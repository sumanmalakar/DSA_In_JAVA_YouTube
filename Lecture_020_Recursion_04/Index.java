import java.util.HashMap;

public class Index {
    static String words[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    static void number_spell(int n){
        if(n == 0) return;

        number_spell(n/10);

        System.out.print(words[n%10]+" ");
    }

    static boolean isPalindrome(String str, int s, int e){
        if(s>=e) return true;

        if(str.charAt(s) != str.charAt(e)) return false;

        return isPalindrome(str, s+1, e-1);
    }

    static boolean isAnagram(String s1, String s2, int index , HashMap<Character,Integer>map){
        if(s1.length() != s2.length()) return false;

        if(index == s1.length()){
            for(int val : map.values()){
                if(val != 0) return false;
            }
            return true;
        }

        map.put(s1.charAt(index),map.getOrDefault(s1.charAt(index), 0)+1);

        map.put(s2.charAt(index),map.getOrDefault(s2.charAt(index), 0)-1);

        return isAnagram(s1, s2, index+1, map);
        

    }

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "aba";

        HashMap<Character,Integer>map = new HashMap<>();

        if(isAnagram(str1, str2, 0,map )){
            System.out.println("Anagramic String");
        }else{
            System.out.println("Not a Anagram");
        }

        // if(isPalindrome(str, 0, str.length()-1)){
        //     System.out.println("String is Palindrome");
        // }else{
        //     System.out.println("Not a palindromic string");
        // }


        // int n = 321;
        // number_spell(n);
    }
}
