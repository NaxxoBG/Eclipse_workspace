package Chapter_4;

import java.util.Scanner;

public class Exercise_3
{
   public static void main(String[] args)
   {
      String firmname;
      String address;
      String phone;
      String fax;
      String website;
      String manager;

      String managerName;
      String surname;
      String phoneNum;

      @SuppressWarnings("resource")
      Scanner in = new Scanner(System.in);

      firmname = in.nextLine();
      address = in.nextLine();
      phone = in.nextLine();
      fax = in.nextLine();
      website = in.nextLine();
      manager = in.nextLine();

      managerName = in.nextLine();
      surname = in.nextLine();
      phoneNum = in.nextLine();

      System.out.printf("Company name: %s\nAddress: %s\nPhone %s\nFax: %s\nWebsite: %s\nManager: %s\nManager name: %s\nSurname: %s\nPhone: %s",
            firmname, address, phone, fax, website, manager, managerName, surname, phoneNum);
   }
}