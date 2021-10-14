
package class4fibonacci;

public class Class4Fibonacci {

    public static void main(String[] args) {
       
        int number1=0;
        int number2=1;
        int result=0;
        
        System.out.println(number1);
        System.out.println(number2);
        
        for(int a=3; a<=10; a++){
            result=number1+number2;
            System.out.println(result);
            number1=number2;
            number2=result;
        
        }
        
        
    }
    
}
