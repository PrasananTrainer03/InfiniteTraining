
abstract class Employ {
	int empno;
	String name;
	double basic;
	
	public Employ(int empno, String name, double basic) {
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}

	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}
}

class Hari extends Employ {
	public Hari(int empno, String name, double basic) {
		super(empno, name, basic);
	}
}

class Yashik extends Employ {
	public Yashik(int empno, String name, double basic) {
		super(empno, name, basic);
	}
}

public class AbsCon {

	public static void main(String[] args) {
		Employ[] arrEmploy = new Employ[] 
		{
			new Hari(1, "Rahul", 73442),
			new Yashik(3, "Ambika", 89325)
		};
		
		for (Employ employ : arrEmploy) {
			System.out.println(employ);
		}
	}
}
