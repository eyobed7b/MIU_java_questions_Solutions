public class KSmallFactors{
    public static void main(String[] args) {
        System.out.println(hasKSmallFactors(7,30));
        System.out.println(hasKSmallFactors(6,14));
        System.out.println(hasKSmallFactors(6,30));
    }
    public static boolean hasKSmallFactors(int k,int n){
       for(int i=1; i<k;i++)
       for(int m=1; m<k; m++) 
       if(m*i==n) return true;
       
       return false;
    }
}