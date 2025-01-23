package com.ssafy.day01.b_array;

public class Array_09 {
//	public static int[] dx = {-1, 1, 0, 0};
//	public static int[] dy = {-1, 1, 0, 0};
	
    public static void main(String[] args) {

        char[][] grid = {
                { '2', '3', '1', '4' },
                { '1', 'X', '3', '2' },
                { '3', '4', 'X', 'X' },
                { 'X', '4', '1', '5' } };

        int[][] deltas = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        int sum = 0;

        // TODO: X로 표시된 항목의 상하좌우 숫자의 합을 구하시오.
        //  단 행과 열의 오름차순으로 접근하며 상하좌우의 순서로 탐색한다. 합을 구할 때 이미 더한 영역은 다시 더하지 않는다.
        for(int x = 0; x < 4; x++) {
        	for(int y = 0; y < 4; y++) {
        		if(grid[x][y] == 'X') {
        			for(int k = 0; k < 4; k++) {
        				int nx = x + deltas[k][0];
        				int ny = y + deltas[k][0];
//        				int nx = x + dx[k];
//        				int ny = y + dx[k];
        				
        				if(nx >= 0 && nx < 4 && ny >= 0 && ny < 4 
        						&& grid[nx][ny] != 'X') {
        					sum += grid[nx][ny] - '0';
        					grid[nx][ny] = '0';
        				}
        			}
        		}
        	}
        }
        
        
        // END
        System.out.println(sum);
        // 10
    }
}
