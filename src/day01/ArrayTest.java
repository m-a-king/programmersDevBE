package day01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayTest {

    public static void main(String[] args) throws IOException {
        int[] arr;
        arr = new int[5];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        Member[] members = new Member[3];
        for (int i = 0; i < 3; i++) {
            members[i] = new Member();
            System.out.println("넘버");
            int no = Integer.parseInt(bufferedReader.readLine());
            System.out.println("이름");
            String name = bufferedReader.readLine();
            System.out.println("번호");
            String tel = bufferedReader.readLine();

            members[i].no = no;
            members[i].name = name;
            members[i].tel = tel;
        }

        for (Member member : members) {
            System.out.println(member.no);
            System.out.println(member.name);
            System.out.println(member.tel);
            System.out.println();
        }
    }
}
