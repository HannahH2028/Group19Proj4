//Fady Francis
//AI: Claude
//Strategy: My strategy for designing something like this using AI, is using several tests and making sure that the code is built around the
//the tests, AI has a very hard time forgetting what to do or how to do something if the implementation is built around something else. 
//this strategy is going to be basically the same for all code written by me.
//Prompt: Implement a RealmFactory.java that can allow the implementation of SkyRealmFactory and UndergroundRealmFactory.(never asked it
//to make this specifically but it did and it seemed fine to me).

package edu.oop.guild.factory;

import edu.oop.guild.model.RealmType;
import java.util.Objects;

public class RealmFactoryProvider {

    public RealmFactory forRealm(RealmType realmType) {
        Objects.requireNonNull(realmType, "realmType must not be null");
        switch (realmType) {
            case SKY:         return new SkyRealmFactory();
            case UNDERGROUND: return new UndergroundRealmFactory();
            default: throw new IllegalArgumentException("No factory for realm: " + realmType);
        }
    }
}
