public class CountDigit{
    public static void main(String[] args) {
        System.out.println(counDigit(33331,3));
        System.out.println(counDigit(33331,6));
        System.out.println(counDigit(3,3));
        System.out.println(counDigit(-543,3));
    }
    public static int counDigit(int n, int digit) {
        if(n<0 || digit <0) return -1;
        int count =0;
        while(n!=0){
            if((n%10)==digit) count++;
            n/=10;
        }

        return count;
        
    }
}