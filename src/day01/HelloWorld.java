package day01;

public class HelloWorld {

    /**
     * 문서화 주석 : javadoc -> api
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("hello world");
        System.out.println("안녕 세상");
        System.out.print("반가워요");
        System.out.println("자바 공부");

        int a = 100;
        System.out.println("a=" + a);
        System.out.println('a' + a);

        System.out.printf("a : %d \n", a);
        System.out.printf("%s", 100);

        String text = "hello world";
        double pi = 3.141592;
        int year = 2024;
        int mm = 7;
        int dd = 16;

        System.out.println(text);
        System.out.println(pi);
        System.out.printf("pi : %.2f%n", pi);
        System.out.println(year + " " + mm + " " + dd);
        System.out.printf("a : %-5d \n", a);
        System.out.printf("a : %5d \n", a);
        System.out.printf("a : %05d \n", a);

        System.out.printf("%4d-%2d-%2d%n", year, mm, dd);
        System.out.printf("%4d-%02d-%02d%n", year, mm, dd);

    }
}
