package three;
import java.util.Scanner;

public class maxmin {

	public static void main(String[] args) {
		Scanner in = new Scanner( System.in);
//		System.out.print("Enter series of numbers");;
//		double largest=in.nextDouble();
//		while(in.hasNextDouble()) {
//			 double input = in.nextDouble();
//			 if(input>largest) {
//				 largest=input;
//			 }
//		}
//		System.out.println(largest);*/
		// TODO Auto-generated method stub
	System.out.print("Enter series of number");
    double smallest=in.nextDouble();
    while(in.hasNextDouble()) {
    	double input=in.nextDouble();
    	if(input<smallest) {
    		smallest=input;
    	}
    }
    System.out.println(smallest);
	}

}
