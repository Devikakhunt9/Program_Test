import java.util.*;
public class Dictance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int a=sc.nextInt();
        System.out.println("Enter number ");
        int b=sc.nextInt();
        int result=distance(a,b );
        System.out.println("Distance : " + result);
    }

    public static int distance(int a,int b) {
        int count=0;
        while (a> 0 || b> 0) {
            if(a%2 != b%2)
                count++;
            a=a/2;
            b=b/2;
        }
        return count;
    }
}


