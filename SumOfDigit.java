import java.util.*;
class SumOfDigit {
    public static int digit(int num){
        int sum =0;
        while(num>0){
        int digit = num%10;
        sum += digit;
        num = num/10;
        }
          return sum;
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the digit :");
        int num = sc.nextInt();
        int result = SumOfDigit.digit(num);
        System.out.println("Sum of digit is:"+result);
    }
}
