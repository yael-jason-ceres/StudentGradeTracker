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

        // APP: Print names of each user
        System.out.println("Here are the Github usernames of our students:\n");

        for (String k : Students.keySet()) {
            System.out.print("|" + Students.get(k).getName() + "| ");
        }

        Boolean continueLoop = true;

        System.out.println("\nStudents.containsValue(\"yael\") = " + Students.containsValue("yael");


//        do {
//            // APP: See more information
//            System.out.println("\n\nWhat student would you like to see more information on?");
//
//            String seeMoreInfo = sc.nextLine();
//
//            // APP: Check if value inputted value is in the hashmap
//            continueLoop = Students.containsValue(seeMoreInfo);
//            System.out.println("continueLoop = " + continueLoop);
//
//            // APP: condition statment what to do next
//            if (!continueLoop) {
//                System.out.println("Sorry, no student found with the GitHub username of \"" + seeMoreInfo + "\".");
//            } else {
//                System.out.print("Name: " + Students.get(seeMoreInfo).getName() + " Github username: " + Students.keySet());
//                System.out.println("Current average: " + Students.get(seeMoreInfo).getGradeAverage());
//                continueLoop = false;
//            }
//
//            // Ask again if they want to see more information
//            System.out.println("Would you like to see more info?");
//
//            String askAgain = sc.nextLine();
//
//            if (askAgain == "no" || askAgain == "n") {
//                continueLoop = false;
//            }
//
//        } while (continueLoop);




    }

}
