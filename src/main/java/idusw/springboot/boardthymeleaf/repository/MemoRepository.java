package idusw.springboot.boardthymeleaf.repository;

import idusw.springboot.boardthymeleaf.entity.MemoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemoRepository extends JpaRepository<MemoEntity, Long> {
}
