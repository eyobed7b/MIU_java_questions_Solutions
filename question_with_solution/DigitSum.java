public class DigitSum{
    public static void main(String[] args) {
        System.out.println(isDigitSum(32121,10));
        System.out.println(isDigitSum(32121,9));
        System.out.println(isDigitSum(13,6));
        System.out.println(isDigitSum(3,3));
        System.out.println(isDigitSum(-543,3));

    }
    public static int isDigitSum(int n, int m) {
         int sum=0;
         if(n<0 || m<0) return -1;
         while(n!=0){
             sum+=n%10;
             n/=10;
         }

         if(sum<m) return 1;
         return 0;
    }
}