// featureのparamのvalueで指定したやつ
package com.plugin.webdata;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

public class WebData extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {

        if (action.equals("sayHello")) {
            String name = data.getString(0);
            String message = "Hello, World !!! " + "Hello, " + name;
            callbackContext.success(message);
            return true;
        } else {
            return false;
        }
    }
}
