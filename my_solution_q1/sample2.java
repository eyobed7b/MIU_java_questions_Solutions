public class sample2{
    public static void main(String[] args) {
       int num1 []= {1} ;
       int num2 []= {1, 2} ;
       int num3 []= {1, 2, 3} ;
       int num4[]= {1, 2, 3, 4} ;
       int num5 []= {3, 3, 4, 4} ;
       int num6 []= {3, 2, 3, 4} ; 
       int num7 []= {4, 1, 2, 3} ;
       int num8 []= {1, 1} ;
       int num9 []= {} ;

       System.out.println(sample(num1));
       System.out.println(sample(num2));
       System.out.println(sample(num3));
       System.out.println(sample(num4));
       System.out.println(sample(num5));
       System.out.println(sample(num6));
       System.out.println(sample(num7));
       System.out.println(sample(num8));
       System.out.println(sample(num9));
    }
    public static int sample(int[ ] a) {
        int even =0;
        int odd =0;
        for(int i=0; i<a.length;i++){
            if(a[i]%2==0) even+=a[i];
            else if(a[i]%2!=0) odd +=a[i];
        }
        return (odd-even);
        
    }
}