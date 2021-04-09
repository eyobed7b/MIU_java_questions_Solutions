public class NUnique{
    public static void main(String[] args) {

        int num1 [] = {7, 3, 3, 2, 4}   ;
        int num2 [] = {7, 3, 3, 2, 4}   ;
        int num3 [] ={7, 3, 3, 2, 4}  ;
        int num4 [] ={7, 3, 3, 2, 4}    ;
        int num5 [] ={7, 3, 3, 2, 4}  ;
        int num6 [] = {1}  ;
        System.out.println(isNUnique(num1,6));
        System.out.println(isNUnique(num2,10));
        System.out.println(isNUnique(num3,11));
        System.out.println(isNUnique(num4,8));
        System.out.println(isNUnique(num5,4));
        System.out.println(isNUnique(num6,6));
     
    }
    public static   int isNUnique(int[ ] a, int n) {
        int count =0;
        if(a.length<2)return 0;
        for(int i=0; i<a.length;i++){
            for(int k=0; k<a.length;k++)
            {

                if(i!=k && a[i]+a[k]==n) count++;
            }
        }

          if(count ==2)
        return 1;

        return 0;

    
    }
}