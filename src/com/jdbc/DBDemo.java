package com.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBDemo {
    public static void main(String[] args) throws SQLException {
        Statement statement = getTheStatement();
        ResultSet resultSet= statement.executeQuery("select * from public.cars");
        List<Car> cars= populateCarsData(resultSet);
        for(Car car:cars){
            System.out.println(car);
        }
    }

    private static List<Car> populateCarsData(ResultSet resultSet) throws SQLException {
        List<Car> cars=new ArrayList<>();
        while(resultSet.next()){
            Car car=new Car(resultSet.getString("brand"),resultSet.getString("model"),resultSet.getInt("year"));
            cars.add(car);
        }
        return cars;
    }

    private static Statement getTheStatement() throws SQLException {
        Connection connection= DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "admin");
        Statement statement=connection.createStatement();
        return statement;
    }
}
