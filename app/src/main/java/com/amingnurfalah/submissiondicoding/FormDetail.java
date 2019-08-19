package com.amingnurfalah.submissiondicoding;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class FormDetail extends AppCompatActivity {

    public static final String EXTRA_PHOTO = "animal_photo";
    protected ImageView photo;
    protected TextView detail;
    protected TextView name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_detail);
        name = findViewById(R.id.name);
        photo = findViewById(R.id.photo);
        detail = findViewById(R.id.detail);

        getSupportActionBar().setTitle("Detail");

        final String photoAnimal = getIntent().getStringExtra(EXTRA_PHOTO);
        String namaAnimal = getIntent().getStringExtra("NAME");
        name.setText(namaAnimal);


        Glide.with(this).load(photoAnimal).apply(new RequestOptions().centerCrop()).into(photo);
     String sdetail = getIntent().getStringExtra("DETAIL");
     detail.setText(sdetail);




    }
}
