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

## ScreenShots
<img width="347" height="716" alt="Ekran Resmi 2026-06-11 17 27 06" src="https://github.com/user-attachments/assets/37cc3f8c-4004-4d28-b122-bfb7ec3faafc" />
<img width="347" height="716" alt="Ekran Resmi 2026-06-11 17 27 20" src="https://github.com/user-attachments/assets/8cbf2f6d-312e-4ab0-9c9e-2a37d587ffb9" />
<img width="347" height="716" alt="Ekran Resmi 2026-06-11 17 36 19" src="https://github.com/user-attachments/assets/acd29d01-95fa-4e04-9960-a4451e175ca6" />



## Tech
- Android Studio, Java, minSDK 24

