package com.bike.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bike.demo.entity.Bike;

@Repository
public interface BikeRepository extends JpaRepository<Bike, Integer>{

}
