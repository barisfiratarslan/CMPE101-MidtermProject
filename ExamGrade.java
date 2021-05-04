//class of exam grade
public class ExamGrade {
    private int midtermExamGrade;//field about midterm exam grade
    private int finalExamGrade;//field about final exam grade

    public int getMidtermExamGrade(){//it helps you to get value of midterm exam grade
        return midtermExamGrade;
    }

    public void setMidtermExamGrade(int midtermExamGrade){//it helps you to change value of midterm exam grade
        this.midtermExamGrade=midtermExamGrade;
    }

    public int getFinalExamGrade(){//it helps you to get value of final exam grade
        return finalExamGrade;
    }

    public void setFinalExamGrade(int finalExamGrade){//it helps you to change final exam grade
        this.finalExamGrade=finalExamGrade;
    }

    public ExamGrade(int midtermExamGrade,int finalExamGrade){//constructor of exam grade
        this.midtermExamGrade=midtermExamGrade;
        this.finalExamGrade=finalExamGrade;
    }//end of the constructor

    public String toString(){//it translates every fields of exam grade to sentence
        return "Midterm Exam Grade: "+midtermExamGrade+" Final Exam Grade: "+finalExamGrade;
    }//end of the constructor
}//end of the class