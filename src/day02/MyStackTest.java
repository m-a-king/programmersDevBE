package day02;

import day02.jobkorea.JobSeeker;

public class MyStackTest {
    public static void main(String[] args) throws Exception {
        MyStack<String> stack = new MyStack<>();
        stack.push("JAVA");
        stack.push("DB");
        stack.push("SPRING");
        stack.push("JPA");

        System.out.println(stack.peek());
        String item1 = stack.pop();
        System.out.println(item1);
        System.out.println(stack.peek());
        String item2 = stack.pop();
        System.out.println(item2);
        System.out.println(stack.peek());

        MyStack<JobSeeker> jobSeekerStack = new MyStack<>();
        jobSeekerStack.push(new JobSeeker(1, 4000));
        jobSeekerStack.push(new JobSeeker(2, 5000));
        jobSeekerStack.push(new JobSeeker(3, 6000));

        while (!jobSeekerStack.isEmpty()) {
            jobSeekerStack.pop().printInfo();
        }
    }
}
