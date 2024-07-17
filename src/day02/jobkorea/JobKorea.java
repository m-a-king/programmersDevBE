package day02.jobkorea;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
* 구직자 - 속성 3개 이상, 메서드 2개 이상
* 구인회사 - 속성 3개 이상, 메서드 2개 이상
*
* */
public class JobKorea {
    private List<JobSeeker> jobSeekers = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void selectMenu() {
        System.out.println("----잡코리아----");
        System.out.println("1. 구직자 등록");
        System.out.println("2. 회사 등록");
        System.out.println("3. 구직자 정보 출력 (  A L L  )");
        System.out.println("4. 구직자 정보 검색 ( 경    력 )");
        System.out.println("5. 구직자 정보 삭제 ( 희망 연봉 )");
        System.out.println("9. 종료");
        System.out.println("*****************************");
        System.out.println(">>>>> 메뉴 번호를 선택하세요 <<<<<");
        System.out.println("*****************************");

    }
    public void createJobSeeker() {
        JobSeeker jobSeeker = new JobSeeker();
        jobSeeker.inputInfo();
        jobSeekers.add(jobSeeker);
    }

    public void createCompany() {
        System.out.println("구현 예정");
    }

    public void printAllJobSeeker() {
        for (JobSeeker js : jobSeekers) {
            js.printInfo();
        }
    }

    public List<JobSeeker> findJobSeekerByCareer() {
        System.out.println("검색할 경력을 입력하세요:");
        int career = scanner.nextInt();

        List<JobSeeker> res = new ArrayList<>();

        for (JobSeeker js : jobSeekers) {
            if (js.getCareer() == career) {
                js.printInfo();
                res.add(js);
            }
        }
        return res;
    }

    public void deleteJobSeekerByDesiredSalary() {
        System.out.println("삭제할 희망 연봉을 입력하세요:");
        int salary = scanner.nextInt();
        boolean removed = jobSeekers.removeIf(js -> js.getDesiredSalary() == salary);

        if (removed) {
            System.out.println("연봉 " + salary + "의 구직자 정보를 삭제했습니다.");
        } else {
            System.out.println("해당 연봉을 가진 구직자가 없습니다.");
        }
    }

    public static void main(String[] args) {
        JobKorea app = new JobKorea();
        while (true) {
            app.selectMenu();
            int menu = app.scanner.nextInt();
            if (menu == 9) {
                System.out.println("b2b2");
                return;
            }
            switch (menu) {
                case 1 -> app.createJobSeeker();
                case 2 -> app.createCompany();
                case 3 -> app.printAllJobSeeker();
                case 4 -> app.findJobSeekerByCareer();
                case 5 -> app.deleteJobSeekerByDesiredSalary();
                default -> System.out.println("잘못된 번호 선택");
            }

        }

    }
}
