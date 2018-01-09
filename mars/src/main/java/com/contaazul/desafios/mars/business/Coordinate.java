package com.contaazul.desafios.mars.business;

/**
 * Created by pablo on 09/01/18.
 */
public class Coordinate {

    private Integer _x;
    private Integer _y;

    public Coordinate(Integer x, Integer y) {
        this._x = x;
        this._y = y;
    }

    public Integer get_x() { return this._x; }
    public Integer get_y() { return this._y; }

    @Override
    public boolean equals(Object obj) {
        Coordinate given = ((Coordinate)obj);
        return this.get_x().equals(given.get_x())
                && this.get_y().equals(given.get_y());
    }
}
