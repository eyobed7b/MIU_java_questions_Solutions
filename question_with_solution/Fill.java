public class Fill{
    public static void main(String[] args) {
        int num1 [] ={1,2,3,5,9,12,2,1};
        int num2 [] = {4,2,3,12};
        int num3 [] = {2,6,9,0,3};
     
        for(int i=0; i<fill(num1,3,10).length; i++)
        {
            
            System.out.print(fill(num1,3,10)[i]+" ");
        }
        System.out.println(" ");
        for(int i=0; i<fill(num2,1,5).length; i++)
        {
            
            System.out.print(fill(num2,1,5)[i]+" ");
        }
        System.out.println(" ");
        for(int i=0; i<fill(num3,0,4).length; i++)
        {
            
            System.out.print(fill(num3,0,4)[i]+" ");
        }
        System.out.println(" ");
    }
    public static int [] fill(int [] arr, int k, int n) {
        int count =0;
        int arr2 [] = new int[n];
        if(k==0) return arr2;
        for(int i=0; i<n;i++){
            if(count>(k-1)) count =0;
                 
            arr2[i]=arr[count];
            count++;
        }

        return arr2;
        
    }

}