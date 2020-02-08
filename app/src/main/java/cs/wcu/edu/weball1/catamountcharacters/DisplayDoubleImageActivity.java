package cs.wcu.edu.weball1.catamountcharacters;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Displays two images that correspond to user supplied alphanumeric characters.
 * The point is to be able to read the characters from a distance when multiple
 * devices are held next to one another to spell out a word/phrase/sentence/etc.
 *
 * @author Evert Ball
 * @version 20 February 2020
 *
 */
public class DisplayDoubleImageActivity extends AppCompatActivity {

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
        setContentView(R.layout.activity_display_double_image);

        // Initialize needed variables and get extras from previous activity
        String to_display_first = "";
        String to_display_second = "";
        Bundle extras = getIntent().getExtras();

        //TODO: Remove magic strings.

        // Check that extras are not null
        if (extras != null) {
            // Get the extras
            to_display_first = extras.getString("to_display_first");
            to_display_second = extras.getString("to_display_second");
        }

        // Find the id of the first Drawable resource by its filename
        int img_id_first = this.getResources().getIdentifier(
                 to_display_first,
                "drawable",
                this.getPackageName()
        );

        // Find the id of the second Drawable resource by its filename
        int img_id_second = this.getResources().getIdentifier(
                to_display_second,
                "drawable",
                this.getPackageName()
        );

        // Get references to the drawable resources and their ImageViews
        Drawable first_img = this.getResources().getDrawable(img_id_first);
        Drawable second_img = this.getResources().getDrawable(img_id_second);
        ImageView img_first = findViewById(R.id.img_first_char);
        ImageView img_second = findViewById(R.id.img_second_char);

        //Display the Drawables on the screen
        img_first.setImageDrawable(first_img);
        img_second.setImageDrawable(second_img);
    }
}
