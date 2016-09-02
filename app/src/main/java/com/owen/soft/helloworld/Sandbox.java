package com.owen.soft.helloworld;


import android.os.Bundle;

import java.util.Date;

/**
 * Created by Administrator on 2016/8/13 0013.
 */
public class Sandbox {
    private Date mDate;

    public Sandbox() {
    }

    public Sandbox(Date date) {
        mDate = date;
    }

    private String saySomething(){
        String something = "Something";
        return something;
    }
    private void addName(String name, Bundle bundle ){
        bundle.putString("name_key", name);
    }

    private Date getDate(){
        return  mDate;
    }
    private String methodHello (){
        String greet = "Hello";
        StringBuilder stringBuilder = new StringBuilder();
        for(int nC = 0; nC < 10; nC++){
            stringBuilder.append(greet + nC);
        }
        return stringBuilder.toString();
    }
    private String methodGoodbye (){
        String greet = "Goodbye";
        StringBuilder stringBuilder = new StringBuilder();
        for(int nC = 0; nC < 10; nC++){
            stringBuilder.append(greet + nC);
        }
        return stringBuilder.toString();
    }
}
