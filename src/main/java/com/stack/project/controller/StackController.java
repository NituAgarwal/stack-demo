package com.stack.project.controller;

import com.stack.project.model.Stack;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/api/stack")
public class StackController<T> {

    private Stack stack;

    @GetMapping("/peek")
    public T getPeek(){
        return (T)this.stack.peek();
    }

    @DeleteMapping("/pop")
    public T pop(){
        if(this.stack.getSize() == 0){
            return (T) ("Stack is Empty.");
        }
        return (T)this.stack.pop();
    }

    @PostMapping(value="/create", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String create(@RequestBody HashMap<String, Integer> values){
        this.stack = new Stack(values.get("capacity"));
        return "Stack created with size " + values.get("capacity");
    }

    @PutMapping("/push")
    public T push(@RequestParam(value = "value", required = true)T value){
        if(this.stack.getSize() == this.stack.getCapacity()){
            return (T) ("Stack is full");
        }
        this.stack.push(value);
        return (T) (value + " is pushed in stack");
    }
}
