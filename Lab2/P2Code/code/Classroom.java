import java.util.LinkedList;

public class Classroom {
    //atributos
    private String code;
    private LinkedList<Lecture> lectureList;

    //métodos
    public Classroom(String c){
        lectureList = new LinkedList<Lecture>(); //la clase Lecture está associada con la clase Classroom.
        this.code = c;
    }
    public String toString(){
        return code;
    }

    public void addLecture(Lecture l) {
        lectureList.add(l);
    }
    
}
