
public class JumpIndex {
    public static void main(String[] args) {
        int[] arr={2,3,1,1,4}; 
        System.out.println(isJump(arr));
    }

    public static boolean isJump(int[] arr){
        if(arr.length<=1)return true;
        
        boolean result[]=new boolean[arr.length];
        result[arr.length-1]=true;
        for(int i=arr.length-2;i>=0;i--){
            for(int j=i+1;j<=i+arr[i] && j<arr.length;j++){
                if(result[j]==true){
                    result[i]=true;
                    break;
                }
            }
        }

        return result[0];
    }
}
