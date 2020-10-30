package com.example.plugin;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

public class WebData extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {

        if (action.equals("get")) {
            String str = data.getString(0);//"http://www.google.co.jp/"

            URL url = new URL(str);
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            String input;
            StringBuffer stringBuffer = new StringBuffer();
            while ((input = in.readLine()) != null)
            {
                stringBuffer.append(input);
            }
            in.close();
            String htmlData = stringBuffer.toString();

            callbackContext.success(htmlData);

            return true;

        } else {
            
            return false;

        }
    }
}
