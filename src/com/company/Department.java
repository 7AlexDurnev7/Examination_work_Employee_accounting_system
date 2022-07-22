package com.company;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

// Class "Department"
public class Department {

    // Fields
    private String nameOfDepartment;
    private String chief;

    public Map<String, Employee> employeePosts = new LinkedHashMap<>();

    // Getters and Setters
    public String getNameOfDepartment() {
        return nameOfDepartment;
    }
    public Map<String, Employee> getEmployeePosts() {
        return employeePosts;
    }
    public String getChief() {
        return chief;
    }

    // Method to create new department without employee
    public Department(String nameOfDepartment, List<String> nameOfPosts) {
        this.nameOfDepartment = nameOfDepartment;
        for (String name : nameOfPosts) {
            employeePosts.put(name, null);
        }
    }

    // Method to add employees in department
    public boolean addEmployee(String nameOfDepartment, Employee empl) {
        // do check exist this department
        if (employeePosts.containsKey(nameOfDepartment)) {
            // if exist -> add new employee
            employeePosts.put(nameOfDepartment, empl);
            return true;
            // if department is not exist -> return false
        } return false;
    }

    // Method to remove employee from department
    public boolean removeEmployee(String nameOfDepartment, Employee empl) {
        // do check exist this post
        if (employeePosts.containsKey(nameOfDepartment)) {
            // if exist -> remove it
            employeePosts.remove(nameOfDepartment, empl);
            return true;
        } return false; // if is not exist -> return false
    }

    //Method to find employee by full name (ID)
    public Employee findEmployeeByFullName(String name) {
        // running through the map
        for(Map.Entry<String, Employee> entry :employeePosts.entrySet()) {
            // if name equals incoming data and full name
            if(name.equals(entry.getValue().getFullName())) {
                // return info about employee
                return entry.getValue();
            }
        }
        // if date is not equals -> false
        return null;
    }

    //Method to find employee by post
    public Employee findEmployeeByPost(String post) throws Exception {
        // running through the map
        for(Map.Entry<String, Employee> entry :employeePosts.entrySet()) {
            // if post equals incoming data and post
            if (post.equals(entry.getValue().getPost())) {
                // return info about employee
                return entry.getValue();
            }
        }
        // if date is not equals -> false

        return null;
    }

//    // Method to show info about department
//    public void showDepartment(Department department) {
//        // print info about department
//        System.out.println("\t\t\t" + department.getNameOfDepartment() + "\n" );
//        // running through the map
//        for(Map.Entry<String, Employee> entry : department.getEmployeePosts().entrySet()) {
//            String key = entry.getKey();
//            Employee value = entry.getValue();
//            // print info: key and value
//            System.out.println(key + ": " + value + "\n");
//        }
//    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<String,Employee > entry : employeePosts.entrySet()) {
            String key = entry.getKey();
            Employee value = entry.getValue();
            sb.append(key).append(": ").append("\n").append(value);
        }
        return sb.toString();
    }

    public String nameOfDepartment() {
        return nameOfDepartment + "Chief of department" + chief;
    }



}// Class "Department" end
