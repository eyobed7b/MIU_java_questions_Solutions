public class StantonMeasure{
    public static void main(String[] args) {
        int num1 []= {1, 4, 3, 2, 1, 2, 3,2};
        int num2 []= {1} ;
        int num3 []= {0};
        int num4 []= {3, 1, 1, 4} ;
        int num5 [] ={1, 3, 1, 1, 3, 3, 2, 3, 3, 3, 4} ;
        int num6 [] ={};
        System.out.println(stantonMeasure(num1));
        System.out.println(stantonMeasure(num2));
        System.out.println(stantonMeasure(num3));
        System.out.println(stantonMeasure(num4));
        System.out.println(stantonMeasure(num5));
        System.out.println(stantonMeasure(num6));
    
    }
    public static int stantonMeasure(int[ ] a){
        int countOne=0,countN =0;
        for(int i=0; i<a.length;i++){
            if(a[i]==1) countOne++;
        }
        for(int i=0; i<a.length; i++){
            if(a[i]==countOne){
                countN++;
            }
        }
        return countN;
    }
}