public class Employee {
    private String id;
    private String jobType;
    private int scalePoint;

    public Employee(String id, String jobType, int point){
        this.id = id;
        this.jobType = jobType;
        this.scalePoint = point;
    }

    public String getJobType() {
        return jobType;
    }

    public int getScalePoint() {
        return scalePoint;
    }
}
