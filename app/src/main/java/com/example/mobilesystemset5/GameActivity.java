package com.example.mobilesystemset5;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.content.Intent;
import android.widget.Button;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    int currentRow, currentCol;

    Button btnUp, btnDown, btnLeft, btnRight;
    TextView tvRoomInfo; // It shows the Room coordintaes in the screen and it updates when the user moved

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        btnUp = findViewById(R.id.btnUp);
        btnDown = findViewById(R.id.btnDown);
        btnLeft = findViewById(R.id.btnLeft);
        btnRight = findViewById(R.id.btnRight);
        tvRoomInfo = findViewById(R.id.tvRoomInfo);

        int[] start = MazeData.findStart(); // that returns the integer array
        currentRow = start[0]; // that's the row
        currentCol = start[1]; // that's the col

        btnUp.setOnClickListener(v -> move(-1, 0));
        btnDown.setOnClickListener(v -> move(1, 0));
        btnLeft.setOnClickListener(v -> move(0, -1));
        btnRight.setOnClickListener(v -> move(0, 1));

        updateRoom();
    }

    protected void move(int rowDelta, int colDelta) {
        currentRow += rowDelta;
        currentCol += colDelta;

        if (MazeData.maze[currentRow][currentCol] == 0) {
            Intent intent = new Intent(this, ResultActivity.class);
            startActivity(intent); // That's open the ResultActivity file's screen so we wrote intent in the startActivity
            finish();
            return;
        }
        updateRoom();
    }

    protected void updateRoom() { // That updates the TextView and shows the coordinates like (1,0) and also it works when the user has moved
        tvRoomInfo.setText("Room (" + currentRow + ", " + currentCol  + ")");

        int roomValue = MazeData.maze[currentRow][currentCol] & ~MazeData.START_MARKER; // that takes the currentRow and currentCol values and cleans the 16 bit

        updateButton(btnUp,    (roomValue & MazeData.UP)    != 0 && currentRow > 0);
        updateButton(btnDown,  (roomValue & MazeData.DOWN)  != 0 && currentRow < MazeData.maze.length - 1);
        updateButton(btnLeft,  (roomValue & MazeData.LEFT)  != 0 && currentCol > 0);
        updateButton(btnRight, (roomValue & MazeData.RIGHT) != 0 && currentCol < MazeData.maze[0].length - 1);
    }

    void updateButton(Button btn, boolean available) {
        if (available) { // if available is true this button will be green and it'll be clickable if not it'll be gray and button it won't be able to click
            btn.setBackgroundColor(Color.GREEN);
            btn.setEnabled(true);
        } else {
            btn.setBackgroundColor(Color.GRAY);
            btn.setEnabled(false);
        }
    }
    }
