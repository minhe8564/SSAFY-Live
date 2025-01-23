package com.ssafy.day01.b_array;

public class Array_08 {

    public static void main(String[] args) {

        char[][] grid = { { '2', '3', '1', '4' },
                { '1', 'X', '3', '2' },
                { '3', '4', 'X', 'X' },
                { 'X', '4', '1', '5' } };

        int sum = 0;
        // TODO: X로 표시된 항목의 좌우 숫자의 합을 구하시오.
        for(int i = 0; i < 4; i++) {
        	for(int j = 0; j < 4; j++) {
        		if(grid[i][j] == 'X') {
        			// 좌
        			if(j-1 >= 0 && grid[i][j-1] != 'X')
        				// char 타입 -> int 타입
        				// '0' ASCII 코드값(48)
        				sum += grid[i][j-1] -'0';
        			// 우
        			if(j+1 >= 0 && grid[i][j+1] != 'X')
        				sum += grid[i+1][j] -'0';
        		}
        	}
        }

        // END
        System.out.println(sum);
    }
}
