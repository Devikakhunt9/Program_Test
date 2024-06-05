import java.util.Scanner;

public class Haystack{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter haystack :");
        String hystackString = sc.nextLine();
        System.out.println("Enter needle :");
        String needleString = sc.nextLine();
        System.out.println(hystackString.indexOf(needleString));
        sc.close();
    }
}