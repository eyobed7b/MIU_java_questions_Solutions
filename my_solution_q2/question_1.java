public class question_1 { 

    public static void main(String[] args) {
    int num1 [] = {0, 1, 2, 3, 4} ;
    int num2 [] =  {3, 2, 1} ;
    int num3 [] =  {3, -2, -1}; 
    int num4 [] =  {3, 2, 1};
    int num5 [] =   {3, 2} ;
    int num6 [] =  {4, 0, 9};
    int num7 [] =   {10} ;
    int num8 [] =  {0, 1}; 
    System.out.println( eval(1.0,num1));
    System.out.println( eval(3.0,num2));
    System.out.println( eval(2.0,num3));
    System.out.println( eval(-3.0,num4));
    System.out.println( eval(2.0,num5));
    System.out.println( eval( 2.0,num6));
    System.out.println( eval(2.0,num7));
    System.out.println( eval(10.0,num8));
    }

    public static double eval(double x, int[ ] a) {
        double sum =0;
        for(int i=(a.length-1); i>=0; i--){
            sum +=a[i]*power(x,i);
        }
        return sum;
        
    }
    private static double power(double x, int k  ) {
        if(k==0) return 1;
        else if(k==1) return x;
        double init =1;
        for(int i=0; i<k;i++) init=init*x;

        return init;
    }
}