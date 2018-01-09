package com.contaazul.desafios.mars.business;

/**
 * Created by pablo on 09/01/18.
 */

public enum CardinalDirection {
    N, E, S, W;

    public CardinalDirection RotateLeft() {
        switch (this) {
            case N:
                return CardinalDirection.W;
            default:
                return CardinalDirection.values()[this.ordinal() -1];
        }

    }

    public CardinalDirection RotateRight() {
        switch (this) {
            case W:
                return CardinalDirection.N;
            default:
                return CardinalDirection.values()[this.ordinal() +1];
        }

    }
}
