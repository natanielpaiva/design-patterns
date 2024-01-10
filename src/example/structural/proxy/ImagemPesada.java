package example.structural.proxy;

// RealObject
public class ImagemPesada implements Imagem {
    private String arquivo;

    public ImagemPesada(String arquivo) {
        this.arquivo = arquivo;
        carregarDoDisco();
    }

    private void carregarDoDisco() {
        System.out.println("Carregando " + arquivo);
        // Simula o carregamento pesado
    }

    @Override
    public void exibir() {
        System.out.println("Exibindo " + arquivo);
    }
}
