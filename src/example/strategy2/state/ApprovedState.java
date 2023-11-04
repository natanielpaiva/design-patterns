package example.strategy2.state;

import example.strategy2.InspectionState;

/**
 * Estado concreto representando uma vistoria aprovada.
 * Instagram: @natanieltech
 * LinkedIn: https://www.linkedin.com/in/natanielpaiva/
 * YouTube: https://www.youtube.com/@NatanielTech
 */
public class ApprovedState implements InspectionState {
    @Override
    public void handleState() {
        System.out.println("A vistoria foi APROVADA. Todos os critérios foram atendidos.");
    }
}
