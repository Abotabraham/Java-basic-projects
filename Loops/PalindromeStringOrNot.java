package Loops;
// The program checks if a given string is a palindrome
public class PalindromeStringOrNot {
    public static void main(String[] args) {
        String str = "George";
        boolean isPalindrome = true;

        for (int i = 0, j = str.length()-1; i < j ; i++, j--) {

            if (str.charAt(i) == str.charAt(j)){
                continue;
            } else {
                isPalindrome = false;
                break;
            }
        }

        System.out.println(isPalindrome ? "The string is palindrome" : "The string is not a palindrome");
    }
}
