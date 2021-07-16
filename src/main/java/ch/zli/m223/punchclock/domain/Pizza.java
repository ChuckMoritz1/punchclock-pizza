package ch.zli.m223.punchclock.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

/**
 * The type Pizza.
 */
@Entity
public class Pizza {

    /**
     * The Id.
     */
    @Id
    public Long id;
    /**
     * The Name.
     */
    public String name;


    @ManyToMany
    private List<Entry> entry;

}
