---
title: Advertising SDK Integration
layout: default 
---

Advertising SDK support is available in version 1.3.X and above of the Push Video SDK.

The Push Video SDK provides an adapter class ([PushVideoAdManager](http://incoming-inc.github.io/android-template-app/apidocs-1.3/com/incoming/pvnsdk/PushVideoAdManager.html)) that is implemented for a specific third-part advertising SDK. Once the SDK is configured to use the SDK, as follows, it will be used to display pre-roll advertisiements for the videos.

    PushVideo.initialize(getApplicationContext(), endPoint, projectKey);
    PushVideo.configureAdManager(<PushVideoAdManager implementation>);


Please contact Incoming Media for information regarding the implmentation details of third-party advertising SDK adapters.


