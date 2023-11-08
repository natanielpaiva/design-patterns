package example.nostrategy2;

public class Main {
    public static void main(String[] args) {
        Inspection inspection = new Inspection(Inspection.State.PENDING);

        // O estado atual é pendente
        inspection.nextState();

        // Alterando o estado para aprovado
        inspection.setState(Inspection.State.APPROVED);
        inspection.nextState();

        // Alterando o estado para reprovado
        inspection.setState(Inspection.State.FAILED);
        inspection.nextState();
    }
}

