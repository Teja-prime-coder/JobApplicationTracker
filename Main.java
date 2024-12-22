package kittu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JobApplicationTracker tracker = new JobApplicationTracker();

        while (true) {
            System.out.println("\nJob Application Tracker");
            System.out.println("1. Add Job Application");
            System.out.println("2. View All Applications");
            System.out.println("3. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            switch (choice) {
                case 1:
                    System.out.print("Enter company name: ");
                    String company = scanner.nextLine();
                    System.out.print("Enter job title: ");
                    String jobTitle = scanner.nextLine();
                    System.out.print("Enter application date (e.g., YYYY-MM-DD): ");
                    String date = scanner.nextLine();
                    System.out.print("Enter application status: ");
                    String status = scanner.nextLine();
                    JobApplication application = new JobApplication(company, jobTitle, date, status);
                    tracker.addApplication(application);
                    break;
                case 2:
                    tracker.printAllApplications();
                    break;

                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    return; 
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
