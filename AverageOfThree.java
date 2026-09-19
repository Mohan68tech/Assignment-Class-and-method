import java.util.*;
class AverageOfThree {
    public static int Sum(int a, int b, int c) {
        int sum = 0;
        sum = a + b + c;
        return sum;
    }
        public static double Average( int a, int b, int c){
            int sum = Sum(a, b, c);
            double avg = 0;
            avg = sum / 3.0;
            return avg;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("enter the value of b: ");
        int b = sc.nextInt();
        System.out.print("enter the value of c: ");
        int c = sc.nextInt();

         int Add = AverageOfThree.Sum(a,b,c);
         System.out.println("Sum of three number is:"+Add);
          double result = AverageOfThree.Average(a,b,c);
          System.out.println("Sum of three number :"+ result);
    }
}

