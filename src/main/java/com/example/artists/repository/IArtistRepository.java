package com.example.artists.repository;

import com.example.artists.model.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IArtistRepository extends JpaRepository<Artist,Long> {
}
