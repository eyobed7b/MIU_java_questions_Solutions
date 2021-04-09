public class GuthrieSequence{
    public static void main(String[] args) {
        int num1 [] = {8, 4, 2, 1}   ;
        int num2 [] = {8, 17, 4, 1}   ;
        int num3 [] = {8, 4, 1}  ;
        int num4 [] ={8, 4, 2} ;
        System.out.println(isGuthrieSequence(num1));
        System.out.println(isGuthrieSequence(num2));
        System.out.println(isGuthrieSequence(num3));
        System.out.println(isGuthrieSequence(num4));

    }
    public static int isGuthrieSequence(int[ ] a) {
        if(a[a.length-1]!=1) return 0;
        for(int i=1; i<a.length;i++){

            if(a[i-1]%2==0 && a[i]!=(a[i-1]/2)) return 0;
            else if(a[i-1]%2!=0 && a[i] != ((a[i-1]*3)+1)) return 0;
           
        }
        return 1;
    }
}