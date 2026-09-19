import java.util.*;
class Palindrome {
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
    return true;
}


        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your String :");
            String str = sc.nextLine();
            boolean result = Palindrome.isPalindrome(str);
            System.out.println("Palindrome is: " + result);

        }
    }

