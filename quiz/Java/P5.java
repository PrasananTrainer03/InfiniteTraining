	enum WeekDays {
	    Sunday,
	    Monday,
	    Tuesday,
	    Wednesday,
	    Thursday,
	    Friday,
	    Saturday
	}
	public class P5 {
	    public static void main(String[] args) {
        	WeekDays w = WeekDays.Friday;
	        System.out.println(w);
			String s = "Saturday";
			WeekDays res = WeekDays.valueOf(s);
			System.out.println(res);
	    }
	}