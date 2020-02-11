import java.util.ArrayList;

public class Inbox
{
   private String inboxName;
   private ArrayList<Message> messages;

   public Inbox(String inboxName) {
      this.setInboxName(inboxName);
      this.messages = new ArrayList<>();
   }

   public Message[] getAllMessages() {
      return (Message[]) messages.toArray();
   }

   public void deleteMessageByOwner(String owner) {
      for (Message message : messages) {
         if(message.getFrom().equals(owner)) {
            messages.remove(message);
         }
      }
   }

   public String getInboxName() {
      return inboxName;
   }

   public void setInboxName(String inboxName) {
      this.inboxName = inboxName;
   }
}