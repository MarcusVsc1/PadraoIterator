package br.ufjf.model;

import java.util.Iterator;

public class Gravadora {

    public static Integer contarMusicasLongaDuracao(Disco disco) {
        Integer quantidade = 0;
        for (Musica musica : disco){
            if (musica.getDuracaoSegundos() > 300) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarMusicasPorEstilo(Disco disco, String estilo) {
        Integer quantidade = 0;
        for (Musica musica : disco){
            if (musica.getEstilo().equals(estilo)) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarMusicasNoDisco(Disco disco) {
        Integer quantidade = 0;
        for (Iterator<Musica> a = disco.iterator(); a.hasNext(); ){
            quantidade++;
            a.next();
        }
        return quantidade;
    }

}
