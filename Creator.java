public class Creator {
	public static void main(String[] args) {
    		String name = "James Gosling";
    		int yearCreated = 1995;
            // double num = "60";//cannot convert String to double

            //check for compilation errors
            String gradeOnTest = "A";
            int balance = -30;
            //double isRaining = false;//type mistmatch: cannot convert from boolean to double
            char grade_on_test = 'F';
            int num = (10 -(4 + 3)) * 6; //18

		    System.out.println(name);
    		System.out.println(yearCreated);
    		System.out.println(num);
	}
}

/*Using the order of operations, (4 + 3) is evaluated first. Then, (10 - 7) is evaluated. Finally, 3 * 6 is evaluated producing a value of 18.
*/