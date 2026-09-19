import java.util.*;
class SmallestNumber {
    public static int IsSmallest(int a, int b, int c){
        int smallest = a;

        if (b < smallest) {
            smallest = b;
        }
        if (c < smallest) {
            smallest = c;
        }
        return smallest;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter value a :");
        int a = sc.nextInt();
        System.out.print("enter value b :");
        int b = sc.nextInt();
        System.out.print("enter value c :");
        int c = sc.nextInt();
        int result  = IsSmallest(a,b, c);
        System.out.println("Smallest number is : "+ result);

    }
}
