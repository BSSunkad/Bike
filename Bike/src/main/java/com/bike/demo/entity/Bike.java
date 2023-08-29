package com.bike.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "Bike_details")
public class Bike {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bikeId;
	private String company;
	private String model;
	private String varient;
	private String price;
}
