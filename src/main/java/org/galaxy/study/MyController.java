package org.galaxy.study;

import org.galaxy.study.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController extends BaseController {

    @RequestMapping(value = "/test")
    @ResponseBody
    public String test() {
        return "hello spring";
    }

    @RequestMapping(value = "/hello")
    public ModelAndView sayHello(Model model) {
        return new ModelAndView("hello.jsp");
    }

}
