# ASS1
The assignment displays the details of the person by selecting the choices. There are 4 types of choices like create, display, raiseSalary, exit.Acoording to user choice they need to select. If they choose create or display the details like name, age, salary, designation will be displayed. If your choice is raisedSalary it displays the statement just salary raised. If you choose exit it comes out of the program.
The N1 class comprises of methods like create, display and raiseSalary which has their own function as mentioned if we choose create or display or raiseSalary. The scanner class is used in N1 because to take the inputs from the user.






import java.util.Scanner;
class N1{
int age,sal,choice;
String name,designation;
Scanner sc=new Scanner(System.in);
void create(){
System.out.println("enter name");
name=sc.next();
System.out.println("enter age");
age=sc.nextInt();
System.out.println("enter sal");
sal=sc.nextInt();
System.out.println("enter designation");
designation=sc.next();
}
void display(){
System.out.println("Enter name");
name=sc.next();
System.out.println("Enter age");
age=sc.nextInt();
System.out.println("Enter sal");
sal=sc.nextInt();
System.out.println("enter designation");
designation=sc.next();
}
void raiseSalary(){
sal=sal+1000;
System.out.println("salary raised");
}
}







The N3 class consists of main method which helps to execute the program. The object is created here to store the inputs given by user according to user. We use do while for infinite nimber of iterations and switch condition statement is used to perform equality check between the output expression and also the value presnt in the case. 






public class N3{
public static void main(String[] args){
N1 n=new N1();
Scanner sc=new Scanner(System.in);
int choice;
do{
System.out.println("1.Create");
System.out.println("2.display");
System.out.println("3.raiseSalary");
System.out.println("4.exit");
System.out.println("enter your choice");
choice=sc.nextInt();
switch(choice){
     case 1: n.create();
             break;
     case 2: n.display();
             break;
     case 3: n.raiseSalary();
             break;
}
}while(choice<4);




Thus the execution happens according to above given conditions.
