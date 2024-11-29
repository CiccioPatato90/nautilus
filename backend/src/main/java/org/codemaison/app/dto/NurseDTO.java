package org.codemaison.app.dto;

public class NurseDTO {
    private String firstName;
    private String lastName;
    private Integer age;
    private RepartoDTO reparto;
    private ShiftPreferenceDTO shiftPreference;

    public NurseDTO(String firstName, String lastName, Integer age, RepartoDTO reparto, ShiftPreferenceDTO shiftPreference) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.reparto = reparto;
        this.shiftPreference = shiftPreference;
    }
}


