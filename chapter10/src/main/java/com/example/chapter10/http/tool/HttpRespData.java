package com.example.chapter10.http.tool;

import android.graphics.Bitmap;

public class HttpRespData {
    public String content;
    public Bitmap bitmap;
    public String cookie;
    public String err_msg;

    public HttpRespData(){
        content="";
        bitmap=null;
        cookie="";
        err_msg="";
    }


}
