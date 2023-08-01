import java.util.Scanner;

//revers the word

public class reverse {

    public static void main(String[] args) {

//ReverseString using CharcterArray.



        Scanner read = new Scanner(System.in);
        System.out.println("enter any word");
        String word = read.next();


        // convert String to character array


        // by using toCharArray


        char[] resultarray = word.toCharArray();



        for (int i = resultarray.length - 1; i >= 0; i--)

            // print reversed String

            System.out.print(resultarray[i]);

    }
}
