public class Inertial{
 public static void main(String[] args) {
    int num1 [] = {1}  ;
    int num2 [] = {2}  ;
    int num3 [] = {1,2,3,4}  ;
    int num4 [] = {1, 1, 1, 1, 1, 1, 2}    ;
    int num5 [] = {2, 12, 4, 6, 8, 11}  ;
    int num6 [] ={2, 12, 12, 4, 6, 8, 11} ;
    int num7 [] = {-2, -4, -6, -8, -11} ;
    int num8 [] = {2, 3, 5, 7}  ;
    int num9 [] ={2, 4, 6, 8, 10}  ;
    
    System.out.println(isInertial(num1));
    System.out.println(isInertial(num2));
    System.out.println(isInertial(num3));
    System.out.println(isInertial(num4));
    System.out.println(isInertial(num5));
    System.out.println(isInertial(num6));
    System.out.println(isInertial(num7));
    System.out.println(isInertial(num8));
    System.out.println(isInertial(num9));
 }
 public static int isInertial(int[ ] a)  {
     int max=0;
    boolean isOdd = false;
     if(a.length ==0 || a.length <=2) return 0;

     for(int i=0; i<a.length;i++){
          if(a[i]%2!=0) isOdd = true;

         if( a[i]>max) max=a[i];

     }
       if(max%2==0 && isOdd)
{    
     for(int i=0; i<a.length;i++){
         for(int k=0;k<a.length;k++){
             if(a[i]%2!=0 && a[k]%2==0 && a[i]<a[k] && a[k]!=max) return 0;
         }
     }
     return 1;
    }
    return 0;
    
     
 }
}