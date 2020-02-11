import java.util.ArrayList;

public class Club_Test
{
   public static void main(String[] args)
   {
      ArrayList<ClubMember> members = new ArrayList<>();

      ClubMember member1 = new Junior("Bill", 15, 'm');
      ClubMember member2 = new Senior("Sarah", 45, 'f');
      ClubMember member3 = new OldBoys("Dave", 50, 7);

      members.add(member1);
      members.add(member2);
      members.add(member3);

      System.out.println(member1);
      System.out.println(member2);
      System.out.println(member3);

      System.out.println(members);
   }
}