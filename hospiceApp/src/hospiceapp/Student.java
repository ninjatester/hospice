/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hospiceapp;

/**
 *
 * @author workstation
 */
public class Student {
        int idNumber;
        String name;
        int EGN;
        String course;
        String specialty;
        String address;
        int isOrphan;
        int isMarried;
        int isLonelyParent;
        int hasRelatives;
        double achievement;
        int status;

        public Student() {

        }

        public Student(int idNumber, String name, int EGN, String course, 
                String specialty, String address, int isOrphan, int isMarried, 
                int isLonelyParent, int hasRelatives, double achievement, int status) {
                this.idNumber = idNumber;
                this.name = name;
                this.EGN = EGN;
                this.course = course;
                this.specialty = specialty;
                this.address = address;
                this.isOrphan = isOrphan;
                this.isMarried = isMarried;
                this.isLonelyParent = isLonelyParent;
                this.achievement = achievement;
                this.status = status;
        }

        public int getIdNumber() {
            return idNumber;
        }

        public void setIdNumber(int idNumber) {
            this.idNumber = idNumber;
        }



        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public int getEGN() {
            return EGN;
        }

        public void setEGN(int EGN) {
            this.EGN = EGN;
        }
        
        

        public String getCourse() {
                return course;
        }

        public void setCourse(String course) {
                this.course = course;
        }

        public String getSpecialty() {
            return specialty;
        }

        public void setSpecialty(String specialty) {
            this.specialty = specialty;
        }

        public String getAddress() {
                return address;
        }

        public void setAddress(String address) {
                this.address = address;
        }

        public int getIsOrphan() {
            return isOrphan;
        }

        public void setIsOrphan(int isOrphan) {
            this.isOrphan = isOrphan;
        }

        public int getIsMarried() {
            return isMarried;
        }

        public void setIsMarried(int isMarried) {
            this.isMarried = isMarried;
        }

        public int getIsLonelyParent() {
            return isLonelyParent;
        }

        public void setIsLonelyParent(int isLonelyParent) {
            this.isLonelyParent = isLonelyParent;
        }

        public int getHasRelatives() {
            return hasRelatives;
        }

        public void setHasRelatives(int hasRelatives) {
            this.hasRelatives = hasRelatives;
        }

        public double getAchievement() {
            return achievement;
        }

        public void setAchievement(double achievement) {
            this.achievement = achievement;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }
        
}
