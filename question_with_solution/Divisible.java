public class Divisible{
    public static void main(String[] args) {
        int num1 [] = {3, 3, 6, 36}  ;
        int num2 [] = {4}  ;
        int num3 [] = {3, 4, 3, 6, 36}  ;
        int num4 [] = {6, 12, 24, 36}   ;
        int num5 [] = {6, 12, 24, 36}  ;
        System.out.println(isDivisible(num1,3));
        System.out.println(isDivisible(num2,2));
        System.out.println(isDivisible(num3,3));
        System.out.println(isDivisible(num4,12));
        System.out.println(isDivisible(num5,3));
    }
    public static   int isDivisible(int [  ] a, int divisor) {
        for(int i=0; i<a.length;i++){
            if(a[i]%divisor!=0) return 0;
        }
        return 1;
    }
}