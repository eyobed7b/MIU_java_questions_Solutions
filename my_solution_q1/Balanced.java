public class Balanced
{
    public static void main(String[] args) {
        int num1[] = {2, 3, 6, 7} ;
        int num2[] = {6, 3, 2, 7} ;
        int num3 []= {6, 7, 2, 3, 12} ;
        int num4 []= {6, 7, 2, 3, 14, 95} ;
        int num5 []= {7, 15, 2, 3} ;
        int num6[] = {16, 6, 2, 3} ;
        int num7 []= {2} ;
        int num8 []= {3} ;
        int  num9[] = {};
        System.out.println(isBalanced(num1));
        System.out.println(isBalanced(num2));
        System.out.println(isBalanced(num3));
        System.out.println(isBalanced(num4));
        System.out.println(isBalanced(num5));
        System.out.println(isBalanced(num6));
        System.out.println(isBalanced(num7));
        System.out.println(isBalanced(num8));
        System.out.println(isBalanced(num9));
    
      
        
    }
    public static int isBalanced(int[ ] a) {
     
        for(int i=0; i<a.length; i++){
           if(i%2==0 && a[i]%2!=0){
               return 0;
           }
           else if (i%2!=0 && a[i]%2==0){
               return 0;
           }

        }
        return 1;
    }
}