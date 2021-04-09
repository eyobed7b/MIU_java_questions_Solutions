public class FibonacciNumber{
    public static void main(String[] args) {
        System.out.println(isFibonacciNumber(5));
        System.out.println(isFibonacciNumber(8));
        System.out.println(isFibonacciNumber(13));
        System.out.println(isFibonacciNumber(21));
        System.out.println(isFibonacciNumber(20));

    }
    public static int isFibonacciNumber(int n) {
        int prev_no1=1,prev_no2=1, current_no=0;
        while(current_no<n){
        current_no = prev_no1+prev_no2;
        prev_no2=prev_no1;
        prev_no1 = current_no;
        }
        if(current_no == n) return 1;

        return 0;
    }
}