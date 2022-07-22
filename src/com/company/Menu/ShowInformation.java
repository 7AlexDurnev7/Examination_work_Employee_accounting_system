package com.company.Menu;


import com.company.Department;
import com.company.Employee;

import java.util.Collections;
import java.util.Map;

// Class "ShowInformation"
public class ShowInformation {

    private Employee employee;

    // Output information about department
    // Method to show info about department
    public void showDepartment(Department department) {
        // print info about department
        System.out.println("\t\t\t" + department.getNameOfDepartment() + "\n" );
        // running through the map
        for(Map.Entry<String, Employee> entry : department.getEmployeePosts().entrySet()) {
            String key = entry.getKey();
            Employee value = entry.getValue();
            // print info: key and value
            System.out.println(key + ": " + value + "\n");
        }
    }



} // Class "ShowInformation" end
