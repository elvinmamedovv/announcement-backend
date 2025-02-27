package az.mapacaademy.announcement.dao;

import az.mapacaademy.announcement.config.DatabaseConfig;
import az.mapacaademy.announcement.constant.QueryConstants;
import az.mapacaademy.announcement.entity.City;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
@Repository
public class CityDao {
    public List<City> findAll(){

        List<City> cities = new ArrayList<>();
        try (Connection connection = DatabaseConfig.getConnection()){

             Statement statement = connection.createStatement();
             ResultSet resultSet =statement.executeQuery(QueryConstants.GET_CITY_QUERY);
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


}