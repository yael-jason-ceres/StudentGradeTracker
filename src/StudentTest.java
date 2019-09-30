public class StudentTest {

    public static void main(String[] args) {

        Student yael = new Student("yael");
        
        yael.addGrade(10);
        yael.addGrade(20);
        yael.addGrade(20);

        System.out.println("yael.getGradeAverage() = " + yael.getGradeAverage());



    }

}
