public class question_5{
    public static void main(String[] args) {
        int num1[]= {8, 9, 9, 5, 0} ;
        int num2[]= {8, 9, 9, 5, 0} ; 
        int num3[]= {9, 9, 9, 9, 9, 9, 9, 9, 9, 9} ; 
        int num4[]= {9, 9, 9, 9, 9, 9, 9, 9, 9, 9} ; 
       updateMileageCounter(num1,1);
        updateMileageCounter(num2,2);
        updateMileageCounter(num3,1);
        updateMileageCounter(num4,13);
    }

    public static void updateMileageCounter(int[ ] a, int miles)  {
     boolean isFound = false;
     int temp =0;
         for(int i=0; i<a.length;i++){
           
            if(i==0)  a[i] = a[i]+miles;
            a[i]=a[i]+temp;
           
            if(a[i]>=10){
                temp = a[i]/10;

                    a[i]=a[i]%10;
                   
                    
                } else temp =0;
                // System.out.print(temp+ " " +a[i]+" ");
                
         
          
          

         }
        for(int i=0; i<a.length;i++) System.out.print(a[i]);
        System.out.println(" ");
         
    }
}