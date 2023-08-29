package com.bike.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bike.demo.entity.Bike;
import com.bike.demo.service.BikeService;

@RestController
public class BikeController {

	@Autowired
	private BikeService bikeService;
	
	@PostMapping("/buy")
	public Bike buyBike(@RequestBody Bike bike) {
		Bike bike1 = bikeService.buyBike(bike);
		return bike1;
	}
	
	@GetMapping("/get/{id}")
	public Bike getBike(@PathVariable int bikeId) {
		Bike bike2 = bikeService.getBikeById(bikeId);
		return bike2;
	}
	
	@GetMapping("/getAll")
	public List<Bike> lisBikes(Bike bike){
		List<Bike> listBikes = bikeService.listBike(bike);
		return listBikes;
	}
	
	@PutMapping("/put/{id}")
	public Bike changeBike(@PathVariable("id") int bikeId, @RequestBody Bike bike) {
		
		Bike changeBike = bikeService.changeBike(bikeId,bike);
		return changeBike;
	}
	
	@DeleteMapping("/sell/{id}")
	public String sellBike(@PathVariable("id") int bikeId) {
		bikeService.sellBike(bikeId);
		return  "Selected bike has been sold-out";
	}
}











