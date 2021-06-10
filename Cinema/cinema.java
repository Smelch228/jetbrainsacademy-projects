import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[][] arr = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        int k = scanner.nextInt();  //num of tickets of neighboring seats in same row
        //Solution
        boolean isStreak = false;
        int count = 0;
        int row = 0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (!isStreak) {
                    if (arr[i][j] == 0) {
                        count++;
                    } else {
                        count = 0;
                    }

                    if (k == count) {
                        isStreak = true;
                        row = i + 1;
                    }
                }
            }
            count = 0;
        }
        System.out.println(row);
    }
}

/*
The cinema has n rows, each row consists of m seats (n and m do not exceed 20).
A two-dimensional matrix stores the information on the sold tickets: the number 1 means that the ticket for this place is already sold,
and the number 0 means that the place is available. You want to buy k tickets to neighboring seats in the same row. Find whether it can be done.
Input data format

On the input, the program gets the number of n rows and m seats. Then, there are n lines, each containing m numbers (0 or 1) separated by spaces.
The last line contains the number k.

Output data format

The program should output the number of the row with k consecutive available seats.
If there are several rows with k available seats, output the first row with these seats. If there is no such a row, output the number 0.

Sample Input 1:

3 4
0 1 0 1
1 1 0 1
1 0 0 1
2

Sample Output 1:
3
 */
