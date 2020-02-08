package cs.wcu.edu.weball1.catamountcharacters;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Allows a user to select an image to be displayed from a set list of images.
 *
 * @author Evert Ball
 * @version 20 February 2020
 *
 */
public class SelectImageActivity extends AppCompatActivity {

    /** Button that displays a Catamount */
    private Button btnCat;

    /** Button that displays the alumni tower logo */
    private Button btnTower;

    /** Button that displays the word 'computer' */
    private Button btnComp;

    /** Button that displays the word 'science' */
    private Button btnSci;

    /** Button that displays 'CS467 2020' */
    private Button btnYear;

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
        setContentView(R.layout.activity_select_image);

        // References for each of the buttons
        this.btnCat   = this.findViewById(R.id.btn_cat);
        this.btnTower = this.findViewById(R.id.btn_tower);
        this.btnComp  = this.findViewById(R.id.btn_comp);
        this.btnSci   = this.findViewById(R.id.btn_sci);
        this.btnYear  = this.findViewById(R.id.btn_year);

    } // end onCreate method

    /**
     * Moves user to the DisplaySingleImageActivity based on the button that
     * was pressed.
     *
     * @param view The view element that was selected (i.e the button pressed).
     */
    public void buttonClicked(View view) {

        Intent singleImgActivity = new Intent(this, DisplaySingleImageActivity.class);

        // TODO: Remove magic strings.

        if(view == btnCat) {
            singleImgActivity.putExtra("to_display", "cat");
        } else if (view == btnTower) {
            singleImgActivity.putExtra("to_display", this.btnTower.getText().toString().toLowerCase());
        } else if (view == btnComp) {
            singleImgActivity.putExtra("to_display", this.btnComp.getText().toString().toLowerCase());
        } else if (view == btnSci) {
            singleImgActivity.putExtra("to_display", this.btnSci.getText().toString().toLowerCase());
        } else if (view == btnYear) {
            singleImgActivity.putExtra("to_display", "cs467");
        } // end if statement

        startActivity(singleImgActivity);

    } // end buttonClicked method

} // end SelectImageActivity class
