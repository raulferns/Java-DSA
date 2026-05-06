package Day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class numsDisappeared {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i]!=nums[correct]){
                sort(nums, i, correct);
            }
            else{
                i++;
            }
        }
        List<Integer> result = new ArrayList<Integer>();

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                result.add(j + 1);
            }
        }

        return result;
    }
    public void sort(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
    public static void main(String[] args){
        numsDisappeared obj = new numsDisappeared();
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> result = obj.findDisappearedNumbers(nums);
        System.out.println(result);
    }
}
