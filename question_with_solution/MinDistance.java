public class MinDistance{
    public static void main(String[] args) {
        System.out.println(minDistance(13013));
        System.out.println(minDistance(8));
    }

    public static int minDistance(int n) {
        int min=0, prev_no=0,count =0;
        for(int i=1; i<n;i++){
            if(count==0 && n%i==0) {
                prev_no = i;
                count++;
            }else if(count==1 && n%i==0){
                min= i-prev_no;
                count++;
            }else if(count>1 && n%i==0){
                if((i-prev_no)<min){
                    min = i-prev_no;
                }
                prev_no = i;
            }


        }
        return min;
    }
}