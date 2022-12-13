package br.ufjf.model;

import lombok.*;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@Getter
@Setter
public class Disco implements Iterable<Musica>{

    private List<Musica> musicaList;

    public Disco(Musica... musicas) {
        this.musicaList = Arrays.asList(musicas);
    }

    @Override
    public Iterator<Musica> iterator() {
        return musicaList.iterator();
    }
}
