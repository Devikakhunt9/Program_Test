import java.util.Scanner;

/**
 * number_digit
 */
public class number_digit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int n = sc.nextInt();
       
        char[] numberArray = new char[1000];
        for(int i = 1;i<200;i++){
            numberArray[i] = (char)i;
        }
        for (char c : numberArray) {
            System.out.println(c);
        }
        
    }
}