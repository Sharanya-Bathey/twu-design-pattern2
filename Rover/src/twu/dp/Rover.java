package twu.dp;

public class Rover {
    private int x;
    private int y;
    private char direction;

    public Rover(Position position, char direction) {
        this.x = position.getX();
        this.y = position.getY();
        this.direction = direction;
    }

    public Position getPosition() {
        return new Position(x, y);
    }

    public char getDirection() {
        return direction;
    }

    public void navigate(String instructions) {
        for (char command : instructions.toCharArray()) {
            if(command == 'M') {
                switch (direction) {
                    case 'N':
                        y++;
                        break;
                    case 'S':
                        y--;
                        break;
                    case 'E':
                        x++;
                        break;
                    case 'W':
                        x--;
                        break;
                }
            }
            if(command == 'L') {
                switch (direction) {
                    case 'N':
                        direction = 'W';
                        break;
                    case 'S':
                        direction = 'E';
                        break;
                    case 'E':
                        direction = 'N';
                        break;
                    case 'W':
                        direction = 'S';
                        break;
                }
            }
            if(command == 'R') {
                switch (direction) {
                    case 'N':
                        direction = 'E';
                        break;
                    case 'S':
                        direction = 'W';
                        break;
                    case 'E':
                        direction = 'N';
                        break;
                    case 'W':
                        direction = 'S';
                        break;
                }
            }
        }
    }
}