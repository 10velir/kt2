package com.itacademy.database.DAO.impl;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CarSearchFilter {

    private String supplier;
    private String model;
    private Integer maxSpeed;
    private Integer price;
    private Integer limit;
    private Integer offset;
}