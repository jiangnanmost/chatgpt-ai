package cn.jiangnan.chatbot.api.domain.bibili;

import cn.jiangnan.chatbot.api.domain.bibili.aggregate.UnreplyMessage;

import java.io.IOException;

public interface Ibiapi {
    public UnreplyMessage replyMessage(String cookie) throws IOException;
    //subject_id == oid--type默认为1--mes=“url”--source_id"==root==parent
    public void ReplyMessage(String cookie, long oid, String message,long source_id) throws IOException;
}
