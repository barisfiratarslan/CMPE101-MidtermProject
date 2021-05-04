//there is import because of using random
import java.util.Random;
//class of test
public class Test {
    public static void main(String[] args) {
        //instances of exam grade
        ExamGrade eg1=new ExamGrade(60, 90);
        ExamGrade eg2=new ExamGrade(20, 60);
        ExamGrade eg3=new ExamGrade(55, 85);
        //instances of student 
        Student s1=new Student("Barış", "Arslan", "male", 3.4, "CMPE",eg1);
        Student s2=new Student("Fırat", "Arslan", "male", 2.5, "CMPE", eg1);
        Student s3=new Student("ali", "mehmet", "male", 1.0, "EEN", eg3);
        Student s4=new Student("ayşe", "pek", "female", 3.0, "EEN", eg2);
        Student s5=new Student("kai", "pek", "male", 3.1, "TK", eg2);

        Student[] a={s5,s3,s2,s1,s4};   //array for test     
        Student[] b=generatedStudent(4); //describing genereted values to b because of testing
        show(b); //instance of show method
        findMinMax(b);    //instance of findMinMax method
        
        System.out.println(search(a,118101));//instance of search method
        System.out.println(s2);//these control changeGrade before working method
        changeGrade(a, 118102, eg3);//instance of changeGrade method
        System.out.println(s2);//these control changeGrade after working method
        meanGPA(a);//instance of meanGPA        
    }

    //the method can help you to find which index is in
    public static int search(Student[] student,int studentID){
        for(int i=0;i<student.length;i++){
           if(student[i].getStudentID()==studentID){
               return i;
           } 
        }
        return -1;//if there is not student id in array,this result will be -1
    }//end of the method

    //the method can help you to change grade of given student id if it is in the array
    public static void changeGrade(Student[] student,int studentID,ExamGrade examGrade){
        int count=0; //there is count int because of finding given student id have or not
        for(int i=0;i<student.length;i++){
            if(student[i].getStudentID()==studentID){
                student[i].setExamGrade(examGrade);
                ++count;
            }
        }

        if(count==0){//if caunt do not equal 0,it says that the given student id is in the array
            System.out.println("No such student");
        }
    }//end of the method

    //this method can help you to change given information about all values to sentence
    public static void show(Student[] student){
        for(int i=0;i<student.length;i++){
            System.out.printf("First Name: %s Last Name: %s Gender: %s Student ID: %d GPA: %,.2f Department: %s Midterm Grade: %d Final Grade: %d %n",student[i].getFirstName(),student[i].getLastName(),student[i].getGender(),student[i].getStudentID(),student[i].getGPA(),student[i].getDepartment(),student[i].getExamGrade().getMidtermExamGrade(),student[i].getExamGrade().getFinalExamGrade());
        }
    }//end of the method

    //the method can help you to create new students by given number
    public static Student[] generatedStudent(int x){
        String gender;
        Student[] student=new Student[x];//we create array and we describe count of item by given number
        for(int i=0; i < student.length; i++){
            double GPA = Math.random()*4;//it helps you to create random double value between 0 to 4 for gpa
            int midterm= (int)(Math.random()*100);//it helps to create random integer value between 0 to 100 for midterm exam grade
            int finalGra= (int)(Math.random()*100);//it helps to create random integer value between 0 to 100 for final exam grade
            int preGender=(int)(Math.random()*2);//it helps to create random integer value between 0 to 1 for gender because when it is equal 1,it transformes to male else it transformes to female
            if(preGender==1){
                gender="male";
            }          
            else{
                gender="female";
            }
            ExamGrade e1=new ExamGrade(midterm, finalGra);//we create exam grade to add student instructere
            student[i] = new Student("barış", "arslan", gender, GPA, "CMPE", e1);
        }
        return student;
    }//end of the method

    //the method can help you to find average of gpa in given array
    public static void meanGPA(Student[] student){
        double count=0;//there is count value to find total grade in student array
        for(int i=0;i<student.length;i++){
            count=student[i].getGPA()+count;
        }
        double result=count/student.length;
        System.out.println(result);
    }//end of the method

    //the method can help you to find min and max value of midterm and final exam grade
    public static void findMinMax(Student[] student){
        int minMidterm=student[0].getExamGrade().getMidtermExamGrade();//this is first step to find min value of midterm because I describe first index of midterm value in array
        int maxMidterm=student[0].getExamGrade().getMidtermExamGrade();//this is first step to find max value of midterm because I describe first index of midterm value in array
        int minFinal=student[0].getExamGrade().getFinalExamGrade();//this is first step to find min value of final because I describe first index of final value in array
        int maxFinal=student[0].getExamGrade().getFinalExamGrade();//this is first step to find max value of final because I describe first index of final value in array

        for(int i=0;i<student.length;i++){
            if(student[i].getExamGrade().getMidtermExamGrade()<minMidterm){ // this condution find min value of midterm until this step 
                minMidterm=student[i].getExamGrade().getMidtermExamGrade();
            }
            if(student[i].getExamGrade().getMidtermExamGrade()>maxMidterm){// this condution find max value of midterm until this step 
                maxMidterm=student[i].getExamGrade().getMidtermExamGrade();
            }
            if(student[i].getExamGrade().getFinalExamGrade()<minFinal){// this condution find min value of final until this step 
                minFinal=student[i].getExamGrade().getFinalExamGrade();
            }
            if(student[i].getExamGrade().getFinalExamGrade()>maxFinal){// this condution find max value of final until this step 
                maxFinal=student[i].getExamGrade().getFinalExamGrade();
            }
        }

        System.out.println("Maximum Midterm Exam Grade: "+maxMidterm+" Minumum Midterm Exam Grade: "+minMidterm);
        System.out.println("Maximum Final Exam Grade: "+maxFinal+" Minumum Final Exam Grade: "+minFinal);
    }//end of the method
}//end of the class