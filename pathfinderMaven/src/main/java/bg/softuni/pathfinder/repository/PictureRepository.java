package bg.softuni.pathfinder.repository;

import bg.softuni.pathfinder.model.entities.PictureEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PictureRepository extends JpaRepository<PictureEntity, Long> {

    @Query("SELECT p.url FROM PictureEntity AS p")
    List<String> findAllUrls();
}
