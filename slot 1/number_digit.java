import java.util.ArrayList;
import java.util.Scanner;

/**
 * number_digit
 */
public class number_digit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int n = sc.nextInt();
       
        ArrayList<String> numbers = new ArrayList<String>();
        for (int i = 1; i <=100; i++) {
         numbers.add(i+"");   
        }
        for (String string : numbers) {
            System.out.print(string);
        }
        System.out.println();
        String result = String.join("",numbers);
        System.out.println(n+"th digit of the Series :"+result.charAt(n-1));
        // System.out.println(result);
        

        
        
    }
}