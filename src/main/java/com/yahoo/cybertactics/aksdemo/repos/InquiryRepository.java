package com.yahoo.cybertactics.aksdemo.repos;

import com.yahoo.cybertactics.aksdemo.model.Inquiry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InquiryRepository extends JpaRepository<Inquiry, Long> {
}