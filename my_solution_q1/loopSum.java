public class loopSum
{
    public static void main(String[] args) {
      
        int num1 []= {1, 2, 3} ; int n1= 2;
        int num2 []= {-1, 2, -1} ; int n2 =7;
        int num3 []={1, 4, 5, 6} ; int n3=4;
       System.out.println(loopSum(num1,n1));
       System.out.println(loopSum(num2,n2));
       System.out.println(loopSum(num3,n3));
    }
public static int loopSum(int[ ] a, int n) {
    int count =0;
    int sum =0;
    for(int i=0; i<a.length; i++){
        sum+=a[i];
        count++;
        if(count == n) return sum;
        else if(count == a.length) i=0;
     
    }
    return sum;
}

}