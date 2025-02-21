package cn.jiangnan.chatbot.api.domain.bibili.vo;

public class ReplyItem {
    private long id;
    private User user; // User 对象
    private Item item; // Item 对象
    private long atTime;

    // Constructor
    public ReplyItem(long id, User user, Item item, long atTime) {
        this.id = id;
        this.user = user;
        this.item = item;
        this.atTime = atTime;
    }

    // Getters and Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public long getAtTime() {
        return atTime;
    }

    public void setAtTime(long atTime) {
        this.atTime = atTime;
    }
}
