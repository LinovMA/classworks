package clw1508;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game {

    public static void main(String[] args) {
        Game game = new Game();
        Map map = new Map();
        Controller contr = new Controller();
        game.createMap(map);
        game.addStone(map);
        map.addPlayer(9, 0);
        map.showMap(map.map);
        while (map.x != 0 || map.y != 9) {
            contr.mapMovingPlayer(map);
        }
    }

    public void createMap(Map map) {
        map.map = new char[10][10];
        for (int i = 0; i < map.map.length; i++) {
            for (int j = 0; j < map.map[i].length; j++) {
                map.map[i][j] = '.';
            }
        }
    }

    public void addStone(Map map) {
        for (int i = 0; i < map.map.length; i++) {
            for (int j = 0; j < map.map[i].length; j++) {
                map.map[i][j] = (char) (Math.random() * 100);
                if (map.map[i][j] >= 80) {
                    map.map[i][j] = 'X';
                    map.map[0][9] = '.';
                } else {
                    map.map[i][j] = '.';
                }
            }
        }
    }
}
