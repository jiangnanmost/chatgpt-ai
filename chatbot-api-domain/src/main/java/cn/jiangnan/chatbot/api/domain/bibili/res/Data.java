package cn.jiangnan.chatbot.api.domain.bibili.res;

import cn.jiangnan.chatbot.api.domain.bibili.vo.Cursor;
import cn.jiangnan.chatbot.api.domain.bibili.vo.ReplyItem;

import java.util.List;

public class Data {
        private Cursor cursor;
        private List<ReplyItem> items;
        // Constructor
        public Data(Cursor cursor, List<ReplyItem> items) {
            this.cursor = cursor;
            this.items = items;
        }
        // Getters and Setters
        public Cursor getCursor() {
            return cursor;
        }

        public void setCursor(Cursor cursor) {
            this.cursor = cursor;
        }

        public List<ReplyItem> getItems() {
            return items;
        }

        public void setItems(List<ReplyItem> items) {
            this.items = items;
        }
}
