public class LinearSearch{

    static int LinearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        for(int i=0; i < arr.length; i++){
            int element = arr[i];
            if(element == target){
                return i;
            }
        
        }
        
    return -1;
    }

    public static void main(){
        int[] num = {2 , 8  -2, 3, 10};
        System.out.println(LinearSearch(num, 10));
    }
}