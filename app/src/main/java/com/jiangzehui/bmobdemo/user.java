package com.jiangzehui.bmobdemo;

import cn.bmob.v3.BmobObject;

/**
 * Created by jiangzehui on 17/6/2.
 */
public class user extends BmobObject{
    private String username;
    private String pswd;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPswd() {
        return pswd;
    }

    public void setPswd(String pswd) {
        this.pswd = pswd;
    }

    public user(String username, String pswd) {
        this.username = username;
        this.pswd = pswd;
    }


}
