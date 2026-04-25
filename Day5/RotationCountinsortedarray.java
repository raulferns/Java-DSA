package Day5;

public class RotationCountinsortedarray {
    static int findRotatedCount(int[] arr){
        int pivot=findPivot(arr);
        return pivot+1;
    }

    static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length -1;
        
        while(start<=end){
            int mid=start + (end-start)/2;

            if(mid < end && nums[mid]>nums[mid+1]){
                return mid;
            }
            else if(mid > start && nums[mid]<nums[mid-1]){
                return mid -1;
            }
            else if(nums[mid]>nums[end]){
                start = mid+1;
            }
            else{
                end = mid -1;
            }
        }
        
        return -1;
    }

    static int BS(int[] arr, int target, int start, int end){
        
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target==arr[mid]){
                return mid; 
            }
            else if(target<=arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[]args){
        int arr[] = {0,1,2,3,4,5};
        System.out.println(findRotatedCount(arr));
    }
}
