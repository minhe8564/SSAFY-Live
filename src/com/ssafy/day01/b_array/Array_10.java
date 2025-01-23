package com.ssafy.day01.b_array;

import java.util.Arrays;

public class Array_10 {
	private static int R = 4, C = 5;
	private static char[][] map;
	private static StringBuilder sb = new StringBuilder();

	private static void setup() {
		map = new char[R][C];
		// TODO: 위 배열을 알파벳 대문자 A ~ T로 초기화 하시오.
		char alpha = 'A';

		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				map[i][j] = alpha++;
			}
		}

		// END
	}

	public static void main(String[] args) {
		setup();
		rowFirst();
		colFirst();
		zigzag();
		snail();
	}

	private static void rowFirst() {
		// TODO: 행우선 탐색을 작성하시오.
		sb = new StringBuilder();
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				sb.append(map[i][j] + " ");
			}
			sb.append("\n");
		}

		// END
		System.out.println(sb.toString());
	}

	private static void colFirst() {
		// TODO: 열우선 탐색을 작성하시오.
		sb = new StringBuilder();
		for (int i = 0; i < C; i++) {
			for (int j = 0; j < R; j++) {
				sb.append(map[j][i] + " ");
			}
			sb.append("\n");
		}

		// END
		System.out.println(sb.toString());
	}

	private static void zigzag() {
		// TODO: zigzag 탐색을 작성하시오.
		sb = new StringBuilder();
		for (int i = 0; i < R; i++) {
			if (i % 2 == 0) { // 오른쪽으로 이동
				for (int j = 0; j < C; j++) {
					sb.append(map[i][j] + " ");
				}
			} else { // 왼쪽으로 이동
				for (int j = C - 1; j >= 0; j--) {
					sb.append(map[i][j] + " ");
				}
			}
			sb.append("\n");
		}

		// END
		System.out.println(sb.toString());
	}

	private static void snail() {
		// TODO: 달팽이 탐색을 작성하시오.
		sb = new StringBuilder();
		int[][] map = new int[R][C];

		// 초기 (x=0, y=0)에서 x=-1로 이동하면, 배열 범위 밖이기 때문에 오류 발생
//		int[] dx = {-1, 1, 0, 0};
//		int[] dy = {0, 0, -1, 1};
		int[] dx = { 0, 1, 0, -1 }; // 오른쪽, 아래, 왼쪽, 위 방향
		int[] dy = { 1, 0, -1, 0 }; // 오른쪽, 아래, 왼쪽, 위 방향
		boolean[][] visited = new boolean[R][C];

		int x = 0, y = 0, dir = 0; // 시작 위치와 방향 (0: 오른쪽, 1: 아래, 2: 왼쪽, 3: 위)
		int num = 1; // 채울 숫자

		// 달팽이 탐색 시작
		while (num <= R * C) {
			map[x][y] = num++; // 현재 위치에 숫자 채우기
			visited[x][y] = true; // 방문 처리

			// 다음 위치 계산
			int nx = x + dx[dir];
			int ny = y + dy[dir];

			// 범위 벗어나거나 이미 방문한 곳이라면 방향 전환
			if (nx < 0 || ny < 0 || nx >= R || ny >= C || visited[nx][ny]) {
				dir = (dir + 1) % 4; // 방향 변경
				nx = x + dx[dir];
				ny = y + dy[dir];
			}

			// 다음 위치로 이동
			x = nx;
			y = ny;
		}

		// 결과 출력
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				System.out.printf("%2d ", map[i][j]);
			}
			System.out.println();
		}
	}
}
