public class Sorted
{
    public static void main(String[] args) {
        int num1 [] = {1, 2, 3, 4} ;
        int num2 [] =  {4, 3, 2, 1} ;
        int num3 [] =  {1, 2, 4, 3} ;
        int num4 [] =  {} ;
        int num5 [] =  {2} ;
        System.out.println(isSorted(num1));
        System.out.println(isSorted(num2));
        System.out.println(isSorted(num3));
        System.out.println(isSorted(num4));
        System.out.println(isSorted(num5));

    }
    public static int isSorted(int[ ] a)
    {
         boolean asce = true;
         boolean desce = true;
         if(a.length == 0 || a.length==1) return 1;
         if(a[0]<a[1]) {
             for(int i=1; i<a.length; i++){
               if(a[i-1]>a[i]){
                   asce = false;
                   break;
               }
             }
         }

         else if(a[0]>a[1]) {
              for(int i=1; i<a.length; i++){
                if(a[i-1]<a[i]){
                    desce = false;
                    break;
                }
             }
         }

         if(asce&&desce) return 1;
         
         return 0;
    }
    

}