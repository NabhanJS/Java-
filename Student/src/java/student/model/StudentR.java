/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.model;

/**
 *
 * @author nabha
 */
public class StudentR {
    
    private int rollnumber;
    private int enggphysics1;
    private int enggchemistry;
    private int enggmathematics1;
    private int basicelectricalengg;
    private int electronicengg;
    private int enggchemistrylab;
    private int enggphysicslab;

    public StudentR() {
    }
    
    

    public StudentR(int rollnumber, int enggphysics1, int enggchemistry, int enggmathematics1, int basicelectricalengg, int electronicengg, int enggchemistrylab, int enggphysicslab) {
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

    public int getEnggphysics1() {
        return enggphysics1;
    }

    public void setEnggphysics1(int enggphysics1) {
        this.enggphysics1 = enggphysics1;
    }

    public int getEnggchemistry() {
        return enggchemistry;
    }

    public void setEnggchemistry(int enggchemistry) {
        this.enggchemistry = enggchemistry;
    }

    public int getEnggmathematics1() {
        return enggmathematics1;
    }

    public void setEnggmathematics1(int enggmathematics1) {
        this.enggmathematics1 = enggmathematics1;
    }

    public int getBasicelectricalengg() {
        return basicelectricalengg;
    }

    public void setBasicelectricalengg(int basicelectricalengg) {
        this.basicelectricalengg = basicelectricalengg;
    }

    public int getElectronicengg() {
        return electronicengg;
    }

    public void setElectronicengg(int electronicengg) {
        this.electronicengg = electronicengg;
    }

    public int getEnggchemistrylab() {
        return enggchemistrylab;
    }

    public void setEnggchemistrylab(int enggchemistrylab) {
        this.enggchemistrylab = enggchemistrylab;
    }

    public int getEnggphysicslab() {
        return enggphysicslab;
    }

    public void setEnggphysicslab(int enggphysicslab) {
        this.enggphysicslab = enggphysicslab;
    }
    
    
    
}
