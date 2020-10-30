package com.sanofarm.plugin.webdata;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;

public class CordovaPluginWebdata extends CordovaPlugin {

  @Override
  public boolean execute(String action, JSONArray args,
            CallbackContext callbackContext) throws JSONException {
    if ("webdata".equals(action)) {
      callbackContext.success("HelloWorld");
      return true;
    }
  }

}