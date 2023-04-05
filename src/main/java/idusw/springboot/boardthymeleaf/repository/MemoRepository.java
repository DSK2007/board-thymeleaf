package idusw.springboot.boardthymeleaf.repository;

import idusw.springboot.boardthymeleaf.entity.Memo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemoRepository extends JpaRepository<Memo, Long> {
}
