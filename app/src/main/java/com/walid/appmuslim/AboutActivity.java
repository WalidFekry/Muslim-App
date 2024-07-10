package com.walid.appmuslim;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;


public class AboutActivity extends AppCompatActivity  {

    Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);


        final ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setDisplayHomeAsUpEnabled(true);





        ImageButton button = (ImageButton) findViewById(R.id.fb_btn);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/Waleed.Fikri" )));

            }
        });


        ImageButton imageButton2 = (ImageButton) findViewById(R.id.linkedin_btn);

        imageButton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/ProWalidFekry" )));
            }
        });


        ImageButton imageButton3 = (ImageButton) findViewById(R.id.insta_btn);

        imageButton3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/dev?id=6257553101128037563" )));

            }
        });


        Button buttoon = (Button) findViewById(R.id.follow_btn);

        buttoon.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://sites.google.com/view/appmuslim/home" )));

            }
        });


        TextView websitebutton = (TextView) findViewById(R.id.website_btn);

        websitebutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/groups/440403217380641" )));

            }
        });



        TextView websitwaleed = (TextView) findViewById(R.id.website_btn2);

        websitwaleed.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.co/beu9yzisk9" )));

            }
        });




        TextView websitbutton = (TextView) findViewById(R.id.website_walid);

        websitbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto","prowalidfekry@gmail.com", null));
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "رسالة إلى مطور تطبيق المسلم");
                emailIntent.putExtra(Intent.EXTRA_TEXT, "");
                startActivity(Intent.createChooser(emailIntent, "Send email..."));
            }
        });

        TextView websitbutton00 = (TextView) findViewById(R.id.website_walid2);

        websitbutton00.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/Waleed.Fikri" )));


            }
        });


    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:

                Intent intent = new Intent(AboutActivity.this, MainActivity.class);
                startActivity(intent);

                return true;
        }
        return super.onOptionsItemSelected(item);
    }


    }


/**
 * Created by IronCodes on 11.04.2019.
 * Website : http://ironcodes.tech/
 * "All rights reserved ©2014-©2019"
 */

