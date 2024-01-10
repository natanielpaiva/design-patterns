package example.structural.proxy;

// Proxy
public class ProxyImagem implements Imagem {
    private ImagemPesada imagemPesada;
    private String arquivo;

    public ProxyImagem(String arquivo) {
        this.arquivo = arquivo;
    }

    @Override
    public void exibir() {
        if (imagemPesada == null) {
            imagemPesada = new ImagemPesada(arquivo);
        }
        imagemPesada.exibir();
    }
}
