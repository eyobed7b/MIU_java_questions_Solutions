public class primeproduct{
    public static void main(String[] args) {

        System.out.println(isPrimeProduct(22));
    }

    public static int isPrimeProduct(int n) {
        for(int i=2; i<n;i++){
            if(isPrime(i)==1){
                for(int k=0; k<n; k++){
                    if(isPrime(k)==1 && k*i==n) {
                        //System.out.println("k= "+k+" i= "+i);
                        return 1;}
                }
            }
        }
        return 0;

        
    }
    public static int isPrime(int num) {
       
            if(num==2) return 1;
            else if(num <=1) return 0;
    
            for(int i=2;i<num;i++){
                if(num%i==0) return 0;
            }
    
            return 1;
       
    }
}