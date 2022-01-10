package com.mister_chan.keyboard;

import android.inputmethodservice.InputMethodService;
import android.view.View;
import android.widget.Toast;

public class MyKeyboard extends InputMethodService {
    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public View onCreateInputView() {
        return getLayoutInflater().inflate(R.layout.keyboard_view, null);
    }

    public void onKey(View view) {
        Toast.makeText(this, "Hi", Toast.LENGTH_LONG).show();
    }
}
