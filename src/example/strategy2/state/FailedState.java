package example.strategy2.state;

import example.strategy2.InspectionState;

/**
 * Estado concreto representando uma vistoria reprovada.
 * Instagram: @natanieltech
 * LinkedIn: https://www.linkedin.com/in/natanielpaiva/
 * YouTube: https://www.youtube.com/@NatanielTech
 */
public class FailedState implements InspectionState {
    @Override
    public void handleState() {
        System.out.println("A vistoria foi REPROVADA. Verifique os critérios não atendidos e reenvie.");
    }
}
