package model;

public enum State {
    HIT("X"),
    MISS("M"),
    WATER("~"),
    SHIP("O");

    private final String symbol;

    State(String symbol) {
        this.symbol = symbol;
    }

    private String getSymbol() {
        return symbol;
    }

    public static State fromSymbol(String c) {
        for (State state : values()) {
            if (state.getSymbol().equals(c)) {
                return state;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return symbol;
    }
}
