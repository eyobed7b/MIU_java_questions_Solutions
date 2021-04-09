public class ZeroChecker{
    public static void main(String[] args) {
        int num1 [] = {1,2,3};
        int num2 [] = {1,0,4,0};
        int num3 [] = {1,2,3,0};
        int num4 [] = {0,0,0};
        int num5 [] = {};

        System.out.println(arrayHasNonZeros(num1));
        System.out.println(arrayHasNonZeros(num2));
        System.out.println(arrayHasNonZeros(num3));
        System.out.println(arrayHasNonZeros(num4));
        System.out.println(arrayHasNonZeros(num5));
    }
    public static int arrayHasNonZeros(int [] a) {

        for(int i=0; i<a.length; i++){
            if(a[i]==0) return 0;
        }
        return 1;
    }
}