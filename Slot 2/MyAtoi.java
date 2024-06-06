import java.util.Scanner;

public class MyAtoi {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :");
        String s = sc.nextLine();
    System.out.println(convertStringToInt(s));
       
    }

    public static int convertStringToInt(String s) {
         s = s.trim();
         boolean isSign=true;
         boolean ispoint=true;
         boolean isloop=true;
         String newString = "";

         for(int i=0;i<s.length() && isloop;i++){
            if(s.charAt(i)=='-' && isSign){
                isSign=false;
                newString+=s.charAt(i);
            }
            else if(s.charAt(i)=='.' && ispoint){
                ispoint=false;
                newString+=s.charAt(i);
            }
            else if(Character.isDigit(s.charAt(i))){
                newString+=s.charAt(i);
                isSign=false;
            }
            else{
                isloop = false;
            }
        }
        double s1 = Double.parseDouble(newString);
        return((int)s1);
    }
}
