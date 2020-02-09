package cs.wcu.edu.weball1.catamountcharacters;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Activity where the user is asked to supply two single alphanumeric characters
 * to be displayed as images on the screen by using the characters to find
 * corresponding Drawable resource files.
 *
 * @author Evert Ball
 * @version 20 February 2020
 *
 */
public class TwoCharactersActivity extends AppCompatActivity {

    /** Error message displayed when the user does not enter correct input */
    private static final String NON_ALPHANUMERIC_ERROR_MSG =
            "Only alphanumeric characters allowed.";

    /** The EditText that contains the first character to be displayed. */
    private EditText editFirstChar;

    /** The EditText that contains the second character to be displayed. */
    private EditText editSecondChar;

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
        setContentView(R.layout.activity_two_characters);

        // Initializing fields
        this.editFirstChar = this.findViewById(R.id.edit_first_char);
        this.editSecondChar = this.findViewById(R.id.edit_sec_char);
    } // end onCreate method

    /**
     * Method that calls input validation method and supplies characters to the
     * screen that displays them. If the character is a number, it will prepend
     * 'num_' to the filename so that it can be displayed.
     *
     * @param view The view element that was clicked.
     */
    public void goClicked(View view) {

        // Get the user supplied characters as Strings from their EditTexts
        String firstChar =
                this.editFirstChar.getText().toString().toLowerCase().trim();
        String secondChar =
                this.editSecondChar.getText().toString().toLowerCase().trim();

        // Validate input
        boolean validInput = isValidInput(firstChar, secondChar);


        // TODO: Remove magic strings.

        // Prepend 'num_' to numeric characters so they can be found by filename
        if(firstChar.matches("\\d+") && secondChar.matches("\\d+")) {
            firstChar = "num_" + firstChar;
            secondChar = "num_" + secondChar;
        } else if(firstChar.matches("\\d+")) {
            firstChar = "num_" + firstChar;
        } else if(secondChar.matches("\\d+")) {
            secondChar = "num_" + secondChar;
        }

        // If all input was valid, move to display screen.
        if(validInput) {
            Intent displayDoubleActivity = new Intent(this,
                    DisplayDoubleImageActivity.class);
            displayDoubleActivity.putExtra("to_display_first",
                    firstChar + "_bl");
            displayDoubleActivity.putExtra("to_display_second",
                    secondChar + "_bl");
            startActivity(displayDoubleActivity);
        } // end if statement
    } // end goClicked method

    /**
     * Helper method that validates user input.
     *
     * @param first The user input from the first EditText
     * @param second The user input from the second EditText
     * @return Returns true if user input is a single alphanumeric character,
     *         false otherwise.
     */
    private boolean isValidInput(String first, String second) {

        // TODO: Remove magic strings and make regex a constant
        boolean valid = false;
        String alphanumeric = "\\d|\\w";

        // If non-alphanumeric input found, display a toast with an error msg
        if(first.length() == 0) {
            Toast.makeText(getApplicationContext(),
                    "Please enter a value for the first character.",
                    Toast.LENGTH_LONG).show();
        } else if(second.length() == 0) {
            Toast.makeText(getApplicationContext(),
                    "Please enter a value for the second character.",
                    Toast.LENGTH_LONG).show();
        } else if(!first.matches(alphanumeric) || !second.matches(alphanumeric)) {
            Toast.makeText(getApplicationContext(),
                    NON_ALPHANUMERIC_ERROR_MSG,
                    Toast.LENGTH_LONG).show();
        } else {
            valid = true;
        } // end if-else statement

        return valid;
    } // end isValidInput method


} // end TwoCharactersActivity class
