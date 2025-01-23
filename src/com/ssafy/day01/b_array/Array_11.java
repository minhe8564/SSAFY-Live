package com.ssafy.day01.b_array;

public class Array_11 {
    private static int R = 4, C = 5;
    private static char[][] map;
    // TODO: deltas 계열의 변수를 초기화 하시오.
    private static int[] drCross = {-1, 1, 0, 0}; // 상, 하, 좌, 우
    private static int[] dcCross = {0, 0, -1, 1};
    private static int[] drX = {-1, -1, 1, 1}; // 대각선
    private static int[] dcX = {-1, 1, -1, 1};
    private static int[] drHorse = {-2, -2, -1, -1, 1, 1, 2, 2}; // 장기 말 이동
    private static int[] dcHorse = {-1, 1, -2, 2, -2, 2, -1, 1};
    // END

    private static void setup() {
        map = new char[R][C];
        char alpha = 'A';
        for (int r = 0; r < R; r++) {
            for (int c = 0; c < C; c++) {
                map[r][c] = alpha++;
            }
        }
    }

    public static void main(String[] args) {
        setup();
        checkCross();
        checkX();
        straight();
        moveHorse();
    }

    private static void checkCross() {
        int sum = 0;
        // TODO: 자음의 주변을 +로 탐색하고 요소의 합을 출력하시오. (A=0, B=1, ...)
        for (int r = 0; r < R; r++) {
            for (int c = 0; c < C; c++) {
                if (!isVowel(map[r][c])) {
                    for (int d = 0; d < 4; d++) { // 상하좌우 탐색
                        int nr = r + drCross[d];
                        int nc = c + dcCross[d];
                        if (isIn(nr, nc)) {
                            sum += map[nr][nc] - 'A';
                        }
                    }
                }
            }
        }
        // END
        System.out.println(sum == 498);
    }

    private static void checkX() {
        int sum = 0;
        // TODO: 모음의 주변을 X로 탐색하고 요소의 합을 출력하시오. (A=0, B=1, ...)
        for (int r = 0; r < R; r++) {
            for (int c = 0; c < C; c++) {
                if (isVowel(map[r][c])) {
                    for (int d = 0; d < 4; d++) { // 대각선 탐색
                        int nr = r + drX[d];
                        int nc = c + dcX[d];
                        if (isIn(nr, nc)) {
                            sum += map[nr][nc] - 'A';
                        }
                    }
                }
            }
        }
        // END
        System.out.println(sum == 72);
    }

    private static void straight() {
        int sum = 0;
        // TODO: 'K'의 사방으로 영역 내에서 모음을 만나기 전까지 모든 자음들을 합해서 출력하세요. (A=0, B=1, ...)
        int startR = 2, startC = 0; // 'K'의 위치 (3행 1열)
        for (int d = 0; d < 4; d++) {
            int nr = startR, nc = startC;
            while (true) {
                nr += drCross[d];
                nc += dcCross[d];
                if (!isIn(nr, nc) || isVowel(map[nr][nc])) break;
                sum += map[nr][nc] - 'A';
            }
        }
        // END
        System.out.println(sum == 56);
    }

    private static void moveHorse() {
        char maxChar = 'A';
        int maxSum = 0;
        // TODO: 모음에서 장기의 말 이동 했을 때 만나는 지점의 합이 가장 큰 알파벳과 그때의 합은? 합이 같다면 큰 알파벳
        for (int r = 0; r < R; r++) {
            for (int c = 0; c < C; c++) {
                if (isVowel(map[r][c])) {
                    int currentSum = 0;
                    for (int d = 0; d < 8; d++) {
                        int nr = r + drHorse[d];
                        int nc = c + dcHorse[d];
                        if (isIn(nr, nc)) {
                            currentSum += map[nr][nc] - 'A';
                        }
                    }
                    if (currentSum > maxSum || (currentSum == maxSum && map[r][c] > maxChar)) {
                        maxSum = currentSum;
                        maxChar = map[r][c];
                    }
                }
            }
        }
        // END
        System.out.println(maxChar == 'I' && maxSum == 48);
    }

    private static boolean isIn(int r, int c) {
        return 0 <= r && r < R && 0 <= c && c < C;
    }

    private static boolean isVowel(char ch) {
        return "AEIOU".indexOf(ch) >= 0;
    }
}
