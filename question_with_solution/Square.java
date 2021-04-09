public class Square{
    public static void main(String[] args) {
        System.out.println(isSquare(4));
        System.out.println(isSquare(25));
        System.out.println(isSquare(-24));
        System.out.println(isSquare(8));
        System.out.println(isSquare(0));
    }
    public static int isSquare(int n)  {
        if(n==0) return 1;
        for(int i=1; i*i<= n; i++){
            if(n%i==0 && n/i==i) return 1;
        }
        return 0;
    }
}