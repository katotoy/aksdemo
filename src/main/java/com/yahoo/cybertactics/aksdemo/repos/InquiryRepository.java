package com.yahoo.cybertactics.aksdemo.repos;

import com.yahoo.cybertactics.aksdemo.model.Inquiry;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Collection;

public interface InquiryRepository extends JpaRepository<Inquiry, Long> {
    Collection<Inquiry> findByDateCreatedBetweenOrderByDateCreatedDescIdAsc(LocalDate startDate, LocalDate endDate);
}