package com.cbfacademy;
import java.net.URL;
import java.net.URLConnection;
import java.net.MalformedURLException;
import java.io.IOException;


public class ConnectUrl {
   public static void main(String[] args) throws Exception {
    URL cbfUrl = new URL("https://codingblackfemales.com/");
    URLConnection cbfUrlConnection = cbfUrl.openConnection();
    cbfUrlConnection.connect();
    String content = cbfUrlConnection.getContent();
    System.out.println(content);
   }
}
