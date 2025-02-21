package cn.jiangnan.chatbot.api.domain.bibili.vo;

public class Cursor {
    private boolean isEnd;
    private long id;
    private long time;

    // Constructor
    public Cursor(boolean isEnd, long id, long time) {
        this.isEnd = isEnd;
        this.id = id;
        this.time = time;
    }

    // Getters and Setters
    public boolean isEnd() {
        return isEnd;
    }

    public void setEnd(boolean end) {
        isEnd = end;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }
}
