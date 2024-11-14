package JavaModule.src;

public abstract class Employee {
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

    //Method for calculating pay
    public abstract double calculateMonthlyPayment();

    //Method for creating a payslip
    public abstract void generatePayslip();

    //superclass with login method
    //admin subclass with AddEmployee method
    //HR subclass with PromoteEmployee method
    //JavaModule.src.Employee subclass above
}
