package JavaModule.src;

public class Employee extends LoginSystem {
    private String id;
    private String jobType;
    private int scalePoint;

    public Employee(String id, String jobType, int scalePoint) {
        this.id = id;
        this.jobType = jobType;
        this.scalePoint = scalePoint;
    }

    public String getJobType() {
        return jobType;
    }

    public int getScalePoint() {
        return scalePoint;
    }
}
