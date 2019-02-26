package com.example.licio.restaurants;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
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
        Typeface caviarFont = Typeface.createFromAsset(getAssets(),"fonts/CaviarDreams.ttf");
        mAppNameTextView.setTypeface(caviarFont);
        mFindRestaurantsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "Welcome!", Toast.LENGTH_SHORT).show();
                String location = mLocationEditText.getText().toString();
//                Log.d(TAG,location);
                Intent intent = new Intent(MainActivity.this,RestaurantsActivity.class);
                intent.putExtra("location",location);
                startActivity(intent);
//                 location = mLocationEditText.getText().toString();
                //Toast.makeText(MainActivity.this, location, Toast.LENGTH_LONG).show();
            }
        });
    }
}
