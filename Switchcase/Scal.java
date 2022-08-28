import java.util.Scanner;
class Scal
{
	public static void main(String arg[])
	{
		int num1,num2,res,choice;
		char a;
		Scanner sc=new Scanner(System.in);
		do
	{
		System.out.println("Enter the first number");
		num1=sc.nextInt();
		System.out.println("Enter the operation");
		a=sc.next().charAt(0);
		System.out.println("Enter the second number");
		num2=sc.nextInt();

		switch(a)
		{
		case '+':
			res=num1+num2;
			System.out.print("Addition is ");
			System.out.println(res);
			break;
		case '-':
			res=num1-num2;
			System.out.print("Subtraction is ");
			System.out.println(res);
			break;
		case '*':
			res=num1*num2;
			System.out.print("Multiply is ");
			System.out.println(res);
			break;
		case '/':
			res=num1/num2;
			System.out.print("Division is ");
			System.out.println(res);
			break;	
		default:
		System.out.println("Please enter valid input");			

		}
		System.out.println("Do you want to continue press 1");
		choice=sc.nextInt();
	}

		while(choice==1);


	}
}
