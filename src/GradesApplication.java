import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {

        // Create hashmap
        HashMap<String, Student> Students = new HashMap<>();

        // Add students to hashmap
        Students.put("yael", new Student("yael"));
        Students.put("jason", new Student("jason"));
        Students.put("ethan", new Student("ethan"));
        Students.put("ryan", new Student("ryan"));


        // Add 3 grades to each user
        // Yael
        Students.get("yael").addGrade(98);
        Students.get("yael").addGrade(88);
        Students.get("yael").addGrade(90);

        // Jason
        Students.get("jason").addGrade(99);
        Students.get("jason").addGrade(92);
        Students.get("jason").addGrade(78);

        // Ethan
        Students.get("ethan").addGrade(86);
        Students.get("ethan").addGrade(90);
        Students.get("ethan").addGrade(94);

        // Ryan
        Students.get("ryan").addGrade(91);
        Students.get("ryan").addGrade(89);
        Students.get("ryan").addGrade(84);

        // Run the application
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome!\n");

        System.out.println("Here are the Github usernames of our students:\n");

        for (String k : Students.keySet()) {
            System.out.print("|" + Students.get(k).getName() + "| ");
        }

    }

}
