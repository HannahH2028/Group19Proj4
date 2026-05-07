//Fady Francis
//AI: Claude
//Strategy: My strategy for designing something like this using AI, is using several tests and making sure that the code is built around the
//the tests, AI has a very hard time forgetting what to do or how to do something if the implementation is built around something else. 
//this strategy is going to be basically the same for all code written by me.
//Prompt: Based upon the provided tests that are contained in notificationAdapterTests. I would like you to implement NotificationChannel.java 
//that is going to be able to interface LegacyOwlScroll.java along with an OwlScrollNotificationAdapter.java. Focus on making sure all the files
//are working together smoothly and pass all tests already provided.

package edu.oop.guild.notification;

import edu.oop.guild.model.DeliveryPlan;

public interface NotificationChannel {
    String send(DeliveryPlan plan);
}
