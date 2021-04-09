public class SumDigit{
    public static void main(String[] args) {
        System.out.println(sumDigit(3114));
        System.out.println(sumDigit(-6543));
        System.out.println(sumDigit(3114));
    }
    public static int sumDigit(int n) {
        int sum=0;
            if(n<0) n=-n;

        while(n!=0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}