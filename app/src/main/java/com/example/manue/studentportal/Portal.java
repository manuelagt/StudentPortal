package com.example.manue.studentportal;

public class Portal {

    private String mUrlText;
    private String mTitleText;

    public Portal(String mUrlText, String mTitleText){
        this.mUrlText = mUrlText;
        this.mTitleText = mTitleText;
    }

    public String getmUrlText() {
        return mUrlText;
    }

    public void setmUrlText(String mUrlText) {
        this.mUrlText = mUrlText;
    }

    public String getmTitleText() {
        return mTitleText;
    }

    public void setmTitleText(String mTitleText) {
        this.mTitleText = mTitleText;
    }

}
