package io.theoperator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by andreas on 3/1/15.
 */
@Controller
@RequestMapping("/bar")
public class BarController {

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView bar() {
        return new ModelAndView("bar");
    }

}
