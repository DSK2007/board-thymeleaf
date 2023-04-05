package idusw.springboot.boardthymeleaf.service;

import idusw.springboot.boardthymeleaf.domain.Memo;
import org.springframework.stereotype.Service;

import java.util.List;


public interface MemoService {
    int create(Memo m);
    Memo read(Memo m); // m의 식별자인 mno 값도 가능
    List<Memo> readList();
    int update(Memo m); // m을 수정하고 하는 필트 값을 전달
    int delete(Memo m); // m의 식별자인 mno값도 가능

    List<Memo> initalize(); // 초기화
}
