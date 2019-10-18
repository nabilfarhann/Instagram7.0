package com.nabilfarhan.instagram7.Model;

public class Story {

    private String imageurl;
    private long timestart;
    private long timeend;
    private String storyid;
    private String userid;

    public Story(String imageurl, long timestart, long timmeend, String storyid, String userid) {
        this.imageurl = imageurl;
        this.timestart = timestart;
        this.timeend = timmeend;
        this.storyid = storyid;
        this.userid = userid;
    }

    public Story() {
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public long getTimestart() {
        return timestart;
    }

    public void setTimestart(long timestart) {
        this.timestart = timestart;
    }

    public long getTimeend() {
        return timeend;
    }

    public void setTimmeend(long timmeend) {
        this.timeend = timmeend;
    }

    public String getStoryid() {
        return storyid;
    }

    public void setStoryid(String storyid) {
        this.storyid = storyid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }
}
