package com.example.streamingservice.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Song {
    private String name;
    private Long length;
    private List<PerformingArtist> performingArtists;
    private List<Producer> producers;
    private Genre genre;
}
