public class Solve10{
    public static void main(String[] args) {

        System.out.println(solve10());
    }
    public static int [] solve10() {
        int nums [] = new int[2];
        
        for(int i=0; i<10; i++){
            for(int k=0; k<10; k++){
            
                if(factorial(i)+factorial(k)==factorial(10)) {
                    nums[0]=i;
                    nums[1] =k;
                                       return nums;
                }
            }
        }
       
        return nums;
    }

    public static int factorial(int num) {
        int fact =1;
        for(int i=num ; i>=1 ; i--){
                fact *=i;
        }

        return fact;
    }
}