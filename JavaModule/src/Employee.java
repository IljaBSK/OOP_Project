package JavaModule.src;

public class Employee extends User {

    private String name;
    private String doB;
    private int ppsNo;
    private int id;
    private String jobTitle;
    private int scalePoint;

    public Employee(String username, String password, String jobType, String name, String doB, int pps, int id, String jobTitle, int scalePoint) {
        super(username, password, jobType);
    }


    public String getJobTitle() {
        return jobTitle;
    }

    public int getScalePoint() {
        return scalePoint;
    }
}
