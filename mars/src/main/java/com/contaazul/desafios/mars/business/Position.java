package com.contaazul.desafios.mars.business;

/**
 * Created by pablo on 09/01/18.
 */
public class Position {

    private CardinalDirection _diretion;
    private Coordinate _coordinate;


    public Position(CardinalDirection diretion, Coordinate coordinate) {
        this._diretion = diretion;
        this._coordinate = coordinate;
    }

    public CardinalDirection get_direction() { return _diretion; }
    public Coordinate get_coordinate() { return _coordinate; }

    @Override
    public boolean equals(Object obj) {
        Position given = ((Position)obj);
        return this.get_direction().equals(given.get_direction())
                && this.get_coordinate().equals(given.get_coordinate());
    }

    @Override
    public String toString() {
        return new StringBuilder()
            .append("(")
            .append(this.get_coordinate().get_x())
            .append(",")
            .append(this.get_coordinate().get_y())
            .append(",")
            .append(this.get_direction().toString())
            .append(")")
                .toString();
    }
}
