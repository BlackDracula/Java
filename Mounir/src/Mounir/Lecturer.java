package Mounir;
public class Lecturer extends Staff {
    private String[] Course = new String[3];
    static int count =0;
    Lecturer(){};
    public void setCourse (String Course ) {
        this.Course[count]=Course;
        count++;
    }
    static int x =0;
    public String getCourse(int x){
        return Course[x];
    }
    public String toString () {
        return "Name: " + getName() + "\nJob: "+getJobTitle()+ "\ncourse[0]: "
        + getCourse(x) +"\ncourse[1]: " + getCourse(1) +"\nStaff id: "+getStaffID();
    }
}