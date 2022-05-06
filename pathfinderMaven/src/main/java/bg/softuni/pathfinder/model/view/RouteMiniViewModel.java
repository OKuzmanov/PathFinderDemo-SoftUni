package bg.softuni.pathfinder.model.view;

import bg.softuni.pathfinder.model.entities.PictureEntity;

import java.util.Set;

public class RouteMiniViewModel {

    private String name;

    private String description;

    private Set<PictureEntity> pictures;

    public RouteMiniViewModel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<PictureEntity> getPictures() {
        return pictures;
    }

    public void setPictures(Set<PictureEntity> pictures) {
        this.pictures = pictures;
    }
}
