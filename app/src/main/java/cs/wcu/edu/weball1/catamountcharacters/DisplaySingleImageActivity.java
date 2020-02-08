package cs.wcu.edu.weball1.catamountcharacters;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;

public class DisplaySingleImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_single_image);

        String to_display = "";
        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            // Get the extra
            to_display = extras.getString("to_display");
        }

        int img_id = this.getResources().getIdentifier(
                to_display,
                "drawable",
                this.getPackageName()
        );
        Drawable imgToDisplay = this.getResources().getDrawable(img_id);
        ImageView singleImg = findViewById(R.id.img_single);

        singleImg.setImageDrawable(imgToDisplay);
    }
}
