public class Magic{
    public static void main(String[] args) {
        int num1 [] = {21,3,7,9,11,4,6} ;
        int num2 [] = {13,4,4,4,4} ;
        int num3 [] = {10,5,5} ;
        int num4 [] = {0,6,8,20} ;
        int num5 [] = {3};
        int num6 [] = {8,5,5,5,3} ;
        System.out.println(isMagicArray(num1));
        System.out.println(isMagicArray(num2));
        System.out.println(isMagicArray(num3));
        System.out.println(isMagicArray(num4));
        System.out.println(isMagicArray(num5));
        System.out.println(isMagicArray(num6));
    }
    public static int isMagicArray(int[]a) {
        int sum =0;
        for(int i=0; i<a.length ;i++){
            if(isPrime(a[i])==1) sum+=a[i];
        }
        if(sum==a[0] || (sum==0 && a[0]==0)) return 1;

        return 0;
    }
    private static int isPrime(int num) {
        if(num==2) return 1;
        else if(num <=1) return 0;

        for(int i=2;i<num;i++){
            if(num%i==0) return 0;
        }

        return 1;
    }
}