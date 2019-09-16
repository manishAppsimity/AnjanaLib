package com.dager.toastlibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by root on 16/9/19.
 */

public class ToasterMessager {

    public static void s(Context c, String message){

        Toast.makeText(c,message, Toast.LENGTH_SHORT).show();

    }
}
