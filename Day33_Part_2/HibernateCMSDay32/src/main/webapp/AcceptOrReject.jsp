<%@page import="com.java.hib.cms.Wallet"%>
<%@page import="com.java.hib.cms.OrderStatus"%>
<%@page import="org.hibernate.Transaction"%>
<%@page import="com.java.hib.cms.Orders"%>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.Query"%>
<%@page import="org.hibernate.Session"%>
<%@page import="com.java.hib.cms.SessionHelper"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="AcceptOrReject.jsp">
	Vendor Id : 
	<input type="number" name="venId" /> <br/> <br/> 
	Order Id : 
	<input type="number" name="ordId" /> <br/> <br/>
	Status : 
	<select name="status">
		<option value="ACCEPTED">Accepted</option>
		<option value="DENIED">Denied</option>
	</select>
	<input type="submit" value="Accept/Reject" />
</form>	
<%
	if (request.getParameter("venId") != null && 
		request.getParameter("ordId") != null
			) {
		int ordId = Integer.parseInt(request.getParameter("ordId"));
		int vendorId = Integer.parseInt(request.getParameter("venId"));
		SessionFactory sf = SessionHelper.getFactory();
		Session s=sf.openSession();
		Query q=s.createQuery("from Orders where ORD_ID="+ ordId);
		List<Orders> orderList = q.list();
		Orders order = orderList.get(0);
		int vid = order.getVendorId();
		if (vid!=vendorId) {
			out.println("You are not Authorised Vendor...");
		} else {
			String status = request.getParameter("status");
			if (status.equals("ACCEPTED")) {
				order.setOrderStatus(OrderStatus.ACCEPTED);
				Transaction t = s.beginTransaction();
				s.save(order);
				t.commit();
				out.println("Your Order Approved...");
			} else {
				order.setOrderStatus(OrderStatus.DENIED);
				Transaction t = s.beginTransaction();
				s.save(order);
				t.commit();
				int cid = order.getCustId();
				String ws = order.getWalSource();
				double amount = order.getBillAmount();
				Query qw=s.createQuery("from Wallet where Cus_id=" +cid + " and WAL_SOURCE='"+ ws +"'");
				List<Wallet> list=qw.list();
				Wallet wallet = list.get(0);
				wallet.setWAL_AMOUNT(wallet.getWAL_AMOUNT()+amount);
				t = s.beginTransaction();
				s.update(wallet);
				t.commit();
				out.println("Order Rejected and Amount Refunded...");
			}
		}
	}
%>
</body>
</html>