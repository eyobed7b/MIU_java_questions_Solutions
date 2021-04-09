public class SquarePair
  {  
      public static void main(String[] args) {
          int num1 [] = {9,0,2,-5,7};
          int num2 [] = {9};
          int num3 [] = {11,5,4,20,0 ,-2};

        System.out.println(countSquarePairs(num1));
        System.out.println(countSquarePairs(num2));
        System.out.println(countSquarePairs(num3));

    }
public static int countSquarePairs(int[ ] a) {
    int count =0;
    if(a.length==0 || a.length<2) return 0;
    for(int i=0; i<a.length;i++){
           if(a[i]>0)
        for(int k=0; k<a.length;k++){
            if(a[i]<a[k] &&   a[k]>0){
                if(isSquare(a[i]+a[k])==1){ count++;
               
                }
            }
        }

    }
    return count;
}
    
    public static int isSquare(int num) {
        for(int i=1; i*i<=num;i++){
            if(num%i==0 && num/i==i) return 1;
        }
        return 0;
    }

}
