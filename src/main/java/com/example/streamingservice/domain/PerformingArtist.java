package com.example.streamingservice.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PerformingArtist extends Artist{
    private String recordLabel;
    private List<Genre> genres;
    private String stageName;
}
