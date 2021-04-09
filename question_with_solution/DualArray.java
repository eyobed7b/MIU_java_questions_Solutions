public class DualArray{
    public static void main(String[] args) {
        int num1 [] ={1,2,1,3,3,2};
        int num2 [] ={2,5,2,5,5};
        int num3 [] ={3,1,1,2,2};
        System.out.println(isDual(num1));
        System.out.println(isDual(num2));
        System.out.println(isDual(num3));
    }
    public static int isDual(int []a) {
        if(a.length<=1) return 0;
        int count =0;
        
        for(int i=0; i<a.length;i++){
            for(int k=0; k<a.length;k++){
                if(a[k]==a[i]) count ++;
            }
            if(count!=2) return 0;
            count=0;
        }
        return 1;
        
    }
}