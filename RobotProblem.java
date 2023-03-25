package FindTheQuickestWayBack;

import java.util.Scanner;

public class RobotProblem {

    public static int robot(String move) {

        int oX = 0, oY = 0;
        boolean xRight = false, xLeft = false, yUp = false, yDown = false;

        for (int i = 0; i < move.length(); i++) {

            if (i == 0) {
                xRight = true;
            }

            if (move.toUpperCase().charAt(i) == 'F') {
                if (xRight) {
                    oX++;
                }
                else if (xLeft) {
                    oX--;
                }
                else if (yUp) {
                    oY++;
                }
                else {
                    oY--;
                }
            }
            else if (move.toUpperCase().charAt(i) == 'L') {
                if (xRight) {
                    xRight = false;
                    yUp = true;
                }
                else if (yUp) {
                    yUp = false;
                    xLeft = true;
                }
                else if (xLeft) {
                    xLeft = false;
                    yDown = true;
                }
                else {
                    yDown = false;
                    xRight = true;
                }
            }
            else if (move.toUpperCase().charAt(i) == 'R') {
                if (xRight) {
                    xRight = false;
                    yDown = true;
                }
                else if (yDown) {
                    yDown = false;
                    xLeft = true;
                }
                else if (xLeft) {
                    xLeft = false;
                    yUp = true;
                }
                else {
                    yUp = false;
                    xRight = true;
                }
            }
        }

        int result;
        int higher;
        int lower;

        if (oX > oY) {
            higher = oX;
            lower = oY;
        }
        else if (oY > oX) {
            higher = oY;
            lower = oX;
        }
        else {
            higher = oX;
            lower = oY;
        }

        if (oX == oY && oY == 0) {
            return 0;
        }
        else if ((oY > 0 && oX == 0 && yUp) || (oX > 0 && oY == 0 && xRight)) {
            result = higher + 2;
            return result;
        }
        else if ((oY < 0 && oX == 0 && yDown) || (oX < 0 && oY == 0 && xLeft)) {
            result = (lower * -1) + 2;
            return result;
        }
        else if ((oX > 0 && oY == 0 && xLeft) || (oY > 0 && oX == 0 && yDown)) {
            result = higher;
            return result;
        }
        else if ((oX < 0 && oY == 0 && xRight) || (oY < 0 && oX == 0 && yUp)) {
            result = (lower * -1);
            return result;
        }
        else if ((xRight || xLeft) && oY > 0 && oX == 0) {
            result = higher + 1;
            return result;
        }
        else if ((xRight || xLeft) && oY < 0 && oX == 0) {
            result = (higher + (lower * -1)) + 1;
            return result;
        }
        else if ((yUp || yDown) && oX > 0 && oY == 0) {
            result = higher + 1;
            return result;
        }
        else if ((yUp || yDown) && oX < 0 && oY == 0) {
            result = (higher + (lower * -1)) + 1;
            return result;
        }
        else if (oY == oX && oY > 0 && (yUp || xRight)) {
            result = higher + lower + 2;
            return result;
        }
        else if (oY == oX && oY < 0 && (yUp || xRight)) {
            result = ((higher * -1) + (lower * -1)) + 1;
            return result;
        }
        else if (oY == oX && oY > 0 && (yDown || xLeft)) {
            result = higher + lower + 1;
            return result;
        }
        else if (oY == oX && oY < 0 && (yDown || xLeft)) {
            result = ((higher * -1) + (lower * -1)) + 2;
            return result;
        }
        else if (oX != oY && oY > 0 && oX > 0 && yUp) {
            result = higher + (lower * -1) + 2;
            return result;
        }
        else if (oX != oY && oY > 0 && oX > 0 && yDown) {
            result = (higher * -1) + (lower * -1) + 2;
            return result;
        }
        else if (oY < 0 && oX > 0 && yUp) {
            result = higher + (lower * -1) + 1;
            return result;
        }
        else if (oY < 0 && oX > 0 && yDown) {
            result = higher + (lower * -1) + 2;
            return result;
        }
        else if (oX != oY && oY > 0 && oX > 0 && xRight) {
            result = higher + lower + 2;
            return result;
        }
        else if (oY < 0 && oX > 0 && xRight) {
            result = higher + (lower * -1) + 2;
            return result;
        }
        else if (oX != oY && oY > 0 && oX > 0 && xLeft) {
            result = higher + 1;
            return result;
        }
        else if (oY < 0 && oX > 0 && xLeft) {
            result = higher + (lower * -1) + 1;
            return result;
        }
        else if (oY > 0 && oX < 0 && yUp) {
            result = higher + (lower * -1) + 2;
            return result;
        }
        else if (oY > 0 && oX < 0 && yDown) {
            result = higher + (lower * -1) + 1;
            return result;
        }
        else if (oX != oY && oY < 0 && oX < 0 && yUp) {
            result = ((higher* -1) + (lower * -1)) + 1;
            return result;
        }
        else if (oX != oY && oY < 0 && oX < 0 && yDown) {
            result = ((higher * -1) + (lower * -1)) + 2;
            return result;
        }
        else if (oY > 0 && oX < 0 && xRight) {
            result = higher + (lower * -1) + 1;
            return result;
        }
        else if (oX != oY && oY < 0 && oX < 0 && xRight) {
            result = ((higher * -1) + (lower * -1)) + 1;
            return result;
        }
        else if (oY > 0 && oX < 0 && xLeft) {
            result = higher + (lower * -1) + 2;
            return result;
        }
        else if (oX != oY && oY < 0 && oX < 0 && xLeft) {
            result = ((higher * -1) + (lower * -1)) + 2;
            return result;
        }
        System.exit(404);
        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\nPlease insert the commands to set the path of the robot." +
                "\nAfter that, we will calculate the minimum number of moves required to return the robot in the " +
                "starting position.");
        String commands = sc.next();

        int i = 0;
        while (i < commands.length()) {
            if (commands.toUpperCase().charAt(i) != 'F' &&
                    commands.toUpperCase().charAt(i) != 'R' &&
                    commands.toUpperCase().charAt(i) != 'L') {

                System.out.println("\nThe available commands are: " +
                        "\n'F' - front" +
                        "\n'R' - fight" +
                        "\n'L' - left");
                System.out.println("\nPlease select the commands again:");
                commands = sc.next();
                i = 0;
                continue;
            }
            i++;
        }

        int result = robot(commands);
        System.out.println(result == 0 ?
                "\nFollowing the route, the robot returned to the starting position." :
                "\nThe minimum number of moves for the robot to return back to the starting position is: " + result);
    }
}
