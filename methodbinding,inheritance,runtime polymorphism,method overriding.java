import java.util.Scanner;
class Operation
{
void calculate(int number)
{
system.out.println("gerneric operetion");
}
class Square extends Operation{
void calculate(int number)
{
system.out.println("square of"+number+"is:"+(number*number));
}
class Cube extends Operation{
void calculate(int number)
{
system.out.println("cube of"+number+"is:"+(number*number*number));
}
}
class MethodBinding{
public static void main(string[]args)
{
Scanner scan=new Scanner(system.in);
system.out.println("enter the number");
int num=scan.nextInt();
system.out.println("choose operation");
system.out.println("1.square");
system.out.println("2.Cube");
int choice=scan.nextint();
Operation op;
if(choice==1)
{
op=Square();
}
else
{
op=Cube();
}
op.calculate(num);
scan.close();
}
}






