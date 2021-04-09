public class Complet2{
    public static void main(String[] args) {
        int num1 [] ={2,3,2,4,11,6,10,9,8};
        int num2 [] ={2,3,3,6};
        int num3 [] ={2,-3,4,3,6};
        System.out.println(isComplete(num1));
        System.out.println(isComplete(num2));
        System.out.println(isComplete(num3));
    }
    public static int  isComplete(int [] a) {
        int max=0; boolean isFound =false;
        for(int i=0; i<a.length;i++){
            if(a[i]%2==0 && a[i]>max) max = a[i];
            if(a[i]<=0) return 0;
        }
       // System.out.println(max);
        for(int k=2; k<max; k+=2){
            for(int i=0; i<a.length; i++){
                if(k==a[i]) {isFound = true; break;}
            }
            if(!isFound) return 0;
            isFound = false;
        }
        return 1;
    }
}