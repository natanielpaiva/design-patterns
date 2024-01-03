package example.creational.buider;

import javax.swing.*;

public class Main {

    public static void main(String[] args){
       Produto.Builder builder = new Produto.Builder();
       Produto produto = builder
               .nome("Iphone")
               .preco(5000d)
               .quantidadeEmEstoque(33)
               .categoria("Celular")
               .build();

       System.out.println(produto.getNome());
    }

}
