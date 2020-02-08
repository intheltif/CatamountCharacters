package cs.wcu.edu.weball1.catamountcharacters;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * The main menu of the application. Displays after the splash screen.
 *
 * @author Evert Ball
 * @version 20 February 2020
 */
public class MainMenuActivity extends AppCompatActivity {

    private Button btnOneChar;

    private Button btnTwoChars;

    private Button btnImg;

    private Button btnInfo;

    /**
     * Called when the activity is starting. All initialization is done within
     * this method, as well as programmatically retrieving UI elements.
     *
     * @param savedInstanceState If the activity is being re-initialized after
     *                           previously being shut down then this Bundle
     *                           contains the data it most recently supplied in
     *                           onSaveInstanceState(Bundle).
     *                           This value may be null.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        this.btnOneChar = this.findViewById(R.id.oneCharacterBtn);

        this.btnTwoChars = this.findViewById(R.id.twoCharBtn);

        this.btnImg = this.findViewById(R.id.imgBtn);

        this.btnInfo = this.findViewById(R.id.infoBtn);
    } // end onCreate activity

    public void buttonClicked(View view) {

        Intent nextActivity = null;

        while(nextActivity == null) {
            if (view == btnOneChar) {
                nextActivity = new Intent(this, OneCharacterActivity.class);
            } else if (view == btnTwoChars) {
                nextActivity = new Intent(this, TwoCharactersActivity.class);
            } else if (view == btnImg) {
                nextActivity = new Intent(this, SelectImageActivity.class);
            } else if (view == btnInfo) {
                nextActivity = new Intent(this, AboutDeveloperActivity.class);
            } // end if statement
        }
        startActivity(nextActivity);

    } // end buttonClicked method
} // end MainMenuActivity activity
