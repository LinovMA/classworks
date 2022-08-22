package clw1508;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Controller {

    private int getDirection() {
        int direction = 0;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(
                    System.in
            ));
            direction = Integer.parseInt(br.readLine());
        } catch (Exception ex) {
            System.out.println("Ошибка ввода");
        }
        return direction;
    }

    public void mapMovingPlayer(Map map) {
        int movie = getDirection();
        switch (movie) {
            case (4): {
                map.goLeft();
                map.showMap(map.map);
                break;
            }
            case (8): {
                map.goUp();
                map.showMap(map.map);
                break;
            }
            case (2):{
                map.goDown();
                map.showMap(map.map);
                break;
            }
            case (6): {
                map.goRight();
                map.showMap(map.map);
                break;
            }
            default:{
                System.out.println("Не верный элемент управления!");
            }
        }
    }
}
