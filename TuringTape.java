import java.util.ArrayList;
import java.util.List;

/**
 * A Turing tape is an infinite tape that contains symbols from a finite alphabet.
 * The tape is divided into cells, and each cell contains a symbol from the alphabet.
 * The tape has a head that can read and write symbols, and move left or right.
 *
 * This particular tape is a binary Turing tape, which means that the alphabet contains only 0s and 1s.
 */
public class TuringTape {
    private final ArrayList<Integer> tape;
    private int headPosition;

    public TuringTape() {
        tape = new ArrayList<>();
        tape.add(0); // Initialize with a single cell containing 0 (blank symbol)
        headPosition = 0;
        printTuringTapeInformation();
    }

    public TuringTape(List<Integer> tape) {
        if (tape == null) {
            throw new IllegalArgumentException("Tape cannot be null");
        }
        if (tape.isEmpty()) {
            throw new IllegalArgumentException("Tape cannot be empty");
        }

        // Check that the list contains only 0s and 1s
        if (!tape.stream().allMatch(symbol -> symbol == 0 || symbol == 1)) {
            throw new IllegalArgumentException("Tape can only contain 0s and 1s");
        }

        this.tape = new ArrayList<>(tape);
        printTuringTapeInformation();
    }

    public int readSymbol() {
        return tape.get(headPosition);
    }

    public void writeSymbol(int symbol) {
        tape.set(headPosition, symbol);
    }

    /**
     * Moves the head left by one cell.
     * If the head is at the leftmost cell, a new blank cell is added at the start of the tape.
     */
    public void moveLeft() {
        if (headPosition == 0) {
            tape.add(0, 0); // Add a new blank cell at the start if at the leftmost cell
        } else {
            headPosition--;
        }

        printTuringTapeInformation();
    }

    /**
     * Moves the head right by one cell.
     * If the head is at the rightmost cell, a new blank cell is added at the end of the tape.
     */
    public void moveRight() {
        headPosition++;
        if (headPosition == tape.size()) {
            tape.add(0); // Add a new blank cell at the end if at the rightmost cell
        }

        printTuringTapeInformation();
    }

    /**
     * Prints the current head position, tape size and tape contents.
     */
    private void printTuringTapeInformation() {
        System.out.println("Head position: " + headPosition);
        System.out.println("Tape size: " + tape.size());
        System.out.println("Tape: " + tape);
    }
}
