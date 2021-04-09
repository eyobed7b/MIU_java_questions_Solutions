public class Comulative{
    public static void main(String[] args) {
        int num1[] = {1, 1, 2, 4, 8};
        int num2[] = {1} ;
        int num3[] = {0,0,0,0,0,0} ;
        int num4[] = {1, 1, 1, 1, 1, 1} ;
        int num45[]= {3, 3, 6, 12, 24} ;
        int num5[] = {-3, -3, -6, -12, -24};
        int num6[] = {-3, -3, 6, 12, 24};

        System.out.println(isCumulative(num1));
        System.out.println(isCumulative(num2));
        System.out.println(isCumulative(num3));
        System.out.println(isCumulative(num4));
        System.out.println(isCumulative(num45));
        System.out.println(isCumulative(num5));
        System.out.println(isCumulative(num6));
    }
    public static int isCumulative(int[ ] a) {
        int cumuSum =0;
        if(a.length<=1) return 0;
        for(int i=1; i<a.length; i++){
            cumuSum = cumuSum+a[i-1];
            if(a[i]!= cumuSum)
            return 0;
        }
        return 1;
        
    }
}