package com.example.demo.repository;

import com.example.demo.model.Pc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PcRepository extends JpaRepository<Pc, Long> {

}
