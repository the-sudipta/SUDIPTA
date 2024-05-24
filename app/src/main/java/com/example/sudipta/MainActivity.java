package com.example.sudipta;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    /*
    * To Give the permission to call someone, go to menifests(in app folder)-> AndriodManid=fest.xml and write
    *<uses-permission android:name="andriod.permission.CALL_PHONE"/>
    * */

    // APK Building
    // Location app
    // pass : sudipta

    private static final int REQUEST_CALL = 1;

    TextView name_textView, juniorDev_textView, address_TextView, phoneNumber_TextView, mail_Textview, kotlin_TextView, java_TextView, c_Textview,
            edu_Degree_TextView1, edu_Degree_TextView2, edu_Degree_TextView3, edu_Degree_TextView4,exp_textView2,exp_textView1;

    ImageView dp_imageView, facebook_imageView, instragram_ImageView, twitter_imageView, github_imageView, technology_imageView, football_imageView,
            games_imageView, app_imageView, music_imageView, travel_imageView;
    public String myMail = "sudipta.kumar020@gmail.com";
    String myFacebook = "https://www.facebook.com/sudipta.kumar.3154/";
    String myInstragram = "https://www.instagram.com/yaarian_roy/";
    String myTwitter = "https://twitter.com/Yaarian_Roy";
    String myGithub = "https://github.com/yaarian-om";
    String myLinkedIn = "https://www.linkedin.com/in/sudipta-kumar-0a7324216/";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        name_textView = findViewById(R.id.name_textView);
        juniorDev_textView = findViewById(R.id.juniorDev_textView);
        address_TextView = findViewById(R.id.address_TextView);
        phoneNumber_TextView = findViewById(R.id.phoneNumber_TextView);
        mail_Textview = findViewById(R.id.mail_Textview);
        kotlin_TextView = findViewById(R.id.kotlin_TextView);
        java_TextView = findViewById(R.id.java_TextView);
        c_Textview = findViewById(R.id.c_Textview);
        edu_Degree_TextView1 = findViewById(R.id.edu_Degree_TextView1);
        edu_Degree_TextView2 = findViewById(R.id.edu_Degree_TextView2);
        edu_Degree_TextView3 = findViewById(R.id.edu_Degree_TextView3);
        edu_Degree_TextView4 = findViewById(R.id.edu_Degree_TextView4);
        exp_textView2 = findViewById(R.id.exp_textView2);
        exp_textView1 = findViewById(R.id.exp_textView1);

        dp_imageView = findViewById(R.id.dp_imageView);
        facebook_imageView = findViewById(R.id.facebook_imageView);
        instragram_ImageView = findViewById(R.id.instragram_ImageView);
        twitter_imageView = findViewById(R.id.twitter_imageView);
        github_imageView = findViewById(R.id.github_imageView);
        technology_imageView = findViewById(R.id.technology_imageView);
        football_imageView = findViewById(R.id.football_imageView);
        games_imageView = findViewById(R.id.games_imageView);
        app_imageView = findViewById(R.id.app_imageView);
        music_imageView = findViewById(R.id.music_imageView);
        travel_imageView = findViewById(R.id.travel_imageView);


        address_TextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoLocation("23.759097,90.422413","17");
            }
        });

        phoneNumber_TextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                phoneCall("01931117419");
            }
        });

        mail_Textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //print("dip.kumar020@gmail.com","long");
                sendMail(myMail,"Hire","Mr. Sudipta Kumar Das. We're hiring you for a job.\n Please reply a mail to receive details ");
            }
        });

        kotlin_TextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://en.wikipedia.org/wiki/Kotlin_(programming_language)");
            }
        });

        java_TextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://en.wikipedia.org/wiki/Java_(programming_language)");
            }
        });

        c_Textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://en.wikipedia.org/wiki/C%2B%2B");
            }
        });

        name_textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                print("Hii & Welcome to my BioData","long");
            }
        });

        juniorDev_textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl(myLinkedIn);
            }
        });

        facebook_imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl(myFacebook);
            }
        });

        instragram_ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl(myInstragram);
            }
        });

        twitter_imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl(myTwitter);
            }
        });

        github_imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl(myGithub);
            }
        });

        technology_imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.preparationtech.com/");
            }
        });

        football_imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                print("Goal Keeper in School team","long");
            }
        });

        games_imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://account.battle.net/details");
            }
        });

        app_imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://github.com/yaarian-om/APK-Collections");
            }
        });

        music_imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.youtube.com/channel/UCBwv6HVmYSYdAZENEGtkw8A");
            }
        });

        travel_imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://steemit.com/travel/@king3071/my-dream-destination-switzerland");
            }
        });

        dp_imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.linkedin.com/in/sudipta-kumar-0a7324216/");
            }
        });

        edu_Degree_TextView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("http://www.mgbhs.edu.bd/");
            }
        });

        edu_Degree_TextView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://imperialcollege.edu.bd/");
            }
        });

        edu_Degree_TextView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://cu.ac.bd/");
            }
        });

        edu_Degree_TextView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.aiub.edu/");
            }
        });

        exp_textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://github.com/yaarian-om/JAR-Collection");
            }
        });

        exp_textView1.setOnClickListener(new View.OnClickListener() {  /// Andriod
            @Override
            public void onClick(View v) {
                gotoUrl("https://github.com/yaarian-om/APK-Collections");
            }
        });

        juniorDev_textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.linkedin.com/in/sudipta-kumar-0a7324216/");
            }
        });



    }







    // click to go to Location // 23.759097,90.422413

    private void gotoLocation(String location, String zoom){
        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("geo: "+location+"?z="+zoom));
        //intent.setPackage("com.google.android.apps.maps")
        startActivity(intent);
    }


    // Click and go to mail

    private void sendMail(String recipient,String subject, String message){
        Intent intent = new Intent(Intent.ACTION_SEND);
        //Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:"+recipient));
        String[] recipients = {recipient};
        intent.putExtra(Intent.EXTRA_EMAIL, recipients); // It Works For Only Lots of emails or String Arrays
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
        intent.putExtra(Intent.EXTRA_TEXT, message);
        intent.setType("message/rfc822"); // it will be turned off if we use SENDTO
        intent.setPackage("com.google.android.gm"); // it will be turned off if we use SENDTO
       startActivity(intent);
    }

    // Click and Call // Call Intent
    private void phoneCall(String number){
        if(ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.CALL_PHONE},REQUEST_CALL);
        }else{
            String dial = "tel:"+number;
            startActivity(new Intent(Intent.ACTION_CALL,Uri.parse(dial)));
        }

    }


    // Click and Go to Url // URL Intent
    private void gotoUrl(String line) {
        Uri uri = Uri.parse(line);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

    // Click to see a toast message
    public void print(String line, String duration){
        duration = duration.toLowerCase();
        if(duration == "long"){
            Toast.makeText(MainActivity.this, line, Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(MainActivity.this, line, Toast.LENGTH_SHORT).show();
        }

    }
}