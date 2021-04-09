public class Layered
{
    public static void main(String[] args) {
        int num1 [] = {1, 1, 2, 2, 2, 3, 3} ; 
        int num2 [] = {3, 3, 3, 3, 3, 3, 3} ;
        int num3 [] = {1, 2, 2, 2, 3, 3} ;
        int num4 [] = {2, 2, 2, 3, 3, 1, 1} ;
        int num5 [] = {2} ;
        int num6 [] = {} ;
        System.out.println(isLayered(num1));
        System.out.println(isLayered(num2));
        System.out.println(isLayered(num3));
        System.out.println(isLayered(num4));
        System.out.println(isLayered(num5));
        System.out.println(isLayered(num6));



    }

    public static int isLayered(int[ ] a) {
        int count =0;
        boolean isfound =false;
        if(a.length ==0 || a.length==1)  return 0;
        for (int i=1; i<a.length;i++ ){
            if(a[i-1]==a[i]){
                count++;
            }
            else if(a[i-1]!=a[i]){
                if(count==0){
                    return 0;
                }
               else  if(count>0){
                    if(a[i-1]>a[i])
                    return 0;
                    else if(a[i-1]<a[i])
                    count =0;
                }
            }


        }
        return 1;
    }
}