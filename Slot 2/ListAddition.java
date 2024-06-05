import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> input1 = new ArrayList<Integer>();
        input1.add(2);
        input1.add(4);
        input1.add(3);
        List<Integer> reversedInput1 = input1.reversed();
        ArrayList<Integer> input2 = new ArrayList<Integer>();
        input2.add(5);
        input2.add(6);
        input2.add(4);
        List<Integer> reversedInput2 = input2.reversed();
        reversedInput1.toArray();
       reversedInput2.toArray();

       List<Integer> result = new ArrayList<>();
        int carry = 0;
        int i = 0;

        while (i < input1.size() || i < input2.size() || carry != 0) {
            int sum = carry;
            if (i < input1.size()) {
                sum += input1.get(i);
            }
            if (i < input2.size()) {
                sum += input2.get(i);
            }

            result.add(sum % 10); // Append units digit to result
            carry = sum / 10;     // Update carry for next iteration
            i++;
        }
        String ans = "";
        
        for (Integer num : result) {
            ans = ans + num + ",";
        }
        String finalAns = ans.substring(0,ans.length()-1);
        System.out.println("Result of addition: ["+finalAns+"]");
       
    }
}
