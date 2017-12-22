package com.yoxiang.voice;

import com.baidu.aip.speech.AipSpeech;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: Rivers
 * Date: 2017/12/22 16:48
 */
public class SpeechTest {

    public static final String APP_ID = "10571995";
    public static final String API_KEY = "MnEgosLO3vAMjFegtM6ltlXQ";
    public static final String SECRET_KEY = "PHZaFe4Hzo55SOk7IGXRTdREOPCWNXNa";


    public static void main(String[] args) {
        // 初始化一个AipSpeech
        AipSpeech client = new AipSpeech(APP_ID, API_KEY, SECRET_KEY);

        // 可选：设置网络连接参数
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);

        // 可选：设置代理服务器地址, http和socket二选一，或者均不设置
//        client.setHttpProxy("proxy_host", proxy_port);  // 设置http代理
//        client.setSocketProxy("proxy_host", proxy_port);  // 设置socket代理

        // 调用接口
        HashMap<String, Object> options = new HashMap<>();
        options.put("lan", "ct");
        JSONObject res = client.asr("/Users/Rivers/Rivers/test1.wav", "wav", 16000, options);
        System.out.println(res.toString(2));
    }
}
