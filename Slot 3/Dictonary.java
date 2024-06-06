public class Dictonary {
    public static void main(String[] args) {
        String s="cupcake";
        String[] dictionary={"cup","cake"};
        
        for(int i=0;i<dictionary.length;i++){
            s=s.replaceAll(dictionary[i], "");
           
        }
        System.out.println(s.length()==0?true:false);
    }
}
