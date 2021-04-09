public class MeeraArray{
    public static void main(String[] args) {
        int num1 [] ={-4,0,1,0,2};
        int num2 [] ={1,0,0,8,0};
       
        System.out.println(isMeera(num1));
        System.out.println(isMeera(num2));
    }
    public static int isMeera(int []a) {
        for(int i=0; i<a.length ;i++){
            if(a[i]>i) return 0;
        }
        return 1;
    }
} 