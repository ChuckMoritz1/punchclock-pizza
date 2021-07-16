package ch.zli.m223.punchclock.domain;

import javax.persistence.*;

@Entity
public class Pizzeria {

    @Id
    @Column
    public Long id;

    public String name;

    @ManyToOne
    private Entry entry;

}
