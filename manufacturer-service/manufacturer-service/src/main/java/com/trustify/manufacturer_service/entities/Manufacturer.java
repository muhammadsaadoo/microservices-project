package com.trustify.manufacturer_service.entities;
import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
@Entity
@Table(name = "manufacturers")
@Data
public class Manufacturer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long userId;

    @Column(nullable = false, unique = true)
    private String companyName;

    @Column(nullable = false)
    private String registrationNumber;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String email;

    @Enumerated(EnumType.STRING)
    private ManufacturerStatus status = ManufacturerStatus.PENDING;

    public enum ManufacturerStatus {
        PENDING, VERIFIED, REJECTED
    }


    @OneToMany(mappedBy = "manufacturer", cascade = CascadeType.ALL)
    private List<CompanyDocument> documents=null;
}

