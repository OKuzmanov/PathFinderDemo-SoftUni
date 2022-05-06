package bg.softuni.pathfinder.repository;

import bg.softuni.pathfinder.model.entities.RouteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RouteRepository extends JpaRepository<RouteEntity, Long> {
}
