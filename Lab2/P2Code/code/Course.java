import java.util.LinkedList;

public class Course {
    //atributos
    private String name;
    private LinkedList<Assignment> assignmentList;
    private LinkedList<Enrollment> enrollmentList;
    private LinkedList<Lecture> lectureList;

    //métodos
    public Course(String n){
        lectureList = new LinkedList<Lecture>(); //la clase Lecture está associada con la clase Course
        assignmentList = new LinkedList<Assignment>(); //la clase Assignment está associada con la clase Course
        enrollmentList = new LinkedList<Enrollment>(); //la clase Enrollment está associada con la clase Course
        this.name = n;
    }
   
    public String toString(){
        
        return this.name;
    }

    public void addLecture(Lecture l) {
        lectureList.add(l);
    }

    public void addEnrollment(Enrollment e) {
        enrollmentList.add(e);
    }

    public void addAssignment(Assignment a) {
        assignmentList.add(a);
    }

    
}
