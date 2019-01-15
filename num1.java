import java.io.*;
class num1
{
	static double fact(double a)
	{
		System.out.println(a);
		double k=1;
		for (;a>0;a=a-1)
		{
			k=k*a;
		System.out.println(k);

		System.out.println(a);
		}
		return k;
			

	}

	public static void main(String args[])throws IOException
	{
		/*BufferedReder br=new BufferedReader(new InputStreamReader(System.in));
		double x=0;
		for (long i=0;i<=10000000000000;i++)
		{
			x=x+(i*i+i+1)*fact(i);
		}*/
		double a=1000000000000.0;
		System.out.println(fact(a));




	}
}