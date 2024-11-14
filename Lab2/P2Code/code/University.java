import java.util.LinkedList;

public class University {
    //clase principal
    
    //linkedlists como atributos
    private LinkedList<Student> studentList;
    private LinkedList<Teacher> teacherList;
    private LinkedList<Course> courseList;
    private LinkedList<Classroom> classroomList;
    private LinkedList<Enrollment> enrollmentList;
    private LinkedList<Assignment> assignmentList;
    private LinkedList<Lecture> lectureList;
    
    //métodos
    public University(){
        studentList = new LinkedList<Student>(); //crear objeto que almacenas
        teacherList = new LinkedList<Teacher>();
        courseList = new LinkedList<Course>();
        classroomList = new LinkedList<Classroom>();
        enrollmentList = new LinkedList<Enrollment>();
        assignmentList = new LinkedList<Assignment>();



        LinkedList<String[]>students = Utility.readXML("student");
        for(String[]array : students){
            Student student = new Student(array[0], Integer.parseInt(array[1]));
            studentList.add(student);
        }

        LinkedList<String[] > teachers = Utility.readXML("teacher");
        for(String[]array : teachers){
            Teacher teacher = new Teacher(array[0]);
            teacherList.add(teacher);
        }

        LinkedList<String[]>courses = Utility.readXML("course");
        for(String[]array : courses){
            Course course = new Course(array[0]);
            courseList.add(course);
        }

        LinkedList<String[]>classrooms = Utility.readXML("classroom");
        for(String[]array : classrooms){
            Classroom classroom = new Classroom(array[0]);
            classroomList.add(classroom);
        }

        LinkedList<String[] > enrollments = Utility.readXML("enrollment");
        for(String[] array : enrollments){
            Student student = Utility.getObject(array[0], studentList);
            Course course = Utility.getObject(array[1], courseList);
            Enrollment enrollment = new Enrollment(array[2]);
            enrollment.addStudent(student);
            enrollment.addCourse(course);
            student.addEnrollment(enrollment);
            course.addEnrollment(enrollment);
            enrollmentList.add(enrollment);
        }

        
        LinkedList<String[] > assignments = Utility.readXML("assignment");
        for(String[] array : assignments){
            Teacher teacher = Utility.getObject(array[0], teacherList);
            Course course = Utility.getObject(array[1], courseList);
        
            LinkedList<Integer> groups = new LinkedList<Integer>();
            for(int i = 2; i<array.length; i++){
                groups.add(Integer.parseInt(array[i]));

            }
            Assignment assignment = new Assignment(teacher, course, groups);
            teacher.addAssignment(assignment);
            course.addAssignment(assignment);
        

        }



        LinkedList<String[] > lectures = Utility.readXML("lecture");
        for(String[] array : lectures){
            Classroom classroom = Utility.getObject(array[0], classroomList);
            Course course = Utility.getObject(array[1], courseList);
            Lecture lecture = new Lecture(array[4], Integer.parseInt(array[2]), Integer.parseInt(array[3]));
            lecture.addClassroom(classroom);
            lecture.addCourse(course);
            classroom.addLecture(lecture);
            course.addLecture(lecture);

        }

    }

    public LinkedList< String> getStudents(){
        return Utility.toString(studentList); //REGRESA LA LISTA DE TODOS LOS ESTUDIANTES QUE TIENEN
    }  

    public LinkedList<String> getTeachers(){
        return Utility.toString(teacherList);
    }

    public LinkedList<String> getClassrooms(){
        return Utility.toString(classroomList);
    }

    public LinkedList<String> getCourses(){
        return Utility.toString(courseList);
    }


    //CoursesOfStudent
    LinkedList<String[]> enroll = Utility.readXML("enrollment");
    public LinkedList<String> coursesOfStudent (String student) {
        LinkedList<String> coursesOfStudent = new LinkedList<String>();
        for(String[] array: enroll){
            if(student.equals(array[0])){
                coursesOfStudent.add(array[1]);

            }
        }
        return Utility.toString(coursesOfStudent);
    }

    //TecahersOfCourse
    LinkedList<String[]> assig = Utility.readXML("assignment");
    public LinkedList<String> teachersOfCourse (String teacher) {
        LinkedList<String> teachersOfCourse = new LinkedList<String>();
        for(String[] array: assig){
            if(teacher.equals(array[0])){
                teachersOfCourse.add(array[1]);
  
            }
        }
        return Utility.toString(teachersOfCourse);
    }


    //CoursesOfClasroom (extra)
    LinkedList<String[] > lect = Utility.readXML("lecture");
     public LinkedList<String> CoursesOfClassroom(String classroom){
        LinkedList<String> coursesOfClassroom = new LinkedList<String>();
        for(String[] array : lect){
            if(classroom.equals(array[0])){
                coursesOfClassroom.add(array[1]);
                if(coursesOfClassroom.size()>1){
                    int c=0;
                    for(int i=0;i<coursesOfClassroom.size();i++){
                        String s = array[1];
                        if(s.equals(coursesOfClassroom.get(i))){
                            c++;
                            if(c>1){
                                coursesOfClassroom.remove(i);
                                c=0;
                            }
                        }
                        }
                }
                }
            }
        return Utility.toString(coursesOfClassroom);
        }
    
    }
      
    