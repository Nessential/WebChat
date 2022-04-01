package com.main;

public class Chat {
    String name;
    String value;
    long time;
    long overdue;

//聊天


    @Override
    public String toString() {
        return "Chat{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                ", time=" + time +
                '}';
    }




    public Chat() {
    }

    public Chat(String name, String value, int time) {
        this.name = name;
        this.value = value;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }
}
