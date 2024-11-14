public class Lecture {
    //atributos
    private String group;
    private int timeSlot;
    private int type;
    private Classroom classroom;
    private Course course;

    //métodos
    public Lecture(String g, int s, int t) {
        this.group = g;
        this.timeSlot = s;
        this.type = t;
    }

    public void addCourse(Course course) {
        this.course = course;
          
    }

    public void addClassroom(Classroom classroom) {
        this.classroom = classroom;
    }
    
}
