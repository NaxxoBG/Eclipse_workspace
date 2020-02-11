
public class ApartmentComplex_Test
{
   public static void main(String[] args)
   {
      //Adding apartments
      Apartment ap1 = new Apartment(10);
      Apartment ap2 = new Apartment(20);
      Apartment ap3 = new Apartment(30);
      Apartment ap4 = new Apartment(40);
      //Adding tenants
      Tenant guy1 = new Tenant("Al");
      Tenant guy2 = new Tenant("Bill");
      Tenant guy3 = new Tenant("Clay");
      Tenant guy4 = new Tenant("Dustin");
      //Adding dates
      MyDate date1 = new MyDate();
      MyDate date2 = new MyDate(3,12,2014);
      //Adding an apartment complex
      ApartmentComplex complex = new ApartmentComplex("Finest Street");
      //Adding apartments to complex
      complex.add(ap1);
      complex.add(ap2);
      complex.add(ap3);
      complex.add(ap4);
      //Adding tenants to apartments
      ap1.rentTo(guy1, date1);
      System.out.println(ap1);
      ap2.rentTo(guy4, date2);
      System.out.println(ap2);
      //Printing complex
      System.out.println(complex);
      System.out.println(ap3.isAvailable());
      System.out.println(ap2.isAvailable());
      System.out.println(complex.getFirstAvailableApartment());
      System.out.println(complex.getApartmentByTenant(guy1));
      System.out.println(complex.getApartmentByTenant(guy2));
      System.out.println(complex.getApartmentByTenant(guy3));
      System.out.println(complex.getApartmentByNumber(30));
      System.out.println(complex.getApartment(4));
      System.out.println(complex.getNumberOfApartments());
   }
}