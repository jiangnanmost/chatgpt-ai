package cn.jiangnan.chatbot.api.domain.service;

import cn.jiangnan.chatbot.api.domain.bibili.Ibiapi;
import cn.jiangnan.chatbot.api.domain.bibili.aggregate.UnreplyMessage;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.io.IOException;
@Service
public class biapi implements Ibiapi {


    private Logger logger = LoggerFactory.getLogger(biapi.class);


    @Override
    public UnreplyMessage replyMessage(String cookie) throws IOException {
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        HttpGet httpGet = new HttpGet("https://api.bilibili.com/x/msgfeed/at?build=0&mobi_app=web");
        httpGet.addHeader("cookie",cookie);
        httpGet.addHeader("Content-Type", "application/json; charset=utf-8");

        CloseableHttpResponse response = httpClient.execute(httpGet);
        if(response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
            String jsonStr = EntityUtils.toString(response.getEntity());
            logger.info("拉取艾特信息",jsonStr);
            UnreplyMessage atres=JSON.parseObject(jsonStr, UnreplyMessage.class);
            return atres;
        }
        else{
            throw new RuntimeException("queryUnAnsweredQuestionsTopicId Err Code is " + response.getStatusLine().getStatusCode());
        }
    }

    @Override
    public void ReplyMessage(String cookie, long oid, String message,long source_id) throws IOException {
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        HttpPost post = new HttpPost("https://api.bilibili.com/x/v2/reply/add");
        post.addHeader("cookie", cookie);
        post.addHeader("Content-Type", "application/x-www-form-urlencoded; charset=utf-8");
        //subject_id == oid--type默认为1--mes=“url”--source_id"==root==parent
        String info = "oid="+oid+"&type=1"+"&message="+message+"&root="+source_id+"&parent="+source_id+"&jsonp=jsonp&scene=msg&plat=1&from=im-reply&build=0&mobi_app=web&csrf_token=07fa9cc046328d52130ee9df39c7963a&csrf=07fa9cc046328d52130ee9df39c7963a";
        StringEntity entity = new StringEntity(info);
        post.setEntity(entity);
        CloseableHttpResponse response = httpClient.execute(post);
        if(response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
            String res = EntityUtils.toString(response.getEntity());
            System.out.println(res);
        }
        else{
            System.out.println(response.getStatusLine().getStatusCode());
        }
    }
}
