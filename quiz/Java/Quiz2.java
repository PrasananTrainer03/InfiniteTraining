	public class Quiz2 {
        enum WeekDays {
	    Sunday,
	    Monday,
	    Tuesday,
	    Wednesday,
	    Thursday,
	    Friday,
	    Saturday
	    }
        private void WeekDays() {
            System.out.println("Hi");
		}
	    public static void main(String[] args) {
        	WeekDays w = WeekDays.Friday;
	        System.out.println(w);
			new Quiz2().WeekDays();
	    }
	}