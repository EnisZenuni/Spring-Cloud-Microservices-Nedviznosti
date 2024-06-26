package ez.ndvz.realestateservice.repository;

import ez.ndvz.realestateservice.domain.models.House;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HouseRepository extends JpaRepository<House, Long> {

}
