package com.contaazul.desafios.mars.Controller;

/**
 * Created by pablo on 09/01/18.
 */

import com.contaazul.desafios.mars.business.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MarsController {

    private final Integer XSIZE = 5;
    private final Integer YSIZE = 5;
    private final Position startPosition = new Position(CardinalDirection.N, new Coordinate(0,0));

    @RequestMapping(method = RequestMethod.POST , value = "/rest/mars/{commandStr}")
    public ResponseEntity MoveOnMars(@PathVariable String commandStr) {
        try {
            Field field = new Field(this.XSIZE, this.YSIZE);
            Robot robot = new Robot(field, this.startPosition);
            Command command = new Command(commandStr);
            robot.Move(command);

            return new ResponseEntity<>(robot.get_position().toString(), HttpStatus.OK);
        } catch(Exception err){
            return new ResponseEntity<>(err.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}
