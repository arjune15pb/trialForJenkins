import java.util.Date;

public class Student {

    public Student(){
        System.out.println("Creating student object at time "+ new Date());
    }
    public void sayHello(){
        System.out.println("Hi , I am student");
    }
}
