package com.example.androidhw22;

import androidx.appcompat.app.AppCompatActivity;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView=findViewById(R.id.textview);
        ConnectivityManager mConnectivityManager = (ConnectivityManager) getSystemService(MainActivity.this.CONNECTIVITY_SERVICE);
        NetworkInfo mNetworkInfo = mConnectivityManager.getActiveNetworkInfo();
            if(mNetworkInfo!=null){
                if(mNetworkInfo.getTypeName().equals("WIFI")){
                    textView.setText(mNetworkInfo.getTypeName()+"~");
                }
                else if(mNetworkInfo.getTypeName().equals("MOBILE")){
                    textView.setText("基地台~");
                }

        }
    }
}
