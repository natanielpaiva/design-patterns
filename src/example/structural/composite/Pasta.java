package example.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Pasta implements Arquivo {
    private List<Arquivo> arquivos = new ArrayList<>();
    private String nome;

    public Pasta(String nome) {
        this.nome = nome;
    }

    public void adicionar(Arquivo arquivo) {
        arquivos.add(arquivo);
    }

    public void remover(Arquivo arquivo) {
        arquivos.remove(arquivo);
    }

    @Override
    public void mostrar() {
        System.out.println("Pasta: " + nome);
        for (Arquivo arquivo : arquivos) {
            arquivo.mostrar();
        }
    }
}

