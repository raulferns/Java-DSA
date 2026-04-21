public class SearchInStrings {

    static boolean searchString(String str, char ch){
        if(str.length() == 0){
            return false;
        }

        for(int i=0; i<str.length(); i++){
            if(ch==str.charAt(i)){
                return true;
            }
        }
        return false;
    }

    static boolean searchString2(String str, char ch){
        if(str.length() == 0){
            return false;
        }

        for(char i: str.toCharArray()){
            if(ch == i){
                System.out.println(i);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        String name = "Raul";
        System.out.println(searchString2(name, 'u'));
        

    }
}
