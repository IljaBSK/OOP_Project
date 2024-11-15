package JavaModule.src;

public class Employee extends User {
    private String id;
    private String jobType;
    private int scalePoint;

    public Employee(String username, String password, String jobType) {
        super(username, password, jobType);
    }


    public String getJobType() {
        return jobType;
    }

    public int getScalePoint() {
        return scalePoint;
    }
}
