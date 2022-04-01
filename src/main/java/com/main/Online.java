package com.main;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Online {
    private String username;
    private long overdue;

    @Override
    public String toString() {
        return "Online{" +
                "username='" + username + '\'' +
                ", overdue=" + overdue +
                '}';
    }
}
