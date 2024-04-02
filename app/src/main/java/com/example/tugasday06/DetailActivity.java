package com.example.tugasday06;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView detailImage = findViewById(R.id.detailImage);
        TextView detailTitle = findViewById(R.id.detailTitle);
        TextView detailDescription = findViewById(R.id.detailDescription);
        TextView detailPrice = findViewById(R.id.detailPrice);
        Button btnShare = findViewById(R.id.btnShare);

        int imageResId = getIntent().getIntExtra("gambar_motor", 0);
        String title = getIntent().getStringExtra("nama_motor");
        String description = getIntent().getStringExtra("deskripsi_motor");
        detailDescription.setText(description);
        String price = getIntent().getStringExtra("harga_motor");
        detailImage.setImageResource(imageResId);
        detailTitle.setText(title);
        detailPrice.setText(price);



        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shareContent();
            }
        });
    }

    private void shareContent() {
        String title = getIntent().getStringExtra("nama_motor");
        String price = getIntent().getStringExtra("harga_motor");

        String shareMessage = "nama motor: " + title + "\nharga: " + price;

        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Sharing " + title);
        shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);

        startActivity(Intent.createChooser(shareIntent, "Share via"));
    }

}










