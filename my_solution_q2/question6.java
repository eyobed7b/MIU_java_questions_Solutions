public class question6{
    public static void main(String[] args) {
        System.out.println(isConsectiveFactored(24));
        System.out.println(isConsectiveFactored(105));
        System.out.println(isConsectiveFactored(90));
        System.out.println(isConsectiveFactored(23));
        System.out.println(isConsectiveFactored(15));
        System.out.println(isConsectiveFactored(2));
        System.out.println(isConsectiveFactored(0));
        System.out.println(isConsectiveFactored(-12));
    }
    public static int isConsectiveFactored(int n) {
        int product =1, prev = 0,count=0;

        if(n<=0) return 0;
    
        for(int i=1;product != n; i++ ){
            if(n%i==0){
                           if(count>0 && i == prev +1 && prev > 1) {return 1;}
               product = product *i;
               prev = i;
               
               count ++;
            
           
           }
        }

        return 0;
    }

    
}