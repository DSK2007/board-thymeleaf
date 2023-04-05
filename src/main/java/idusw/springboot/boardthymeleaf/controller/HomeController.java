package idusw.springboot.boardthymeleaf.controller;

import idusw.springboot.boardthymeleaf.domain.Memo;
import idusw.springboot.boardthymeleaf.service.MemoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Controller
public class HomeController {
    MemoService memoService;
    public HomeController(MemoService memoService) {
        this.memoService = memoService;
    }

    /*
    @Autowired
    MemoRepository memoRepository;
     */

    @GetMapping("/init")
    public String goHome() {
        memoService.initalize();
        return "index";
    }

    List<Memo> result = new ArrayList<>(); // 결과 리스트
    @GetMapping("/memo")
    public String getMemoList(Model model) {
        result = memoService.readList(); // 서비스 객체의 메소드를 호출하여 업무를 처리한다.
        model.addAttribute("memoList", result); // 처리된 겨로가를 전달하기 위해 model 객체의 속성으로 지정(지정 시 알아서 전달해줌)
        return "list"; // view 이름
    }

    @GetMapping("/memo/{mno}")
    public String getMemoList(@PathVariable("mno") Long mno, Model model) {
        Memo result = new Memo();
        Memo memo = new Memo();
        memo.setMno(mno);
        result = memoService.read(memo);
        model.addAttribute("memo", result); // 처리된 결과를 전달하기 위해 model 객체의 속성으로 지정
        return "one"; // view 이름
    }
}
