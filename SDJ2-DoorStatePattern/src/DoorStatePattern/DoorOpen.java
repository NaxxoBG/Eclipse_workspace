package DoorStatePattern;
public class DoorOpen extends DoorState {
    
    public void click(Door door) {
        door.setState(STAYOPEN);
    }
    
    public void timeout(Door door) {
        door.setState(DoorConstants.CLOSING);
    }
}