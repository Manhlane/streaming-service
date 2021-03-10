package com.example.streamingservice.controllers;

import com.example.streamingservice.domain.Artist;
import com.example.streamingservice.domain.PerformingArtist;
import com.example.streamingservice.domain.Producer;
import com.example.streamingservice.services.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.awt.*;

@RestController
@RequestMapping("/artists")
public class ArtistController {

    @Autowired
    private ArtistService artistService;

    @GetMapping(value = "/", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Artist> searchArtist(){
        return new ResponseEntity(new PerformingArtist(), HttpStatus.OK);
    }

    @GetMapping(value = "/producers", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public Artist searchProducers(){
        return new Producer();
    }

    @GetMapping(value = "/perfoming-artists", produces={MediaType.APPLICATION_JSON_VALUE})
    public Artist searchPerfomingArtists(){
        return new PerformingArtist();
    }

    @PostMapping(value="/producer", consumes={MediaType.APPLICATION_JSON_VALUE})
    public void addProducer(@Valid @RequestBody Artist producer){

    }

    @PostMapping(value="/perfoming-artist", consumes={MediaType.APPLICATION_JSON_VALUE})
    public void addPerfomingArtist(@Valid @RequestBody Artist perfomingArtist){
    }
}
