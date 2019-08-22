package switchtest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
				
		//switch primjer
		
		
		System.out.println("Enter the day in week: ");
       
       try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
	       	String name = reader.readLine();
	       	
	       	SwitchTest st = new SwitchTest();   		
	   		var numberInWeek = st.getNumberOfDayInWeek(name);   
	   		
	   		System.out.println(name + " = " + numberInWeek);
   		
       }catch(IOException e){
       	System.out.println("Exception while reading from console: " + e);  
       	
       }catch(IllegalArgumentException e){  
       	System.out.println("Exception while processing input value: " + e);
       }    				
		  
	
	
		//doWork();
	}
		
	public static void doWork() {
		  Main main = new Main();
		
	      //before: with type declaration
	      //MathOperation addition = (int a, int b) -> a + b;
	     	      
	      //with var declaration
	      MathOperation addition = (var a, var b) -> a + b;
			
	      //without type declaration
	      MathOperation subtraction = (a, b) -> a - b;
			
	      //with return statement along with curly braces
	      MathOperation multiplication = (var a, var b) -> { return a * b; };
			
	      //without return statement and without curly braces
	      MathOperation division = (var a, var b) -> a / b;
			
	      System.out.println("6 + 3 = " + main.operate(6, 3, addition));
	      System.out.println("6 - 3 = " + main.operate(6, 3, subtraction));
	      System.out.println("6 x 3 = " + main.operate(6, 3, multiplication));
	      System.out.println("6 / 3 = " + main.operate(6, 3, division));
			
	      //without parenthesis
	      GreetingService greetService1 = message ->
	      System.out.println("Hello " + message);
			
	      //with parenthesis
	      GreetingService greetService2 = (message) ->
	      System.out.println("Hello " + message);
			
	      greetService1.sayMessage("Nikolina");
	      greetService2.sayMessage("Nina");
	}
		
	   interface MathOperation {
	      public abstract int operation(int a, int b);
	   }
		
	   interface GreetingService {
	      void sayMessage(String message);
	   }
		
	   private int operate(int a, int b, MathOperation mathOperation) {
	      return mathOperation.operation(a, b);
	   }
	

	   

		
}
