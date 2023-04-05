package idusw.springboot.boardthymeleaf.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity // 엔티티 클래스 임으로 나타내는 어노테이션
@Table(name = "tbl_memo")
@ToString // lombok 라이브러리 사용
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class MemoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long mno;

    @Column(length = 200, nullable = false)
    private String memoText;
}
