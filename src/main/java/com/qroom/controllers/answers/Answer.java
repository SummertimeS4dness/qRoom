package com.qroom.controllers.answers;

public abstract class Answer {
    protected boolean status;
    protected String command;
    protected String info;

    public Answer(boolean status, String command, String info) {
        this.status = status;
        this.command = command;
        this.info = info;
    }

    public boolean isStatus() {
        return status;
    }

    public String getCommand() {
        return command;
    }

    public String getInfo() {
        return info;
    }
}
