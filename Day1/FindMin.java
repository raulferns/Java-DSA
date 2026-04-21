public class FindMin {

    static int findMin(int[] arr){
        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            int ele = arr[i];
            
            if(ele<min){
                min = ele;
                
            }
            
        }
        return min;
    }


    public static void main(String[] args){
        int[] nums = {8, 21, 53, 7, 4, 19, 2, 10};
        System.out.println(findMin(nums));
    }
    
}
