package idusw.springboot.boardthymeleaf.service;

import idusw.springboot.boardthymeleaf.domain.Memo;
import idusw.springboot.boardthymeleaf.entity.MemoEntity;
import idusw.springboot.boardthymeleaf.repository.MemoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.IntStream;

@Service
public class MemoServiceImpl implements MemoService {
    MemoRepository memoRepository;
    public MemoServiceImpl(MemoRepository memoRepository) {
        this.memoRepository = memoRepository;
    }

    @Override
    public int create(Memo m) {
        return 0;
    }

    @Override
    public Memo read(Memo m) {
        return null;
    }

    @Override
    public List<Memo> readList() {
        return null;
    }

    @Override
    public int update(Memo m) {
        return 0;
    }

    @Override
    public int delete(Memo m) {
        return 0;
    }

    @Override
    public List<Memo> initalize() {
        IntStream.rangeClosed(1, 10).forEach(i -> {
            MemoEntity memo = MemoEntity.builder().memoText("sample" + i).build();
            memoRepository.save(memo);
        });
        return null;
    }
}
