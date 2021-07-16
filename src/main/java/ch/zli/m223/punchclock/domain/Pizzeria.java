package ch.zli.m223.punchclock.domain;

import javax.persistence.*;

/**
 * The type Pizzeria.
 */
@Entity
public class Pizzeria {

    /**
     * The Id.
     */
    @Id
    @Column
    public Long id;

    /**
     * The Name.
     */
    public String name;

    @ManyToOne
    private Entry entry;

}
