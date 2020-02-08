package cs.wcu.edu.weball1.catamountcharacters;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelectImageActivity extends AppCompatActivity {

    private Button btnCat;

    private Button btnTower;

    private Button btnComp;

    private Button btnSci;

    private Button btnYear;

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

    }


    public void buttonClicked(View view) {

        Intent info = new Intent(this, AboutDeveloperActivity.class);

        if(view == btnCat) {
            // put extras
        } else if (view == btnTower) {
            // put extras
        } else if (view == btnComp) {
            // put extras
        } else if (view == btnSci) {
            // put extras
        } else if (view == btnYear) {
            // put extras
        } // end if statement

        startActivity(info);

    } // end buttonClicked method
}
