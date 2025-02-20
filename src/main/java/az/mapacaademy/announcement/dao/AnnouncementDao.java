package az.mapacaademy.announcement.dao;

import az.mapacaademy.announcement.config.DatabaseConfig;
import az.mapacaademy.announcement.entity.Announcement;
import az.mapacaademy.announcement.entity.Category;
import az.mapacaademy.announcement.entity.City;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Repository
public class AnnouncementDao {

    public List<Announcement> findAll(){
        List<Announcement> announcements = new ArrayList<>();
        try(Connection connection = DatabaseConfig.getConnection()) {
            String sql =""" 
select  a.announcement_id,
        a.name,
        a.description,
        a.announcement_number,
        a.price,
        a.phone_number,
        a.seller_full_name,
        a.delivery,
        a.created_date,
        a.modified_date,
        c.city_id,
        c.name as city_name,
        ct.category_id,
        ct.name as  category_name
from announcement a
left join cities c  on a.city_id = c.city_id
left join categories ct on a.category_id = ct.category_id;


""";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                Announcement announcement = new Announcement();
                announcement.setAnnouncementId(resultSet.getLong("announcement_id"));
                announcement.setAnnouncementName(resultSet.getString("name"));
                announcement.setAnnouncementDescription(resultSet.getString("description"));
                announcement.setAnnouncementNumber(resultSet.getLong("announcement_number"));
                announcement.setPrice(resultSet.getDouble("price"));
                announcement.setPhoneNumber(resultSet.getString("phone_number"));
                announcement.setSellerName(resultSet.getString("seller_full_name"));
                announcement.setDelivery(resultSet.getBoolean("delivery"));
                Timestamp createdDate = resultSet.getTimestamp("created_date");
                LocalDateTime createdDateTime= createdDate.toLocalDateTime();
                announcement.setCreatedDate(createdDateTime);

                Timestamp modifiedDate = resultSet.getTimestamp("modified_date");
                LocalDateTime modifiedDateTime = modifiedDate.toLocalDateTime();
                announcement.setModifiedDate(modifiedDateTime);

                Long cityId = resultSet.getLong("city_id");
                String cityName = resultSet.getString("city_name");
                City city = new City(cityId, cityName);
                announcement.setCity(city);

                Long categoryId = resultSet.getLong("category_id");
                String categoryName = resultSet.getString("category_name");
                Category category = new Category(categoryId, categoryName);
                announcement.setCategory(category);
                announcements.add(announcement);






            }
        } catch (SQLException e) {
            e.printStackTrace(System.err);
        }


        return announcements;
    }

}
