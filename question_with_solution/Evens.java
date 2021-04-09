public class Evens{
    public static void main(String[] args) {
        System.out.println(isEven(2426));
        System.out.println(isEven(3224));
    }
    public static int isEven(int num) {
        while(num!=0){
            if((num%10)%2!=0) return 0;
            num/=10;
        }

        return 1;
    }
}