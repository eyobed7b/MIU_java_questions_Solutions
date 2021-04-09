public class BunkerNUmber{
    public static void main(String[] args) {
        System.out.println(isBunker(11));
        System.out.println(isBunker(22));
        System.out.println(isBunker(8));
    }
    public static int isBunker(int n) {
        int count =0,sum=1;
        while(sum<n){
            sum+=count;
            count++;
        }
        if(sum==n) return 1;

        return 0;
    }
}