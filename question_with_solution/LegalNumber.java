public class LegalNumber {
    public static void main(String[] args) {
        int num1 [] = {1, 0, 1, 1} ;
        int num2 [] ={1, 1, 2};
        int num3 [] ={3, 2, 5};
        int num4 [] ={3, 7, 1};
        System.out.println(convertToBase10(num1,2));
        System.out.println(convertToBase10(num2,3));
        System.out.println(convertToBase10(num3,8));
        System.out.println(convertToBase10(num4,6));
        // System.out.println(power(2,3));
    }
    public static  int  isLegalNumber( int[] a,  int base) {
        for(int i=0; i<a.length;i++){
            if(a[i]>base) return 0;
        }
        return 1;
    }
    public static int convertToBase10(int[ ] a, int base) {
        int sum=0;
        if(isLegalNumber(a,base)==1){
            for(int i=0 ;i<a.length;i++){
              sum= sum+(a[(a.length-1-i)]*power(base,i) );
            }
        }
        return sum;
    }
    public static int power(int num, int pow) {
        int result =1;
        if(pow==0) return 1;
        for(int i=0;i<pow;i++){
           result*=num;
        }
        return result;
        
    }
}