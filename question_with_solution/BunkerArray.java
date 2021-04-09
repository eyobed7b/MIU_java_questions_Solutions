public class BunkerArray{
    public static void main(String[] args) {
        int num1 [] = {7,6,10,1};
        int num2 [] = {7,6,10};
        int num3 [] = {6,10,1};
        int num4 [] = {3,7,1,8,1};


        System.out.println(isBunker(num1));
        System.out.println(isBunker(num2));
        System.out.println(isBunker(num3));
        System.out.println(isBunker(num4));
    }
    public static int isBunker(int [] a) {
        int oneCount =0, primeCount =0;
        for(int i=0; i<a.length;i++){
            if(a[i]==1 && oneCount ==0) oneCount ++;
            else if(isPrime(a[i])==1) primeCount ++;
            
            if(oneCount>0 && primeCount >0) return 1;
        }

        return 0;
    }
    public static int isPrime(int num) {
      if(num==2) return 1;
      else if(num<=1) return 0;
      
      for(int i=2; i<num; i++){
          if(num%i==0) return 0;
      }
      return 1;
    }
}