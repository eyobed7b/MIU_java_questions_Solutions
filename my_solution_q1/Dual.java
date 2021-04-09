public class Dual
{
    public static void main(String[] args) {
       int num1 []= {1, 2, 3, 0} ;
       int num2 []= {1, 2, 2, 1, 3, 0} ;
       int num3 []={1, 1, 2, 2} ;
       int num4 []={1, 2, 1} ;
       int num5 []={} ;
      System.out.println(isDual(num1));
      System.out.println(isDual(num2));
      System.out.println(isDual(num3));
      System.out.println(isDual(num4));
      System.out.println(isDual(num5));
       
    }

    public static int isDual(int[ ] a) {
        int check=0;
        if(a.length%2!=0) return 0;
        else if(a.length==0) return 1;
        for(int i=2; i<a.length;i++){
            check +=a[i-2];
           if(i%2!=0 ){
           
            if(check != a[i-1]+a[i]) return 0;

            check =0;

           }

        }
        return 1;
        
    }
    
}