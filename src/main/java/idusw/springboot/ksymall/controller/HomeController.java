package idusw.springboot.ksymall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping(value = {"api/v2", "api/v2"})
    // http://<host-ip>:<port>/api/v1을 get 방식으로 요청하는 경우 처리
    public String getRestApiV1(Model model) {
        // org.springframework.ui.Model :
        // UI (User Interface, View, Template)에서 사용하는 Model class
        // model 을 활용하여 view 에게 속성을 전달
        model.addAttribute("name","김수연"); // model 객체레 속성을 추가(지정)
        model.addAttribute("dept", "comso");
        // view or template 파일을 지정해주어야 함.
        return "./main/index"; // templates 아래 index.html을 접근 (기본 dynamic web page)
    }
    @GetMapping(value = {"400"})
    public String go400(Model model) {
        model.addAttribute("msg", "정보전달");
        return "./error/400"; // view에게 전달
    }
    @GetMapping(value = {"", "/"})
    public String goHome(Model model) {
        model.addAttribute("msg", "정보전달");
        return "./main/index"; // view에게 전달
    }
}
