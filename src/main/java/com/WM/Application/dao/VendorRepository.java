package com.WM.Application.dao;

import com.WM.Application.entity.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
public interface VendorRepository extends JpaRepository<Vendor, Long> {
}
