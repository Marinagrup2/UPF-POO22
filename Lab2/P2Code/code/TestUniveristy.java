public class TestUniveristy {
    //metodo principal, donde se ejecuta todo
   
    public static void main(String[] args){
        University university = new University(); //llama a la clase university
        
        System.out.println(university.getStudents());
        System.out.println(university.coursesOfStudent( "Ron Weasley"  ) ) ;
        System.out.println(university.teachersOfCourse( "Filius Flitwick" ) ) ;
        System.out.println(university.CoursesOfClassroom( "10.100") ) ;

    }
   
    
}
