package hello;

import java.util.Scanner;
public class star1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


			int line;
	        Scanner input = new Scanner(System.in);
	        
	     
	        line = input.nextInt();
	        
	        for(int i=0; i<line; i++) {
	            for(int j=0; j<=i; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }

		
	}

}

