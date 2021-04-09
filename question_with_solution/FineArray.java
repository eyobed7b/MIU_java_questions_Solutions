public class FineArray{
    public static void main(String[] args) {

        int num1 [] = {4,7,9,6,5};
        int num2 [] = {4,9,6,33};
        int num3 [] = {3,8,15};
        System.out.println(isFineArray(num1));
        System.out.println(isFineArray(num2));
        System.out.println(isFineArray(num3));
    }
    public static int isFineArray(int[] a) {
        boolean isPrimeNo = false; int indexOf =0;
        for(int i=0; i<a.length;i++){
            if(isPrimeNo && isPrime(a[i])==1 && absolute(a[i]-a[indexOf])==2) return 1;
               
            if(isPrime(a[i])==1){
                isPrimeNo = true;
                indexOf =i;
            }

        }
        if(!isPrimeNo) return 1;
        
        return 0;
    }
    public static int isPrime(int num) {
        if(num ==2 ) return 1;
        else if(num <=1) return 0;
        for(int i=2;i<num;i++)if(num%i==0) return 0;

        return 1;
    }
    public static int absolute (int num) {
        if(num <0) return -num;
        else if(num>0) return num;
        

        return 0;
    }
}