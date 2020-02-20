package cs.wcu.edu.weball1.catamountcharacters;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
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
        int orientation = getResources().getConfiguration().orientation;
        Bundle extras = getIntent().getExtras();

        // Check that extras are not null
        if (extras != null) {
            // Check orientation and get extras.
            if(orientation == Configuration.ORIENTATION_PORTRAIT) {
                to_display_first = extras.getString("to_display_first");
                to_display_second = extras.getString("to_display_second");
            } else {
                to_display_first = extras.getString("to_display_first_land");
                to_display_second = extras.getString("to_display_second_land");
            }
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

    @Override
    /**
     * Called by the system when the device configuration changes while the activity is running.
     * At the time this function has been called the resources have to be reloaded to match the new
     * configuration.
     *
     * @param newConfig The new device configuration.
     */
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        String to_display_first = "";
        String to_display_second = "";
        int orientation = getResources().getConfiguration().orientation;
        Bundle extras = getIntent().getExtras();

        // Check that extras are not null
        if (extras != null) {
            // Check orientation and get extras.
            if(orientation == Configuration.ORIENTATION_PORTRAIT) {
                to_display_first = extras.getString("to_display_first");
                to_display_second = extras.getString("to_display_second");
            } else {
                to_display_first = extras.getString("to_display_first_land");
                to_display_second = extras.getString("to_display_second_land");
            }
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
