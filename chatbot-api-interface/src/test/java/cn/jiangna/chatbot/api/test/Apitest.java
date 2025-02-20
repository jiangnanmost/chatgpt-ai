package cn.jiangna.chatbot.api.test;

import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClientBuilder;
import org.apache.hc.core5.http.HttpStatus;
import org.apache.hc.core5.http.ParseException;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.http.io.entity.StringEntity;
import org.junit.jupiter.api.Test;

import java.io.IOException;

/**
 * 单元测试
 */
public class Apitest {
        @Test
        public void query_reply() throws IOException, ParseException {
            CloseableHttpClient httpClient = HttpClientBuilder.create().build();
            HttpGet httpGet = new HttpGet("https://api.bilibili.com/x/msgfeed/at?build=0&mobi_app=web");
            httpGet.addHeader("cookie", "buvid_fp_plain=undefined; buvid4=285B8A16-C4A5-F053-954C-E782AEA8C3B763501-022021112-nVDPmcrgLsoCSaWUmu%2FRtQ%3D%3D; header_theme_version=CLOSE; DedeUserID=1712020266; DedeUserID__ckMd5=63f7fc7a3ce1a952; enable_web_push=DISABLE; FEED_LIVE_VERSION=V_WATCHLATER_PIP_WINDOW3; buvid3=4231A3BD-35FF-C0D4-017F-5FDE9ABF14B594729infoc; b_nut=1725029794; _uuid=7876CBE6-2CE9-B188-10BB9-6249E51EC33438842infoc; rpdid=0zbfAHMIiT|2Z9DfsuP|4EO|3w1TCpVa; enable_feed_channel=DISABLE; LIVE_BUVID=AUTO7317380753985954; PVID=1; home_feed_column=5; browser_resolution=1528-738; CURRENT_QUALITY=80; is-2022-channel=1; fingerprint=eb3f34a89e5a0f71584ed1f050bc393d; b_lsid=10E27BB4C_19521221DE1; bili_ticket=eyJhbGciOiJIUzI1NiIsImtpZCI6InMwMyIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3NDAyNzY4MzksImlhdCI6MTc0MDAxNzU3OSwicGx0IjotMX0.ETQK6a_LyxhWjoDtvQurAy3w8tsIm0dEhkXKA1wj08o; bili_ticket_expires=1740276779; SESSDATA=5c7b4d87%2C1755569641%2C8af99%2A22CjAbzgelYQly4CLqJ8zrIRPfpkcAo4gIQBqdBU3VLVvoakeN2mv1Of6CuDDBIQMRZ0QSVlhYMlU5WDFhdWVBemZPd2pQbHRBOWFWSFExcXJUTXRPdGhSVU4tT2k2SktJNnFkYlNxNVJEeXVIXzZ0MHRpclhScWFQWXZfRlY2d1ZoZnBVVFgxM01nIIEC; bili_jct=07fa9cc046328d52130ee9df39c7963a; sid=7ehri4li; CURRENT_FNVAL=4048; buvid_fp=4231A3BD-35FF-C0D4-017F-5FDE9ABF14B594729infoc; bp_t_offset_1712020266=1035860255398952960");
            httpGet.addHeader("Content-Type", "application/json; charset=utf-8");
            CloseableHttpResponse response = httpClient.execute(httpGet);
            if(response.getCode() == HttpStatus.SC_OK) {
                String res = EntityUtils.toString(response.getEntity());
                System.out.println(res);
            }
            else{
                System.out.println(response.getCode());
            }
        }
        @Test
        public void replyto () throws IOException, ParseException {
            CloseableHttpClient httpClient = HttpClientBuilder.create().build();
            HttpPost post = new HttpPost("https://api.bilibili.com/x/v2/reply/add");
            post.addHeader("cookie", "buvid_fp_plain=undefined; buvid4=285B8A16-C4A5-F053-954C-E782AEA8C3B763501-022021112-nVDPmcrgLsoCSaWUmu%2FRtQ%3D%3D; header_theme_version=CLOSE; DedeUserID=1712020266; DedeUserID__ckMd5=63f7fc7a3ce1a952; enable_web_push=DISABLE; FEED_LIVE_VERSION=V_WATCHLATER_PIP_WINDOW3; buvid3=4231A3BD-35FF-C0D4-017F-5FDE9ABF14B594729infoc; b_nut=1725029794; _uuid=7876CBE6-2CE9-B188-10BB9-6249E51EC33438842infoc; rpdid=0zbfAHMIiT|2Z9DfsuP|4EO|3w1TCpVa; enable_feed_channel=DISABLE; LIVE_BUVID=AUTO7317380753985954; PVID=1; bili_ticket=eyJhbGciOiJIUzI1NiIsImtpZCI6InMwMyIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3Mzk5Nzc3OTYsImlhdCI6MTczOTcxODUzNiwicGx0IjotMX0.AbYj2OUxTzko49entYQ-6OZr1v9AS-YAMnEGwV4wPMg; bili_ticket_expires=1739977736; SESSDATA=850cbf5e%2C1755270597%2C816ba%2A22CjB-kMGappZR9Z-0L0LBTwCWrvwfUC_UpN2emKaWr_svKwl1bDP6lDHDQgct4qAAT9YSVjh2VkQzTzNUMWRHU3Q2Wll0bFJDTkxTaHpvV3FJQUZfcFJZTFBoWktkb2NHdkJtVDZDYk42dXBLaGpMN3lHb3ZzTFFXRGhYd1dwdUVFVFh4NDQ0Q2J3IIEC; bili_jct=12764fd10759b1ca4ebe2f0316c4b57b; home_feed_column=5; browser_resolution=1528-738; CURRENT_QUALITY=80; is-2022-channel=1; fingerprint=eb3f34a89e5a0f71584ed1f050bc393d; sid=5h3c2ior; bp_t_offset_1712020266=1035588572947677184; CURRENT_FNVAL=4048; b_lsid=FC1013E53_1951D73B7AD; buvid_fp=4231A3BD-35FF-C0D4-017F-5FDE9ABF14B594729infoc");
            post.addHeader("Content-Type", "application/x-www-form-urlencoded; charset=utf-8");
            String info = "oid=114024721157117&type=1&message=%e4%bd%a0%e5%a5%bd%e5%95%8a%ef%bc%8c%e8%bf%99%e6%98%af%e6%88%91%e7%9a%84%e6%b5%8b%e8%af%95%e6%b6%88%e6%81%af%ef%bc%8c%e7%9b%ae%e5%89%8d%e6%b2%a1%e6%9c%89%e6%8e%a5%e4%b8%8aai&root=255817408384&parent=255817408384&jsonp=jsonp&scene=msg&plat=1&from=im-reply&build=0&mobi_app=web&csrf_token=12764fd10759b1ca4ebe2f0316c4b57b&csrf=12764fd10759b1ca4ebe2f0316c4b57b";
            StringEntity entity = new StringEntity(info);
            post.setEntity(entity);
            CloseableHttpResponse response = httpClient.execute(post);
            if(response.getCode() == HttpStatus.SC_OK) {
                String res = EntityUtils.toString(response.getEntity());
                System.out.println(res);
            }
            else{
                System.out.println(response.getCode());
            }

        }
}
