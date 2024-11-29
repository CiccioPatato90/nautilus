package org.codemaison.app.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "ShiftPreferences", schema = "nautilus")
public class ShiftPreference {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ShiftPreferenceID", nullable = false)
    private Integer id;

    @Size(max = 50)
    @NotNull
    @Column(name = "PreferenceName", nullable = false, length = 50)
    private String preferenceName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPreferenceName() {
        return preferenceName;
    }

    public void setPreferenceName(String preferenceName) {
        this.preferenceName = preferenceName;
    }


}