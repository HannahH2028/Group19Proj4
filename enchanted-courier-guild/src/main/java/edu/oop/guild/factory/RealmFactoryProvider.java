//Fady Francis
//AI: Claude
//Strategy: My strategy for designing something like this using AI, is using several tests and making sure that the code is built around the
//the tests, AI has a very hard time forgetting what to do or how to do something if the implementation is built around something else. 
//this strategy is going to be basically the same for all code written by me.
//Prompt: Implement a RealmFactory.java that can allow the implementation of SkyRealmFactory and UndergroundRealmFactory.(never asked it
//to make this specifically but it did and it seemed fine to me). After doing some testing this file gave some errors, so I located the error, and had Gemini Repair the error by 
//getting rid of a specific line and changing the default case.

package edu.oop.guild.factory;

import edu.oop.guild.model.RealmType;
import java.util.Objects;

public class RealmFactoryProvider {

    public RealmFactory forRealm(RealmType realmType) {

        Objects.requireNonNull(realmType);


        if (realmType == RealmType.SKY) {
            return new SkyRealmFactory();
        }

    
        return new UndergroundRealmFactory();
    }
}