package infinite.EmployServiceDemo;

import java.sql.SQLException;

public class EmployService {

	public Employ[] showEmploy() throws ClassNotFoundException, SQLException {
		return new EmployDAO().showEmploy();
	}
	
	public Employ searchEmploy(int empno) throws ClassNotFoundException, SQLException {
		return new EmployDAO().searchEmploy(empno);
	}
}
