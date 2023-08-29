package com.bike.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bike.demo.entity.Bike;
import com.bike.demo.repository.BikeRepository;

@Service
public class ServiceImplimentation implements BikeService {

	@Autowired
	private BikeRepository bikeRepo;

	@Override
	public Bike buyBike(Bike bike) {
		Bike bike1 = bikeRepo.save(bike);
		return bike1;
	}

	@Override
	public Bike getBikeById(int bikeId) {
		Optional<Bike> bike = bikeRepo.findById(bikeId);
		return bike.get();
	}

	@Override
	public List<Bike> listBike(Bike bike) {
		List<Bike> liBikes = bikeRepo.findAll();
		return liBikes;
	}

	@Override
	public Bike changeBike(int id,Bike bike) {

		Bike existingBike = bikeRepo.findById(id).get(); //userRepository.findById(user.getId()).get();
		existingBike.setCompany(bike.getCompany());
		existingBike.setModel(bike.getModel());
		existingBike.setPrice(bike.getPrice());
		existingBike.setVarient(bike.getVarient());
		
		Bike save = bikeRepo.save(existingBike);
		
		return save;
	}

	@Override
	public void sellBike(int bikeId) {
		bikeRepo.deleteById(bikeId);
	}
}
