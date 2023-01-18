package com.crearly.mssavetravel.repository;

import com.crearly.mssavetravel.entity.Travel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITravelRepository extends JpaRepository<Travel, Integer> {
}
