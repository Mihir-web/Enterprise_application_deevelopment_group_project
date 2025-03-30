package com.project.group4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.project.group4.Order;
import com.project.group4.OrderService;

@Controller
public class WebController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/place-order")
    public String showOrderForm(Model model) {
        model.addAttribute("order", new Order());
        return "place-order";
    }

    @PostMapping("/submit-order")
    public String submitOrder(@ModelAttribute Order order, Model model) {
        Order placedOrder = orderService.placeOrder(order);
        model.addAttribute("order", placedOrder);
        return "order-confirmation";
    }

    @GetMapping("/orders/{userId}")
    public String viewUserOrders(@PathVariable String userId, Model model) {
        model.addAttribute("orders", orderService.getUserOrders(userId));
        model.addAttribute("userId", userId);
        return "user-orders";
    }

    @GetMapping("/orders/{userId}/pending")
    public String viewPendingOrders(@PathVariable String userId, Model model) {
        model.addAttribute("orders", orderService.getPendingOrders(userId));
        model.addAttribute("userId", userId);
        return "pending-orders";
    }
} 