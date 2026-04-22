package Day2;

public class orderAgnosticBS {

    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start]< arr[end];
        while(start<=end){
            int mid = start + (end-start)/2;

                if(target == arr[mid]){
                    return mid;
                }
                if(isAsc){
                    if(target<arr[mid]){
                        end = mid-1;
                    }
                     else if (target>arr[mid]){
                        start= mid+1;
                    }
                }
                else{
                    if(target>arr[mid]){
                        end = mid-1;
                    }
                     else if (target<arr[mid]){
                        start= mid+1;
                    }
                }
                
                
        }
        

        return -1;
    }

    public static void main(String[] args){
        int[] ascarr = {3,3,3,3,3,3,40,46,59};
        int[] decarr = {50, 39, 27, 27, 10, 9, 7, 5};
        System.out.println(orderAgnosticBS(ascarr, 46));
        System.out.println(orderAgnosticBS(decarr, 7));
    }
}
