package com.jojoldu.book.springboot.domain.posts;

import com.jojoldu.book.springboot.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

//직접 쿼리를 날리지 않고 Entity클래스를 통해 수정!
@Getter
@NoArgsConstructor //기본생성자 자동추가, public Posts(){}와 같은 효과
@Entity//테이블과 링크될 클래스라는 걸 표시, 기본값으로 클래스의 카멜이름을 언더스코어_네이밍으로 테이블이름을 매칭 ex)SalesManager.java -> sales_manager table
public class Posts extends BaseTimeEntity {
    @Id //해당테이블의 PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) //PK의 생성규칙 GenerationType.IDENTITY 해줘야 autoIncrement가능
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;
    private String author;

    @Builder //매개변수있는 생성자 ? 생성자 상단에 선언 시 생성자에 포함된 필드만 빌더에 포함
    public Posts(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content){
        this.title = title;
        this.content = content;
    }

    //Entity클래스에는 절대 Setter를 만들지 않음!!
}
