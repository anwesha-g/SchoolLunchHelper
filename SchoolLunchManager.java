import java.util.Scanner;

public class SchoolLunchManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // array with the # of meals perc otpion
        int[] mealsLeft = new int[5];

        System.out.println("Option 1: Cheese Pizza");
        System.out.println("Option 2: Popcorn Chicken");
        System.out.println("Option 3: Bosco Sticks");
        System.out.println("Option 4: Classic Caesar Salad");
        System.out.println("Option 5: Turkey Sandwich");
        System.out.println();

        // intialize with default values
        for (int i = 0; i < mealsLeft.length; i++) {
            System.out.print("Enter the number of meals left for option " + (i + 1) + ": ");
            mealsLeft[i] = scanner.nextInt();
        }

        //  if the user wants lunch
        System.out.print("Do you want lunch? (yes/no): ");
        String wantLunch = scanner.next();

        if (wantLunch.equalsIgnoreCase("yes")) {
            // ask for student ID using a String method
            System.out.print("Please enter your student ID number: ");
            String studentID = scanner.next();

            // check if the student ID is valid; just if its a length of 5 in this case
            if (studentID.length() == 5) {
                System.out.print("Which meal do you want? (Enter the option number): ");
                int choice = scanner.nextInt();

                if (choice >= 1 && choice <= 5) {
                    if (mealsLeft[choice - 1] > 0) {
                        System.out.println("Option " + choice + " is available. " + "Enjoy your " +
                                getMealName(choice) + "!");
                    } else {
                        System.out.println("Option " + choice + " is not available. Have a good day!");
                    }
                } else {
                    System.out.println("Invalid option. Have a good day!");
                }
            } else {
                System.out.println("Invalid student ID. Lunch cannot be provided.");
            }
        } else if (wantLunch.equalsIgnoreCase("no")) {
            System.out.println("Thank you and have a good day.");
        } else {
            System.out.println("Invalid response. Please enter 'yes' or 'no'.");
        }

        scanner.close();
    }

    //  get the name of a meal based on its option number
    public static String getMealName(int option) {
        String[] mealNames = {"Cheese Pizza", "Popcorn Chicken", "Bosco Sticks", "Classic Caesar Salad", "Turkey Sandwich"};
        if (option >= 1 && option <= mealNames.length) {
            return mealNames[option - 1];
        }
        return "Unknown Meal";
    }
}
