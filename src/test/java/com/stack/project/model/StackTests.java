package com.stack.project.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Objects;


@SpringBootTest
public class StackTests {
    private Stack stack;

    @BeforeEach
    public void setup(){
        stack = new Stack(2);
    }

    @Test
    public void initialiseStack(){
        Stack<Integer> stack = new Stack(4);
        stack.push(3);
        assert(stack.peek()).equals(3);

        Stack<String> stackString = new Stack(1);
        stackString.push("abc");
        assert(stackString.pop()).equals("abc");
    }

    @Test
    public void stackFull(){
        stack.push(3);
        assert(stack.peek()).equals(3);
        stack.push(4);
        assert(stack.peek()).equals(4);
        stack.push(5); // This will be ignored
        assert(stack.peek()).equals(4);
    }

    @Test
    public void isEmptyStack(){
        Stack<Integer> stack = new Stack(2);
        assert Objects.equals(stack.isEmpty(), true);
        stack.push(4);
        assert Objects.equals(stack.isEmpty(), false);
        stack.pop();
        assert Objects.equals(stack.isEmpty(), true);
    }

    @Test
    public void push(){
        stack.push("abc");
        assert(stack.peek()).equals("abc");
    }

    @Test
    public void pop(){
        stack.push(3);
        assert(stack.pop()).equals(3);
        Objects.equals(stack.peek(), null);
    }

    @Test
    public void peek(){
        stack.push("abcd");
        assert(stack.peek()).equals("abcd");
        stack.pop();
        Objects.equals(stack.peek(), null);
    }

    @Test
    public void getSize(){
        stack.push("abcd");
        assert Objects.equals(stack.getSize(), 1);
    }


}
