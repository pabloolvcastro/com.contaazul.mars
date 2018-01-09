package com.contaazul.desafios.mars.business;

/**
 * Created by pablo on 08/01/18.
 */
public class Field {

    private final Integer XMAXSIZE = 5;
    private final Integer YMAXSIZE = 5;

    private Integer _xsize;
    private Integer _ysize;

    /***
     * Create a new Mars field with the size provided
     * @param xsize The X size on Cartesian plane
     * @param ysize
     */
    public Field (Integer xsize, Integer ysize) throws Exception {

        this.IsValid( xsize, ysize);

        this._xsize = xsize;
        this._ysize = ysize;
    }

    public Integer get_xsize () { return this._xsize; }
    public Integer get_ysize () { return this._ysize; }

    private void IsValid(Integer xsize, Integer ysize) throws Exception {
        if(xsize < 0) {
            throw  new Exception("O valor fornecido para X é menor que 0.");
        }
        if(ysize < 0) {
            throw  new Exception("O valor fornecido para Y é menor que 0.");
        }
        if(xsize > XMAXSIZE) {
            throw  new Exception(
                    "O valor fornecido para X excede o valor máximo permitido: MAX X VALUE = "
                            + XMAXSIZE + ".");
        }
        if(ysize > YMAXSIZE) {
            throw  new Exception(
                    "O valor fornecido para Y excede o valor máximo permitido: MAX X VALUE = "
                            + YMAXSIZE + ".");
        }
    }

    public Boolean IsValidCoordinate(Coordinate coordinate) {
        if(coordinate.get_x() < 0 || coordinate.get_x() >= this.get_xsize()) {
            return false;
        }

        if(coordinate.get_y() < 0 || coordinate.get_y() >= this.get_ysize()) {
            return false;
        }

        return true;
    }
}
