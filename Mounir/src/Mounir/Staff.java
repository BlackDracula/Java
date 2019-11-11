package Mounir;
public class Staff {
    private String name;
    private String JobTitle;
    private int staff_id;
    Staff(){};
    public void setName (String name) {
        this.name=name;
    }
    public void setJobTitle(String JobTitle) {
        this.JobTitle=JobTitle;
    }
    public void setStaffID (int staff_id) {
        this.staff_id=staff_id;
    }
    public int getStaffID () {
        return staff_id;
    }
    public String getName() {
        return this.name;
    }
    public String getJobTitle() {
        return JobTitle;
    }
    public static void PrintDetails (Object o) {
        if (o instanceof Admin) {
            System.out.println(((Admin)o).toString());
        }
        else if (o instanceof Lecturer) {
            System.out.println(((Lecturer)o).toString());
        }
    }
}