import java.util.*;
public class ConsecetiveNumber {
    public static boolean ThreeConsecetiveNo(int num1, int num2, int num3){
        return (num2 == num1+1 ) && ( num3 == num2+1);
}
public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter num1 :");
        int num1 = sc.nextInt();
        System.out.print("enter num2 :");
        int num2 = sc.nextInt();
        System.out.print("enter num3 :");
        int num3 = sc.nextInt();
        System.out.println(" check whether the three  said number consecative are not  :"+ThreeConsecetiveNo(num1, num2, num3));

}
}
