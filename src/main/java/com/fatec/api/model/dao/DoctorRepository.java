package com.fatec.api.model.dao;

import com.fatec.api.model.bean.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
