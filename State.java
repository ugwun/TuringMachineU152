/**
 * Abstract class for the states of the Turing Machine.
 *
 * The Turing Machine has 15 states, which are represented by the inner classes of this class. For the sake of
 * simplicity, the states are named A, B, C, D, E, F, G, H, I, J, K, L, M, N and O.
 *
 * Each state has a method {@link State#nextState(TuringTape)} that returns the next state of the Turing Machine.
 *
 * For the table of rules, see the README.md file.
 */
public abstract class State {

    /**
     * Writes a symbol to the tape, moves the head left or right, and returns the next state.
     *
     * @param tape the Turing tape {@link TuringTape}
     * @return the next state of the Turing Machine
     */
    public abstract State nextState(TuringTape tape);

    public static class StateA extends State {
        @Override
        public State nextState(TuringTape tape) {
            State nextState;
            if (tape.readSymbol() == 0) {
                tape.writeSymbol(0);
                tape.moveRight();
                nextState = new StateB();
            } else {
                tape.writeSymbol(1);
                tape.moveRight();
                nextState = new StateA();
            }
            System.out.println("Current state: StateA, Next state: " + nextState.getClass().getSimpleName());

            return nextState;
        }
    }

    public static class StateB extends State {
        @Override
        public State nextState(TuringTape tape) {
            State nextState;
            if (tape.readSymbol() == 0) {
                tape.writeSymbol(1);
                tape.moveRight();
                nextState = new StateC();
            } else {
                tape.writeSymbol(1);
                tape.moveRight();
                nextState = new StateA();
            }
            System.out.println("Current state: StateA, Next state: " + nextState.getClass().getSimpleName());
            
            return nextState;
        }
    }

    public static class StateC extends State {
        @Override
        public State nextState(TuringTape tape) {
            State nextState;
            if (tape.readSymbol() == 0) {
                tape.writeSymbol(0);
                tape.moveLeft();
                nextState = new StateG();
            } else {
                tape.writeSymbol(0);
                tape.moveLeft();
                nextState = new StateE();
            }
            System.out.println("Current state: StateA, Next state: " + nextState.getClass().getSimpleName());
            
            return nextState;
        }
    }

    public static class StateD extends State {
        @Override
        public State nextState(TuringTape tape) {
            State nextState;
            if (tape.readSymbol() == 0) {
                tape.writeSymbol(0);
                tape.moveLeft();
                nextState = new StateF();
            } else {
                tape.writeSymbol(1);
                tape.moveLeft();
                nextState = new StateE();
            }
            System.out.println("Current state: StateA, Next state: " + nextState.getClass().getSimpleName());
            
            return nextState;
        }
    }

    public static class StateE extends State {
        @Override
        public State nextState(TuringTape tape) {
            State nextState;
            if (tape.readSymbol() == 0) {
                tape.writeSymbol(1);
                tape.moveRight();
                nextState = new StateA();
            } else {
                tape.writeSymbol(1);
                tape.moveLeft();
                nextState = new StateD();
            }
            System.out.println("Current state: StateA, Next state: " + nextState.getClass().getSimpleName());

            return nextState;
        }
    }

    public static class StateF extends State {
        @Override
        public State nextState(TuringTape tape) {
            State nextState;
            if (tape.readSymbol() == 0) {
                tape.writeSymbol(1);
                tape.moveLeft();
                nextState = new StateD();
            } else {
                tape.writeSymbol(1);
                tape.moveLeft();
                nextState = new StateD();
            }
            System.out.println("Current state: StateA, Next state: " + nextState.getClass().getSimpleName());

            return nextState;
        }
    }

    public static class StateG extends State {
        @Override
        public State nextState(TuringTape tape) {
            State nextState;
            if (tape.readSymbol() == 0) {
                tape.writeSymbol(0);
                tape.moveRight();
                nextState = new StateH();
            } else {
                tape.writeSymbol(1);
                tape.moveLeft();
                nextState = new StateG();
            }
            System.out.println("Current state: StateA, Next state: " + nextState.getClass().getSimpleName());

            return nextState;
        }
    }

