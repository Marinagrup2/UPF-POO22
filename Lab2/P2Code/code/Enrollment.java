public class Enrollment {
    //atributos
    private String seminarGroup;
    private Student student;
    private Course course;

    //métodos
    public Enrollment(String sg){
        this.seminarGroup = sg;
    }

    public void addStudent(Student student){
        this.student = student;

    }

    public void addCourse(Course course){
        this.course = course;

        
    }

}
