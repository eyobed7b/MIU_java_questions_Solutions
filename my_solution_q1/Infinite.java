public class Infinite
{
    public static void main(String[] args) {
        int num1 []={1, 2, -1, 5};
        int num2 []={1, 2, 4, -1};
        int num3 []= {5, 3, 4, -1, 1, 2} ;
        int num4 []= {3} ;
        int num5 []= {3, 2, 3, 1} ;
        int num6 []= {0} ;
        int num7 []= {-1} ;

        System.out.println(isInfinite(num1));
        System.out.println(isInfinite(num2));
        System.out.println(isInfinite(num3));
        System.out.println(isInfinite(num4));
        System.out.println(isInfinite(num5));
        System.out.println(isInfinite(num6));
        System.out.println(isInfinite(num7));
    }
    public static int isInfinite(int[ ] a) {
         int count =0;
         int check_infi =0;
        
         
     while(check_infi< a.length   ){

           if(a[count]==-1){
               return -1;
           }
           else if(a[count]<-1 || a[count]>= a.length){
               return 1;
           }
           count = a[count];
           check_infi++;


     }
     return 0;


    }
}