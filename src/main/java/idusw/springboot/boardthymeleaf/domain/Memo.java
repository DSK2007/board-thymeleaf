package idusw.springboot.boardthymeleaf.domain;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class Memo {
    private long mno;
    private String memoText;
}

