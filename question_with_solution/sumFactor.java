public class sumFactor{
    public static void main(String[] args) {
        int num1 [] ={3, 0, 2, -5, 0}  ;
        int num2 [] = {9, -3, -3, -1, -1} ;
        int num3 [] = {1} ;
        int num4 [] = {0, 0, 0} ;
        System.out.println(sumFactor( num1));
        System.out.println(sumFactor( num2));
        System.out.println(sumFactor(num3));
        System.out.println(sumFactor( num4));
    }
    public static int sumFactor(int[ ] a) {
        int count =0,sum =0;
       for(int i=0; i<a.length;i++){
           sum+=a[i];
       }  
       for(int i=0; i<a.length;i++){
           if(a[i]==sum) count++;
       } 
       return count;
    }
}