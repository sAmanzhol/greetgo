package com.example.greetgo;

import com.example.greetgo.mapper.WordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.Map;


@Controller
public class GreetingController {
    @Autowired
    WordMapper wordMapper;

    @GetMapping
    public String main(Map<String, Object> model) {
        model.put("some", wordMapper.findWordById(1).getText());
        return "index";
    }

}
