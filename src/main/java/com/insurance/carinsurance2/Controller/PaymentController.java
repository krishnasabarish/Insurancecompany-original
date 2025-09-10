package com.insurance.carinsurance2.Controller;

import com.insurance.carinsurance2.Entity.CarInsuranceEntity;
import com.insurance.carinsurance2.Repository.CarInsuranceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private CarInsuranceRepository repository;

    // Show Payment Page with QR Code
    @GetMapping("/{id}")
    public String showPaymentPage(@PathVariable Long id, Model model) {
        CarInsuranceEntity policy = repository.findById(id).orElse(null);
        if (policy == null) {
            return "error"; // you can create an error.jsp if needed
        }

        model.addAttribute("policy", policy);
        return "payment";  // JSP or Thymeleaf page name (payment.jsp or payment.html)
    }

    // After payment success → show confirmation
    @PostMapping("/success")
    public String paymentSuccess(Model model) {
        model.addAttribute("message", "✅ Payment Successful! Your policy is activated.");
        return "success"; // success.jsp page
    }
}
