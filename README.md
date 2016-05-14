### GCM Test
-----------

Simple test application to test Google Cloud Messages.

#### How to use

1. Put the [google-services.json](https://developers.google.com/mobile/add?platform=android&cntapi=gcm) into app/ 

2. Trigger a push notification via a http POST using [Postman](https://chrome.google.com/webstore/detail/postman/fhbjgbiflinjbdggehcddcbncdddomop?hl=en) or [Hurl.it](Hurl.it)
    
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