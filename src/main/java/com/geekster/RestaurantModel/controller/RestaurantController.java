package com.geekster.RestaurantModel.controller;

import com.geekster.RestaurantModel.model.Restaurant;
import com.geekster.RestaurantModel.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/restaurants")
public class RestaurantController {
    @Autowired
    private RestaurantService restaurantService;

    @PostMapping("/addRestaurant")
    public ResponseEntity<Restaurant> addRestaurant(@RequestBody Restaurant restaurant) {
        Restaurant addedRestaurant = restaurantService.addRestaurant(restaurant);
        return new ResponseEntity<>(addedRestaurant, HttpStatus.CREATED);
    }

    @GetMapping("/getRestaurant/{userId}")
    public ResponseEntity<Restaurant> getRestaurant(@PathVariable("userId") int userId) {
        Restaurant restaurant = restaurantService.getRestaurant(userId);
        if (restaurant != null) {
            return new ResponseEntity<>(restaurant, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/getAllRestaurants")
    public ResponseEntity<List<Restaurant>> getAllRestaurants() {
        List<Restaurant> restaurants = restaurantService.getAllRestaurants();
        return new ResponseEntity<>(restaurants, HttpStatus.OK);
    }

    @PutMapping("/updateRestaurantInfo/{userId}")
    public ResponseEntity<Restaurant> updateRestaurantInfo(@PathVariable("userId") int userId, @RequestBody Restaurant updateRestaurant) {
        Restaurant restaurant = restaurantService.updateRestaurant(userId, updateRestaurant);
        if (restaurant != null) {
            return new ResponseEntity<>(restaurant, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/deleteRestaurant/{userId}")
    public ResponseEntity<Void> deleteRestaurant(@PathVariable("userId") int userId) {
        boolean deleted = restaurantService.deleteRestaurant(userId);
        if (deleted) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
