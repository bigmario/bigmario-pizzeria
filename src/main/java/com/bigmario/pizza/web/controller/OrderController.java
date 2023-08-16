package com.bigmario.pizza.web.controller;

import com.bigmario.pizza.persistence.entity.OrderEntity;
import com.bigmario.pizza.persistence.projection.OrderSummary;
import com.bigmario.pizza.service.OrderService;
import com.bigmario.pizza.service.dto.RandomOrderDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping()
    public ResponseEntity<List<OrderEntity>> getAll(){
        return ResponseEntity.ok(this.orderService.getAll());
    }

    @GetMapping("/today")
    public ResponseEntity<List<OrderEntity>> getTodayOrders(){
        return ResponseEntity.ok(this.orderService.getTodayOrders());
    }

    @GetMapping("/outside")
    public ResponseEntity<List<OrderEntity>> getOutsideOrders(){
        return ResponseEntity.ok(this.orderService.getOutsideOrders());
    }

    @GetMapping("/customer/{customerId}")
    public ResponseEntity<List<OrderEntity>> getCustomerOrders(@PathVariable String customerId){
        return ResponseEntity.ok(this.orderService.getCustomerOrders(customerId));
    }

    @GetMapping("/summary/{orderId}")
    public ResponseEntity<OrderSummary> getSummary(@PathVariable Integer orderId){
        return ResponseEntity.ok(this.orderService.getSummary(orderId));
    }

    @PostMapping("/random")
    public ResponseEntity<Boolean> getRandomOrder(@RequestBody RandomOrderDto randomOrderDto){
        return ResponseEntity.ok(this.orderService.saveRandomOrder(randomOrderDto));
    }
}
