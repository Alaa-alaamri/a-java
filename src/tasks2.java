//task1: implement pow (x,n), which calculates x raised to the power n (x^n)
import java.util.Scanner;

public class tasks2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("enter the number:");
        double x = read.nextDouble();
        System.out.println("enter the power:");
        double n = read.nextDouble();
       double z =1;
       while (n != 0){
           z = x * z;
           --n;
       }
        System.out.println(z);



       //task 2:






    }
}

