package BillyCarStatePattern;

public interface CarConstants
{
   CarState NOTSHININGANDFORWARD = new NotShiningAndForward();
   CarState SHININGANDFORWARD = new ShiningAndForward();
   CarState NOTMOVINGANDSHINING = new NotMovingAndShining();
   CarState SHINING = new Shining();
   CarState NOTSHINING = new NotShining();
   CarState BACKWARDSANDSHINING = new BackwardsAndShining();
   CarState STOPANDNOSHINING = new StopShiningAndBackwards();
   CarState SHININGAGAIN = new ShiningAgain();
   CarState NOTSHININGAGAIN = new NotShiningAgain();
   
}
