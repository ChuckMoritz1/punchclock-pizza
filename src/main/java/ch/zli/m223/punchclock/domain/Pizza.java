package ch.zli.m223.punchclock.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Pizza {

    @Id
    public Long id;
    public String name;


    @ManyToMany
    private List<Entry> entry;

}
