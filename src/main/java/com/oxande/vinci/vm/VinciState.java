package com.oxande.vinci.vm;

import java.util.AbstractQueue;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class VinciState {

    List<Object> stack = new ArrayList<>();
    Map<String, Object> vars = new HashMap<>();

    /**
     * Push an object to the stack.
     *
     * @param obj the object to add (can be null)
     */
    public void push( Object obj ){
        stack.add(obj);
    }

    /**
     * Pop an object from the stack.
     *
     * @return the object got from the stack
     */
    public Object pop(){
        int size = stack.size();
        return stack.remove(size-1);
    }
}
