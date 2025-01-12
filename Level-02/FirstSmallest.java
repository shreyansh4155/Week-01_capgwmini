class FirstSmallest {
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the first number");
		int fNum=scn.nextInt();
		System.out.println("Enter the second number");
		int sNum = scn.nextInt();
		System.out.println("Enter the third number");
		int tNum = scn.nextInt();

		//checking the first number that it is smallest or not

		boolean isFirstSmallest = (number1 <= number2) && (number1 <= number3);

       		 System.out.println("Is the first number the smallest? " + isFirstSmallest);
	}
}
		