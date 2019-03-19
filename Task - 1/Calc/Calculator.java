public class Calculator
{
	public double calculation(int a,int b,String operator)
	{
		try
		{
			switch(operator)
			{
				case "+":
					return (double)a+b;
				case "*":
					return (double)a*b;
				case "/":
					return (double)a/b;
				default:
					return (double)0;
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
			return (double)0;
		}
	}
}
