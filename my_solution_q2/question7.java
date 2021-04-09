public class question7{
    public static void main(String[] args) {
        System.out.println(isTwinPrime(5));
        System.out.println(isTwinPrime(7));
        System.out.println(isTwinPrime(53));
        System.out.println(isTwinPrime(9));
    }

    public static int isTwinPrime(int n)  {
      boolean isprime1 = true, isprime2 = true;

      if(n==1) return 0;
        for(int i=2 ; i<n;i++){
             if(n%i==0 )  return 0;
          
        }
        for(int i=2;  i<n-2 ; i++){
            if((n-2)%i==0) isprime1 = false;
            
        }
        for(int i=2;  i<n+2 ; i++){
            if((n+2)%i==0) isprime2 = false;
            
        }
        
         if(isprime1 || isprime2) return 1;

        return 0;

        

    }
}