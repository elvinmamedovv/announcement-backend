package az.mapacaademy.announcement.dao;

import az.mapacaademy.announcement.config.DatabaseConfig;
import az.mapacaademy.announcement.entity.City;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CityDao {
    public List<City> findAll(){

        List<City> cities = new ArrayList<>();
        try (Connection connection = DatabaseConfig.getConnection()){

             Statement statmennt = connection.createStatement();
             String query= "SELECT * FROM cities ";
             ResultSet resultSet =statmennt.executeQuery(query);
             while (resultSet.next()){
                 Long id = resultSet.getLong("city_id");
                 String name = resultSet.getString("name");
                 City city = new City (id, name);
                 cities.add(city);
             }

        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return cities;


    }

    public static void main(String[] args) {
        CityDao cityDao = new CityDao();
        List<City> cities = cityDao.findAll();
        System.out.println(cities);
    }
}