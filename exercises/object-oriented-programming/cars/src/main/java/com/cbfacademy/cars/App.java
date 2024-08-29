package com.cbfacademy.cars;

import java.util.List;

public class App {
    public static void main(String[] args) {
        //Display details of all cars in showroom

      // instantiate a Showroom object
      Showroom showroom = new Showroom();

      // call getCars()
      List<Car> cars = showroom.getCars();

      //print the details for each Car instance in the list
      for (Car car : cars) {
          System.out.println(car.getDetails());
      }

    }
}
