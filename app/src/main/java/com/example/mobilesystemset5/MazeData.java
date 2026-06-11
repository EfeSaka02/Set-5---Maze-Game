package com.example.mobilesystemset5;

public class MazeData {

    public static final int[][] maze = { // That's the maze and each number defines the room's doors for example 1 = left, right = 2, 8 is down and 16 is start marker
            {10,  8, 11,  9},
            {28,  3,  0, 12},
            {12, 10,  9, 13},
            { 6,  5,  6,  5}
    };

    public static final int LEFT  = 1;
    public static final int RIGHT = 2;
    public static final int UP    = 4;
    public static final int DOWN  = 8;
    public static final int START_MARKER = 16;

    public static int[] findStart() {
        for (int r = 0; r < maze.length; r++) { // that looks every line in the maze.length
            for (int c = 0; c < maze[r].length; c++) {
                if ((maze[r][c] & START_MARKER) != 0) { // and row and column  and start marker if it's not equal 0 it returns new int I mean new start room
                    return new int[]{r, c};
                }
            }
        }
        return new int[]{1, 0}; // If it coudln't find it it returns 1,0
    }
}