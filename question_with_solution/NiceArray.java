public class NiceArray{
    public static void main(String[] args) {

        int num1 [] ={2,10,9,3};
        int num2 [] ={2,2,3,3,3};
        int num3 [] ={0,1,1};
        int num4 [] ={3,4,5,7};
        System.out.println(isNiceArray(num1));
        System.out.println(isNiceArray(num2));
        System.out.println(isNiceArray(num3));
        System.out.println(isNiceArray(num4));
    }
public static int isNiceArray(int [] a) {
    boolean isFound = false;
    for(int i=0; i<a.length;i++){
        for(int k=0; k<a.length;k++){
            if(k!=i && (a[i]==a[k]+1 || a[i]==a[k]-1)){
                isFound = true;
                break;
            }
        }
        if(!isFound) return 0;

        isFound = false;
    }
    return 1;
}
}