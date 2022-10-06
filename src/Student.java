// room 1
import java.util.Calendar;
public class Student {
    double[] grades = new double[100];
    private String name;
    private String surname;
    private int yearOfEnrollment;
    private String program;
    private int assignmentgrade;
    private int assignmentn;

    private int numberOfAssignments;

    public void setNumberOfAssignments(int assignmentNumber){
        numberOfAssignments = assignmentNumber;
    }
    public Student(String theName, String theSurname){
        name = theName;
        surname = theSurname;
    }
    public void setEnrollmentYear(int enrollmentYear){
        yearOfEnrollment = enrollmentYear;
    }
    public void setProgram(String getProgram){
        program = getProgram;
    }
    public void setGrade(int assignmentnumber, int assignmentpoints){
    assignmentn = assignmentnumber;
    assignmentgrade = assignmentpoints;
    }
    public double getGrades(){
        return;
    }
    public int getNumberOfAssignments(){
        return numberOfAssignments;
    }
    public int getEnrolmentYear(){
        return yearOfEnrollment;
    }
    public String getProgram(){
        return program;
    }

    public void printName(){
     System.out.println(name + " " + surname);
    }
    public int getYearOfStudy(){
        int yearnow = Calendar.getInstance().get(Calendar.YEAR);
        return yearnow - yearOfEnrollment;
    }
    public int getGraduationYear(){
        return yearOfEnrollment + 4;
    }
}

/*
* Create a Student class.

Create public fields:
name, surname

Add constructor, which accepts name and surname.

Create a method which prints student full name.

Create an object of Student class and test it.
Further test every new addition to the class by handling the object in your main function.

Create private fields:
enrolmentYear, program

Create getters and setters for private fields:
setEnrolmentYear, getEnrolmentYear
setProgram, getProgram

Create method getYearOfStudy, which calculates year of study on the base of enrolment year

To know current year use:
import java.util.Calendar;
int year = Calendar.getInstance().get(Calendar.YEAR);


Create method getGraduation year.

Add private property numberOfAssignments and corresponding setter and getter.

Create private property grades as an array of 100 elements of type double.

Create method setGrade(assignmentNumber, assignmentPoints) to set grades for particular assignment.

Create method getGrade(assignmentNumber), which returns given assignment grade.

Create method getTotalPoints, which calculates and returns sum of student points.

Create method printFullInformation which format and print full information about the student on the base of previous properties and methods.

Create several Student objects, fill its with data and printFullInformation.*/
