import java.util.Arrays;

public class Searchin2DArray {
    
    static int[] search(int[][] arr, int target){
        for(int r=0; r<arr.length; r++){
            for(int c=0; c<arr[r].length; c++){
                
                if(arr[r][c]==target){
                    return new int[]{r,c}; 
                }

            }
        }
        return new int[]{-1,-1};
    }
    
    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int r=0;r<arr.length; r++){
            for(int c=0; c<arr[r].length; c++){
                int ele = arr[r][c];
                if(ele>max){
                    max = ele;
                }
            }
        }
        return max;

    }

    public static void main(String[] args){
        int[][] twodarr = {{5, 8, 4},{17, 2, 19,},{18, 11, 10} };
        int target = 19;
        int[] ans = search(twodarr,target);
        System.out.println("Min "+ Arrays.toString(ans));

        System.out.println("Max " + max(twodarr));
    }
}
