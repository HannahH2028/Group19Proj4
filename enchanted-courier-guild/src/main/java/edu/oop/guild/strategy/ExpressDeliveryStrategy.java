//Hannah Huang
//formula: weight*2 + distance*4 + 25 (+ 10 more if fragile)
//assumes PackageType and RealmType has no affect on pricing

package edu.oop.guild.strategy;

import java.util.Objects;
import edu.oop.guild.model.DeliveryRequest;

public class ExpressDeliveryStrategy extends DeliveryCostStrategy{
	public int cost; //for the cost
	
	@Override
	public int estimateCoins(DeliveryRequest request) {
		//making sure request isn't null
		Objects.requireNonNull(request, "Request cannot be null");
		
		//math
		cost = (request.getWeightKg() * 2) + (request.getDistanceLeagues() * 4) + 25;
		//checking if fragile, and adding further tax if so
		if(request.isFragile() == true) {
			cost += 10;
		}
		
		//returning cost
		return cost;
	} //end function
}
