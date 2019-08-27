package a;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class HelloController {

    @RequestMapping(value = "/a", method = {RequestMethod.GET})
    @ResponseBody
    public String successModel(HttpServletRequest request, HttpServletResponse reponse) {
        return "success2";
    }
}
