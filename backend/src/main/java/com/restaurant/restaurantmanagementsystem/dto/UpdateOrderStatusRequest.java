package com.restaurant.restaurantmanagementsystem.dto;

import lombok.Data;
@Data
public class UpdateOrderStatusRequest {
    private Long orderId;
    private String status;
}
