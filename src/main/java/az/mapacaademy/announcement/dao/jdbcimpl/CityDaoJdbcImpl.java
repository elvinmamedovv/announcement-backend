package az.mapacaademy.announcement.dao.jdbcimpl;

import az.mapacaademy.announcement.config.DatabaseConfig;
import az.mapacaademy.announcement.constant.QueryConstants;
import az.mapacaademy.announcement.dao.CityDao;
import az.mapacaademy.announcement.entity.City;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
@Slf4j
@Repository("cityDaoJdbcImpl")
public class  CityDaoJdbcImpl implements CityDao {
    @Override
    public List<City> findAll(){
        log.info("Getting cities from DB");

        List<City> cities = new ArrayList<>();
        try (Connection connection = DatabaseConfig.getConnection()){

             Statement statement = connection.createStatement();
             log.info("Get cities from DB query: {}", QueryConstants.GET_CITY_QUERY);
             ResultSet resultSet =statement.executeQuery(QueryConstants.GET_CITY_QUERY);
             while (resultSet.next()){
                 Long id = resultSet.getLong("city_id");
                 String name = resultSet.getString("name");
                 City city = new City (id, name);
                 cities.add(city);
             }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return cities;


    }


}