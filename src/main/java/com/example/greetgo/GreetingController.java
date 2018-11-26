package com.example.greetgo;

import com.example.greetgo.domain.Word;
import com.example.greetgo.mapper.WordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class GreetingController {
    @Autowired
    WordMapper wordMapper;

    @GetMapping("/greeting")
    public Word greeting(@RequestParam(required=false, defaultValue="1") int id) {
        System.out.println("==== in greeting ====");
        return wordMapper.findWordById(id);
    }

}
