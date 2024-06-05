import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MinStack {
    public static void main(String[] args) {

       String[] oprations = {"minstack","push","push","push","getMin","pop","top","getMin"};
        String[] values = {"[]","-2","0","-3","[]","[]","[]","[]"};
        String[] ans = new String[oprations.length];
        int i =0;
        MinStackObject mst = new MinStackObject();
        for (String string : oprations) {
        
            switch (string) {
                case "minstack":
                    mst = new MinStackObject();
                    ans[i] = "null";
                    i++;
                    break;
                case "push":
                    mst.push(Integer.parseInt(values[i]));
                    ans[i] = "null";
                    i++;
                    break;
                case "pop":
                    mst.pop();
                    ans[i] = "null";
                    i++;
                    break;
                case "top":
                    
                    ans[i] = mst.top()+"";
                    i++;
                    break;
                case "getMin":
                    
                    ans[i] = mst.getMin()+"";
                    i++;
                    break;
                default:
                System.out.println("not leagal opration");
                    break;
            }
        }

        System.out.print("oprations : [");
        for (String string : oprations) {
            System.out.print(string + ",");
            string = string.substring(0, string.length() - 1);  // Remove the last character
            
        }
        System.out.println("]");

        System.out.print("Values    : [");
        for (String string : values) {
            System.out.print(string + ",");
            string = string.substring(0, string.length() - 1);  // Remove the last character
            
        }
        System.out.println("]");
        System.out.print("Output    : [");
        for (String string : ans) {
            System.out.print(string + ",");
            if (string.endsWith(",")) {
                string = string.substring(0, string.length() - 1);  // Remove the last character
            }
        }
        System.out.println("]");
   
}
}
class MinStackObject{
    int top = -1;
    int[] st = new int[100];
    public void push(int n){
        top++;
        st[top] = n;
        // System.out.println("Push : " + top + "=>" + st[top]);
    }

    public void pop(){
        // System.out.println("top value for pop" + top + "value of top" + st[top]);
        int x = st[top];
        // System.out.println("Pop : "+top + "=>" + x);
        top--;
    }

    public int top(){
        // System.out.println("Top : " + top + "=>" +st[top]);
        return st[top];
    }

    public int getMin(){
        int min = st[0];
        for(int i=0;i<=top;i++){
            if(min>st[i]){
                min = st[i];

            }
           
        }
        //  System.out.println("min : " + min);
         return min;
    }

    public void printStack(){
        for(int i=0;i<=top;i++){
            // System.out.print(st[i] + "=>");
        }
    }
    
}