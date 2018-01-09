package com.contaazul.desafios.mars.business;

/**
 * Created by pablo on 09/01/18.
 */
public class Command {

    private String _command;
    private final String _validLetters = "RLM";

    public Command(String command) throws Exception {
        this.IsValid(command);
        this._command = command;
    }

    private void IsValid(String command) throws Exception {
        StringBuilder builder = new StringBuilder();
        for (Character c : command.toCharArray()) {
            String value = new String(new char[] {c});
            if(!_validLetters.contains(value)) {
                builder.append(value);
            }
        }

        if(builder.length() > 0) {
            throw new Exception("Commando inválido. Letra(s) inválida(s): " + builder.toString());
        }
    }

    private Position _ExecuteMove(Position current) {
        Integer newX = current.get_coordinate().get_x();
        Integer newY = current.get_coordinate().get_y();

        switch (current.get_direction()) {
            case N:
                newY++;
                break;
            case E:
                newX++;
                break;
            case S:
                newY--;
                break;
            case W:
                newX--;
        }

        return new Position(current.get_direction(), new Coordinate(newX, newY));
    }

    private Position _Execute(Character command, Position current) {
        switch (command) {
            case 'R':
                return new Position(current.get_direction().RotateRight(), current.get_coordinate());
            case 'L':
                return new Position(current.get_direction().RotateLeft(), current.get_coordinate());
            case 'M':
                return this._ExecuteMove(current);
        }

        return current;
    }

    public Position Execute(Position current) {
        Position newCurrent = current;
        for (Character c : this.get_command().toCharArray()) {
            newCurrent = this._Execute(c, newCurrent);
        }

        return newCurrent;
    }

    public String get_command() { return this._command;}
}
