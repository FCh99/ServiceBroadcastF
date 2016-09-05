package com.example.faustocheca.servicemyf;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyReceiver extends BroadcastReceiver {
    public MyReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.

        //String numberResult = intent.getStringExtra("numTotal");
        String numberResult = intent.getExtras().getString("numTotal");
        Log.i(">>My receiver", numberResult);

        Intent intent1 = new Intent(context,Main2Activity.class);
        intent1.putExtra("numTotal",numberResult);
        intent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent1);





        //Log.i(">>TAG","received in MyReceiver");





       //throw new UnsupportedOperationException("Not yet implemented");






    }
}
