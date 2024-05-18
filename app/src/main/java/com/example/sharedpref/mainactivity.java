package com.example.sharedpref;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

package com.example.sharedpregerences;


public class mainactivity extends AppCompatActivity {
    UserSetting userSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userSettings = new UserSetting(this);

        Toast.makeText(this, "email : " + userSettings.getSharePrefEmail() + " , User :" + userSettings.getSharedPrefUser(), Toast.LENGTH_SHORT).show();

    }

}

public class MainActivity extends AppCompatActivity {
    public com.example.sharedpregerences.UserSetting userSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userSettings = new com.example.sharedpregerences.UserSetting(this);

        Toast.makeText(this, "email : " + userSettings.getSharePrefEmail() + " , User :" + userSettings.getSharedPrefUser(), Toast.LENGTH_SHORT).show();

    }

    private class UserSetting {
        public UserSetting(mainactivity mainActivity) {
        }
    }
}