# cordova-plugin-referrer

This simple plugin stores the referrer value under Shared Preferences passed when an Android Application is installed from a URL containing a Referral Value.


Installing
---

From the repo:

	$ cordova plugin add https://github.com/vijayrajasekaran/cordova-plugin-referrer


How To Retrieve the Referrer Value
---

You can retrieve the referral value from Shared Preferences, preferably using App preferences plugin for cordova from https://github.com/apla/me.apla.cordova.app-preferences

```javascript

function ok (value) { console.log(value); }
function fail (error) { console.log(error); }

var prefs = plugins.appPreferences;
prefs.fetch (ok, fail, 'referrer');

```

