package com.diego.tutorial28;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.widget.PopupMenu;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showPopup(View view){
        PopupMenu popupMenu = new PopupMenu(this, view);
        MenuInflater menuInflater = popupMenu.getMenuInflater();
        menuInflater.inflate(R.menu.my_menu, popupMenu.getMenu());
        PopUpMenuEventHandle eventHandle = new PopUpMenuEventHandle(getApplicationContext());

        popupMenu.setOnMenuItemClickListener(eventHandle);

        popupMenu.show();
    }
}
