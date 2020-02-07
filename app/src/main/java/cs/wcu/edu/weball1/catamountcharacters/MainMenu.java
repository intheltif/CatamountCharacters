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
public class MainMenu extends AppCompatActivity {

    private final Button btnOneChar = this.findViewById(R.id.oneCharBtn);

    private final Button btnTwoChars = this.findViewById(R.id.twoCharBtn);

    private final Button btnImg = this.findViewById(R.id.imgBtn);

    private final Button btnInfo = this.findViewById(R.id.infoBtn);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    public void buttonClicked(View view) {

        if(view == btnOneChar) {
            //Do thing
        } else if (view == btnTwoChars) {
            //do thing
        } else if (view == btnImg) {
            //do thing
        } else if (view == btnInfo) {
            Intent info = new Intent(this, AboutDeveloper.class);
            startActivity(info);
        }
    }
}
