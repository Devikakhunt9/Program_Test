import java.util.Scanner;

public class DevideWithoutOp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Divident : ");
        int divident=sc.nextInt();
        
        System.out.println("Enter Divisor : ");
        int divisor=sc.nextInt();
        double count=0;

        if(divident>0 && divisor<0){
            while (divident>=divisor*-1) {
                divident+=divisor;
                count--;
            }
        }
        else if(divident<0 && divisor>0){
            while (divident<=divisor*-1) {
                divident+=divisor;
                count--;
            }
        }
        else if(divident<0 && divisor<0){
            while(divident<=divisor){
                divident-=divisor;
                count++;
            }
        }
        else{
            while (divident>=divisor) {
                divident-=divisor;
                count++;
            }
        }
        System.out.println("Result : "+(int)count);
    }
}
