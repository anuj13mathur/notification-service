package com.notification.model.type;

import static com.notification.model.type.Color.RED;

public class Alert implements Type{
    @Override
    public String getColor() {
        return RED.toString();
    }
}
