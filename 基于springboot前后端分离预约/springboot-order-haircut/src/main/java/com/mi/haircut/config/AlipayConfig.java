package com.mi.haircut.config;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author : Rong
 * @date : 2020/1/25
 * @Desc:
 */


public class AlipayConfig {

 // 应用ID,支付宝提供的APPID，上面截图中有提到
 public static String app_id = "2016101800718136";

 // 商户私钥，您的PKCS8格式RSA2私钥
// public static String merchant_private_key = "这里写入上面生成的**应用私钥**";

 public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCDk0bRf9nf5Og6wxLSZ0h+Vj1IFR3MgkxPQqlR0nmDOJ/cnq4WRTHHIaog5nCP0HPqD+O47rtIGYFsnmDGWrG9rHvczW/GErP+pn6fS31nR2GrTDY1fIXwt5CUXaUb7j6OPrJsw6pf6GGt8fsCHgjBSh+CNcEmJDkiJqMAI50N2sTdji/fxlrcfstTgOSryvKY7LE2kMs3/eSYqnJQerGj42VavkDV0x77Awlv5dpHjFxFoo1jtdlGgaTYKQCbfN6G9Vba3B8bHFlq4ETKVrq0fg70NzMWk/UhFFNuvxG5TpsF6MIp1loaOJbPq70FMMKoiJLZdT9JqlBmRziOKeFBAgMBAAECggEAXw9nyfKaAdXLJrFLhvISARzjd5GyDtBQu68Iz9HF8tVVQjruwa5KUXl0BgMXbgAHzyKdvz3T1zp+NHCUsJpT8hqM/rD6QVu/6Yp2zzXmK1j6Kp2MSMZnqsukzFx/7pcJYRHRLR2MmXA2Kks6s4PphWS9MQEPRDRFhvPtLiuMy7Wq4KFRit0iQViNpL/lk/vIVI7ENTNCJXy5Nx9HOLzLB0dssmeHr0gL3dRKa1ZLGwUBBiv5YXfbzuWS5i17YCMfBUh1OLk9v0bi8Nu7zCBWb1QI9gg5jB7kpaQ1Q6ZI0+G+xn0lH4+MMIGWNP8oEuUGKp8EYXDZfGa6KX9OnXmhlQKBgQC8JyV/gyY7h7iwc3lanmrWYqRiVWMY9dGgwOo/61xM1xRSTZ1fMppmvkCMdEoyzWtwrzgkn+92G9TB2drGYONd6jVlNG/Y2ociR1D8DB5ACJgvnEdv20qsOdACitVIchkRdSXqaD3cp2YVa2vsg2ZPpcqBXiPYe63t4CH+GG0CdwKBgQCzBVAMwVkRQUirpcv6S5D5Ui4oSXs1sh+6g7DUSr61OqiytJv++aM/DvsNJefoSPcZeRLfVfmlfHLzNDJ2FSwJzHopsGw6hyAkzml2BOl39uxzZi6fa+EDXu7rFAYt8EAt9Yqs0tK0dKJ9jLobfH3j/uGQIVmSSf9P7eWPFKuwBwKBgQC1GJywAaR/8d8i/tIUFZxRYrpD51mtgZTWPDh7c2bwkqd9nDTXlxYjxATO63MrOKqr2AqavdG3BYyfVLeM716IW1Ava+wndhZROQFKx8Mp8NvCH5JmqFRUNoTunYAx7ZgRRIdM+i5ovjq0bSOAjuyfxryGDf1Eda5v4aX2Mr5hewKBgDZP91BXXJlSkCSbYX4nbO1nVF+eo4XP67Zfe8d8gc1j5YiKKQW7YR6hgeMkS+56LJWK2QHvCJV/YzSL8n9Gvxyd77Y0MzGyizr/cJmAtgBSZrxAFQcC6LpoE944LgPD7wTCiPcT4x8if6XNiy0JoPwJ+Q8MPyuVzaLHTy0QnWIDAoGACJAQQ7Q6HBr2QXmFEnsdGqoIxoJyPRQShnRlGzve7fjLQAFrxmWZ5kwgB3zbwchivMyI4xIcNgAmkMebA6MrV+DPVsxSqOKg+D39vHURoPLZnLtfmULXAXb1bvKhd/cgFG2sYEHGporb4nqi+D3rUlMulEpRsTjQsTntVZ+SYA4=";

 // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/appDaily.htm 对应APPID下的支付宝公钥。

// public static String alipay_public_key = "注意是上面再三提示的支付宝公钥";

 public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAsNXDiY6rz6YlyI877zLjp+T7RnXpL1zKqGnhIqQxImRv141mELGH71tpuel2tXMHso6aAEYDog8lcw2OJ9CA3gotKaXERQvAIt1FgeQE7BDHKttfdbMP8YshbA9Mqo/wvEEp03GkJun+Vg33W10eXOyKBU+Dw68EPerRf1a9932qM8sSpuAmkB+KU7HKrVBN2Hyk6raVbmoqKjula2wIM/xT/YbYtkdztNJH6vfeflP/IHZpoM/46bYHzMx+I1dq/dnBpFc15f/lGIUxfFpBUlpg0KfPrMDREZIFaSreJmVoCM5wfeQ1q8M+euJPYyboisT1zhAZDBos6uxejmd+aQIDAQAB";

 // 服务器异步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问.如果只是测试使用,那么设置成自己项目启动后可以访问到的一个路径,作为支付宝发送通知的路径(有什么用暂时没发现)
 public static String notify_url = "http://localhost:8080/haircut/alipay/alipay-callback-notify-url";

 // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问.如果只是测试使用,那么设置成自己项目启动后可以访问到的一个路径.是支付正常完成后,会访问的路径.
 public static String return_url = "http://localhost:8080/haircut/alipay/alipay-callback-return-sult";
 // 签名方式，注意这里，如果步骤设置的是RSA则用RSA,如果按照扇面步骤做的话,选择RSA2
 public static String sign_type = "RSA2";
 // 字符编码格式
 public static String charset = "utf-8";
 // 支付宝网关
 public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";



}