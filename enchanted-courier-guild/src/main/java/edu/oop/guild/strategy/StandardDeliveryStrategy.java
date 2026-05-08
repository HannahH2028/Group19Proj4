//Hannah Huang
//formula from what I can gather: weight*2 + distance*3 + 3 (+ 5 more if fragile)
//assumed PackageType and RealmType does not affect pricing

package edu.oop.guild.strategy;

import java.util.Objects;
import edu.oop.guild.model.DeliveryRequest;

public class StandardDeliveryStrategy implements DeliveryCostStrategy{
	public int cost; //for the cost
	
	@Override
	public int estimateCoins(DeliveryRequest request) {
		//making sure something is actually passed in
		Objects.requireNonNull(request, "Request cannot be null"); 
		
		//math
		cost = (request.getWeightKg() * 2) + (request.getDistanceLeagues() * 3) + 3;
		//checking if it's fragile, and adding further tax if so
		if(request.isFragile() == true) {
			cost += 5;
		}
		
		//returning the estimated cost
		return cost;
	} //end function
}
