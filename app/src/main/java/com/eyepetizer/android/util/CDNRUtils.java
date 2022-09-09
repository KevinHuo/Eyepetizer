package com.eyepetizer.android.util;

import android.content.Context;

import com.qiniu.cdnr.Client;
import com.qiniu.cdnr.Config;

public class CDNRUtils {

    private static Client sClient;

    public static void init(Context context) {
        sClient = Client.create(context, null, null, new Config());
    }

    public static Client getClient() {
        return sClient;
    }
}
