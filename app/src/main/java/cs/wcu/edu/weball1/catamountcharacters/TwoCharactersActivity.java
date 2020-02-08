package cs.wcu.edu.weball1.catamountcharacters;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class TwoCharactersActivity extends AppCompatActivity {

    private static final String NON_ALPHANUMERIC_ERROR_MSG = "Only single alphanumeric characters allowed.";
    EditText editFirstChar;
    EditText editSecondChar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_characters);

        this.editFirstChar = this.findViewById(R.id.edit_first_char);
        this.editSecondChar = this.findViewById(R.id.edit_sec_char);
    }

    public void goClicked(View v) {
        String firstChar = this.editFirstChar.getText().toString().toLowerCase().trim();
        String secondChar = this.editSecondChar.getText().toString().toLowerCase().trim();
        boolean validInput = isValidInput(firstChar, secondChar);

        if(firstChar.matches("\\d+") && secondChar.matches("\\d+")) {
            firstChar = "num_" + firstChar;
            secondChar = "num_" + secondChar;
        } else if(firstChar.matches("\\d+")) {
            firstChar = "num_" + firstChar;
        } else if(secondChar.matches("\\d+")) {
            secondChar = "num_" + secondChar;
        }

        if(validInput) {
            Intent displayDoubleActivity = new Intent(this, DisplayDoubleImageActivity.class);
            displayDoubleActivity.putExtra("to_display_first", firstChar + "_bl");
            displayDoubleActivity.putExtra("to_display_second", secondChar + "_bl");
            startActivity(displayDoubleActivity);
        } // end if statement
    } // end goClicked method

    private boolean isValidInput(String first, String second) {

        boolean valid = false;
        String alphanumeric = "\\d|\\w";

        if(!first.matches(alphanumeric) || !second.matches(alphanumeric)) {
            Toast.makeText(getApplicationContext(),
                    NON_ALPHANUMERIC_ERROR_MSG,
                    Toast.LENGTH_LONG).show();
        } else {
            valid = true;
        } // end if-else statement

        return valid;
    } // end isValidInput method


} // end TwoCharactersActivity class
