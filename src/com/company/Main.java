package com.company;


import com.company.Menu.ShowInformation;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {

        // create this class to print any info about organization/department/find employee/chief -> etc.
        ShowInformation show = new ShowInformation();

        // List positions in Sale department
        ArrayList<String> salesDep =  new ArrayList<>();
        salesDep.add("Head manager");
        salesDep.add("Manager");
        salesDep.add("Middle manager");
        salesDep.add("Helper");

        // Create Sales department
        Department sales = new Department("Sale department", salesDep);

        // List to save and add all department
        List<String> deptInOrganization = new ArrayList<>();

        // Create new organization without departments
        Organization organization = new Organization("Gudinni", deptInOrganization);
        System.out.println(organization);
//        System.out.println();

        // Create new employees
        Employee employee = new Employee("Gromov Alex",10.12.1989 , "male", salesDep.get(0),"8-916-78-15-67", sales.getNameOfDepartment(), "-",
                "08.08.2020", 110000);
        Employee employee1 = new Employee("Petrov Ivan","11.03.1988","male",salesDep.get(1),"8-920-295-55-97","Sale Department", employee.getFullName(),"09.06.2020", 55000);
        Employee employee2 = new Employee("Ivanov Petr","10.12.1990", "male", salesDep.get(3),"8-999-99-99-99", "Sale Department", employee.getFullName(),
                "19.10.2019", 30000);
        Employee employee3 = new Employee("Gerdov Andrey","10.12.1980", "male", salesDep.get(2),"8-996-55-59-59", "Sale Department", employee.getFullName(),
                "11.02.2020", 450000);

        // add all employee in the department
        sales.addEmployee(salesDep.get(0), employee);
        sales.addEmployee(salesDep.get(1), employee1);
        sales.addEmployee(salesDep.get(3), employee2);
        sales.addEmployee(salesDep.get(2), employee3);
        show.showDepartment(sales);

        // List positions in Purchase department
        ArrayList<String> purchase =  new ArrayList<>();
        purchase.add("Head supplier");
        purchase.add("Supplier");
        purchase.add("Middle supplier");

        // Create Purchase department
        Department snabb = new Department("Purchase department", purchase);

        // create new employee
        Employee employee4 = new Employee("Verbovа Irina","10.12.1967", "female", purchase.get(0), "8-923-97-79-79", snabb.getNameOfDepartment(), "-",
                "22.01.2016", 100000);
        Employee employee5 = new Employee("Guriev Serg","10.12.1960", "male", purchase.get(1), "8-996-57-55-58", snabb.getNameOfDepartment(), employee4.getFullName(),
                "15.08.2018", 80000);
        Employee employee6 = new Employee("Bregneva Alena","10.12.1987", "female", purchase.get(2), "8-914-67-35-17", snabb.getNameOfDepartment(), employee4.getFullName(),
                "05.03.2022", 70000);

        // add all employee in the Purchase department
        snabb.addEmployee(purchase.get(0), employee4);
        snabb.addEmployee(purchase.get(1), employee5);
        snabb.addEmployee(purchase.get(2), employee6);
        show.showDepartment(snabb);

        // Create list for Accounting department
        List<String> accounts = new ArrayList<>();
        accounts.add("Chief accountant");
        accounts.add("Accountant");

        // Create Accounting department
        Department acc = new Department("Accounting department", accounts);

        // create new employee for Accounting department
        Employee employee7 = new Employee("Bregneva Alena","10.12.1987", "female", accounts.get(0), "8-914-67-35-17", acc.getNameOfDepartment(), "-",
                "05.03.2022", 78000);
        Employee employee8 = new Employee("Barigina Elena","10.12.1989", "female", accounts.get(1),"8-916-78-15-67", acc.getNameOfDepartment(), employee7.getFullName(),
                "08.08.2020", 110000);

        // add all employee in the Accounting department
        acc.addEmployee(accounts.get(0), employee7);
        acc.addEmployee(accounts.get(1), employee8);
        show.showDepartment(acc);


        // add full departments in the list
        deptInOrganization.add(sales.getNameOfDepartment());
        deptInOrganization.add(snabb.getNameOfDepartment());
        deptInOrganization.add(acc.getNameOfDepartment());

        // add full departments in the list
        organization.addDepartment(sales.getNameOfDepartment(), sales);
        organization.addDepartment(snabb.getNameOfDepartment(), snabb);
        organization.addDepartment(acc.getNameOfDepartment(), acc);




        // remove employee from department
//        System.out.println("Remove employee from department");
//        sales.removeEmployee(salesDep.get(3), employee2);
//        show.showDepartment(sales);

        // Find employee by full name
//        System.out.println("Find employee by full name: ");
//        System.out.println(sales.findEmployeeByFullName("Gromov Alex"));
//        System.out.println();

        // Find employee by post
//        System.out.println("Find employee by post: ");
//        System.out.println(sales.findEmployeeByPost("Manager"));





    }
}
