public class Filter{
    public static void main(String[] args) {
        int num1 [] = {1,2,3,9,6,11} ;
        int num2 [] = {3,4,6,7,14,16} ;
        int num3 [] = {1,2,3,4,10,11,13} ;
        int num4 [] = {3,6,5,5,13,6,13}  ;
        int num5 [] = {9,6,18} ;
        int num6 [] = {4,7,13};
        System.out.println(isFilter(num1));
        System.out.println(isFilter(num2));
        System.out.println(isFilter(num3));
        System.out.println(isFilter(num4));
        System.out.println(isFilter(num5));
        System.out.println(isFilter(num6));

    }
    public static int isFilter(int []a) {
        boolean isNineFound = false, isSevenFound = false, isNineFilterd = false,isSevenFilterd = true;
        for(int i=0 ; i<a.length;i++){
            if(a[i]==9) isNineFound = true;
            else if(a[i]==7) isSevenFound = true;

            if(isNineFound && a[i]==11) isNineFilterd = true;
            else if(isSevenFound && a[i]==13) isSevenFilterd = false;
        }
        if(isNineFilterd || (isSevenFilterd && isSevenFound) || (!isNineFound && !isSevenFound) ) return 1;


        return 0;
        
    }
}