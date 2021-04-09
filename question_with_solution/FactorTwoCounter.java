public class FactorTwoCounter{
    public static void main(String[] args) {
        System.out.println(factorTwoCounter(32));
        System.out.println(factorTwoCounter(27));
    }
    public static int factorTwoCounter( int n) {
        int count =0;
        while(n%2==0){
            
            n=n/2;
            if(n%2==0) count++;
            
        }
        return count;
        
    }
}