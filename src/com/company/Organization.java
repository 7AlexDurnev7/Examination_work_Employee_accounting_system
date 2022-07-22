package com.company;

import java.util.*;

// Class "Organization"
public class Organization {

    private String nameOfOrganization;

    public Map<String, Department> departments = new LinkedHashMap<>();

    // Getters
    public String getNameOfOrganization() {
        return nameOfOrganization;
    }
    public Map<String, Department> getDepartments() {
        return departments;
    }

    // Method to create new organization
    public Organization(String nameOfOrganization, List<String> nameOfDepartment) {
        this.nameOfOrganization = nameOfOrganization;
        for (String name : nameOfDepartment) {
            departments.put(name, null);
        }
    }

    // Method to add department in organization
    public boolean addDepartment(String nameOfOrganization, Department depart) {
        if (departments.containsKey(nameOfOrganization)) {
            departments.put(nameOfOrganization, depart);
            return true;
        }
        return false;
    }

    // Method to remove department from organization
    public boolean removeDepartment(String nameOfOrganization, Department depart) {
        if(departments.containsKey(nameOfOrganization)) {
            departments.remove(nameOfOrganization, depart);
            return true;
        }
        return false;
    }

    // Method to search department by name
    public Department searchDepartmentByName(String name) {
        // running through the map
        for(Map.Entry<String, Department> entry : departments.entrySet()) {
            // if name equals incoming data and name of department
            if(name.equals(entry.getValue().getNameOfDepartment())) {
                // return info about department
                return entry.getValue();
            }
        }
        // if date is not equals -> (may throw exceptions)
        return null;
    }

    // Method to search head of department by post
    public Department searchHeadOfDepartmentByName(String post) {
        // running through the map
        for(Map.Entry<String, Department> entry : departments.entrySet()) {
            // if post equals incoming data
            if(post.equals(entry.getValue().getChief())) {
                return entry.getValue();
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\t\t\t\t").append("OOO ").append("\"").append(nameOfOrganization).append("\"");
        return sb.toString();
    }

} // Class "Organization" end
