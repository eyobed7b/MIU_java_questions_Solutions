public class  Normal{
    public static void main(String[] args) {
        for(int i=0; i<=20 ;i++)
        System.out.println(isNormal(i));
    }
    public static int isNormal(int n) {
        for (int i=2; i<n;i++ ){
            if(i%2!=0 && n%i==0) return 0;
        }
        return 1;
    }
}