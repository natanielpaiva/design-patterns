package example.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FabricaDeCirculos {
    private Map<String, Circulo> circulos = new HashMap<>();

    public Circulo getCirculo(String cor) {
        Circulo circulo = circulos.get(cor);

        if (circulo == null) {
            circulo = new Circulo(cor);
            circulos.put(cor, circulo);
            System.out.println("Criando um círculo de cor : " + cor);
        }
        return circulo;
    }
}
