package cs.wcu.edu.weball1.catamountcharacters;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

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

        String to_display_first = "";
        String to_display_second = "";
        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            // Get the extra
            to_display_first = extras.getString("to_display_first");
            to_display_second = extras.getString("to_display_second");
        }

        int img_id_first = this.getResources().getIdentifier(
                 to_display_first,
                "drawable",
                this.getPackageName()
        );

        int img_id_second = this.getResources().getIdentifier(
                to_display_second,
                "drawable",
                this.getPackageName()
        );

        if(img_id_first == 0 || img_id_second == 0) {
            Toast.makeText(getApplicationContext(), "id was 0", Toast.LENGTH_LONG).show();
        }

        Drawable first_img = this.getResources().getDrawable(img_id_first);
        Drawable second_img = this.getResources().getDrawable(img_id_second);
        ImageView img_first = findViewById(R.id.img_first_char);
        ImageView img_second = findViewById(R.id.img_second_char);

        img_first.setImageDrawable(first_img);
        img_second.setImageDrawable(second_img);
    }
}
