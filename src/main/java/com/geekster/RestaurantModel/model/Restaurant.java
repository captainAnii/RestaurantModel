package com.geekster.RestaurantModel.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Restaurant {
    private Long userId;
    private String name;
    private String address;
    private String number;
    private String specialty;
    private int totalStaffs;
}
