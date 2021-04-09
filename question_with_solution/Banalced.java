public class Banalced{
    public static void main(String[] args) {

        int num1 [] ={-2,3,2,-3};
        int num2 [] ={-2,2,2,2};
        int num3 [] ={5,-2,2};
        System.out.println(isBalanced(num1));
        System.out.println(isBalanced(num2));
        System.out.println(isBalanced(num3));
    }

    public static int isBalanced(int[] a)
    {
        boolean isFound = false;

     if(a.length<=1) return 0;

     for(int i=0; i<a.length;i++)
     {
         for(int k=0; k<a.length ; k++)
     {
         if(a[i]==(-a[k])){
             isFound = true;
         }
     }
     if(!isFound) return 0;
     isFound = false;
    }
     
     return 1;
    }
}