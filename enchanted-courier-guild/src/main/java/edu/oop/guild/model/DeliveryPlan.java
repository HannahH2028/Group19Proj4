//Fady Francis
//AI: Claude
//Strategy: My strategy for designing something like this using AI, is using several tests and making sure that the code is built around the
//the tests, AI has a very hard time forgetting what to do or how to do something if the implementation is built around something else. 
//this strategy is going to be basically the same for all code written by me.
//Prompt: Based upon the three java files provided to you in the model folder. Specifically, DelieveryPlanTest.java, DeliveryRequestTest.java, 
//and EnumLabelTest.java, generate an implementation of model that is focused on passing all the provided tests. The implemenation, is not
//limited to three files but can be as many as you deem to be most effiecent and safe.

package edu.oop.guild.model;

import edu.oop.guild.creature.Creature;
import java.util.Objects;

public class DeliveryPlan {
    private final DeliveryRequest request;
    private final Creature courier;
    private final String sealedLabel;
    private final int priceInCoins;

    public DeliveryPlan(DeliveryRequest request, Creature courier,
                        String sealedLabel, int priceInCoins) {
        Objects.requireNonNull(request,     "request must not be null");
        Objects.requireNonNull(courier,     "courier must not be null");
        Objects.requireNonNull(sealedLabel, "sealedLabel must not be null");
        if (priceInCoins < 0) throw new IllegalArgumentException("priceInCoins must not be negative");

        this.request      = request;
        this.courier      = courier;
        this.sealedLabel  = sealedLabel;
        this.priceInCoins = priceInCoins;
    }

    public DeliveryRequest getRequest()  { return request; }
    public Creature getCourier()         { return courier; }
    public String getSealedLabel()       { return sealedLabel; }
    public int getPriceInCoins()         { return priceInCoins; }

    public String summary() {
        return courier.name() + " delivers " + sealedLabel + " for " + priceInCoins + " coins";
    }
}

