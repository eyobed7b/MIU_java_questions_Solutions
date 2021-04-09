public class Centered15{
    public static void main(String[] args) {
        int num1 [] = {3, 2, 10, 4, 1, 6, 9}  ;
        int num2 [] = {2, 10, 4, 1, 6, 9}  ;
        int num3 [] = {3, 2, 10, 4, 1, 6}  ;
        int num4 [] = {1,1,8, 3, 1, 1}  ;
        int num5 [] = {9, 15, 6}  ;
        int num6 [] = {1, 1, 2, 2, 1, 1} ;
        int num7 [] = {1, 1, 15 -1,-1} ;
        System.out.println(isCentered15(num1));
        System.out.println(isCentered15(num2));
        System.out.println(isCentered15(num3));
        System.out.println(isCentered15(num4));
        System.out.println(isCentered15(num5));
        System.out.println(isCentered15(num6));
        System.out.println(isCentered15(num7));
        
    }
    
    

    public static int isCentered15(int[ ] a) {
        int sum=0;
        for(int i=1; i<a.length ; i++){
            if(a[i]==15&& i==(a.length-i-1)) return 1;
            sum=a[i];
            for(int k=(i+1); k<a.length;k++){
                sum +=a[k];
               
                
                if(sum>15){
                    sum =0;
                    break;
                }else if(sum ==15 && i==(a.length-k-1))return 1;
            }
            
           
        }
        return 0;
        
    }
}