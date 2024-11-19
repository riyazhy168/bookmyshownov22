package com.scaler.bookmyshownov22.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
@Getter
@Setter
public class Actor extends BaseModel {
    private String name;
}
