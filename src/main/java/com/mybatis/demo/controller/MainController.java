package com.mybatis.demo.controller;

import com.mybatis.demo.mapper.TodoMapper;
import com.mybatis.demo.models.pojo.Todo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class MainController {

    @Autowired
    private TodoMapper todoMapper;

    private static final Logger logger = LoggerFactory.getLogger(MainController.class);

    @ResponseBody
    @GetMapping(value = "/test",produces = MediaType.APPLICATION_JSON_VALUE)
    public Map<String,Object> test(){
        logger.info("inside test ...");
        return new HashMap<>(){{
            put("message","server up");
            put("status",200);
        }};
    }

    @ResponseBody
    @GetMapping(value = "/todo/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Todo getTodoDetails(@PathVariable("id") final int id){
        Todo todoResponse = todoMapper.getTodo(id);
        return todoResponse;
    }
}
