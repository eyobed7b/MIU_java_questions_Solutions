public class question5{
    public static void main(String[] args) {
        int num1 [] = {1,2,0,0,0,3,4};
        int num2 [] ={1,1,1,1,0,0,0,0,0,2,1,2,18} ;
        int num3 [] = {1, 2, 0, 0, 3, 4};
        int num4 [] = {1,2,0,0,0,3,4,5} ;
        int num5 [] = {3,8,3,0,0,0,3,3};
        int num6 [] = {1,2,0,0,0,3,4,0} ;
        int num7 [] = {0,1,2,0,0,0,3,4} ;
        int num8 [] = {0,0,0} ;
        System.out.println(isHollow(num1));
        System.out.println(isHollow(num2));
        System.out.println(isHollow(num3));
        System.out.println(isHollow(num4));
        System.out.println(isHollow(num5));
        System.out.println(isHollow(num6));
        System.out.println(isHollow(num7));
        System.out.println(isHollow(num8));
    }
    public static int isHollow(int[ ] a)  {
        int first=0,zeros=0,last=0,count =0;
       
        for(int i=0; i<a.length;i++){
            if(a[i]==0){
                zeros++;
                
            }
            else if(zeros==0 &&a[i]!=0){
                first++;
            }
            else if(zeros>0 && a[i]!=0){
                last++;
            }
          if((zeros>0)&& (last>0 ) && a[i]==0) {return 0;}
        }
        if(first==last && zeros>2) return 1;
     

      return 0;
    }
}