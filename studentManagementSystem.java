import java.util.*;
class student{
    int id;
    String name;
    int age;
    String course;
    student(int id,String name,int age,String course){
        this.id=id;
        this.name=name;
        this.age=age;
        this.course=course;
    }
}
public class studentManagementSystem {
    static Scanner sc=new Scanner(System.in);
    int choice;
    void showMenu(){
        System.out.println("=========================");
        System.out.println("1.Add Student");
        System.out.println("2.View Student");
        System.out.println("3.Search Student");
        System.out.println("4.Update Student");
        System.out.println("5.Delete Student");
        System.out.println("6.Exit");
        System.out.println("Enter Your Choice:");
        choice=sc.nextInt();
    }
    public static void main(String args[])
    {
        studentManagementSystem sms=new studentManagementSystem();
        System.out.println("======= STUDENT MANAGEMENT SYSTEM ======");
        ArrayList<student> data=new ArrayList<>();
        while(true)
    {
            sms.showMenu();
            if(sms.choice==1)
        {
            System.out.println("Enter the Id :");
            int i=sc.nextInt();
            System.out.println("Enter the Name :");
            String n=sc.next();
            System.out.println("Enter the Age :");
            int a=sc.nextInt();
            System.out.println("Enter the Course :");
            String c=sc.next();
            student s1=new student(i,n,a,c);
            data.add(s1);
        }
        else if(sms.choice==2)
        {
            for(student i:data){
                System.out.println("============================");
                System.out.println("Student id : "+i.id);
                System.out.println("Student Name : "+i.name);
                System.out.println("Student Age : "+i.age);
                System.out.println("Student Course : "+i.course);
            }
        }
        else if(sms.choice==6)
        {
            break;
        }
        else if(sms.choice==3)
        {
            System.out.println("Enter Student Id:");
            int value = sc.nextInt();

            boolean found = false;

            for (student s : data) {

                if (s.id == value) {

                    System.out.println("ID : " + s.id);
                    System.out.println("Name : " + s.name);
                    System.out.println("Age : " + s.age);
                    System.out.println("Course : " + s.course);

                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Student Not Found");
            }
        }
        else if(sms.choice==4)
        {

            System.out.println("Enter Student Id:");
            int value = sc.nextInt();

            boolean found = false;

            for (student s : data) {

                if (s.id == value) {

                    System.out.println("Enter New Name:");
                    s.name = sc.next();

                    System.out.println("Enter New Age:");
                    s.age = sc.nextInt();

                    System.out.println("Enter New Course:");
                    s.course = sc.next();

                    System.out.println("Student Updated Successfully");

                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Student Not Found");
            }
        }
        
        else if(sms.choice==5)
        {
                        
            System.out.println("Enter Student Id:");
            int value = sc.nextInt();
            boolean found = false;
            for (int j = 0; j < data.size(); j++)
            {
                if (data.get(j).id == value) 
                {
                    data.remove(j);
                    System.out.println("Student Deleted Successfully"); 
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Student Not Found");
            }
        }
    }
    }
}
