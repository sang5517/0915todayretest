package textboard2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;


public class Article {
    // 게시물 번호
    private int id;
    // 제목
    private String title;
    // 내용
    private String content;
    private LocalDateTime registrationDate;
    private int views; // 조회수 변수 추가

    private ArrayList<String> comments = new ArrayList<>();



    public Article(int id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.registrationDate = LocalDateTime.now();
        this.views = 0; // 초기 조회수는 0으로 설정
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;

    }

    public String getRegistrationDateFormatted() {
        // 날짜 형식 지정
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
        return registrationDate.format(formatter);
    }


    //조회수를 증가시키는 메서드
    public int increaseViews() {
        views++;
        return views;

    }
    public void initializeComments() {
        this.comments = new ArrayList<>();
    }

    public void addComment(String comment) {
        comments.add(comment);
    }
    public ArrayList<String> getComments() {
        return comments;
    }
    private int likes = 0; // 추천 횟수 변수 추가

    public void incrementLikes() {
        likes++;
    }

    public int getLikes() {
        return likes;
    }
}





