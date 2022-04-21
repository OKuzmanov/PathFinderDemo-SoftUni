package bg.softuni.pathfinderd.model.entities;

import bg.softuni.pathfinderd.model.enums.CategoryEnum;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name = "categories")
public class CategoryEntity extends BaseEntity{

    @Enumerated
    @Column(nullable = false, unique = true)
    private CategoryEnum name;

    @Column(columnDefinition = "text")
    private String description;

    public CategoryEntity() {
    }

    public CategoryEnum getName() {
        return name;
    }

    public void setName(CategoryEnum name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
