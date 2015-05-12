package com.example.broadcastreceiverdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;


public class MainActivity extends Activity {
	TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
   
        
        Intent intent = this.getIntent();
        Log.i("msg",">>>"+intent.getStringExtra("mission"));
        String  broadcastsenderStr="broadcastsender: "+intent.getStringExtra("broadcastreceiver"),
        		broadcastreceiverStr = "broadcastreceiver: "+intent.getStringExtra("broadcastsender"),
        		statusStr = "status: "+intent.getStringExtra("status"),
        		snStr = "sn: "+intent.getStringExtra("sn"),
        		missionStr = "mission: "+intent.getStringExtra("mission");
        
        
        tv = (TextView)findViewById(R.id.tv_sender);
        tv.setText(broadcastsenderStr);
        tv = (TextView)findViewById(R.id.tv_receiver);
        tv.setText(broadcastreceiverStr);
        tv = (TextView)findViewById(R.id.tv_status);
        tv.setText(statusStr);
        tv = (TextView)findViewById(R.id.tv_sn);
        tv.setText(snStr);
        tv = (TextView)findViewById(R.id.tv_mission);
        tv.setText(missionStr);
        
    }


  
}
