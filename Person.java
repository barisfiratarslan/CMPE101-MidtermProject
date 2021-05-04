//class of person
public class Person{
    private String firstName;//field about first name of person
    private String lastName;//field about last name of person
    private String gender;//field about gender of person

    public String getFirstName(){//it helps you to get value of first name
        return firstName;
    }

    public void setFirstName(String firstName){//it helps you to change value of first name
        this.firstName=firstName;
    }

    public String getLastName(){//it helps you to get value of last name
        return lastName;
    }

    public void setLastName(String lastName){//it helps you to change value of last name
        this.lastName=lastName;
    }

    public String getGender(){//it helps you to get value of gender
        return gender;
    }

    public void setGender(String gender){//it helps you to change value of gender
        this.gender=gender;
    }

    public Person(String firstName,String lastName,String gender){//constructor of person
        this.firstName=firstName;
        this.lastName=lastName;
        this.gender=gender;
    }//end of the constructor

    public String toString(){//it translates every fields of person to sentence
        return "First name: "+firstName+" Last Name: "+lastName+" Gender: "+gender;
    }//end of the constructor
}//end of the class