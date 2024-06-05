import java.util.Scanner;

public class MinStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Opration :");
        String oprationsString = sc.nextLine();
        System.out.println("Enter Value String : ");
        String valueString = sc.nextLine();

    }
}

class MinStackObject{
    int top = 0;
    int[] stack = new int[5];
    public void push(int n){
        stack[top] = n;

    }
}
