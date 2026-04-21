public class SearchInRange {

    static int searchFromTill(int[] arr, int target, int start, int end){
        if(arr.length==0){
            return -1;
        }
        for(int i=start;i<=end; i++){
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] nums = {2, -9, 5, 7, 3, -10};
        System.out.println("index of target is " + searchFromTill(nums, 3, 1, 4));

    }
}
