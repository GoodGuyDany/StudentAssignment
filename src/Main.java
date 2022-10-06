//Room 1
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Taras", "Zagidko");
        Student student2 = new Student("Danylo", "Mamchur");
        Student student3 = new Student("Daria", "Vydyborets");
        Student student4 = new Student("Mykhailo", "Kustov");
        student1.printName();
        student2.printName();
        student3.printName();
        student4.printName();

        student1.setNumberOfAssignments(10);
        student1.setEnrollmentYear(2004);
        student3.setEnrollmentYear(2022);
        student1.setProgram("BSE");
        student3.setNumberOfAssignments(20);
        student2.setEnrollmentYear(2011);
        student3.setNumberOfAssignments(21);
        student3.setGrade(10, 11);
        student3.setGrade(5, 3);
        System.out.println(student1.getEnrolmentYear());
        System.out.println(student1.getYearOfStudy());
        System.out.println(student3.getGraduationYear());

    }
    //better System.out.println
    public static void println(String s) {
        System.out.println(s);

    }


}
