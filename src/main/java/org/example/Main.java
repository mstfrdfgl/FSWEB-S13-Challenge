package org.example;

import org.example.enums.Plan;

import javax.print.attribute.standard.Copies;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Healthplan basicPlan=new Healthplan(0,"Basic Health Plan",Plan.BASIC);
        Healthplan premiumPlan=new Healthplan(1,"Premium Health Plan",Plan.PREMIUM);
        Healthplan goldPlan=new Healthplan(2,"Gold Health Plan",Plan.GOLD);

        System.out.println(basicPlan);
        System.out.println(premiumPlan);
        System.out.println(goldPlan);

        String[] googleDeveloperCap=new String[10];
        Company google=new Company(1907,"Google",19.07,googleDeveloperCap);
        String[] microsoftDeveloperCap=new String[3];
        Company microsoft=new Company(1881,"Microsoft",4697.00,microsoftDeveloperCap);

        System.out.println(google);
        System.out.println(microsoft);

        String[] mustafaHealthPlanCap=new String[2];
        Employee mustafa=new Employee(7,"Mustafa Redifoğlu","mustafa@mustafa.com","12345",mustafaHealthPlanCap);
        String[] berkayHealthPlanCap=new String[9];
        Employee berkay=new Employee(5,"Taha Berkay Redifoğlu","berkay@berkay.com","123",berkayHealthPlanCap);

        System.out.println(mustafa);
        System.out.println(berkay);

        mustafa.addHealthPlan(0,basicPlan.getName());
        mustafa.addHealthPlan(1,goldPlan.getName());
        mustafa.addHealthPlan(0, premiumPlan.getName());
        System.out.println(Arrays.toString(mustafa.getHealthPlans()));
        google.addEmployee(0,mustafa.getFullName());

        System.out.println(Arrays.toString(google.getDeveloperNames()));

    }
}