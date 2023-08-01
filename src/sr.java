import java.util.Scanner;
//sentence revers
public class sr {
    public static void main(String args[]) {

        Scanner read = new Scanner(System.in);
        System.out.println("enter any thing");
        String x = read.nextLine();
        String[] z = x.split("");
        System.out.println("revers:");
        for (int i = z.length-1; i >= 0; i--){
            System.out.print(z[i]+"");

        }






    }
}

