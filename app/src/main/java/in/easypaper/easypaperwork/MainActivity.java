package in.easypaper.easypaperwork;


import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
private Button ocr;
    @Override
    public void setContentView(View view) {
        super.setContentView(R.layout.activity_main);

ocr = findViewById(R.id.OCR);

        ocr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, OCR.class));
            }
        });



    }
                    }