//Hannah Huang
//notes from trying to figure out pricing based on tests (Canvas went down and I didn't download the assignment instructions pdf):
//assuming courier and realmType does not have an effect on pricing, as those aren't included in the tests for this
//standard: +5 coins if fragile, weight*2 + distance*3 + 3 (assumes packageType does not affect pricing)
//express: +10 if fragile, weight*2 + distance*4 + 25 (assumes packageType does not affect pricing)
//careful: assumed fragile makes no difference, weight*7 + distance*7 + tax based on packageType (food = 0, potion = 5, artifact = 17)

package edu.oop.guild.strategy;

import edu.oop.guild.model.DeliveryRequest;

//this is basically an interface to base the other strategies on
public interface DeliveryCostStrategy {
	int estimateCoins(DeliveryRequest request);
}
