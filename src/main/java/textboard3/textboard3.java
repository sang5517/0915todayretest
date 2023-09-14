package textboard3;

import java.util.Scanner;

public class textboard3 {
//    - 명령어 : list
//  - 설명 : add로 저장된 게시물의 목록이 나온다.
//  - 입출력 예시
//    ```
//    명령어 : list
//    ==================
//    제목 : 제목1
//    내용 : 내용1
//    ==================
//    제목 : 제목2
//    내용 : 내용2
//    ==================
//            ```
public static void main(String[] args) {

    Scanner scan2 = new Scanner(System.in);

    while (true) {
        System.out.println("명령어 : ");
        String commend3 = scan2.nextLine();
        if(commend3.equals("exit")) {
            System.out.println("프로그램 종료");
            break;
        } else if (commend3.equals("list")) {
            System.out.println("제목 :");
            String ntitle = scan2.nextLine();
            System.out.println("내용 :");
            String ntitle2 = scan2.nextLine();

        }

    }




}

}
