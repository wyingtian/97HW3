package cscie97.asn3.housemate.model;

/**
 * Created by ying on 10/17/15.
 */
public class HouseMateModelFactory {

    public static ServiceInterface getInstance(){
        return HouseMateModel.getInstance();
    }
}
