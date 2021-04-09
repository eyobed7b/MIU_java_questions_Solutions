public class PorcupcinNumber{
    public static void main(String[] args) {

        System.out.println(findPorcupineNumber(0));
        System.out.println(findPorcupineNumber(139));
    }
    public static int  isPrime(int num) {
        for(int i=2; i<num;i++){
            if(num%i==0) return 0;
        }
        return 1;
   }

    public static int findPorcupineNumber(int n) {
        int temp=0, pre_temp =0; int count=0;
         boolean isFound = false;
         n+=1;
         while(!isFound){
            if(isPrime(n)==1 ){

           if(n%10==9 ) {

            if(count==0) {
                temp = n;
                count ++;
            } else if(count ==1){
                isFound = true;
            }

           }else if(count ==1){
                count =0;
        }
            

            } 
         }
        
        return temp;
    }
}
  
 