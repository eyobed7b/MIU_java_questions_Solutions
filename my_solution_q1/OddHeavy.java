public class OddHeavy
{
    public static void main(String[] args) {
        int num1[] = {1} ;
        int num2[] = {2} ;
        int num3[] = {1, 1, 1, 1, 1, 1} ;
        int num4[] = {2, 4, 6, 8, 11} ;
        int num5[] = {-2, -4, -6, -8, -11} ;
        System.out.println(isOddHeavy(num1));
        System.out.println(isOddHeavy(num2));
        System.out.println(isOddHeavy(num3));
        System.out.println(isOddHeavy(num4));
        System.out.println(isOddHeavy(num5));
      
    }
    public static int  isOddHeavy(int[ ] a)
     {
         boolean isfound = false;
            for(int i=0; i<a.length;i++){
                for(int k=0; k<a.length; k++){
                    if(a[i]%2!=0){
                       isfound = true;
                       if(a[k]%2==0 && a[k]>a[i]) return 0;
                    }
                }
            }       
            if(!isfound) return 0;

            return 1;
    }
}