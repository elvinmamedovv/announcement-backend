package az.mapacaademy.announcement.constant;


import lombok.experimental.UtilityClass;

@UtilityClass
public class QueryConstants {
    public static final String GET_CATEGORY_QUERY = "SELECT * FROM categories;";
    public static final String GET_CITY_QUERY = "SELECT * FROM cities;";
    public static final String GET_ANNOUNCEMENT_QUERY = """ 
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
            from announcements a
            left join cities c  on a.city_id = c.city_id
            left join categories ct on a.category_id = ct.category_id;
            """;
    public static final String CREATE_ANNOUNCEMENT_QUERY = """
            insert into announcements
            ( name, description, announcement_number, price, phone_number, seller_full_name, delivery, city_id, category_id)
            VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?);
            
            """;
    public static final String UPDATE_ANNOUNCEMENT_QUERY = """
            
            update announcements
            set name            =?,
                description     =?,
                price           = ?,
                seller_full_name=?,
                delivery        = ?
            where announcement_id= ?
            """;
    public static final String DELETE_ANNOUNCEMENT_QUERY= """
            delete
            from announcements
            where announcement_id =?;
            """;

    public static final String GET_ANNOUNCEMENT_BY_ID= """
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
                    ct.name as category_name
            from announcements a
            left join cities c  on a.city_id = c.city_id
            left join categories ct on a.category_id = ct.category_id
            where announcement_id = ?;
            
            """;

}
