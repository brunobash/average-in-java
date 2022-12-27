import java.util.Scanner;

public class Media {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("		--- AVERAGE CALCULATOR ---		");
		System.out.println("How many number do you want to calculate? ");
		double n = Double.parseDouble(input.nextLine());

		double sum = 0; // store the number's sum

		for(int i = 0; i < n; i++){
			System.out.println("Next number: ");
			double num = Double.parseDouble(input.nextLine());
			sum += num; //add the num to the sum
		}

		double average = sum/n;
		System.out.println("The average is: " + average);
	}
}
