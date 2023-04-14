package com.thuanthanh.vegetables.Entity.Dto.Response;

import lombok.Data;

@Data
public class ResponMessge {
    private String message;

    public ResponMessge() {
    }

    public ResponMessge(String message) {
        this.message = message;
    }
}
