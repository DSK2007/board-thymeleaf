package idusw.springboot.boardthymeleaf.controller;

import idusw.springboot.boardthymeleaf.service.MemoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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
}
