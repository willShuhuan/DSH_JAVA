package com.dsh;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import static com.dsh.R.*;

/**
 * @author dongshuhuan
 * date 2020-03-27
 * version
 */
public class MainActivity extends AppCompatActivity {

    @Override public void onCreate(@Nullable Bundle savedInstanceState,
            @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(layout.activity_main);
    }
}
