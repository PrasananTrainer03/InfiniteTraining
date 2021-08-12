<%@page import="com.java.hib.cms.Wallet"%>
<%@page import="org.hibernate.Transaction"%>
<%@page import="com.java.hib.cms.Menu"%>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.Query"%>
<%@page import="org.hibernate.Session"%>
<%@page import="com.java.hib.cms.SessionHelper"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="com.java.hib.cms.OrderStatus"%>
<%@page import="com.java.hib.cms.Orders"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="PlaceOrder.jsp">
		<center>
			Order Id : 
			<input type="number" name="orderId" /> <br/><br/>
			Customer Id : 
			<input type="number" name="customerId" /> <br/><br/>
			Menu Id : 
			<input type="number" name="menuId" /> <br/><br/> 
			Vendor ID : 
			<input type="number" name="vendorId" /> <br/><br/> 
			Wallet Source : 
			<input type="text" name="walletSource" /> <br/><br/> 
			Order Quantity : 
			<input type="number" name="orderQuantity" /> <br/><br/> 
			Order Comments : 
			<input type="text" name="orderComments" /> <br/><br/> 
			<input type="submit" value="Place Order" />
		</center>
	</form>
	<%
		if (request.getParameter("orderId") !=null &&
				request.getParameter("customerId") !=null && request.getParameter("menuId") != null 
				&& request.getParameter("vendorId") != null 
				&& request.getParameter("orderQuantity") != null
					)
		{
			Orders order = new Orders();
			order.setOrderId(Integer.parseInt(request.getParameter("orderId")));
			order.setCustId(Integer.parseInt(request.getParameter("customerId")));
			order.setMenuId(Integer.parseInt(request.getParameter("menuId")));
			order.setVendorId(Integer.parseInt(request.getParameter("vendorId")));
			order.setWalSource(request.getParameter("walletSource"));
			order.setOrderQuantity(Integer.parseInt(request.getParameter("orderQuantity")));
			order.setOrderComments(request.getParameter("orderComments"));
			order.setOrderStatus(OrderStatus.PENDING);
			
			int qtyOrd =Integer.parseInt(request.getParameter("orderQuantity"));
			int mid=Integer.parseInt(request.getParameter("menuId"));
			SessionFactory sf = SessionHelper.getFactory();
			Session s=sf.openSession();
			int cid = Integer.parseInt(request.getParameter("customerId"));
			String ws = request.getParameter("walletSource");
			
			Query qw=s.createQuery("from Wallet where Cus_id=" +cid + " and WAL_SOURCE='"+ ws +"'");
			List<Wallet> list=qw.list();
			Wallet wallet = list.get(0);
			double wamt = wallet.getWAL_AMOUNT();
			
			Query q=s.createQuery("from Menu where MEN_ID="+ mid);
			double price=0;
			double billAmount=0;
			List<Menu> menuList = q.list();
			if (menuList.size() == 1) {
				Menu menu = menuList.get(0);
				price = menu.getMEN_PRICE();
				billAmount=qtyOrd*price;
			}
			if (billAmount > wamt) {
				out.println(price);
				out.println(qtyOrd);
				out.println(billAmount);
				out.println(wamt);
				out.println("Insufficient funds...");
			} else {
			double finalAmount = wamt-billAmount;
			order.setBillAmount(billAmount);
		//	wallet.setWAL_AMOUNT(finalAmount);
			//s=sf.openSession();
			Transaction t = s.beginTransaction();
			s.save(order);
			
			t.commit();
			
			
			out.println("*** Order Placed Successfully...Amount Debited ***");
			t = s.beginTransaction();
			
			wallet.setWAL_AMOUNT(finalAmount);
			s.update(wallet);
			t.commit();
			
			}
		}
	%>
</body>
</html>