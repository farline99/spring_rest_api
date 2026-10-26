package com.example.phoneowners.repository;

import com.example.phoneowners.entity.PhoneOwner;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PhoneOwnerRepository extends JpaRepository<PhoneOwner, Long> {

    Optional<PhoneOwner> findByPhoneNumber(String phoneNumber);

    boolean existsByPhoneNumber(String phoneNumber);

    boolean existsByPhoneNumberAndIdNot(String phoneNumber, Long id);
}
