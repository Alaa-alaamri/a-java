import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.println("please enter your name");
        String name = read.next();
        System.out.println("welcome"+name);
        System.out.println("please enter number of questions:");
        int number = read.nextInt();

        String[] questions = {"1+1=?", "2+2?", "3+3=?", "4+4?","5+5=??" };
        int score = 0;
        int[] answers = {2,4,6,8,10};
        for (int i=0; i<number; i++){
            System.out.println(questions[i]);
            int an =read.nextInt();

            if (an==answers[i]){
                System.out.println("right");
                score++;

            }else {
                System.out.println("wrong");
            }

            System.out.println("your score is"+score);



        }


    }


}
