package io.theoperator.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by andreas on 2/28/15.
 */

@EnableWebMvc
@ComponentScan(basePackages = {
        "io.theoperator.configuration",
        "io.theoperator.restcontroller"
})
public class ServiceApplicationConfiguration extends WebMvcConfigurerAdapter {



}
