//import stuff here
import java.util.Scanner;

//Your code here
public class Calculator{
    public Calculator(){
        
    }
    public void calculate(){
        Scanner scan  = new Scanner(System.in);
        System.out.print("a: ");
        int a = scan.nextInt();
        System.out.print("b: ");
        int b = scan.nextInt();
        System.out.println("Sum = " + (a+b));
        System.out.println("Difference = " + (a-b));
        System.out.println("Product = " + (a*b));
        System.out.println("Average = " + ((double)(a+b)/2));
        System.out.println("Absolute Value = " + Math.abs(a-b));
        int min = a;
        int max = b;
        if ((b-a) < 0){
            min  = b;
            max = a;
        }
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }
}
//Paste console output below:
/*
a: 13
b: 20
Sum = 33
Difference = -7
Product = 260
Average = 16.5
Absolute Value = 7
Maximum = 20
Minimum = 13
*/
