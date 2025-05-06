class AgeNotWithinRangeException extends Exception{
    AgeNotWithinRangeException(String message){
        super(message);
    }

}

class NameNotValidException extends Exception{
    NameNotValidException(String message){
        super(message);
    }
}


public class Studentclas {
    int rollno;
    int age;
    String course;
    String name;


    Studentclas(String name , String course , int rollno , int age)
            throws  AgeNotWithinRangeException , NameNotValidException{

        try {
            if(age <15 || age >20){
                throw new AgeNotWithinRangeException("Age not within valid range: " + age);
            }

            if(!name.matches("[a-zA-Z\\s]+")){
                throw new NameNotValidException("Name not valid: " + name);
            }
            this.age = age;
            this.name  = name;
            this.course = course;
            this.rollno = rollno;
        } catch (AgeNotWithinRangeException|NameNotValidException ex) {
            System.out.println("Exception inside constructor: " + ex.getMessage());
            this.age = 0;
            this.name = "Invalid";
            this.course = course;
            this.rollno = rollno;
        }

    }

       void display(){
           System.out.println(" my name "+name);
           System.out.println(" age "+age);
           System.out.println("course "+course);
           System.out.println(" roll no "+rollno);
       }
}

class RameshDevops{
    public static void main(String[] args) throws AgeNotWithinRangeException, NameNotValidException {
        Studentclas obj = new Studentclas("Rohit" , "BS DEGREE ",1234,17);
        obj.display();



    }
}