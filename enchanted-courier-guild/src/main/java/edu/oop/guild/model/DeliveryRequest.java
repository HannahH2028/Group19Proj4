//Fady Francis
//AI: Claude
//Strategy: My strategy for designing something like this using AI, is using several tests and making sure that the code is built around the
//the tests, AI has a very hard time forgetting what to do or how to do something if the implementation is built around something else. 
//this strategy is going to be basically the same for all code written by me.
//Prompt: Based upon the three java files provided to you in the model folder. Specifically, DelieveryPlanTest.java, DeliveryRequestTest.java, 
//and EnumLabelTest.java, generate an implementation of model that is focused on passing all the provided tests. The implemenation, is not
//limited to three files but can be as many as you deem to be most effiecent and safe.

package edu.oop.guild.model;

import java.util.Objects;

public class DeliveryRequest {
    private final PackageType packageType;
    private final int weightKg;
    private final int distanceLeagues;
    private final RealmType destinationRealm;
    private final boolean fragile;

    public DeliveryRequest(PackageType packageType, int weightKg, int distanceLeagues,
                           RealmType destinationRealm, boolean fragile) {
        Objects.requireNonNull(packageType, "packageType must not be null");
        Objects.requireNonNull(destinationRealm, "destinationRealm must not be null");
        if (weightKg <= 0) throw new IllegalArgumentException("weightKg must be positive");
        if (distanceLeagues <= 0) throw new IllegalArgumentException("distanceLeagues must be positive");

        this.packageType      = packageType;
        this.weightKg         = weightKg;
        this.distanceLeagues  = distanceLeagues;
        this.destinationRealm = destinationRealm;
        this.fragile          = fragile;
    }

    public PackageType getPackageType()    { return packageType; }
    public int getWeightKg()               { return weightKg; }
    public int getDistanceLeagues()        { return distanceLeagues; }
    public RealmType getDestinationRealm() { return destinationRealm; }
    public boolean isFragile()             { return fragile; }
}
