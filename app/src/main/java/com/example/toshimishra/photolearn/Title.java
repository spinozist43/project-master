package com.example.toshimishra.photolearn;

import  java.util.*;
/**
 * Created by toshimishra on 06/03/18.
 */

public abstract  class Title {

    private String userID;
    private String title;
    private Integer sessionID;
    private Date timeStamp;

    public String getUserID() {
        return userID;
    }

    public String getTitle() {
        return title;
    }

    public Integer getSessionID() {
        return sessionID;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public Title(){

    }
    public  Title(String userID,String title,Integer sessionID){
        this.userID = userID;
        this.title = title;
        this.sessionID = sessionID;
        // TODO : set timestamp and ID
    }



}
