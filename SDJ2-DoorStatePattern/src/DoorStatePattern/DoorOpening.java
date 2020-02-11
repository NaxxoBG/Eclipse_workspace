package DoorStatePattern;
public class DoorOpening extends DoorState {
    
    public void click(Door door) {
        door.setState(CLOSING);
    }
    
    public void complete(Door door) {
        door.setState(DoorConstants.OPEN);
    }
}