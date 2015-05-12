package com.example.broadcastreceiverdemo;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class StaticReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {

		Log.i("msg", "Receiver");

		
		if (intent.getAction().equals("com.example.broadcastreceiverdemo.static_broadcastA")) {
			intent.setClass(context, MainActivity.class);
			intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK| Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);
			context.startActivity(intent);
		}else if (intent.getAction().equals("com.example.broadcastreceiverdemo.static_broadcastB")) {
			intent.setClass(context, MainActivity.class);
			intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK| Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);
			context.startActivity(intent);
		}else if (intent.getAction().equals("com.example.broadcastreceiverdemo.static_broadcastC")) {
			intent.setClass(context, MainActivity.class);
			intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK| Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);
			context.startActivity(intent);
		}
		
		/*FLAG_ACTIVITY_NEW_TASK
		 *如果目前背景已經啟動Activity
		  此在呼叫這個已經存在且執行中Activity起來執行
		  若背景中或目前沒有這個Activity
		  則會新啟動Activity
		  */
		
		
		

	}

}