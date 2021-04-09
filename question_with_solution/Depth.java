public class Depth{
    public static void main(String[] args) {
        
        System.out.println(computeDepth(7));
        // System.out.println(computeDepth(13));
        // System.out.println(computeDepth(25));
    }
    public static int computeDepth(int n) {
        boolean isFound = false,checkDigits = true;
        int count =1;
        int digitCounter =0;
        int num =0,digits[]=new int[10];
        while(!isFound){
            num= n*count;
            checkDigits = true;
            while(num!=0){
                for(int i=0; i<digits.length;i++){
                    if((digits[i])==(num%10)){
                        checkDigits = false;
                    }
                    if(digits[i]== 0 && checkDigits){
                        digits[i]= num%10;
                        digitCounter++;
                        break;

                    }
                   
                }
                num/=10;
            }
            count++;
            if(digitCounter==10) {isFound = true;
           System.out.println(count);
        }
            
        }

        return count;
    }
}