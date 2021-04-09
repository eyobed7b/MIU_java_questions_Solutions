public class AllPosibilities{
    public static void main(String[] args) {
        
        int num1[] = {1, 2, 0, 3} ;
        int num2[] = {3, 2, 1, 0} ; 
        int num3[] = {1, 2, 4, 3} ;
        int num4[] = {0, 2, 3} ;
        int num5[] = {0} ;
        int num6 []= {0,0,0};
        System.out.println(isAllPossibilities(num1));
        System.out.println(isAllPossibilities(num2));
        System.out.println(isAllPossibilities(num3));
        System.out.println(isAllPossibilities(num4));
        System.out.println(isAllPossibilities(num5));
        System.out.println(isAllPossibilities(num6));

    }

    public static int isAllPossibilities(int[ ] a) {
      int count =0;
        if(a.length ==0)
        return 0;
        for(int i = 0; i< a.length ; i++){
             for(int k=0;k<a.length ; k++){
                 if(a[k]==i)
                   { count ++;
                    break;}
             }

        }
        if(count ==a.length)
        return 1;
        else
        return 0;
        
    }
}