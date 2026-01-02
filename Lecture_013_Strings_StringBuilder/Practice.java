import java.util.*;
public class Practice {

    public static String reverse(String str) {
        String rev = "";
        int n = str.length();

        for (int i = n - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        return rev;
    }

    // Palindromic string or not
    public static boolean Palindromic(String str) {
        int i = 0, j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;

            i++;
            j--;
        }
        return true;
    }

    public static void vowels_con_count(String str){
        int vowelsCount = 0, consonentsCount = 0;

        String vowels = "aeiou";

        for(char ch : str.toCharArray()){
           if(vowels.indexOf(ch) != -1){
            vowelsCount++;
           }else{
            consonentsCount++;
           }
        }
        System.out.println("Total Vowels = "+vowelsCount);
        System.out.println("Total Consonents = "+consonentsCount);
    }

    // Anagram
    public static boolean isAnagram(String str1 , String str2){
        if(str1.length() != str2.length()) return false;

        char [] st1 = str1.toCharArray();
        char [] st2 = str2.toCharArray();

        Arrays.sort(st1);
        Arrays.sort(st2);

        return Arrays.equals(st1,st2);
    }

    // reverse word in string
    public static void reverseWord(String str){
        String [] words = str.split(" ");
        String res = "";

        for(int i=words.length - 1; i>=0; i--){
            res += words[i] +" ";
        }
        
        System.out.println(res.trim());
    }

    public static void main(String[] args) {
        String str = "This is the best DSA Course";

        System.out.println(str);
        reverseWord(str);



        // String str1 = "liste";
        // String str2 = "silent";

        // if(isAnagram(str1, str2)){
        //     System.out.println("Both string are Anagram");

        // }else{
        //     System.out.println("Not Angramic Strings");
        // }

        // vowels_con_count(str);

        // if(Palindromic(str)){
        //     System.out.println("Palindromic String");
        // }else{
        //     System.out.println("Not a Palindromic String");
        // }

        // System.out.println(str);
        // System.out.println(reverse(str));

    }
}
