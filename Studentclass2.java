import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class Studentclass2 {
 Map<String , Integer> Student  = new HashMap<String , Integer>();
 Scanner sc = new Scanner(System.in);

 void addDetails(){

     System.out.println("ENTER THE NAME ");
     String name = sc.nextLine();
     sc.nextLine();

     System.out.println("Enter your graade");
     int grade = sc.nextInt();
      sc.nextLine();
     Student.put(name, grade);
     System.out.println("Student added successfully.");

 }

 void removeDetails(){
     System.out.println("enter a name ");
     String name = sc.nextLine();

     if(Student.containsKey(name)){
        Student.remove(name);
         System.out.println("Student removed successfully ");
     }
     else{
         System.out.println("student not found ");
     }
 }

 void display(){

     System.out.println("enter a name ");
     String name = sc.nextLine();
     if(Student.containsKey(name)){
         System.out.println(name +"s grade is "+ Student.get(name));
     }
     else{
         System.out.println("not found");
     }


 }


}

class Details {
    public static void main(String[] args) {
        Studentclass2 obj = new Studentclass2();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("1 want to add student");
            System.out.println("2 display student");
            System.out.println("3 remove studnet");
            System.out.println("Enter a number you want");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
               case 1:
                   if(choice == 1){
                       obj.addDetails();
                       break;
                   }

               case 2:
                   if (choice == 2){
                       obj.display();
                       break;
                   }
               case 3:
                   if(choice == 3){
                       obj.removeDetails();
                       break;
                   }

           }

        }




    }
}