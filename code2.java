	import java.io.*;
class code2
{

public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
try {
	int T,maxX,minX;
T=Integer.parseInt(br.readLine());
	long k=0,m=0;
	int N;
	int c1=0,c2=0;
	if (T>0&&T<=10)
	{
		for(;T>0;T--)
		{	c1=0;c2=0;
		k=0;m=0;
			N=Integer.parseInt(br.readLine());
			minX=Integer.parseInt(br.readLine());
			maxX=Integer.parseInt(br.readLine());
		if (N<100001&&N>=1&&minX<1000000001&&maxX<1000000001&&minX>0&&maxX>0)
		{	
			
			long k1=1;
			long m1=2;
			
			for (int i=0;i<N;i++)
			{
			int a=Integer.parseInt(br.readLine()),b=Integer.parseInt(br.readLine());
			k+=a*k1+b;
			k1=k;
			
			m+=a*m1+b;
			m1=m;
						
			}
			
			
		
		
			int a=minX;int b=maxX;
			if (m%2==0)
			{
			if (a%2==1)
			a++;
			if(b%2==1)
			b--;
			c1+=(b-a)/2+1;
			}
			a=minX;b=maxX;
			if (m%2==1)
			{
			if (a%2==1)
			a++;
			if(b%2==1)
			b--;
			c2+=(b-a)/2+1;
			}
			a=minX;b=maxX;
			if (k%2==0)
			{
			if (a%2==0)
			a++;
			if(b%2==0)
			b--;
			c1+=(b-a)/2+1;
			}
			a=minX;b=maxX;
			if (k%2==1)
			{
			if (a%2==0)
			a++;
			if(b%2==0)
			b--;
			c2+=(b-a)/2+1;
			}
			System.out.println(c1+" "+c2);
			}
		}

	}
}catch (NumberFormatException e)
{
System.out.println(0);
}

 }

}