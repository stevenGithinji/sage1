package com.example.sage;

public class Message {
    private String text;//message body
    private MainActivity.MemberData memberData;// data of the user that sent this message
    private boolean belongsToCurrentUser;// is this message sent by us?

    public Message(String text, MainActivity.MemberData memberData, boolean belongsToCurrentUser){
        this.text=text;
        this.memberData=memberData;
        this.belongsToCurrentUser=belongsToCurrentUser;
    }
    public String getText(){
        return text;
    }
    public MainActivity.MemberData getMemberData(){
        return memberData;
    }
    public boolean isBelongsToCurrentUser(){
        return belongsToCurrentUser;
    }
 }
