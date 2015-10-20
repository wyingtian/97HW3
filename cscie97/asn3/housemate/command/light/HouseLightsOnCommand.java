package cscie97.asn3.housemate.command.light;

import cscie97.asn3.housemate.command.Command;
import cscie97.asn3.housemate.model.IOTDevices.Appliance;
import cscie97.asn3.housemate.component.ServiceInterface;

/**
 * Created by ying on 10/19/15.
 */
public class HouseLightsOnCommand implements Command {
    String houseName;
    ServiceInterface model;
    String authToken;
    public HouseLightsOnCommand(ServiceInterface model, String houseName, String authToken) {
        this.model = model;
        this.houseName = houseName;
        this.authToken = authToken;
    }


    @Override
    public void execute() {
        for(Appliance light :model.findApplianceInHouse(houseName, "light", authToken)){
            light.changeStatus("power","on");
        }
    }
}
