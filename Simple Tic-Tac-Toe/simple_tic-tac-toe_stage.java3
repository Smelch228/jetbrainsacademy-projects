package tictactoe;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter cells: ");
        String cells = scanner.nextLine();
        char[] cellsArr = cells.toCharArray();
        printField(cellsArr);
        solution(cellsArr);
    }

    public static void printField(char[] cellsArr) {
        System.out.println("---------");
        System.out.println("| " + cellsArr[0] + " " + cellsArr[1] + " " + cellsArr[2] + " |");
        System.out.println("| " + cellsArr[3] + " " + cellsArr[4] + " " + cellsArr[5] + " |");
        System.out.println("| " + cellsArr[6] + " " + cellsArr[7] + " " + cellsArr[8] + " |");
        System.out.println("---------");
    }

    public static void solution (char[] cellsArr) {
        ArrayList<String> winsCounter = new ArrayList<>();

        char[] u = {cellsArr[0], cellsArr[1], cellsArr[2]}; //вверхний ряд
        char[] m = {cellsArr[3], cellsArr[4], cellsArr[5]}; //средний ряд
        char[] l = {cellsArr[6], cellsArr[7], cellsArr[8]}; //нижний ряд
        int xCounter = xCount(cellsArr);
        int oCounter = oCount(cellsArr);

        //impossible condition
        if (Math.abs(xCounter - oCounter) > 1) {
            System.out.println("Impossible");
            return;
        }

        //checking diagonals
        if((u[0] == m[1] && m[1] == l[2]) || (u[2] == m[1] && m[1] == l[0])) {
            System.out.println(m[1] + " wins");
            return;
        }

        //checking columns
        for (int i = 0; i < 3; i++) {
            if(u[i] == m[i] && m[i] == l[i]) {
                winsCounter.add(m[i] +" wins");
            }
        }

        //checking rows
        if (u[0] == u[1] && u[1] == u[2]) {
            winsCounter.add(u[0] + " wins");
        }
        if (m[0] == m[1] && m[1] == m[2]) {
            winsCounter.add(m[0] + " wins");
        }
        if (l[0] == l[1] && l[1] == l[2]) {
            winsCounter.add(l[0] + " wins");
        }

        if (winsCounter.size() > 1) {
            System.out.println("Impossible");
            return;
        } else if (winsCounter.size() == 1) {
            System.out.println(winsCounter.get(0));
            return;
        }

        //checking draw
        if (xCounter + oCounter == 9) {
            System.out.println("Draw");
            return;
        }

        System.out.println("Game not finished");    //Если все if-ы не сработали
    }

    public static int xCount(char[] cellsArr) {
        int xCounter = 0;
        for (int i = 0; i < cellsArr.length; i++) {
            if (cellsArr[i] == 'X') {
                xCounter++;
            }
        }
        return xCounter;
    }

    public static int oCount(char[] cellsArr) {
        int oCounter = 0;
        for (int i = 0; i < cellsArr.length; i++) {
            if (cellsArr[i] == 'O') {
                oCounter++;
            }
        }
        return oCounter;
    }
}
//https://github.com/someshnarwade/tictactoe/blob/master/stage3_tictactoe.py
