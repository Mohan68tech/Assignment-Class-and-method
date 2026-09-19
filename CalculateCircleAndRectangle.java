import java.util.*;

class CalculateCircleAndRecatangle {
    public static int areaofrecatangle(int l, int b) {
        return l * b;
    }
    public static double areaofCircle(int r){
        double area = Math.PI * r * r;
        return area;
    }

        public static void main(String[] args){
            int result =  areaofrecatangle(5, 4);
            double result1 = areaofCircle(4);
            System.out.println("Area of recatangle : "+ result);
            System.out.println("Area of circle : "+ result1);
        }
    }

