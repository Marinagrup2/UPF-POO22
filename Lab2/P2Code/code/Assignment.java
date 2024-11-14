import java.util.LinkedList;

public class Assignment {
    //atributos
    private Teacher teachers;
    private Course courses;
    private LinkedList<Integer> groupList;
    
    //métodos
    public Assignment( Teacher initTeacher, Course initCourses, LinkedList<Integer> initGroups){
        groupList = new LinkedList<Integer>();
        this.groupList = initGroups;
        this.teachers =  initTeacher;
        this.courses =  initCourses;
        
    }

    public void addTeacher(Teacher t){
        this.teachers = t;

    }
    public void addCourse(Course c){
        this.courses = c;


    }


}


