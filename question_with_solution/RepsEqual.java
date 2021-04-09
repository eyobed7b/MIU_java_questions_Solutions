public class RepsEqual{
    public static void main(String[] args) {
        int num1 [] = {3, 2, 0, 5, 3} ;
        int num2 [] = {3, 2, 0, 5} ;
        int num3 [] ={3, 2, 0, 5, 3, 4}  ;
        int num4 [] ={2, 3, 0, 5, 3}  ;
        int num5 [] = {9, 3, 1, 1, 2} ;
        int num6 [] = {0, 3, 2, 0, 5, 3} ;
        
        System.out.println(repsEqual(num1,32053 ));
        System.out.println(repsEqual(num2, 32053 ));
        System.out.println(repsEqual(num3,32053 ));
        System.out.println(repsEqual(num4,32053 ));
        System.out.println(repsEqual(num5,32053 ));
        System.out.println(repsEqual(num6,32053 ));
    }
    public static int repsEqual(int[ ] a, int n) {
        int count =a.length-1,checker=0;
        while(n!=0){
                  checker = n%10;
                  if(a[count]!= checker) return 0;
                  n/=10;
                  count--;
        }
        return 1;
    }
}