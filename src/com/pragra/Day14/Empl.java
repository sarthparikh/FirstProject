package com.pragra.Day14;

public class Empl {

    private int id;
    private String firstName;
    private String lastName;
    private String address;
    private float Salary;
    private String phoneNumber;
    private String emailId;
    private String Designation;

    public Empl(int id, String firstName, String lastName, String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public Empl(int id, String firstName, String lastName, String address, float salary, String phoneNumber, String emailId, String designation) {
       this(id,firstName,lastName,address);
        Salary = salary;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
        Designation = designation;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public float getSalary() {
        return Salary;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getDesignation() {
        return Designation;
    }


    public void setSalary(float salary) {
        Salary = salary;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void setDesignation(String designation) {
        Designation = designation;
    }

    @Override
    public String toString() {
        return "Empl{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", Salary=" + Salary +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", emailId='" + emailId + '\'' +
                ", Designation='" + Designation + '\'' +
                '}';
    }
}
