import java.io.*;
class calculator
{
static double p,q;
static int x;
static String div(String str5)
{
for (x=0;x<str5.length();x++)
{
if (str5.charAt(x)=='/')
{
p=Double.parseDouble(str5.substring(0,x));
q=Double.parseDouble(str5.substring(x+1,str5.length()));
}
}
return Double.toString(p/q);
}
static String mul(String str6)
{
for (x=0;x<str6.length();x++)
{
if (str6.charAt(x)=='*')
{
p=Double.parseDouble(str6.substring(0,x));
q=Double.parseDouble(str6.substring(x+1,str6.length()));
}
}
return Double.toString(p*q);
}
static String add(String str7)
{
for (x=0;x<str7.length();x++)
{
if (str7.charAt(x)=='+')
{
p=Double.parseDouble(str7.substring(0,x));
q=Double.parseDouble(str7.substring(x+1,str7.length()));
}
}
return Double.toString(p+q);
}
static String sub(String str8)
{
for (x=0;x<str8.length();x++)
{
if (str8.charAt(x)=='-')
{
p=Double.parseDouble(str8.substring(0,x));
q=Double.parseDouble(str8.substring(x+1,str8.length()));
}
}
return Double.toString(p-q);
}
static String brac2(String str3)
{
String str4="";
char c4;
int b=0,k=0;
for (b=0;b<str3.length();b++)
{
c4=str3.charAt(b);
if (c4=='/'&&k==0)
{
k++;
}
else
if (k==1&&(c4=='+'||c4=='-'||c4=='/'||c4=='*'||(k==1&&b==str3.length()-1)))
{
if (k==1&&b==str3.length()-1)
str3=str3+')';
else
str3=str3.substring(0,b)+')'+str3.substring(b,str3.length());
k--;
}
}
k=0;b=0;
for (b=str3.length()-1;b>=0;b--)
{
c4=str3.charAt(b);
if (c4=='/')
{
k++;
}
else
if (k>0&&(c4=='+'||c4=='-'||c4=='*'||(k>0&&b==0)))
{
str4="";
for (;k>0;)
{k--; str4=str4+'(';}
if (b==0)
str3=str4+str3;
else
str3=str3.substring(0,b+1)+str4+str3.substring(b+1,str3.length()); 
}
}
k=0;b=0;
for (b=0;b<str3.length();b++)
{
c4=str3.charAt(b);
if (c4=='(')
{
k=b;
}
if (c4==')')
{
str3=str3.substring(0,k)+div(str3.substring(k+1,b))+str3.substring(b+1,str3.length());
b=0;
k=0;
}
}
for (b=0;b<str3.length();b++)
{
c4=str3.charAt(b);
if (c4=='*'&&k==0)
{
k++;
}
else
if (k==1&&(c4=='+'||c4=='-'||c4=='*'||(k==1&&b==str3.length()-1)))
{
if (k==1&&b==str3.length()-1)
str3=str3+')';
else
str3=str3.substring(0,b)+')'+str3.substring(b,str3.length());
k--;
}
}
k=0;b=0;
for (b=str3.length()-1;b>=0;b--)
{
c4=str3.charAt(b);
if (c4=='*')
{
k++;
}
else
if (k>0&&(c4=='+'||c4=='-'||(k>0&&b==0)))
{
str4="";
for (;k>0;)
{k--; str4=str4+'(';}
if (b==0)
str3=str4+str3;
else
str3=str3.substring(0,b+1)+str4+str3.substring(b+1,str3.length()); 
}
}
k=0;b=0;
for (b=0;b<str3.length();b++)
{
c4=str3.charAt(b);
if (c4=='(')
{
k=b;
}
if (c4==')')
{
str3=str3.substring(0,k)+mul(str3.substring(k+1,b))+str3.substring(b+1,str3.length());
b=0;
k=0;
}
}
for (b=0;b<str3.length();b++)
{
c4=str3.charAt(b);
if (c4=='+'&&k==0)
{
k++;
}
else
if (k==1&&(c4=='+'||c4=='-'||(k==1&&b==str3.length()-1)))
{
if (k==1&&b==str3.length()-1)
str3=str3+')';
else
str3=str3.substring(0,b)+')'+str3.substring(b,str3.length());
k--;
}
}
k=0;b=0;
for (b=str3.length()-1;b>=0;b--)
{
c4=str3.charAt(b);
if (c4=='+')
{
k++;
}
else
if (k>0&&(c4=='-'||(k>0&&b==0)))
{
str4="";
for (;k>0;)
{k--; str4=str4+'(';}
if (b==0)
str3=str4+str3;
else
str3=str3.substring(0,b+1)+str4+str3.substring(b+1,str3.length()); 
}
}
k=0;b=0;
for (b=0;b<str3.length();b++)
{
c4=str3.charAt(b);
if (c4=='(')
{
k=b;
}
if (c4==')')
{
str3=str3.substring(0,k)+add(str3.substring(k+1,b))+str3.substring(b+1,str3.length());
b=0;
k=0;
}
}
for (b=0;b<str3.length();b++)
{
c4=str3.charAt(b);
if (c4=='-'&&k==0)
{
k++;
}
else
if (k==1&&(c4=='-'||(k==1&&b==str3.length()-1)))
{
if (k==1&&b==str3.length()-1)
str3=str3+')';
else
str3=str3.substring(0,b)+')'+str3.substring(b,str3.length());
k--;
}
}
k=0;b=0;
for (b=str3.length()-1;b>=0;b--)
{
c4=str3.charAt(b);
if (c4=='-')
{
k++;
}
else
if (k>0&&((k>0&&b==0)))
{
str4="";
for (;k>0;)
{k--; str4=str4+'(';}
if (b==0)
str3=str4+str3;
else
str3=str3.substring(0,b+1)+str4+str3.substring(b+1,str3.length()); 
}
}
k=0;b=0;
for (b=0;b<str3.length();b++)
{
c4=str3.charAt(b);
if (c4=='(')
{
k=b;
}
if (c4==')')
{
str3=str3.substring(0,k)+sub(str3.substring(k+1,b))+str3.substring(b+1,str3.length());
b=0;
k=0;
}
}
return str3;
}
static String brac1(String str1)
{
String str2="";
int l=0;
for (int a=0;a<str1.length();a++)
{
char ch=str1.charAt(a);
if (ch=='(')
{
l=a;
}
if (ch==')')
{
str1=str1.substring(0,l)+brac2(str1.substring(l+1,a))+str1.substring(a+1,str1.length());
a=0;
l=0;
}
}
return str1;
}
static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
public static void main(String arg[])throws IOException
{
String str=br.readLine();
str="("+str+")";
System.out.println(brac1(str));
}
}