package com.bike.demo.service;

import java.util.List;

import com.bike.demo.entity.Bike;

public interface BikeService {

	public Bike buyBike(Bike bike);
	public Bike getBikeById(int bikeId);
	public Bike changeBike(int id,Bike bike);
	public void sellBike(int id);
	List<Bike> listBike(Bike bike);
}
