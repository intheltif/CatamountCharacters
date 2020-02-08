package cs.wcu.edu.weball1.catamountcharacters;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;

/**
 * Displays a single image that corresponds to a user supplied alphanumeric
 * character or a chosen image from the SelectImageActivity screen.
 *
 * @author Evert Ball
 * @version 20 February 2020
 *
 */
public class DisplaySingleImageActivity extends AppCompatActivity {

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
        setContentView(R.layout.activity_display_single_image);

        // Initialize variables and get Intent extras from calling activity
        String to_display = "";
        Bundle extras = getIntent().getExtras();


        // TODO: Remove magic strings.

        // Confirm extras are not null
        if (extras != null) {
            // Get the extras
            to_display = extras.getString("to_display");
        }

        // Find the resource id based on its filename
        int img_id = this.getResources().getIdentifier(
                to_display,
                "drawable",
                this.getPackageName()
        );

        // Get the Drawable resource and ImageView to display it in
        Drawable imgToDisplay = this.getResources().getDrawable(img_id);
        ImageView singleImg = findViewById(R.id.img_single);

        // Display the specified Drawable resource
        singleImg.setImageDrawable(imgToDisplay);
    } // end onCreate method

} // end DisplaySingleImageActivity class
