package day02.jobkorea;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JobSeeker {
    private int career, desiredSalary;
    private List<String> skills;
    private Scanner scanner = new Scanner(System.in);
    JobSeeker() {
        this(0, 0);
    }

    public JobSeeker(int career, int desiredSalary) {
        this.career = career;
        this.desiredSalary = desiredSalary;
        this.skills = new ArrayList<>();
    }

    // 구직자 정보 입력받아 멤버 변수에 전달
    public void inputInfo() {
        System.out.println("경력: ");
        setCareer(scanner.nextInt());
        System.out.println("희망연봉: ");
        setDesiredSalary(scanner.nextInt());
        scanner.nextLine();

        // TODO : 반복
        System.out.println("스킬 1");
        setSkills(scanner.nextLine());
        System.out.println("스킬 2");
        setSkills(scanner.nextLine());

    }

    public void printInfo() {
        System.out.println("----------------------------------");
        System.out.println("career = " + career);
        System.out.println("desiredSalary = " + desiredSalary);
        for (String skill : skills) {
            System.out.println("skill = " + skill);
        }
        System.out.println("----------------------------------");

    }

    public int getCareer() {
        return career;
    }

    public int getDesiredSalary() {
        return desiredSalary;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setCareer(int career) {
        this.career = career;
    }

    public void setDesiredSalary(int desiredSalary) {
        this.desiredSalary = desiredSalary;
    }

    public void setSkills(String skill) {
        this.skills.add(skill);
    }
}