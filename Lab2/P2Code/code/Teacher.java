import java.util.LinkedList;

public class Teacher {
    //atributos
    private String name;
    private LinkedList<Assignment> assignmentList;

    //métodos
    public Teacher(String n){
        assignmentList = new LinkedList<Assignment>(); //la classe Assignment esta associada con la clase Teacher
        this.name = n;
    }


    public void addAssignment(Assignment a){
        assignmentList.add(a);
    }
    public String toString(){
        return this.name;
    }







}
