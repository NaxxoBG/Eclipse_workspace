import java.util.ArrayList;

public class CD
{
   private String title;
   private ArrayList<CDTrack> trackList;

   public CD(String title) {
      this.title = title;
      trackList = new ArrayList<CDTrack>();
   }

   public void addTrack(CDTrack track) {
      trackList.add(track.copy());
   }

   public String getTitle() {
      return title;
   }

   public Time getDuration() {
      int duration = 0;
      for (int i = 0; i < trackList.size(); i++) {
         CDTrack eachTrack = trackList.get(i);
         duration += eachTrack.getLength().getTimeInSeconds();
      }
      Time total = new Time(duration);
      return total;
   }

   public CDTrack getCDTrack(int trackNumber) {
      return trackList.get(trackNumber - 1).copy();
   }

   public String toString() {
      String line;
      String text = "";
      for(int j = 0; j < trackList.size(); j++){
         line = trackList.get(j).getArtist() + " - " + trackList.get(j).getTitle() + " (" + trackList.get(j).getLength() + ")";
         text = text + "\n" + line;
      }
      return title + "\n" + getDuration() + text;
   }
}