package Mounir;
public class Admin extends Staff{
    private String skill;
    public Admin(){}
    public void setSkill(String skill) {
        this.skill=skill;
    }
    public String getSkill () {
        return skill;
    }
    public  String toString() {
        return "Name: " + getName() + "\nJob: "+getJobTitle()+"\nStaff id: "+getStaffID()+"\nskill: "+ getSkill();
    }
}