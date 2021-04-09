public class Sample1{
    public static void main(String[] args) {
        int num1[] = {1, 2, 3, 4} ;
        int num2[] = {4, 1, 2, 3};
        int num3[] = {1, 1, 2, 2}; 
        int num4[] = {1, 1}; 
        int num5[] = {1} ;
        int num6[] = {} ;
        System.out.println(Sample(num1));
        System.out.println(Sample(num2));
        System.out.println(Sample(num3));
        System.out.println(Sample(num4));
        System.out.println(Sample(num5));
        System.out.println(Sample(num6));
    }
    public static int Sample(int[ ] a) {
        int max1=0;
        int max2 =0;
        if(a.length==0) return -1;
        for(int i =0; i<a.length;i++ ){
             if(a[i]>max1) {
                 max1=a[i];
                 for(int k=0; k<a.length;k++){
                     if(max1>a[k] && a[k]>max2)
                     max2 = a[k];
                 }
             }
        }
        if(max2 ==0) return -1;

        return max2;
    }
}