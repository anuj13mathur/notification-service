package com.notification.model.type;

import static com.notification.model.type.Color.GREEN;

public class Normal implements Type{
    @Override
    public String getColor() {
        return GREEN.toString();
    }
}
