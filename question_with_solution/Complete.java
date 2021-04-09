public class Complete{
    public static void main(String[] args) {
        int num1 [] ={-5,6,2,3,2,4,5,11,8,7};
        int num2 [] ={5,7,9,13};
        int num3 [] ={2,2};
        int num4 [] ={2,6,3,4};

        System.out.println(isComplete(num1));
        System.out.println(isComplete(num2));
        System.out.println(isComplete(num3));
        System.out.println(isComplete(num4));
    }
    public static int isComplete(int[]a) {
        int evenCount =0,count=0,max=0,min=0;
        for(int i=0; i<a.length;i++){
            if(a[i]%2==0 && evenCount ==0){
                min= a[i];
                evenCount++;
            }
            if(a[i]%2==0 && a[i]>max) max = a[i];
            if(a[i]%2==0 && a[i]<min) min = a[i];

        }

        if((min>0|| max>0) && (min!=max)){
            for(int i= (min+1); i<max; i++){
                for(int k=0; k<a.length;k++){
                    if(i==a[k]) count++;
                }
            }
            
        if(count==(max-min-1)) return 1;
        }

return 0;

    }
}