package example.strategy2;
/**
 * Classe que utiliza o padrão Strategy para gerenciar o estado de uma vistoria.
 * Instagram: @natanieltech
 * LinkedIn: https://www.linkedin.com/in/natanielpaiva/
 * YouTube: https://www.youtube.com/@NatanielTech
 */
public class Inspection {
    private InspectionState state;

    public Inspection(InspectionState state) {
        this.state = state;
    }

    public void setState(InspectionState state) {
        this.state = state;
    }

    public void nextState() {
        state.handleState();
    }
}
