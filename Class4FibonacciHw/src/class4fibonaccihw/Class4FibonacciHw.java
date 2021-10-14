
package class4fibonaccihw;

public class Class4FibonacciHw {

    public static void main(String[] args) {
        
        int number1=0;
        int number2=1;
        int result=0;
        
        System.out.println(number1);
        System.out.println(number2);
        
        for(int a=3; a<=9; a++){
            result=number1+number2;
            System.out.println(result);
            
            number1=number2;
            number2=result;
        
        }
        
       
        
        
    }
    
}
