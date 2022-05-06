package bg.softuni.pathfinderd.model.entities;

import bg.softuni.pathfinderd.model.enums.RoleEnum;

import javax.persistence.*;

@Entity
@Table(name = "roles")
public class RoleEntity extends BaseEntity{

    @Enumerated(value = EnumType.STRING)
    @Column(name = "role")
    private RoleEnum name;

    public RoleEntity() {
    }

    public RoleEnum getName() {
        return name;
    }

    public void setName(RoleEnum name) {
        this.name = name;
    }
}
