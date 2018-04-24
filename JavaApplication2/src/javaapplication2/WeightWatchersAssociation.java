/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Mrek
 */
public class WeightWatchersAssociation {
    private double lowestWeightIndex;

    public WeightWatchersAssociation(double indexLimit) {
        this.lowestWeightIndex = indexLimit;
    }
    public boolean isAcceptedAsMember(Person person) {
        if ( person.weightIndex() < this.lowestWeightIndex ) {
            return false;
        }

        return true;
    }

}
