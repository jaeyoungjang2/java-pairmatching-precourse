package pairmatching.view;

import java.util.Scanner;

public class InputView {

    private static Scanner SC = new Scanner(System.in);

    public static String mainFunction() {
        System.out.println("기능을 선택하세요.");
        System.out.println("1. 페어 매칭");
        System.out.println("2. 페어 조회");
        System.out.println("3. 페어 초기화");
        System.out.println("Q. 종료");
        return SC.nextLine();
    }
}
