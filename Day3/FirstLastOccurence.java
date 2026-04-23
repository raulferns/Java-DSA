package Day3;
class FirstLastOccurence {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        int start = searchFirstandLast(nums, target, true);
        int end = searchFirstandLast(nums, target, false);

        ans[0] = start;
        ans[1] = end;
        return ans;

    }
        
    int searchFirstandLast(int[] nums, int target, boolean isFirst){
        int start=0;
        int end= nums.length-1;
        int ans=-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(target==nums[mid]){
                ans=mid;
                if(isFirst){
                    end= mid-1;
                }
                else{
                    start = mid +1;
                }
            }
            else if(target<=nums[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
        
    }
}