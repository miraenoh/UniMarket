package com.skkuseteam2.unimarket;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ChatModel {

    public int boardid;
    public String name;
    public String timelog;
    public String text;
    public int  picture;
    public int otherid;

    public ChatModel() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }


    public ChatModel(int boardid,String name ,String text, int picture , int otherid) {
        this.name = name;
        this.boardid = boardid;
        Calendar c = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        this.timelog =   sdf.format(c.getTime());
        this.text = text;
        this.picture = picture;
        this.otherid = otherid;
    }

}
