import java.io.*;


public class reverse {
static int rev(int n)
{
int rev = 0;
int rem;
while (n > 0) {
rem = n % 10;
rev = (rev * 10) + rem;
n = n / 10;
}
return rev;
}
public static void main(String[] args)
{
int n = 4526;
System.out.print("Reversed Number is " + rev(n));
}
}
