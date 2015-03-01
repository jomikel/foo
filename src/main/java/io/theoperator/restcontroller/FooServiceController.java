package io.theoperator.restcontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by andreas on 3/1/15.
 */

@RestController
@RequestMapping("/foo")
public class FooServiceController {

    @RequestMapping(method = RequestMethod.GET)
    public String foo() {
        return "foo";
    }

}
