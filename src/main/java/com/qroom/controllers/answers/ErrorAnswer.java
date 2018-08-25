package com.qroom.controllers.answers;

public class ErrorAnswer extends Answer {
    public ErrorAnswer(String command, String info) {
        super(false, command, info);
    }
}
