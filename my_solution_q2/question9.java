public class question9{
     public static void main(String[] args) {
         int num1 [] = {1, 2, -2, -1}  ;
         int num2 [] = {-3, 1, 2, -2, -1,3} ;
         int num3 [] = {3, 4, -2, -3, 2} ;
         int num4 [] = {0, 0, 0, 0, 0,0}  ;
         int num5 [] = {3, -3, -3} ;
         int num6 [] = {3} ;
         int num7 [] = {}  ;
         System.out.println(isZeroBalanced(num1));
         System.out.println(isZeroBalanced(num2));
         System.out.println(isZeroBalanced(num3));
         System.out.println(isZeroBalanced(num4));
         System.out.println(isZeroBalanced(num5));
         System.out.println(isZeroBalanced(num6));
         System.out.println(isZeroBalanced(num7));

         
     }
     public static int isZeroBalanced(int[ ] a)  {
         int zeros =0; int count =0;
         if(a.length ==0) return 0;
         for(int i=0; i<a.length;i++){
                if(a[i]==0) zeros ++;
                else{
                    for(int k=0; k<a.length;k++){
                        if(a[i]+a[k]==0) count ++;
                    }
                }
         }

         if(count ==a.length || zeros == a.length) return 1;

         return 0;
     }
}