package com.example.androidservice;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class MyService extends Service {
    public MyService() {
        Log.e("MS", "Start");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        Bundle bundle = intent.getBundleExtra("student");

        int stuId = bundle.getInt("StuId");
        String stuName = bundle.getString("StuName");
        String stuClass = bundle.getString("Class");

        String content = "Thêm sinh viên thành công. \n Thông tin sinh viên:" + stuId + " " + stuName + "\nLớp" + stuClass;

        Toast.makeText(this, content, Toast.LENGTH_SHORT).show();

        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public IBinder onBind(Intent intent) {
        Log.e("MS", "Start");
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
