package com.insurance.carinsurance2.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "car_insurance")
public class CarInsuranceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ownerName;
    private String email;
    private String phone;
    private String regNo;
    private String make;
    private String model;

    @Column(name = "vehicle_usage") // avoid reserved word "usage"
    private String usage;

    private String history;
    private String plan;
    private boolean roadside;

    @Column(name = "zero_dep") // explicit column name
    private boolean zeroDep;

    private boolean returnToInvoice;

    // --- Getters & Setters ---
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getOwnerName() { return ownerName; }
    public void setOwnerName(String ownerName) { this.ownerName = ownerName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getRegNo() { return regNo; }
    public void setRegNo(String regNo) { this.regNo = regNo; }

    public String getMake() { return make; }
    public void setMake(String make) { this.make = make; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public String getUsage() { return usage; }
    public void setUsage(String usage) { this.usage = usage; }

    public String getHistory() { return history; }
    public void setHistory(String history) { this.history = history; }

    public String getPlan() { return plan; }
    public void setPlan(String plan) { this.plan = plan; }

    public boolean isRoadside() { return roadside; }
    public void setRoadside(boolean roadside) { this.roadside = roadside; }

    public boolean isZeroDep() { return zeroDep; }
    public void setZeroDep(boolean zeroDep) { this.zeroDep = zeroDep; }

    public boolean isReturnToInvoice() { return returnToInvoice; }
    public void setReturnToInvoice(boolean returnToInvoice) { this.returnToInvoice = returnToInvoice; }
}
