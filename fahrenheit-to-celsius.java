
/**
 *
 * @author user
 */
import java.util.Scanner;
public class FahrenheitToCelsius 
{
    public static void main(String[] args)
    {
     double Fahrenheit,Celciusresult,Celcius;
 Scanner Temperature = new Scanner(System.in);
  System.out.println("Please Input the Temperature in Fahrenheit here: ");
  Fahrenheit = Temperature.nextDouble();
  
  Celciusresult = Fahrenheit - 32;
  Celcius = Celciusresult*5/9;
  
  System.out.println ("The Temperature in Fahrenheit today is: " + Fahrenheit + " Fahrenheit" +  " And the Temperature in Celcius today is: "
  + Celcius + " Degrees Celcius.");
    }
}
