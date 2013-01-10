/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hospiceapp;

/**
 *
 * @author workstation
 */
public class HospiceApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello world");
        StudentDAO student = new StudentDAO();
        Student test = new Student();
        test.setAchievement(5.70);
        test.setAddress("Arh G Kozarov 3");
        test.setCourse(3);
        test.setEGN(1234567891);
        test.setHasRelatives(0);
        test.setIsLonelyParent(0);
        test.setIsMarried(0);
        test.setIsOrphan(0);
        test.setName("Test User");
        test.setSpecialty("Informatics");
        test.setStatus(1);
        
        // Adding Data
        student.add(test);
    }
}
