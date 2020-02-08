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

        int img_id = -1;
        String imgName = null;
        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            imgName = extras.getString("Image");
        }

        img_id = this.getResources().getIdentifier(
                imgName,
                "drawable",
                DisplaySingleImageActivity.this.getPackageName()
        );
        Drawable imgToDisplay = this.getResources().getDrawable(img_id);
        ImageView singleImg = findViewById(R.id.img_single);

        singleImg.setImageDrawable(imgToDisplay);
    }
}
