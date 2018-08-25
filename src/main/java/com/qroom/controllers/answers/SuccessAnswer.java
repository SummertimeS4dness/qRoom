package com.qroom.controllers.answers;

public class SuccessAnswer<T> extends Answer {
    private T obj;

    public SuccessAnswer(String command, String info, T obj) {
        super(true, command, info);
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }
}
