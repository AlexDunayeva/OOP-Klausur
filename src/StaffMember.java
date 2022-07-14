import java.util.HashMap;


public class StaffMember extends Person{
    private String job;
    private int staffNumber;

    public StaffMember(String firstName, String lastName, int passportNumber, String job, int staffNumber) {
        super(firstName, lastName, passportNumber);
        this.job = job;
        this.staffNumber = staffNumber;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getStaffNumber() {
        return staffNumber;
    }

    public void setStaffNumber(int staffNumber) {
        this.staffNumber = staffNumber;
    }

    public static HashMap<String, StaffMember> defaultStaff(){

        HashMap<String,  StaffMember> members = new HashMap<>();
        StaffMember bob = new StaffMember("Bob", "Herman", 12354, "Cabin Crew", 339558);
        StaffMember maya = new StaffMember("May", "Brandenburg", 33904, "Captain", 118847);
        members.put(bob.getFirstName(), bob);
        members.put(maya.getFirstName(), maya);

        return members;
    }
}
