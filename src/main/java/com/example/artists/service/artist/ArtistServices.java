package com.example.artists.service.artist;

import com.example.artists.model.Artist;
import com.example.artists.repository.IArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class ArtistServices implements IArtistServices{
    @Autowired
     private  IArtistRepository iArtistRepository;
    @Override
    public Iterable<Artist> findAll() {
        return iArtistRepository.findAll();
    }

    @Override
    public Optional<Artist> findById(Long id) {
        return iArtistRepository.findById(id);
    }

    @Override
    public Artist save(Artist artist) {
        return iArtistRepository.save(artist);
    }

    @Override
    public void remove(Long id) {
        iArtistRepository.deleteById(id);
    }
}
