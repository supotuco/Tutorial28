package com.diego.tutorial28;

import android.content.Context;
import android.view.MenuItem;
import android.widget.PopupMenu;
import android.widget.Toast;

/**
 * Created by Diego on 3/18/16.
 */
public class PopUpMenuEventHandle implements PopupMenu.OnMenuItemClickListener {
    Context context;

    public PopUpMenuEventHandle(Context context){
        this.context = context;
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_item_admin:
                Toast.makeText(context, "Admin", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_item_user:
                Toast.makeText(context, "User", Toast.LENGTH_SHORT).show();;
                return true;
        }
        return false;
    }
}
