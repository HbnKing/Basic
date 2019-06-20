package WorkFlow;

import java.util.Scanner;

public class Switch_case {
	public static void main(String[] args) {
		int i = 2;
		switch(i){
		case 1 :
			System.out.println("这个是1");
		case 2:
			System.out.println("zhege shi 2");
		case 3:
			System.out.println("zhege shi 3");
			break;
		case 4:
			System.out.println("zhege shi 4");


	}




		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a command: ");
		String text = input.nextLine();

		switch (text) {
			case "start":
				System.out.println("Inside case started!");
				break;

			case "stop":
				System.out.println("Inside case stopped.");
				break;

			default:
				System.out.println("Command not defined");
		}


	}

}
