package kittu;

public class JobApplication {
    private String companyName;
    private String jobTitle;
    private String applicationDate;
    private String applicationStatus;
    public JobApplication(String companyName, String jobTitle, String applicationDate, String applicationStatus) {
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.applicationDate = applicationDate;
        this.applicationStatus = applicationStatus;
    }
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(String applicationDate) {
        this.applicationDate = applicationDate;
    }

    public String getApplicationStatus() {
        return applicationStatus;
    }

    public void setApplicationStatus(String applicationStatus) {
        this.applicationStatus = applicationStatus;
    }

    @Override
    public String toString() {
        return "Company: " + companyName + ", Job Title: " + jobTitle + ", Date: " + applicationDate + ", Status: " + applicationStatus;
    }
    public static void main(String[] args) {
        JobApplication application = new JobApplication("AROMA BRAND SOLITIONS", "Software Engineer", "2024-12-20", "Applied");
        System.out.println(application);
    }
}
