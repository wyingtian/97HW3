package cscie97.asn3.housemate.controller.command.door;

import cscie97.asn3.housemate.controller.command.Command;
import cscie97.asn3.housemate.model.IOTDevices.Door;

/**
 * Created by ying on 10/16/15.
 */
public class DoorCloseCommand implements Command {
    Door theDoor;

    public DoorCloseCommand(Door door) {
        this.theDoor = door;
    }
    @Override
    public void execute() {
        theDoor.setState("close");
    }
}
