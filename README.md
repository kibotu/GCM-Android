### GCM Test [![Build Status](https://travis-ci.org/kibotu/GCM-Android.svg?branch=master)](https://travis-ci.org/kibotu/GCM-Android)  [![API](https://img.shields.io/badge/API-15%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=15) [![Licence](https://img.shields.io/badge/licence-Apache-blue.svg)](https://raw.githubusercontent.com/kibotu/kibotu/GCM-Android)
-----------


Simple test application to test Google Cloud Messages.

#### How to use

1. Put the [google-services.json](https://developers.google.com/mobile/add?platform=android&cntapi=gcm) into app/ 

2. Trigger a push notification via a http POST using [Postman](https://chrome.google.com/webstore/detail/postman/fhbjgbiflinjbdggehcddcbncdddomop?hl=en) or [Hurl.it](http://www.Hurl.it)
    
        POST https://android.googleapis.com/gcm/send
        
        Header:
        
            Content-Type: application/json
            Authorization: key={{GCM_API_KEY}} 
        
        Body:
        
            {
              "registration_ids": [
                "{{GCM_TOKEN}}"
              ],
              "data": {
                "message": "How are you doing?"
              }
            }
            
               
###License
<pre>
Copyright 2016 Jan Rabe

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
</pre>