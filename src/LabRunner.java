import java.util.Scanner;
public class LabRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first string: ");
        String first = scan.nextLine();

        System.out.println("String Length: " + first.length());

        if (first.length() % 2 == 0) {
            String one = first.substring(0, (first.length() / 2));
            String two = first.substring(first.length() / 2);
            System.out.println("First half: " + one);
            System.out.println("Second half: " + two);
        } else {
            String one = first.substring(0, (first.length() / 2));
            String two = first.substring(first.length() / 2);
            System.out.println("First half: " + one);
            System.out.println("Second half: " + two);
        }

        System.out.println("Enter second string: ");
        String second = scan.nextLine();

        if (first.length() > second.length()) {
            System.out.println(first + " is longer");
        } else if (second.length() > first.length()) {
            System.out.println(second + " is longer");
        } else {
            System.out.println("Both strings have the same length");
        }

        if (first.equals(second)) {
            System.out.println("Both strings have the exact same characters");
        } else {
            if (first.compareTo(second) < 0) {
                System.out.println(first + " is first alphabetically");
            } else {
                System.out.println(second + " is first alphabetically");
            }
        }

        if (first.indexOf(second) != -1) {
            System.out.println(second + " is found in " + first + " at index " + first.indexOf(second));
        } else {
            System.out.println(second + " is NOT found in " + first);
        }
    }
}
