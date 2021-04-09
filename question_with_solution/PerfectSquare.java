public class PerfectSquare{
    public static void main(String[] args) {
        System.out.println(nextPerfectSquare(6));
        System.out.println(nextPerfectSquare(36));
        System.out.println(nextPerfectSquare(0));
        System.out.println(nextPerfectSquare(-5));
    }
    public static int  nextPerfectSquare(int n) {
        boolean isfound = false;
        n+=1;
        while(!isfound){
            if(n==0){
                return 0;
            }
            for(int i=1; i*i<=n ; i++){

                if((n%i==0)&&(n/i==i)){
                    isfound = true;
                    return n;}
            }
            n++;
        }
        return 0;
    }
}
