package az.mapacaademy.announcement.dao.jpaimpl;

import az.mapacaademy.announcement.dao.CityDao;
import az.mapacaademy.announcement.entity.City;
import az.mapacaademy.announcement.repository.CityRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("cityDaoJpaImpl")
@RequiredArgsConstructor
@Slf4j
public class CityDaoJpaImpl implements CityDao {
    private final CityRepository cityRepository;
    @Override
    public List<City> findAll() {
        log.info("Find all cities method is  called from JPA implementation of CitiDao");
        return cityRepository.findAll();
    }
}
