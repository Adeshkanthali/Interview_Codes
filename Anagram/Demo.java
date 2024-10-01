package SelfPrograms.Anagram;

import java.util.Arrays;

public class Demo {

    //............................................................................//

    public static boolean checkAnagram (String ab, String bc){

        if (ab.length() != bc.length()){
            return false;
        }

        char arr[] = ab.toCharArray();
        char arr1[] = bc.toCharArray();

        Arrays.sort(arr);
        Arrays.sort(arr1);

        return Arrays.equals(arr,arr1);

        //............................................................................//

    }

    public static void main(String[] args) {
        String ab = "Adesh";
        String bc = "heAdd";

        boolean result = checkAnagram(ab, bc);

        System.out.println(result);

    }

}
