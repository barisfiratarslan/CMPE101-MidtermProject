//class of student and there is inheritance of person in student class
public class Student extends Person{
    //fields
    private static int count = 118100; //there is this field because of descrebing field of student id
    private int studentID; //field about id of student
    private String department; // field about department of student
    private Double GPA; // field about gpa of student
    private ExamGrade examGrade; //field about exam grade of students

    public int getStudentID(){//it can get value of student id
        return studentID;
    }

    // it should not work becuse we want unique value of student id
    //public void setStudentID(int studentID){ //normally it can change value of student id
    //    this.studentID=studentID;
    //}
    
    public Double getGPA(){//it can get value of gpa of student
        return GPA;
    }

    public void setGPA(Double GPA){//it can change value of gpa of student
        this.GPA=GPA;
    }

    public String getDepartment(){//it can get value of department of value
        return department;
    }

    public void setDepartment(String department){//it can change value of department of student
        this.department=department;
    }

    public ExamGrade getExamGrade(){//it can get value of exam grade of student
        return examGrade;
    }

    public void setExamGrade(ExamGrade examGrade){//it can change value of exam grade of student
        this.examGrade=examGrade;
    }

    public Student(String firstName,String lastName,String gender,Double GPA,String department,ExamGrade examGrade){ //constructor of student    
        super(firstName,lastName,gender); // there is super because of inheriance class
        studentID=++count;//it helps me to give unique value because in every working constructor count increase and this affects studentID which has never been same
        this.GPA=GPA;
        this.department=department;
        this.examGrade=examGrade;        
    }//end of the constructor

    public String toString(){ // it translates all fields to sentence
        String info=super.toString(); //it takes value of toString method of person
        return info+" Student ID: "+studentID+" Department: "+department+" GPA: "+GPA+" "+examGrade.toString();
    }//end of the constructor
}//end of student class