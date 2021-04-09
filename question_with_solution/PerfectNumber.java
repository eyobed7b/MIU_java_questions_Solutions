public class PerfectNumber{
    public static void main(String[] args) {
        System.out.println(henry(1,3));
    }
    public static   int henry (int i, int j) {
        int larg  =0,count=0,varI=0, varJ=0;
        if(i>j) larg =i;
        else larg=j;

        for(int k=6; count<larg ;k++ ){
 if(k==sumFactorial(k)) {
     count ++;
     if(count==k) varI=k;
     else if(count==j) varJ =k;
 }
        }

        return varI+varJ;

        
    }
    public static int sumFactorial(int num) {
        int sum=0;
        for(int i=1; sum<num ; i++){
           if(num%i==0) sum+=1;
           
        }

        return sum;
    }
}