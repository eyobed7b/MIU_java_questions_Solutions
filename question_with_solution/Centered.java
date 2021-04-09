public class Centered
{
    public static void main(String[] args) {
        int num1[] = {1, 2, 3, 4, 5} ;
        int num2[] = {3, 2, 1, 4, 5} ;
        int num3[] = {3, 2, 1, 4, 1} ;
        int num4[] = {3, 2, 1, 1, 4, 6}; 
        int num5[] = {} ;
        int num6[] = {1};
        System.out.println(isCentered(num1));
        System.out.println(isCentered(num2));
        System.out.println(isCentered(num3));
        System.out.println(isCentered(num4));
        System.out.println(isCentered(num5));
        System.out.println(isCentered(num6));
    }
    public static int isCentered(int[ ] a)
    {
        if(a.length%2==0 || a.length==0) return 0;
        
        for(int i=0; i<a.length;i++){
           
            if(i!=a.length/2 && a[a.length/2]>=a[i])
            return 0;
            
        }
        return 1;
    }
}