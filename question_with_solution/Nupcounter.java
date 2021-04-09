public class Nupcounter{
 public static void main(String[] args) {
    int num [] = {2,3,1,-6,8,-3,-1,2};
    int num2 [] ={6,3,1} ;
    int num3 [] ={1,2,-1,5,3,2,-3};
    System.out.println(nupcounter(num,5));
    System.out.println(nupcounter(num2,6));
    System.out.println(nupcounter(num3,2));
 }  

 public static int nupcounter(int [ ] a, int n) {
     int sum=0;
     int prev_sum=0,count =0;

     for(int i=0; i<a.length;i++){
         prev_sum = sum;
        sum+=a[i];
        if(prev_sum<=n&& sum>n) count ++;
     }
     return count;
     
 }
}