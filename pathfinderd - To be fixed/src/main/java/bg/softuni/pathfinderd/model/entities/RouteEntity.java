package bg.softuni.pathfinderd.model.entities;

import bg.softuni.pathfinderd.model.enums.LevelEnum;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "routes")
public class RouteEntity extends BaseEntity{

    @Column(columnDefinition = "text")
    private String description;

    @Column(columnDefinition = "longtext")
    private String gpxCoordinates;

    @Enumerated(EnumType.STRING)
    @Column(name = "level_enum")
    private LevelEnum level;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(name = "video_url")
    private String videoUrl;

    @ManyToOne
    @JoinColumn(name = "author_id", referencedColumnName = "id", unique = true)
    private UserEntity author;

    @ManyToMany
    @JoinTable(name = "routes_categories",
    joinColumns = @JoinColumn(name = "route_entity_id", referencedColumnName = "id"),
    inverseJoinColumns = @JoinColumn(name = "categories_id", referencedColumnName = "id"))
    private List<CategoryEntity> categories;

    public RouteEntity() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGpxCoordinates() {
        return gpxCoordinates;
    }

    public void setGpxCoordinates(String gpxCoordinates) {
        this.gpxCoordinates = gpxCoordinates;
    }

    public LevelEnum getLevel() {
        return level;
    }

    public void setLevel(LevelEnum level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public UserEntity getAuthor() {
        return author;
    }

    public void setAuthor(UserEntity author) {
        this.author = author;
    }

    public List<CategoryEntity> getCategories() {
        return categories;
    }

    public void setCategories(List<CategoryEntity> categories) {
        this.categories = categories;
    }
}
