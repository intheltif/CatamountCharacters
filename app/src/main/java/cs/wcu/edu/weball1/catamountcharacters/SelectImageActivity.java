package cs.wcu.edu.weball1.catamountcharacters;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

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

        Intent singleImgActivity = new Intent(this, DisplaySingleImageActivity.class);

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
}
