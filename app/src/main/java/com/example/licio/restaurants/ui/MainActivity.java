package com.example.licio.restaurants.ui;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.licio.restaurants.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    public static final String TAG = MainActivity.class.getSimpleName();
    @BindView(R.id.findRestaurantsButton) Button mFindRestaurantsButton;
    @BindView(R.id.locationEditText) EditText mLocationEditText;
    @BindView(R.id.appNameTextView) TextView mAppNameTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

//        mFindRestaurantsButton = (Button)findViewById(R.id.findRestaurantsButton);
//        mLocationEditText = (EditText)findViewById(R.id.locationEditText);
//        mAppNameTextView = (TextView) findViewById(R.id.appNameTextView);
        Typeface caviarFont = Typeface.createFromAsset(getAssets(), "fonts/CaviarDreams.ttf");
        mAppNameTextView.setTypeface(caviarFont);
        mFindRestaurantsButton.setOnClickListener(this);
        //  mFindRestaurantsButton.setOnClickListener(new View.OnClickListener() {
    }
            @Override
            public void onClick(View v) {
            String location = mLocationEditText.getText().toString();
            Intent intent = new Intent(MainActivity.this, RestaurantsActivity.class);
            intent.putExtra("location", location);
            startActivity(intent);
//                Toast.makeText(MainActivity.this, "Welcome!", Toast.LENGTH_SHORT).show();
                //String location = mLocationEditText.getText().toString();
//                Log.d(TAG,location);
//                Intent intent = new Intent(MainActivity.this,RestaurantsActivity.class);
//                intent.putExtra("location",location);
//                startActivity(intent);
//                 location = mLocationEditText.getText().toString();
                //Toast.makeText(MainActivity.this, location, Toast.LENGTH_LONG).show();
            }
       // });
    }


