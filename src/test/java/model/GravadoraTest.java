package model;

import br.ufjf.model.Disco;
import br.ufjf.model.Gravadora;
import br.ufjf.model.Musica;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GravadoraTest {


    @Test
    public void totalMusicasTest() {
        Disco disco = new Disco(
                new Musica("Scatman",215,"Pop"),
                new Musica("Sandstorm",160,"Trance"),
                new Musica("Through the Fire and Flames",440,"Heavy Metal")
        );
        assertEquals(3,Gravadora.contarMusicasNoDisco(disco));
    }

    @Test
    public void totalMusicasLongasTest() {
        Disco disco = new Disco(
                new Musica("Scatman",215,"Pop"),
                new Musica("Sandstorm",160,"Trance"),
                new Musica("Through the Fire and Flames",440,"Heavy Metal")
        );
        assertEquals(1,Gravadora.contarMusicasLongaDuracao(disco));
    }

    @Test
    public void totalMusicasPorEstiloTest() {
        Disco disco = new Disco(
                new Musica("Scatman",215,"Pop"),
                new Musica("Sandstorm",160,"Trance"),
                new Musica("Through the Fire and Flames",440,"Heavy Metal")
        );
        assertEquals(1,Gravadora.contarMusicasPorEstilo(disco,"Pop"));
    }



}
