package DoorStatePattern;
public class DoorStayOpen extends DoorState {
    
    public void click(Door door) {
        door.setState(CLOSING);
    }
}