package io.github.alphadude.language;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by alphadude on 7/9/17.
 */

public class CenterActivity extends AppCompatActivity {

    Button btnIgbo, btnyoruba, btnhausa, btnetsako, btnmaker;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.center_activity);

        btnIgbo = (Button)findViewById(R.id.igbo);
        btnyoruba = (Button)findViewById(R.id.yoruba);
        btnhausa = (Button)findViewById(R.id.hausa);
        btnetsako = (Button)findViewById(R.id.etsako);
        btnmaker = (Button)findViewById(R.id.settings);

        btnIgbo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickIgbo();
            }
        });
        btnyoruba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickyoruba();
            }
        });
        btnhausa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickhausa();
            }
        });
        btnetsako.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicketsako();
            }
        });
        btnmaker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickmaker();
            }
        });

    }

    public void clickIgbo(){
        String name = "IGBO PAGE";
        Intent inigbo = new Intent(this,IgboCat.class);
        inigbo.putExtra("pagename",name);
        startActivity(inigbo);
    }
    public void clickyoruba(){
        String name = "YORUBA PAGE";
        Intent inyo = new Intent(this,YorubaCat.class);
        inyo.putExtra("pagename", name);
        startActivity(inyo);
    }
    public void clickhausa(){
        String name = "HAUSA PAGE";
        Intent inhausa = new Intent(this,HausaCat.class);
        inhausa.putExtra("pagename", name);
        startActivity(inhausa);
    }
    public void clicketsako(){
        String name = "ETSAKO PAGE";
        Intent inetsako = new Intent(this,EtsakoCat.class);
        inetsako.putExtra("pagename", name);
        startActivity(inetsako);
    }
    public void clickmaker(){
        Intent inset = new Intent(this,ProfileActivity.class);
        inset.putExtra("SETTINGS", "SETTINGS");
        startActivity(inset);
    }
}
