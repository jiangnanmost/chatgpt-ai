package cn.jiangnan.chatbot.api.domain.bibili.vo;

public class User {
    private long mid;
    private int fans;
    private String nickname;
    private String avatar;
    private String midLink;
    private boolean follow;

    // Constructor
    public User(long mid, int fans, String nickname, String avatar, String midLink, boolean follow) {
        this.mid = mid;
        this.fans = fans;
        this.nickname = nickname;
        this.avatar = avatar;
        this.midLink = midLink;
        this.follow = follow;
    }

    // Getters and Setters
    public long getMid() {
        return mid;
    }

    public void setMid(long mid) {
        this.mid = mid;
    }

    public int getFans() {
        return fans;
    }

    public void setFans(int fans) {
        this.fans = fans;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getMidLink() {
        return midLink;
    }

    public void setMidLink(String midLink) {
        this.midLink = midLink;
    }

    public boolean isFollow() {
        return follow;
    }

    public void setFollow(boolean follow) {
        this.follow = follow;
    }
}
