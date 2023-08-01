import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        char[][] chars = {{'a', 'b', 'c'},
                {'d', 'e', 'f'},
                {'z', 'w', 'x'}};
        Scanner read = new Scanner(System.in);
        System.out.println("enter the word:");
        String word = read.next();

        char[] cs = word.toCharArray();
        boolean thiswordisvalid = true;
        for (char c :cs) {
            System.out.println(c + ":" + grid(chars,c));
            if (grid(chars,c)) {
                thiswordisvalid = false;
                break;
            }

            while (grid(chars,c)) {

            }

        }
    }


    static boolean grid (char [][] chars, char c){

          for (int i = 0; i < chars.length; i++){
              for (int j = 0 ; j < chars[0].length; j++){
if (c== chars[i][j]){
    return true;
}
              }
          }
          return false;
      }


    }


