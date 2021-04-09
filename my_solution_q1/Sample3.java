public class Sample3{
    public static void main(String[] args) {
    
    char char1[] = {'a', 'b', 'c'};
    char char2 []= {};
    // sample2(char1, 0, 2);
        System.out.println(sample(char1, 0, 4 ));
        System.out.println(sample(char1, 0, 3));
       System.out.println(sample(char1, 0, 2));
        System.out.println(sample(char1, 0, 1));
        System.out.println(sample(char1, 1, 3 ));
        System.out.println(sample(char1, 1, 2 ));
        System.out.println(sample(char1, 1, 1));
        System.out.println(sample( char1, 2, 2));
        System.out.println(sample(char1, 2, 1));
        System.out.println(sample(char1, 3, 1 ));
        System.out.println(sample(char1, 1, 0 ));
        System.out.println(sample(char1, -1, 2 ));
        System.out.println(sample(char1, -1, -2 ));
        System.out.println(sample(char2, 0, 1 ));



    }
    public static char [] sample(char[ ] a, int start, int length) {
        char[] sub = new char[length]; 
        if (length < 0 || start < 0 || start+length-1>=a.length || a.length==0) 
        { 
          return sub; 
        } 
                      
        
        for (int i=start, j=0; j<length; i++, j++) 
        { 
          sub[j] = a[i]; 
        } 
                      
        return sub; 
       
          
    }
}
