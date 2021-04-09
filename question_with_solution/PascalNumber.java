public class PascalNumber{
    public static void main(String[] args) {
        System.out.println(isPascalNumber(6)); 
        System.out.println(isPascalNumber(15)); 
        System.out.println(isPascalNumber(7)); 
    
    }
        public static int isPascalNumber(int n) {
            int sum=0;
            for(int i=1; sum<n; i++){
                sum+=i;
                
            }
            if(sum==n) return 1;

            return 0;
        }
}