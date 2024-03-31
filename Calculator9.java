 public class Calculator9
{
    public float add(float num1 ,float num2)
    {
        return(num1 + num2); 
    }
    public float sub (float num1 ,float num2)
    {
        return(num1 - num2); 
    }
    public float Multiply (float num1 ,float num2)
    {
        return(num1 * num2); 
    }
    public float Divide (float num1 ,float num2)
    {
        return(num1 / num2); 
    }
    class Test{
    public static void main(String[] args)
    {
      ExtendedCalculator9 Calculator9 = new ExtendedCalculator9();

      System.out.println("Addition:"+Calculator9.add(5,3));
      System.out.println("Substraction:"+Calculator9.sub(5,3));
      System.out.println("Multiplication:"+Calculator9.Multiply(5,3));
      System.out.println("Division:"+Calculator9.Divide(5,3));
      System.out.println("Square:"+Calculator9.Square(5));
      System.out.println("Cube:"+Calculator9.Cube(5));

    }
    }
}
