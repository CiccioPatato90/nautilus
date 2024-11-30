package org.codemaison.app.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "Nurses", schema = "nautilus")
public class Nurse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "NurseId", nullable = false)
    private int id;

    @Column(name = "FirstName", length = 256)
    private String firstName;

    @Column(name = "LastName", length = 256)
    private String lastName;

    @NotNull
    @Column(name = "Age", nullable = false)
    private int age;

    @ManyToOne(fetch = FetchType.EAGER)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "RepartoID")
    private Reparti repartoID;

    @ManyToOne(fetch = FetchType.EAGER)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "ShiftPreferenceID")
    private ShiftPreference shiftPreferenceID;

    public ShiftPreference getShiftPreferenceID() {
        return shiftPreferenceID;
    }

    public void setShiftPreferenceID(ShiftPreference shiftPreferenceID) {
        this.shiftPreferenceID = shiftPreferenceID;
    }

    public Reparti getRepartoID() {
        return repartoID;
    }

    public void setRepartoID(Reparti repartoID) {
        this.repartoID = repartoID;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}