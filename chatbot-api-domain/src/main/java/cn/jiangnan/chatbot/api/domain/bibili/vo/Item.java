package cn.jiangnan.chatbot.api.domain.bibili.vo;

import java.util.List;

public class Item {
    private long id;
    private String type;
    private String business;
    private int businessId;
    private String title;
    private String image;
    private String uri;
    private long subjectId;
    private long rootId;
    private long targetId;
    private long sourceId;
    private String sourceContent;
    private String nativeUri;
    private List<AtDetail> atDetails; // AtDetail 对象列表
    private List<Object> topicDetails; // 可以根据需要更改为具体的类型
    private boolean hideReplyButton;
    private long atTime;

    // Constructor
    public Item(long id, String type, String business, int businessId, String title, String image, String uri,
                long subjectId, long rootId, long targetId, long sourceId, String sourceContent,
                String nativeUri, List<AtDetail> atDetails, List<Object> topicDetails, boolean hideReplyButton, long atTime) {
        this.id = id;
        this.type = type;
        this.business = business;
        this.businessId = businessId;
        this.title = title;
        this.image = image;
        this.uri = uri;
        this.subjectId = subjectId;
        this.rootId = rootId;
        this.targetId = targetId;
        this.sourceId = sourceId;
        this.sourceContent = sourceContent;
        this.nativeUri = nativeUri;
        this.atDetails = atDetails;
        this.topicDetails = topicDetails;
        this.hideReplyButton = hideReplyButton;
        this.atTime = atTime;
    }

    // Getters and Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business;
    }

    public int getBusinessId() {
        return businessId;
    }

    public void setBusinessId(int businessId) {
        this.businessId = businessId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(long subjectId) {
        this.subjectId = subjectId;
    }

    public long getRootId() {
        return rootId;
    }

    public void setRootId(long rootId) {
        this.rootId = rootId;
    }

    public long getTargetId() {
        return targetId;
    }

    public void setTargetId(long targetId) {
        this.targetId = targetId;
    }

    public long getSourceId() {
        return sourceId;
    }

    public void setSourceId(long sourceId) {
        this.sourceId = sourceId;
    }

    public String getSourceContent() {
        return sourceContent;
    }

    public void setSourceContent(String sourceContent) {
        this.sourceContent = sourceContent;
    }

    public String getNativeUri() {
        return nativeUri;
    }

    public void setNativeUri(String nativeUri) {
        this.nativeUri = nativeUri;
    }

    public List<AtDetail> getAtDetails() {
        return atDetails;
    }

    public void setAtDetails(List<AtDetail> atDetails) {
        this.atDetails = atDetails;
    }

    public List<Object> getTopicDetails() {
        return topicDetails;
    }

    public void setTopicDetails(List<Object> topicDetails) {
        this.topicDetails = topicDetails;
    }

    public boolean isHideReplyButton() {
        return hideReplyButton;
    }

    public void setHideReplyButton(boolean hideReplyButton) {
        this.hideReplyButton = hideReplyButton;
    }

    public long getAtTime() {
        return atTime;
    }

    public void setAtTime(long atTime) {
        this.atTime = atTime;
    }
}
