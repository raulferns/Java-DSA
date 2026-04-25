package Day4;

class searchRotatedSortedArray {
     int search(int[] nums, int target){
        int pivot = findPivot(nums);

        if(pivot==-1){
            return BinarySearch(nums, target, 0, nums.length-1);
        }
        if(nums[pivot]==target){
            return pivot;
        }
        if(nums[0]<=target){
            return BinarySearch(nums, target, 0, pivot-1);
        }
        return BinarySearch(nums, target, pivot+1, nums.length-1);
        
        
    }

     int findPivot(int[] nums) {
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
     int BinarySearch(int[] nums, int target, int start, int end){
        
        while(start<=end){
            int mid=start + (end-start)/2;
            if(target==nums[mid]){
                return mid;
            }
            else if(target>nums[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;

    }
}
