public class Message
{
   private MyDate timestamp;
   private String text;
   private String from;

   public Message(MyDate timestamp, String text, String from) {
      this.timestamp = timestamp;
      this.text = text;
      this.setFrom(from);
   }

   public String toString() {
      return "Message [timestamp=" + timestamp + ", text=" + text + ", from="
            + getFrom() + "]";
   }

   public String getFrom()
   {
      return from;
   }

   public void setFrom(String from)
   {
      this.from = from;
   }
}