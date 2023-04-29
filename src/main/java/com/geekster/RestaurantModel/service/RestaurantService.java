package com.geekster.RestaurantModel.service;

import com.geekster.RestaurantModel.model.Restaurant;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class RestaurantService {
    private List<Restaurant> restaurants = new ArrayList<>();

    public Restaurant addRestaurant(Restaurant restaurant) {
        restaurant.setUserId((long) (restaurants.size() + 1));
        restaurants.add(restaurant);
        return restaurant;
    }

    public Restaurant getRestaurant(int userId) {
        for (Restaurant restaurant : restaurants) {
            if (restaurant.getUserId() == userId) {
                return restaurant;
            }
        }
        return null;
    }

    public List<Restaurant> getAllRestaurants() {
        return restaurants;
    }

    public Restaurant updateRestaurant(int userId, Restaurant updatedRestaurant) {
        for (Restaurant restaurant : restaurants) {
            if (restaurant.getUserId() == userId) {
                restaurant.setName(updatedRestaurant.getName());
                restaurant.setAddress(updatedRestaurant.getAddress());
                restaurant.setNumber(updatedRestaurant.getNumber());
                restaurant.setSpecialty(updatedRestaurant.getSpecialty());
                restaurant.setTotalStaffs(updatedRestaurant.getTotalStaffs());
                return restaurant;
            }
        }
        return null;
    }

    public boolean deleteRestaurant(int userId) {
        for (Restaurant restaurant : restaurants) {
            if (restaurant.getUserId() == userId) {
                restaurants.remove(restaurant);
                return true;
            }
        }
        return false;
    }
}