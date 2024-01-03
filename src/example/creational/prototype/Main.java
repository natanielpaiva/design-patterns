package example.creational.prototype;

public class Main {
    public static void main(String[] args) {
        // Criando o protótipo de configurações do jogo
        GameSettings prototypeSettings = new GameSettings(50, 70, "Normal");
        System.out.println(prototypeSettings.hashCode());

        // Clonando e modificando para um novo jogador
        GameSettings playerSettings = prototypeSettings.clone();
        System.out.println(playerSettings.hashCode());
        playerSettings.setDifficulty("Hard");

        System.out.println("Player Settings: Difficulty is " + playerSettings.getDifficulty());
        System.out.println("Player Settings: Volume is " + playerSettings.getVolume());
    }
}

