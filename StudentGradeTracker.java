import java.util.ArrayList;
import java.util.Scanner;

class StudentGradeTracker {
    private ArrayList<Integer> grades;

    // Constructor
    public StudentGradeTracker() {
        grades = new ArrayList<>();
    }

    // Method to add a grade with validity check
    public void addGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
        } else {
            System.out.println("Invalid grade! Please enter a grade between 0 and 100.");
        }
    }

    // Method to calculate average
    public double calculateAverage() {
        if (grades.isEmpty()) {
            return 0;
        }
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    // Method to find highest grade
    public int findHighest() {
        if (grades.isEmpty()) {
            return -1;
        }
        int highest = grades.get(0);
        for (int grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }

    // Method to find lowest grade
    public int findLowest() {
        if (grades.isEmpty()) {
            return -1;
        }
        int lowest = grades.get(0);
        for (int grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }

    // Method to display all grades
    public void displayGrades() {
        System.out.println("Grades entered: " + grades);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentGradeTracker tracker = new StudentGradeTracker();

        System.out.println("Welcome to Student Grade Tracker!");

        // Input loop
        while (true) {
            System.out.print("Enter a student's grade (or -1 to finish): ");
            int grade = scanner.nextInt();
            if (grade == -1) {
                break;
            }
            tracker.addGrade(grade);
        }

        // Display Results
        tracker.displayGrades();
        System.out.println("Average Grade: " + tracker.calculateAverage());
        System.out.println("Highest Grade: " + tracker.findHighest());
        System.out.println("Lowest Grade: " + tracker.findLowest());
    }
}
