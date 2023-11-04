package example.strategy2;

import example.strategy2.state.ApprovedState;
import example.strategy2.state.FailedState;
import example.strategy2.state.PendingState;

/**
 * Classe de demonstração que executa ações baseadas no estado atual da vistoria.
 * Instagram: @natanieltech
 * LinkedIn: https://www.linkedin.com/in/natanielpaiva/
 * YouTube: https://www.youtube.com/@NatanielTech
 */
public class Main {
    public static void main(String[] args) {
        Inspection inspection = new Inspection(new PendingState());

        // O estado atual é pendente
        inspection.nextState();

        // Alterando o estado para aprovado
        inspection.setState(new ApprovedState());
        inspection.nextState();

        // Alterando o estado para reprovado
        inspection.setState(new FailedState());
        inspection.nextState();
    }
}

