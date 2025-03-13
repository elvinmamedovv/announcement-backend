package az.mapacaademy.announcement.dao.jdbcimpl;

import az.mapacaademy.announcement.config.DatabaseConfig;
import az.mapacaademy.announcement.constant.QueryConstants;
import az.mapacaademy.announcement.dao.CategoryDao;
import az.mapacaademy.announcement.entity.Category;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Repository("categoryDaoJdbcImpl")

public class CategoryDaoJdbcImpl implements CategoryDao {
    @Override
    public List<Category> findAll(){
        log.info("Getting categories from DB ");
        List<Category> categories = new ArrayList<>();
        try(Connection connection = DatabaseConfig.getConnection()){
            Statement statement = connection.createStatement();
            log.info("Getting category query from DB: {}", QueryConstants.GET_CATEGORY_QUERY);
            ResultSet resultSet = statement.executeQuery(QueryConstants.GET_CATEGORY_QUERY);
            while(resultSet.next()){
                Long id = resultSet.getLong("category_id");
                String name = resultSet.getString("name");
                 Category category = new Category (id,name);
                 categories.add(category);

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return categories;

    }
}
