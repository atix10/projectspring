
package com.udemy.controller;

import com.udemy.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/example")
public class ExampleController {
    
    public static final String EXAMPLE_VIEW = "example";
    //primera forma
    @GetMapping("/exampleString")
    public String exampleString(Model model){
        
        model.addAttribute("person", new Person("Carlos", 25));
        return EXAMPLE_VIEW;
    }
    //segunda forma
    @GetMapping("/exampleMAV")
    public ModelAndView exampleMAV(){
        ModelAndView mav=new ModelAndView(EXAMPLE_VIEW);
        mav.addObject("person", new Person("Vicen", 30));  
        return mav;
    }

}
