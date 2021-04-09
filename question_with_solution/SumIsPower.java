public class SumIsPower{
    public static void main(String[] args) {
        int num [] = {8,8,8,8};
        System.out.println(sumIsPower(num));
    }
    public static boolean sumIsPower(int []a ) {
        int sum =0;
        for(int i=0; i<a.length;i++){
            sum+=a[i];
        }
        
        if(isPower(sum)) return true;

        return false;

    }
    public static boolean isPower(int num) {
        int product =1;
        
        while(product <= num){
            if(product == num) return true;
           
            product *= 2;
        }

        return false;
    }
}