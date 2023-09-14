package textboard2;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;


public class textboard2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        ArrayList<String> titles = new ArrayList<>(); // 여기 하나 밖에 저장을 못하는게 문제
//        ArrayList<String> contents = new ArrayList<>();
        ArrayList<Article> articles = new ArrayList<>();
        articles.add(new Article(1, "안녕하세요 반갑습니다. 자바 공부중이에요.", "내용1"));
        articles.add(new Article(2, "자바 질문좀 할게요~", "내용2"));
        articles.add(new Article(3, "정처기 따야되나요?", "내용3"));

        // 테스트 데이터 추가

        int lastArticleId = 1;

        while (true) {
            System.out.print("명령어 : ");
            String command = scan.nextLine();
            boolean found = false;
            if (command.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (command.equals("add")) {
                System.out.print("게시물 제목을 입력해주세요 : ");
                String title = scan.nextLine();
                System.out.print("게시물 내용을 입력해주세요 : ");
                String content = scan.nextLine();

                Article article = new Article(lastArticleId, title, content);
                articles.add(article);

                System.out.println("게시물이 등록되었습니다.");
                lastArticleId++;
            } else if (command.equals("list")) {
                System.out.println("==================");
                for (int i = 0; i < articles.size(); i++) {

                    Article article = articles.get(i);

                    System.out.printf("번호 : %d\n", article.getId());
                    System.out.printf("제목 : %s\n", article.getTitle());
                    System.out.println("==================");
                }
            } else if (command.equals("update")) {
                System.out.print("수정할 게시물 번호 : ");
                int targetId = scan.nextInt();

                scan.nextLine();

                boolean isExist = false;

                for (int i = 0; i < articles.size(); i++) {
                    Article article = articles.get(i);

                    if (targetId == article.getId()) {
                        System.out.print("제목 : ");
                        String newTitle = scan.nextLine();
                        System.out.print("내용 : ");
                        String newContent = scan.nextLine();

                        Article newArticle = new Article(targetId, newTitle, newContent);
                        articles.set(i, newArticle);

                        System.out.println("수정이 완료되었습니다.");
                        isExist = true;
                    }
                }

                if (isExist == false) {
                    System.out.println("없는 게시물입니다.");
                }


            } else if (command.equals("delete")) {
                System.out.print("삭제할 게시물 번호 : ");
                int targetId = scan.nextInt();

                scan.nextLine();

                boolean isExist = false;

                for (int i = 0; i < articles.size(); i++) {
                    Article article = articles.get(i);
                    if (targetId == article.getId()) {
                        articles.remove(i);
                        System.out.printf("%d번 게시물이 삭제되었습니다.\n", targetId);
                        isExist = true;
                    }
                }
                if (isExist == false) {
                    System.out.println("없는 게시물입니다.");
                }
                String target = scan.nextLine();

            } else if (command.equals("detail")) {
                System.out.print("상세보기 할 게시물 번호를 입력해주세요: ");
                int target = scan.nextInt();
                if (target >= 1 && target <= articles.size()) {
                    Article article = articles.get(target - 1);
                    System.out.println("==================");
                    System.out.printf("번호 : %d\n", target);
                    System.out.printf("제목 : %s\n", article.getTitle());
                    System.out.printf("내용 : %s\n", article.getContent());
                    System.out.printf("등록날짜 %s\n", article.getRegistrationDateFormatted());
                    System.out.printf("조회수 : %d\n", article.increaseViews());
                    System.out.println("==================");
                    System.out.println("");

                    // 조회수를 증가시킴
                    // 댓글 출력
                    ArrayList<String> comments = article.getComments();
          //          ArrayList<LocalDateTime> commentDates = article.(); // 댓글 작성일을 가져옴
                    System.out.println("======= 댓글 =======");
                    for (int i = 0; i < comments.size(); i++) {
                        System.out.printf("댓글 내용 %s\n", article.getComments());
                        System.out.printf("댓글 작성일 %\n",article.getRegistrationDateFormatted());
                        System.out.println();
                    }
                    //댓글 등록 기능
                    while (true) {
                        System.out.println("상세보기 기능을 선택해주세요(1. 댓글 등록, 2. 추천, 3. 수정, 4. 삭제, 5. 목록으로) :");
                        int detailcommand = scan.nextInt();//개행문자처리를 한것

                        if (detailcommand == 1) {
                            System.out.print("댓글을 입력해주세요:");
                            String comment = scan.nextLine();
                            article.addComment(comment);
                            System.out.println("댓글이 성공적으로 등록되었습니다.");
                        } else if (detailcommand == 2) {
                            //게시물 추천기능
                            article.incrementLikes();
                            System.out.print("게시물이 추천되었습니다.");
                        } else if (detailcommand == 3) {
                            //댓글 수정기능
                            System.out.print("새로운 제목을 입력해주세요");
                            String newTitle = scan.nextLine();
                            System.out.print("새로운 내용을 입력해주세요");
                            String newContent = scan.nextLine();
                        } else if (detailcommand == 4) {
                            //댓글 삭제기능
                            articles.remove(article);
                            System.out.print("댓글이 삭제되었습니다.");
                        } else if (detailcommand == 5) {
                            break;
                        } else {
                            System.out.println("올바른 명령을 입력해주세요");
                        }
                    }
                } else {
                    System.out.println("존재하지 않는 게시물 번호입니다.");
                }

            } else if (command.equals("search")) {
                System.out.print("검색 키워드를 입력해주세요 :");
                String keyboard = scan.nextLine();

                boolean found1 = false;


                for (Article article : articles) {
                    if (article.getTitle().contains(keyboard)) {
                        System.out.printf("번호 : %d\n", article.getId());
                        System.out.printf("제목 : %s\n", article.getTitle());
                        found = true; // 검색 결과를 찾았음을 표시
                    }
                }
                if (!found) {
                    System.out.println("검색 결과가 없습니다.");
                }
            }
        }
    }
}






