package de.canberk.webdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;

@Controller
public class IndexController {

    public enum Fruits {
        APPLE("apple"), BANANA("banana");

        private String value;

        Fruits(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    @GetMapping({"", "/", "/index", "index.html"})
    public ModelAndView index(ModelAndView model) {
        model.setViewName("index");
        model.addObject("fruits", Arrays.asList(Fruits.values()));
        return model;
    }
}
