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

        if(view == btnOneChar) {
            //Do thing
        } else if (view == btnTwoChars) {
            //do thing
        } else if (view == btnImg) {
            //do thing
        } else if (view == btnInfo) {
            Intent info = new Intent(this, AboutDeveloperActivity.class);
            startActivity(info);
        } // end if statement

    } // end buttonClicked method
} // end MainMenuActivity activity
