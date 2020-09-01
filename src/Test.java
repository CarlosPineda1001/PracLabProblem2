

public class Test {

	public static void main(String[] args) {
		Date date = new Date(8, 7, 2000);
		Date date1 = new Date(9, 7, 2000);
		
		if(date.compareTo(date1) == 1) {
			System.out.println(date + " this is later than " + date1);
		}else if(date.compareTo(date1) == -1) {
			System.out.println(date + " this is earlier than " + date1);
		}else {
			System.out.println(date + " are the same as " + date1);
		}

	}

}
