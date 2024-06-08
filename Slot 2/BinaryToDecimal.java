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
        String fraction = "";
            index = b.indexOf('.');
           if(index!=-1){
             fraction = b.substring(index+1,b.length());
           }
           else{
            index = b.length();
           }          
        String decimal = (b.substring(0,index));
       
        
            int temp = index-1;
            char[] dcarray = decimal.toCharArray();
            char[] fractionArray = fraction.toCharArray();
        for (int i = 0; i < decimal.length(); i++) {

            double pow = Math.pow(2, temp);
            temp--;
            if(dcarray[i]=='1'){
                sum = sum + pow * 1;
            }
            
        }
        for (int i = 0; i < fraction.length(); i++) {

            double pow = Math.pow(2, temp);
            temp--;
            if(fractionArray[i]=='1'){
                sum = sum + pow * 1;
            }
            
        }
         System.out.println("sum : "+sum); 
    }
}
