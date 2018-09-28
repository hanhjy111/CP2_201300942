package hello;

import java.util.Scanner;
public class star2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int line;
	        Scanner input = new Scanner(System.in);
	        
	        line = input.nextInt();
	        
	        for(int i=line-1; i>=0; i--) {
	            for(int j=0; j<=i; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	}

}

