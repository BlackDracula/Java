package Mounir;
import java.util.Random;
public class teststaff {
    public static void main(String[] args) {
        Random rand = new Random();
        int id = rand.nextInt(1000);
        Staff L1=new Lecturer();
        Staff admin1= new Admin();
        L1.setName("Zaki");
        L1.setJobTitle("Lecturer");
        L1.setStaffID(id);
        ((Lecturer)L1).setCourse("CSC 1103");
        ((Lecturer)L1).setCourse("CSC 1100");
        ((Lecturer)L1).toString();
        admin1.setName("pauziah");
        admin1.setJobTitle("admin officer");
        admin1.setStaffID(id);
        ((Admin)admin1).setSkill("data entry");
        admin1.PrintDetails (L1);
        System.out.println();
        admin1.PrintDetails(admin1);
    }
    public static void displayInfo(Staff s){
        //complete this method to display information about the staff
//        admin1.PrintDetails(admin1);
//        admin1.PrintDetails (L1);
    }
}