package com.company;


import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

@Author(author = "Durnev Alex")

// Class "Employee"
public class Employee {

    transient Scanner in = new Scanner(System.in);

    // Fields
    private String fullName;            //  full name
    private String dateOfBirth;         //  date of birth
    private String gender;              //  gender
    private String post;                //  post
    private String department;          //  department
    private String chief;               //  chief
    private String dateOfEmployment;    //  date of employment
    private int salary;                 //  salary
    private String telephone;           // telephone number

    public Employee(String fullName, String dateOfBirth, String gender,
                    String post, String telephone, String department, String chief,
                    String dateOfEmployment, int salary) throws ParseException {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.post = post;
        this.telephone = telephone;
        this.department = department;
        this.chief = chief;
        this.dateOfEmployment = dateOfEmployment;
        this.salary = salary;
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        sdf.parse(dateOfBirth);
    }

    // Getters
    public String getFullName() {
        return fullName;
    }
    public String getPost() {
        return post;
    }
    public int getSalary() {
        return salary;
    }


    @Override
    public String toString() {
//        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
//        sdf.format(dateOfBirth);
//        sdf.format(dateOfEmployment);
        StringBuilder sb = new StringBuilder();
        sb.append("ID: ").append(fullName).append("\n")
               .append("Date of birth: ").append(dateOfBirth).append("\n")
               .append("Gender: ").append(gender).append("\n")
               .append("Current position: ").append(post).append("\n")
               .append("Telephone number: ").append(telephone).append("\n")
               .append("Department: ").append(department).append("\n")
               .append("Head of department: ").append(chief).append("\n")
               .append("Date of employment: ").append(dateOfEmployment).append("\n")
               .append("Salary: ").append(salary).append("\n");

       return sb.toString();
    }


    // Method to compare employee by salary
   public static final Comparator<Employee> COMPARE_BY_SALARY = (salaryMin, salaryMax)
            -> salaryMin.getSalary() - salaryMin.getSalary();

    //  Method to compare employee by date of employment

}// Class "Employee" end
