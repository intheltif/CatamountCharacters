package cs.wcu.edu.weball1.catamountcharacters;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Activity where the user is asked to supply a single character to be displayed
 * as an image on the screen.
 *
 * @author Evert Ball
 * @version 20 February 2020
 *
 */
public class OneCharacterActivity extends AppCompatActivity {

    private static final String NON_ALPHANUMERIC_ERROR_MSG = "Only single alphanumeric characters allowed.";
    EditText editOneChar;

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
        setContentView(R.layout.activity_one_character);

        this.editOneChar = this.findViewById(R.id.edit_one_char);
    }

    /**
     * The action that is performed upon the user clicking the 'Go >' button on
     * the OneCharacterActivity screen.
     * @param view The element that has been clicked. Not used in this function,
     *             but is required by parent class.
     */
    public void goBtnClicked(View view) {

        String character = this.editOneChar.getText().toString().toLowerCase().trim();
        boolean valid = isValidInput(character);

        if(character.matches("\\d")) {
            character = "num_" + character;
        }

        if(valid) {
            Intent displaySingleActivity = new Intent(this, DisplaySingleImageActivity.class);
            displaySingleActivity.putExtra("to_display", character + "_bl");
            startActivity(displaySingleActivity);
        } // end if statement
    } // end goBtnClicked method

    /**
     * Helper method that validates user input.
     *
     * @param input The user input from the EditText
     * @return Returns true if user input is a single alphanumeric character,
     *         false otherwise.
     */
    private boolean isValidInput(String input) {

        boolean valid = false;
        String alphanumeric = "\\d|\\w";

        if(!input.matches(alphanumeric)) {
            Toast.makeText(getApplicationContext(),
                    NON_ALPHANUMERIC_ERROR_MSG,
                    Toast.LENGTH_LONG).show();
        } else {
            valid = true;
        } // end if-else statement

        return valid;
    } // end isValidInput method

} // end OneCharacterActivity class
