package com.example.streamingservice.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Album {

    private String name;
    private Long id;
    private List<PerformingArtist> artists;
    private LocalDate releaseDate;
    private List<Song> trackList;
    private double rating;
    private Genre genre;

}
