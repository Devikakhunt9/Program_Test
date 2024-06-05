import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Binery :");
        String n = sc.nextLine();
        convertBineryToDecimal(n);
    }

    public static  void convertBineryToDecimal(String b){
        double sum = 0;int index = b.length();
     
            index = b.indexOf('.');
           
            index= index==-1?b.length():index;
            //  System.out.println(index);
        String decimal = (b.substring(0,index));
        String fraction = b.substring(index+1,b.length());
        // System.out.println(decimal + "" + fraction);
            int temp = index-1;
            // System.out.println(temp);
            char[] dcarray = decimal.toCharArray();
            char[] fractionArray = fraction.toCharArray();
        for (int i = 0; i < decimal.length(); i++) {

            // System.out.println("Temp:"+temp);
            double pow = Math.pow(2, temp);
            temp--;
            // System.out.println("power:"+pow);
            if(dcarray[i]=='1'){
                sum = sum + pow * 1;
            }
            
        }
        // System.out.println("sum : "+sum); 
        for (int i = 0; i < fraction.length(); i++) {

            // System.out.println("Temp:"+temp);
            double pow = Math.pow(2, temp);
            temp--;
            // System.out.println("power:"+pow);
            if(fractionArray[i]=='1'){
                sum = sum + pow * 1;
            }
            
        }
         System.out.println("sum : "+sum); 
    }
}
