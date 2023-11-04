package example.strategy2.state;

import example.strategy2.InspectionState;

/**
 * Estado concreto representando uma vistoria pendente.
 * Instagram: @natanieltech
 * LinkedIn: https://www.linkedin.com/in/natanielpaiva/
 * YouTube: https://www.youtube.com/@NatanielTech
 */
public class PendingState implements InspectionState {
    @Override
    public void handleState() {
        System.out.println("A vistoria está PENDENTE. Aguardando a finalização de procedimentos.");
    }
}
