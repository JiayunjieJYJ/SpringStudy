package org.galaxy.study;

import org.galaxy.study.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class MyController extends BaseController {

    @RequestMapping(value = "/test")
    @ResponseBody
    public String test() {
        return "hello spring";
    }

    @RequestMapping(value = "/hello/{name}")
    public String sayHello(Model model, @PathVariable("name") String name) {

        model.addAttribute(name);

        return "hello.jsp";
    }

}
