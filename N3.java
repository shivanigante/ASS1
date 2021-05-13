import java.util.Scanner;
class N1
{
      int age,sal;
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


public class N3
{
           public static void main(String[] args){
                N1 n=new N1();
                Scanner sc=new Scanner(System.in);
                boolean b=true;
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
                                                   b=true;
                                                   break;
                                           case 2: if(b)
					                 n.display();
                                                   else
                                                         System.out.println("no records......");
                                                   break;
                                           case 3:if(b) 
                                                         n.raiseSalary();
                                                   else
                                                         System.out.println("no records......");
                                                   break;
                                         }
              }while(choice<4);
        }
}

