public class PrimeCount{
    public static void main(String[] args) {

        System.out.println(primeCount(10,30));
        System.out.println(primeCount(11,29));
        System.out.println(primeCount(20,22));
        System.out.println(primeCount(1,1));
        System.out.println(primeCount(5,5));
        System.out.println(primeCount(6,2));
        System.out.println(primeCount(-10,6));
    }
    public static int primeCount(int start, int end) {
             int count=0,primeChecker =0;;

             boolean isPrime =true;
        for(int i=start; i<=end; i++){
                    if(i>1 ){
                        if(i==2) count++;
                        else
                        {
                            for(int k=2; k<i;k++){
                          if(i%k==0) isPrime= false;;
                    }
                    if(isPrime){
                        count++;
                      
                    }
                    isPrime = true;
                    
                }


        }
    }
        return count;
    }
}