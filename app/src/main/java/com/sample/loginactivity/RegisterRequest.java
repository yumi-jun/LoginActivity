package com.sample.loginactivity;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import android.os.Bundle;

public class RegisterRequest extends StringRequest {

    final static private String URL=" ";//서버 URL설정
    private Map<String, String> map;

    public RegisterRequest(String userID, String userPassword, String userName, String nickName, Response .Listener<String> listener)
    {
        super(Method.POST,URL,listener,null);
        map=new HashMap<>();
        map.put("userID",userID);
        map.put("userPassword",userPassword);
        map.put("userName",userName);
        map.put("nickName",nickName);

    }
    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return map;
    }
}