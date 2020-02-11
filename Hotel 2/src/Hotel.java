import java.util.ArrayList;

public class Hotel
{
   private Room[] hotelRooms;
   private ArrayList<Employee> employees;
   private String name;
   private String address;

   public Hotel(String name, String address, Room[] rooms) {
      this.hotelRooms = rooms;
      this.name = name;
      this.address = address;
      employees = new ArrayList<>();
   }

   public String getName() {
      return name;
   }

   public String getAddress() {
      return address;
   }

   public Room getRoom(int roomNumber) {
      Room room = null;
      for (int i = 0; i < hotelRooms.length; i++) {
         if (hotelRooms[i].getNo() == roomNumber) {
            room = hotelRooms[i];
            return room;
         }
      }
      return room;
   }

   public void hireReceptionist(int number, String name) {
      employees.add(new Receptionist(number, name));
   }

   public void fireEmployee(int number) {
      for (int i = 0; i < employees.size(); i++) {
         if (employees.get(i).getNumber() == number) {
            employees.remove(i);
         }
      }
   }

   public void hireCleaningPerson(int number, String name) {
      employees.add(new CleaningPerson(number, name));
   }

   public CleaningPerson getCleaningPersonForRoom(int roomNumber) {
      for (Employee employee : employees) {
         //first check if employee is a CleaningPerson and then if it contains a room with that number in its rooms list
         if (employee instanceof CleaningPerson && ((CleaningPerson) employee).getRooms().contains(getRoom(roomNumber))) {
            return (CleaningPerson) employee;
         }
      }
      return null;
   }

   public void setCleaningPersonForRoom(int roomNumber, int employeeNumber) {
      //get the Cleaning person with the specified employee number
      for (Employee employee : employees) {
         if (employee instanceof CleaningPerson && employee.getNumber() == employeeNumber) {
            //add the room with the specified room number to the list of rooms of the found employee
            ((CleaningPerson) employee).getRooms().add(getRoom(roomNumber));
         }
      }
   }
}