package day02;

import day02.jobkorea.JobSeeker;

import java.util.Comparator;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.addFirst(1);
        myLinkedList.addFirst(2);
        myLinkedList.addFirst(3);
        myLinkedList.addFirst(4);
        myLinkedList.addFirst(5);
        myLinkedList.printAllNode();
        myLinkedList.printCurrentNode();

        myLinkedList.addLast(1);
        myLinkedList.addLast(2);
        myLinkedList.addLast(3);
        myLinkedList.addLast(4);
        myLinkedList.addLast(5);
        myLinkedList.printAllNode();
        myLinkedList.printCurrentNode();

        myLinkedList.removeFirst();
        myLinkedList.printAllNode();
        myLinkedList.printCurrentNode();

        myLinkedList.removeLast();
        myLinkedList.printAllNode();
        myLinkedList.printCurrentNode();

        //1. Applicant 객체 3개 생성한 후 링크드리스트에 저장하세요
        MyLinkedList<JobSeeker> jobSeekers = new MyLinkedList<>();
        jobSeekers.addFirst(new JobSeeker(1, 3000));
        JobSeeker js1 = new JobSeeker(2, 4000);
        jobSeekers.addFirst(js1);
        jobSeekers.addFirst(new JobSeeker(3, 5000));
        //2. 중간 지점에 있는 Applicant객체를 하나 삭제하세요
//        jobSeekers.search(js1, comparator)
//        jobSeekers.removeCurrentNode();
        //3. 나이가 22세인 구직자가 있는지 검색해서 해당 구직자 정보를 출력

    }
}
