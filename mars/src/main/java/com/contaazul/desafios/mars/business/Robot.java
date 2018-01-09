package com.contaazul.desafios.mars.business;

/**
 * Created by pablo on 08/01/18.
 */
public class Robot {

    private Field _field;
    private Position _position;


    public Robot(Field field, Position position) {
        this._field = field;
        this._position = position;
    }

    public Field get_field() { return this._field; }
    public Position get_position() { return this._position; }

    private void set_position(Position position) throws Exception {
        if(!this.get_field().IsValidCoordinate(position.get_coordinate())) {
            throw new Exception("Posição inválida. Coordenadas ("
                    + position.get_coordinate().get_x() + ","
                    + position.get_coordinate().get_y() + ") .");
        }

        this._position = position;
    }

    public Position Move(Command command) throws Exception {
        Position newPosition = command.Execute(this.get_position());
        this.set_position(newPosition);
        return this.get_position();
    }
}
