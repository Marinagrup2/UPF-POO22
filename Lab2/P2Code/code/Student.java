import java.util.LinkedList;

public class Student {
    //atributos
    private String name;
    private int NIA;
    private LinkedList<Enrollment> enrollmentList;
    
    //métodos
    public Student(String n, int num){
        enrollmentList = new LinkedList< Enrollment >();  //la clase Enrollment está associada con la clase Student
        this.name = n;
        this.NIA = num;
    }

    public String toString(){
       
        return this.name;
    }

    public void addEnrollment(Enrollment e){
        enrollmentList.add(e);
    }

   
   
}
    
