public class Normai{
    public static void main(String[] args) {
        for(int i=1; i<=10;i++)
        System.out.println(isNormail(i));
    }
    public static int isNormail(int n){
      for(int i=2;i<n;i++)
      if(n%i==0 && i%2!=0) return 0;   
    
    return 1;
 
}}