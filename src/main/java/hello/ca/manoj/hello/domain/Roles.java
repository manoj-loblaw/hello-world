package hello.ca.manoj.hello.domain;

import javax.persistence.*;

@Entity
@Table(name = "role")
public class Roles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "role_id")
    private String roleId;

    @Version
    private Long version;

    private String description;

    public String getRoleId() {
        return roleId;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }
}
