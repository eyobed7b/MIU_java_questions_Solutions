public class question8{
    public static void main(String[] args) {
       int num1 [] = {1, 2, 3, 4}  ;
       int num2 [] = {18, -12, 9, -10} ;
       int num3 [] = {1,1,1,1,1,1,1,1,1}  ;
       int num4 [] =  {1,1,1,1,1,2,1,1,1};

       System.out.println(largestAdjacentSum(num1));
       System.out.println(largestAdjacentSum(num2));
       System.out.println(largestAdjacentSum(num3));
       System.out.println(largestAdjacentSum(num4));
    }
    public static int  largestAdjacentSum(int[ ] a)  {
     int max=0;
     for(int i=1; i<a.length; i++){
         if(a[i]+a[i-1]>max) max = a[i]+a[i-1];
     }
     return max;
        
    }
}