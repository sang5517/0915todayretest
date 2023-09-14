import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // 이름 짓는 규칙
        // 변수,클래스 -> 명사
        // 함수 -> 동사
        // 단어 조합시 단어 의미가 바뀔 때마다 대문자 표현
        // -> 카멜 표기법
        // 클래스 이름 지을 때는 첫글자 무조건 대문자.
        // 누가봐도. 추측 가능한. 단어 조합으로 지으세요.
        // 파파고나 구글 번역기, 챗gpt 사용꼭하면서 신경쓰기
        // 이름 짓는 것 너무너무 매우매우 중요함.
        // 코드 정렬 ( 심심할 때마다 눌러주세요 수시로~)
        // alt + ctrl + L

        Scanner scan = new Scanner(System.in);
        while (true) {

            String command = scan.nextLine();
            if (command.equals("exit")) {
                System.out.println("프로그램을 종료합니다");
            }

//
//            if (func.equals("a")) {
//                System.out.println("기능1");
//            } else if (func.equals("b")) {
//                System.out.println("기능2");
//            } else if (func.equals("도움말")) {
//                System.out.println("a : 기능1");
//                System.out.println("b : 기능2");
//            } else if (func.equals("exit")) {
//                System.out.println("루프종료");
//                break; // 무한루프를 빠져나옴
//            } else {
//                System.out.println("프로그램을 종료합니다.");
//            }
//            scan.close();// 스캐너를 닫음.

//        // 숫자 비교
//        int a = 10;
//        System.out.println(a == 10);
//        // 문자열 비교
//         String str = "hello";
//         System.out.println(str.equals("hello"));
//


        }

    }
}
