package example.structural.flyweight;

public class Cliente {
    private static final String cores[] = {"Vermelho", "Verde", "Azul", "Branco", "Preto"};

    public static void main(String[] args) {
        FabricaDeCirculos fabrica = new FabricaDeCirculos();

        for (int i = 0; i < 20; ++i) {
            Circulo circulo = fabrica.getCirculo(getCorAleatoria());
            circulo.desenhar(getXAleatorio(), getYAleatorio(), getRaioAleatorio());
        }
    }

    private static String getCorAleatoria() {
        return cores[(int)(Math.random()*cores.length)];
    }

    private static int getXAleatorio() {
        return (int)(Math.random()*100);
    }

    private static int getYAleatorio() {
        return (int)(Math.random()*100);
    }

    private static int getRaioAleatorio() {
        return (int)(Math.random()*100);
    }
}

