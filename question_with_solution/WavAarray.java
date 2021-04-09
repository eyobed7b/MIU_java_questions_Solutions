public class WavAarray{
    public static void main(String[] args) {
        int num1 [] ={7,2,9,10,5};
        int num2 [] ={4,11,12,1,6};
        int num3 [] = {1,0,5};
        int num4 [] = {2};
        int num5 [] = {2,6,3,4};
        System.out.println(isWave(num1));
        System.out.println(isWave(num2));
        System.out.println(isWave(num3));
        System.out.println(isWave(num4));
        System.out.println(isWave(num5));
    }
    public static int isWave(int[]a) {
        int prev_no =0;
        for(int i=0; i<a.length;i++){
            if(i==0) prev_no = a[i];
            else{
                if(a[i]%2==0 && prev_no %2==0) return 0;
                else if(a[i]%2!=0 && prev_no % 2!=0) return 0;

                prev_no = a[i];
            }


        }

        return 1;
    }
}