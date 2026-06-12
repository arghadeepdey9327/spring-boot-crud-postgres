package com.example.notes;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Note{
    @Id
    public int id;
    public String email;
    public String ph;
}