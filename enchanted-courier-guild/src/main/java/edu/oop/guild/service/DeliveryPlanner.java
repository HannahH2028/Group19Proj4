//Fady Francis
//AI: Claude
//Strategy: My strategy for designing something like this using AI, is using several tests and making sure that the code is built around the
//the tests, AI has a very hard time forgetting what to do or how to do something if the implementation is built around something else. 
//this strategy is going to be basically the same for all code written by me.
//Prompt: Based upon the provided tests in DeliveryPlannerTest.java implement DeliveryPlanner.java with the focus being on passing all
//provided tests. 

package edu.oop.guild.service;

import edu.oop.guild.creature.Creature;
import edu.oop.guild.factory.RealmFactory;
import edu.oop.guild.log.GuildLog;
import edu.oop.guild.model.DeliveryPlan;
import edu.oop.guild.model.DeliveryRequest;
import edu.oop.guild.seal.PackageSeal;
import edu.oop.guild.strategy.DeliveryCostStrategy;
import java.util.Objects;

public class DeliveryPlanner {

    private final RealmFactory factory;
    private final DeliveryCostStrategy strategy;
    private final GuildLog log;

    public DeliveryPlanner(RealmFactory factory, DeliveryCostStrategy strategy, GuildLog log) {
        Objects.requireNonNull(factory,  "factory must not be null");
        Objects.requireNonNull(strategy, "strategy must not be null");
        Objects.requireNonNull(log,      "log must not be null");
        this.factory  = factory;
        this.strategy = strategy;
        this.log      = log;
    }

    public DeliveryPlan plan(DeliveryRequest request) {
        Objects.requireNonNull(request, "request must not be null");

        Creature courier = factory.createCourier();

        if (!courier.canCarry(request)) {
            throw new IllegalStateException(
                courier.name() + " cannot carry this delivery request");
        }

        PackageSeal seal = factory.createSeal();

        String rawLabel = request.getPackageType().label()
                        + " to "
                        + request.getDestinationRealm().displayName();

        String sealedLabel = seal.apply(rawLabel);

        int price = strategy.estimateCoins(request);

        DeliveryPlan deliveryPlan = new DeliveryPlan(request, courier, sealedLabel, price);

        log.record(deliveryPlan.summary());

        return deliveryPlan;
    }
}
