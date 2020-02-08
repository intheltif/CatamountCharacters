package cs.wcu.edu.weball1.catamountcharacters;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * The main entry point into the application. This screen will act as a splash
 * screen that pauses for a set amount of time and displays the name of the
 * application.
 *
 * @author Evert Ball
 * @version 20 February 2020
 */
public class MainActivity extends AppCompatActivity {

    /** Amount of time the Splash Screen should be delayed by */
    private static final int PAUSE = 5000;

    /** Allows us to delay the screen for a set amount of time */
    private Runnable runner = new Runnable() {
        /**
         * TODO: Finish documentation of this method
         */
        @Override
        public void run() {
            goToNextScreen();
        }
    };

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
        setContentView(R.layout.activity_main);
    }

    /**
     * TODO: Finish documentation of this method
     */
    @Override
    protected void onStart() {
        super.onStart();

        Handler handler = new Handler();
        handler.postDelayed(runner, PAUSE);
    }

    /**
     * TODO: Finish documentation of this method
     */
    private void goToNextScreen() {
        Intent mainMenu = new Intent(this, MainMenuActivity.class);
        this.startActivity(mainMenu);
    }
}
