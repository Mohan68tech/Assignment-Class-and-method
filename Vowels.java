import java.util.*;

class Vowels {
    public static int checkcowels(String str){
        int count = 0;
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                count++;
            }
        }
        return count;
    }
public static void main(String[]  arrgs){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter your String name : ");
        String str = sc.nextLine();

        int result  = checkcowels(str);
        System.out.println("Count the number of vowels in String: " + result);
}
}
