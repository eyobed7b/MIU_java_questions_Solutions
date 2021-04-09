public class MadHav{
    public static void main(String[] args) {
       int num1 [] = {2, 1, 1}  ;
       int num2 [] = {2, 1, 1, 4, -1, -1}  ;
       int num3 [] = {6, 2, 4, 2, 2, 2, 1, 5, 0, 0}  ;
       int num4 [] = {18, 9, 10, 6, 6, 6}   ;
       int num5 [] = {-6, -3, -3, 8, -5, -4}  ;
       int num6 [] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, -2, -1};
       int num7 [] = {3, 1, 2, 3, 0} ;
        System.out.println(isMadhavArray(num1));
        System.out.println(isMadhavArray(num2));
        System.out.println(isMadhavArray(num3));
        System.out.println(isMadhavArray(num4));
        System.out.println(isMadhavArray(num5));
        System.out.println(isMadhavArray(num6));
        System.out.println(isMadhavArray(num7));
        
    }

    public static  int isMadhavArray(int[ ] a) {
        
    
        int temp =0,prev_sum =a[0],take=0;
       boolean isLengthOk = false;

    //    for(int i= 1; i<=a.length;i++){
    //          if((i*(i+1)/2)==a.length) return 0; 
    //    }
                 
        for(int i=1; i<a.length;i++){
           
           for(int k=0; k<=i;k++){
               temp+=a[take];
               take++;

           }
           if(temp!=prev_sum) return 0;

          
        }
        return 1;
    }
}