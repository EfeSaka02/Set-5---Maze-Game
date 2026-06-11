# Maze Game - Mobile Systems Set 5

A simple maze game for Android built with Java.

## How it works
- The maze is stored as a 2D integer array
- Each room value uses a bitmask to encode available doors:
  - 1 = Left, 2 = Right, 4 = Up, 8 = Down, 16 = Start marker
- Navigate between rooms using direction buttons
- Green buttons = door available, Gray buttons = door blocked
- Reach the room with value 0 to win

## Screens
- **Start Screen** - Launch the game
- **Game Screen** - Navigate through rooms with direction buttons
- **Result Screen** - Win screen with Restart and Back to Menu options

## Maze Example (4x4)
{10,  8, 11,  9}
{28,  3,  0, 12}
{12, 10,  9, 13}
{ 6,  5,  6,  5}

Start room: (1,0) — value 28 = 16+8+4 (start marker + up + down)
End room: (1,2) — value 0

## Tech
- Android Studio, Java, minSDK 24
