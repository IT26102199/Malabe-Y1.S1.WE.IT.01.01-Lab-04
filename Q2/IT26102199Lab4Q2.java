import java.util.Scanner;

public class IT26102199Lab4Q2 {
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter exam marks (out of 100): ");
		double e_marks = input.nextDouble();
		
		if(e_marks >= 0 && e_marks <= 100 ) {
			System.out.print("Please enter lab submission marks (out of 100): ");
			double s_marks = input.nextDouble();
			
			if(s_marks >= 0 && s_marks <= 100 ) { 
			
			System.out.print("Please enter the precentage given for the exam: ");
			double p_exam = input.nextDouble();
		
			System.out.print("Please enter the precentage given for thew lab submission: ");
			double p_l_marks = input.nextDouble();
			
			if((p_exam + p_l_marks) == 100) {
				
				double f_mark = 10;
				
				System.out.print("Final Exam Mark is: " + f_mark);
				
			} else {
				System.out.print("The precentages must add up to 100. Terminating program.");
			}
			
			} else {
				System.out.print("Invalid input for submission marks. Terminating program.");
			}
			
		} else {
			System.out.print("Invalid input for exam marks. Terminating program.");
		}
		
		
		
		
		
	}
}