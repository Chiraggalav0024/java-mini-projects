import java.util.Scanner;

public class Calculator{
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the first number");
  int a = sc.nextInt();

  System.out.println("Enter the operation:");
  char op = sc.next().charAt(0);

  System.out.println("Enter the second number:");
  int b = sc.nextInt();

  switch (op){
  case '+':
  System.out.println("the sum is " + (a+b));
  break;

  case '-':
  System.out.println("the difference is " + (a-b));
  break;

  case '*':
  System.out.println("the multiplication is " + (a*b));
  break;

  case '/':
  System.out.println("the devision is " + (a/b));
  break;

  default:
  System.out.println("Invalid choice");
  }

  }
 }
