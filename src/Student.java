import java.util.ArrayList;

public class Student {

    private String name;

    private ArrayList<Integer> grades;

    public Student(String n) {
        this.name = n;
        this.grades = new ArrayList<Integer>();
    }

    public String getName() {
        return this.name;
    }

    public void addGrade(int g) {
        this.grades.add(g);
        System.out.println("New grade was added: " + g);
    }

    public double getGradeAverage() {
        int temp = 0;
        for (Integer g : this.grades) {
            temp += g;
        }
        return (double) (temp / this.grades.size());
    }

}
