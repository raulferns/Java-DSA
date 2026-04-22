package Day2;

public class binarySearch {
    static int searchbin(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        
        while(start<=end){
            int mid = start+(end-start)/2;
            if (target<arr[mid]){
                end = mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
                
            }
            else{
                return arr[mid];
            }

        }
        return -1;
    }
    

    public static void main(String[] args){
        int[] sortedarr = {2, 4, 6, 8, 10, 12, 14};
        System.out.println(searchbin(sortedarr,12 ));
    }
}
