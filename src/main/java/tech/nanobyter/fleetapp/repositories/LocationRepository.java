package tech.nanobyter.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tech.nanobyter.fleetapp.models.Location;

/**
 * @author nanobyter	
 * Created: 2022-09-07
 *
 */

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {

}
