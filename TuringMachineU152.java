import java.util.ArrayList;
import java.util.List;

/**
 * A Turing machine is a mathematical model of computation that defines an abstract machine,
 * which manipulates symbols on a strip of tape according to a table of rules {@link State} .
 * Despite the model's simplicity, given any computer algorithm,
 * a Turing machine capable of simulating that algorithm's logic can be constructed.
 *
 * This particular machine is a U15,2 Turing machine, which is a universal Turing machine with 15 states {@link State}
 * and 2 symbols (0 and 1).
 */
public class TuringMachineU152 {
    private final TuringTape tape;
    private final int maxIterations;
    private State currentState;


    /**
     * Constructs a Turing machine with the given maximum number of iterations, initial tape and initial state.
     *
     * @param maxIterations the maximum number of iterations
     * @param initialTape the initial tape
     * @param initialState the initial state
     */
    public TuringMachineU152(int maxIterations, List<Integer> initialTape, State initialState) {
        this.maxIterations = maxIterations;
        tape = new TuringTape(initialTape);
        currentState = initialState;
    }

    /**
     * Runs the Turing machine until the maximum number of iterations is reached or the current state
     * is null {@link State.StateJ}.
     */
    public void run() {
        int iteration = 0;
        while (currentState != null && iteration < maxIterations) {
            currentState = currentState.nextState(tape);
            iteration++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        // initialising the tape, which is a list of 0s and 1s
        ArrayList<Integer> initialTape = new ArrayList<>();
        initialTape.add(1);
        initialTape.add(0);
        initialTape.add(1);
        initialTape.add(1);
        initialTape.add(1);
        initialTape.add(1);
        initialTape.add(1);
        initialTape.add(1);

        // initialising the Turing machine with the tape and the initial state
        TuringMachineU152 turingMachineU152 = new TuringMachineU152(30, initialTape, new State.StateE());
        turingMachineU152.run();
    }

}
