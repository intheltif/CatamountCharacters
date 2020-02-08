package cs.wcu.edu.weball1.catamountcharacters;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class OneCharacterActivity extends AppCompatActivity {

    EditText editOneChar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_character);

        this.editOneChar = this.findViewById(R.id.edit_one_char);
    }

    public void goBtnClicked(View v) {
        String character = this.editOneChar.getText().toString().toLowerCase().trim();
        if(character.length() > 1) {
            Toast.makeText(getApplicationContext(),
                    "Only 1 alphanumeric character allowed. You entered: " + character,
                    Toast.LENGTH_LONG).show();
            return;
        } else if(character.matches("\\d+")) {
            character = "num_" + character;
        }
        Intent displaySingleActivity = new Intent(this, DisplaySingleImageActivity.class);
        displaySingleActivity.putExtra("to_display", character + "_bl");
        startActivity(displaySingleActivity);
    }

}
