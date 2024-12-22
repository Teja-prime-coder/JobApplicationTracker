package kittu;

import java.util.ArrayList;
import java.util.List;

public class JobApplicationTracker {
    private List<JobApplication> applications;
    public JobApplicationTracker() {
        applications = new ArrayList<>();
    }
    public void addApplication(JobApplication application) {
        applications.add(application);
    }
    public void printAllApplications() {
        if (applications.isEmpty()) {
            System.out.println("No applications yet.");
        } else {
            for (JobApplication app : applications) {
                System.out.println(app);  
            }
        }
    }
    public static void main(String[] args) {
        JobApplicationTracker tracker = new JobApplicationTracker();
        JobApplication application1 = new JobApplication("GOOGLE", "Software Engineer", "2024-12-20", "Applied");
        JobApplication application2 = new JobApplication("AROMA BRAND SOLITIONS", "Software Engineer", "2025-2-7", "Interview Scheduled");
        tracker.addApplication(application1);
        tracker.addApplication(application2);
        tracker.printAllApplications();
    }
}
