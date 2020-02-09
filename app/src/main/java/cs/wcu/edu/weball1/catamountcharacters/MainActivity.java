package cs.wcu.edu.weball1.catamountcharacters;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextPaint;
import android.widget.TextView;

/**
 * The main entry point into the application. This screen will act as a splash
 * screen that pauses for a set amount of time and displays the name of the
 * application.
 *
 * @author Evert Ball
 * @version 20 February 2020
 */
public class MainActivity extends AppCompatActivity {

    /** Amount of time the Splash Screen should be displayed */
    private static final int PAUSE = 5000;

    /** Allows us to delay the screen for a set amount of time */
    private Runnable runner = new Runnable() {
        /**
         * TODO: Figure out exactly what having this Runnable object does.
         * Multithreaded method that allows us to go to the Main Menu screen
         * after a set delay.
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
     * Called after onCreate(Bundle) or after onRestart() when the activity has
     * been stopped, but it is now again being displayed to the user. The use in
     * this activity is that it allows us to delay the app by a set amount of
     * time after onCreate(Bundle) has been called.
     */
    @Override
    protected void onStart() {
        super.onStart();

        Handler handler = new Handler();
        handler.postDelayed(runner, PAUSE);
    }

    /**
     * Starts the next activity once this screen finishes displaying.
     */
    private void goToNextScreen() {
        Intent mainMenu = new Intent(this, MainMenuActivity.class);
        this.startActivity(mainMenu);
    }
}