    public static class StateH extends State {
        @Override
        public State nextState(TuringTape tape) {
            State nextState;
            if (tape.readSymbol() == 0) {
                tape.writeSymbol(1);
                tape.moveLeft();
                nextState = new StateI();
            } else {
                tape.writeSymbol(1);
                tape.moveLeft();
                nextState = new StateG();
            }
            System.out.println("Current state: StateA, Next state: " + nextState.getClass().getSimpleName());

            return nextState;
        }
    }

    public static class StateI extends State {
        @Override
        public State nextState(TuringTape tape) {
            State nextState;
            if (tape.readSymbol() == 0) {
                tape.writeSymbol(0);
                tape.moveRight();
                nextState = new StateA();
            } else {
                tape.writeSymbol(1);
                tape.moveLeft();
                nextState = new StateJ();
            }
            System.out.println("Current state: StateA, Next state: " + nextState.getClass().getSimpleName());

            return nextState;
        }
    }

    public static class StateJ extends State {
        @Override
        public State nextState(TuringTape tape) {
            State nextState;
            if (tape.readSymbol() == 0) {
                tape.writeSymbol(1);
                tape.moveLeft();
                nextState = new StateK();
            } else {
                return null;
            }
            System.out.println("Current state: StateA, Next state: " + nextState.getClass().getSimpleName());

            return nextState;
        }
    }

    public static class StateK extends State {
        @Override
        public State nextState(TuringTape tape) {
            State nextState;
            if (tape.readSymbol() == 0) {
                tape.writeSymbol(0);
                tape.moveRight();
                nextState = new StateL();
            } else {
                tape.writeSymbol(1);
                tape.moveRight();
                nextState = new StateN();
            }
            System.out.println("Current state: StateA, Next state: " + nextState.getClass().getSimpleName());

            return nextState;
        }
    }

    public static class StateL extends State {
        @Override
        public State nextState(TuringTape tape) {
            State nextState;
            if (tape.readSymbol() == 0) {
                tape.writeSymbol(0);
                tape.moveRight();
                nextState = new StateM();
            } else {
                tape.writeSymbol(1);
                tape.moveRight();
                nextState = new StateL();
            }
            System.out.println("Current state: StateA, Next state: " + nextState.getClass().getSimpleName());

            return nextState;
        }
    }

    public static class StateM extends State {
        @Override
        public State nextState(TuringTape tape) {
            State nextState;
            if (tape.readSymbol() == 0) {
                tape.writeSymbol(0);
                tape.moveLeft();
                nextState = new StateB();
            } else {
                tape.writeSymbol(1);
                tape.moveRight();
                nextState = new StateL();
            }
            System.out.println("Current state: StateA, Next state: " + nextState.getClass().getSimpleName());

            return nextState;
        }
    }

    public static class StateN extends State {
        @Override
        public State nextState(TuringTape tape) {
            State nextState;
            if (tape.readSymbol() == 0) {
                tape.writeSymbol(0);
                tape.moveLeft();
                nextState = new StateC();
            } else {
                tape.writeSymbol(0);
                tape.moveRight();
                nextState = new StateO();
            }
            System.out.println("Current state: StateA, Next state: " + nextState.getClass().getSimpleName());

            return nextState;
        }
    }

    public static class StateO extends State {
        @Override
        public State nextState(TuringTape tape) {
            State nextState;
            if (tape.readSymbol() == 0) {
                tape.writeSymbol(0);
                tape.moveRight();
                nextState = new StateN();
            } else {
                tape.writeSymbol(1);
                tape.moveRight();
                nextState = new StateN();
            }
            System.out.println("Current state: StateA, Next state: " + nextState.getClass().getSimpleName());

            return nextState;
        }
    }
}
