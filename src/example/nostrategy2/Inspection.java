package example.nostrategy2;

public class Inspection {

    public enum State {
        APPROVED,
        PENDING,
        FAILED
    }

    private State currentState;

    public Inspection(State state) {
        this.currentState = state;
    }

    public void nextState() {
        switch (currentState) {
            case APPROVED:
                // Lógica para quando a inspeção é aprovada.
                System.out.println("A vistoria foi APROVADA. Todos os critérios foram atendidos.");
                break;
            case PENDING:
                // Lógica para quando a inspeção está pendente.
                System.out.println("A vistoria está PENDENTE. Aguardando a finalização de procedimentos.");
                break;
            case FAILED:
                // Lógica para quando a inspeção é reprovada.
                System.out.println("A vistoria foi REPROVADA. Verifique os critérios não atendidos e reenvie.");
                break;
            default:
                throw new IllegalArgumentException("Estado desconhecido.");
        }
    }

    public void setState(State newState) {
        this.currentState = newState;
    }

    public State getCurrentState() {
        return currentState;
    }
}

