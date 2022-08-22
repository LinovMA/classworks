package clw1508;

public class Map {

    public char[][] map;

    int x = 9;
    int y = 0;

    public void showMap(char[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void addPlayer(int indexX, int indexY) {
        map[indexX][indexY] = '@';
    }

    public void goUp() {

        if ( x - 1 < 0 || map[x - 1][y] == 'X') {
            System.out.println("Сюда ходить нельзя!");
        } else {
            map[x - 1][y] = '@';
            map[x][y] = '.';
            x--;
        }
    }

    public void goDown() {

        if ( x + 1 > 9 || map[x + 1][y] == 'X') {
            System.out.println("Сюда ходить нельзя!");
        } else {
            map[x + 1][y] = '@';
            map[x][y] = '.';
            x++;
        }
    }

    public void goLeft() {

        if (y - 1 < 0 || map[x][y - 1] == 'X') {
            System.out.println("Сюда ходить нельзя!");
        } else {
            map[x][y - 1] = '@';
            map[x][y] = '.';
            y--;
        }
    }

    public void goRight() {
        if (y + 1 > 9 || map[x][y + 1] == 'X') {
            System.out.println("Сюда ходить нельзя!");
        } else {
            map[x][y + 1] = '@';
            map[x][y] = '.';
            y++;
        }

    }
}


