package day02.jobkorea;

import java.util.List;

public class Company {
    private int newSalary, careerSalary;
    private List<String> requiredSkills;

    Company(int newSalary, int careerSalary, List<String> requiredSkills) {
        this.newSalary = newSalary;
        this.careerSalary = careerSalary;
        this.requiredSkills = requiredSkills;
    }

}