package com.main;

public class Chat {
    String name;
    String value;
    int time;

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

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
