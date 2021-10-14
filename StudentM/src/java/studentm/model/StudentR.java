/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentm.model;

/**
 *
 * @author nabha
 */
public class StudentR {
    
    private int rollnumber;
    private String enggphysics1;
    private String enggchemistry;
    private String enggmathematics1;
    private String basicelectricalengg;
    private String electronicengg;
    private String enggchemistrylab;
    private String enggphysicslab;

    public StudentR() {
    }
    
    

    public StudentR(int rollnumber, String enggphysics1, String enggchemistry, String enggmathematics1, String basicelectricalengg, String electronicengg, String enggchemistrylab, String enggphysicslab) {
        this.rollnumber = rollnumber;
        this.enggphysics1 = enggphysics1;
        this.enggchemistry = enggchemistry;
        this.enggmathematics1 = enggmathematics1;
        this.basicelectricalengg = basicelectricalengg;
        this.electronicengg = electronicengg;
        this.enggchemistrylab = enggchemistrylab;
        this.enggphysicslab = enggphysicslab;
    }
    
    

    public int getRollnumber() {
        return rollnumber;
    }

    public void setRollnumber(int rollnumber) {
        this.rollnumber = rollnumber;
    }

    public String getEnggphysics1() {
        return enggphysics1;
    }

    public void setEnggphysics1(String enggphysics1) {
        this.enggphysics1 = enggphysics1;
    }

    public String getEnggchemistry() {
        return enggchemistry;
    }

    public void setEnggchemistry(String enggchemistry) {
        this.enggchemistry = enggchemistry;
    }

    public String getEnggmathematics1() {
        return enggmathematics1;
    }

    public void setEnggmathematics1(String enggmathematics1) {
        this.enggmathematics1 = enggmathematics1;
    }

    public String getBasicelectricalengg() {
        return basicelectricalengg;
    }

    public void setBasicelectricalengg(String basicelectricalengg) {
        this.basicelectricalengg = basicelectricalengg;
    }

    public String getElectronicengg() {
        return electronicengg;
    }

    public void setElectronicengg(String electronicengg) {
        this.electronicengg = electronicengg;
    }

    public String getEnggchemistrylab() {
        return enggchemistrylab;
    }

    public void setEnggchemistrylab(String enggchemistrylab) {
        this.enggchemistrylab = enggchemistrylab;
    }

    public String getEnggphysicslab() {
        return enggphysicslab;
    }

    public void setEnggphysicslab(String enggphysicslab) {
        this.enggphysicslab = enggphysicslab;
    }
    
    
    
    
}
