//Hannah Huang
//formula: weight*7 + distance*7 + tax based on PackageType (food = 0, potion = 5, artifact = 17
//assumed RealmType and if fragile does not affect cost

package edu.oop.guild.strategy;

import java.util.Objects;
import edu.oop.guild.model.DeliveryRequest;

public class CarefulDeliveryStrategy implements DeliveryCostStrategy{
	public int cost; //cost to be returned
	
	@Override
	public int estimateCoins(DeliveryRequest request) {
		//making sure request is not null
		Objects.requireNonNull(request, "Request cannot be null");
		
		//base math
		cost = (request.getWeightKg() * 7) + (request.getDistanceLeagues() * 7);
		
		//checking what type of package, and adding on respective tax
		switch(request.getPackageType()) {
			case FOOD:
				break; //just break since food tax = 0
			case POTION:
				cost += 5;
				break;
			case ARTIFACT:
				cost += 17;
				break;
			default:
				throw new IllegalArgumentException("Delivery request must have a valid type");
		} //end switch
		
		//returning found cost
		return cost;
	} //end function
}
