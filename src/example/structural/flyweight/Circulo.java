package example.structural.flyweight;

public class Circulo {
    private String cor;  // Estado intrínseco

    public Circulo(String cor) {
        this.cor = cor; // Cor é compartilhada entre círculos da mesma cor
    }

    public void desenhar(int x, int y, int raio) {
        // x, y e raio são estados extrínsecos, específicos para cada círculo
        System.out.println("Desenhando um círculo de cor " + cor + " em (" + x + "," + y + ") com raio " + raio);
    }
}
