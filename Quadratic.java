import java.util.*;
import java.math.*;
public class Quadratic 
{
public static void main(String str[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a\n");
double a= sc.nextDouble();
System.out.println("enter b\n");
double b= sc.nextDouble();
System.out.println("enter c\n");
double c= sc.nextDouble();
double d= b*b-4*a*c;
if(d>0.0)
{
double r1=(-b+Math.pow(d,0.5)/(2.0*a));
double r2=(-b-Math.pow(d,0.5)/(2.0*a));
System.out.println("roots are" +r1+ "and"+r2);
}
else if(d==0.0)
{
double r1=-b/(2.0*a);
System.out.println("root is"+r1);
}
else
{
System.out.println("not real roots");
}
}
}


