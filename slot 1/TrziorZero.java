import java.math.BigInteger;
import java.util.Scanner;

public class TrziorZero {
    public static void main(String[] args) {
        int mul = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int n = sc.nextInt();
        for (int i = 1; i < n+1; i++) {
            mul *= i;
        }
        System.out.println(mul);
        String mulans = mul + "";
        char[] mulansArray = mulans.toCharArray();
        int count = 0;
        for (char c : mulansArray) {
            if(c=='0'){
                count++;
            }
        }
        System.out.println("Total Zeros :" + count);

    }
}
