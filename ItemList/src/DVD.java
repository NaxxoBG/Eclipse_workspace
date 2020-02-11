public class DVD extends Item 
{
   private String artist;
   private int year;

   public DVD(String name, String artist, int year) {
      super(name);
      this.artist = artist;
      this.year = year;
   }

   public String getArtist() {
      return artist;
   }

   public int getYear() {
      return year;
   }

   public boolean equals(Object o) {
      if (!(o instanceof DVD)) {
         return false;
      } else {
         DVD other = (DVD) o;
         return getName().equals(other.getName()) && artist.equals(other.artist) && year == other.year;
      }
   }

   public String toString() {
      return "DVD [artist=" + artist + ", year=" + year + "]";
   }
}