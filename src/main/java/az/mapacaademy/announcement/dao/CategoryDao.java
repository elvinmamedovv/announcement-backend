package az.mapacaademy.announcement.dao;

import az.mapacaademy.announcement.config.DatabaseConfig;
import az.mapacaademy.announcement.entity.Category;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


@Repository

public class CategoryDao {
    public List<Category> findAll(){
        List<Category> categories = new ArrayList<>();
        try(Connection connection = DatabaseConfig.getConnection()){

            String sql = " SELECT * FROM categories;";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                Long id = resultSet.getLong("category_id");
                String name = resultSet.getString("name");
                 Category category = new Category (id,name);
                 categories.add(category);

            }

        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return categories;

    }
}
