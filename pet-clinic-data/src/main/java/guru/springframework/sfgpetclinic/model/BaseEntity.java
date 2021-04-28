package guru.springframework.sfgpetclinic.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * Created by jt on 7/18/18.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
// @MappedSuperclass marks class as super parent class for JPA so this class
// will NOT be created in db, but other classes will inherit from it.
@MappedSuperclass
public class BaseEntity implements Serializable {

    @Id
    // generates id by db ok, since it can be used for H2 and mySql
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public boolean isNew() {
        return this.id == null;
    }
}
