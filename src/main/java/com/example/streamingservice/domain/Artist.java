package com.example.streamingservice.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Artist {

    private Long id;
    private String name;
    private double rating;
    private Country country;
    private List<Song> topTracks;
}
