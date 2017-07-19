package io.github.alphadude.language;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Picture;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import static io.github.alphadude.language.R.drawable.alphadude;

/**
 * Created by alphadude on 7/17/17.
 */

public class ProfileActivity extends AppCompatActivity {
    public TextView name,location,github,twittter,instagram;
    ImageView Picutre;

    //public static final String EXTRA_POSITION = "position";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Set Collapsing Toolbar layout to the screen.
        CollapsingToolbarLayout collapsingToolbar =
                (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        // Set title of Detail page
        collapsingToolbar.setTitle(getString(R.string.name));

        name =(TextView)findViewById(R.id.name);
        name.setText(R.string.name);

        location = (TextView)findViewById(R.id.location);
        location.setText(R.string.location);

        github = (TextView)findViewById(R.id.git);
        github.setText(R.string.git);

        twittter =(TextView)findViewById(R.id.twit);
        twittter.setText(R.string.twitter);

        instagram = (TextView)findViewById(R.id.insta);
        instagram.setText(R.string.insta);




    }
}


