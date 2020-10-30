# Cordova WebData Plugin

you can use this plugin to get url data (html)

## Using

Create a new Cordova Project

    $ cordova create webdata com.example.webdataapp WebData
    
Install the plugin

    $ cd webdata
    $ cordova plugin add https://github.com/kzmiyamura/cordova-plugin-webdata
    

Edit `www/js/index.js` and add the following code inside `onDeviceReady`

```js
    var success = function(message) {
        alert(message);
    }

    var failure = function() {
        alert("Error calling WebData Plugin");
    }

    WebData.get("https://www.google.co.jp", success, failure);
```

Install iOS or Android platform

    cordova platform add ios
    cordova platform add android
    
Run the code

    cordova run 

