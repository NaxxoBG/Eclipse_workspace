/**
 * ChatSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.4  Built on : Oct 21, 2016 (10:47:34 BST)
 */
package naxxo.skeleton;

import naxxo.Chat;
import naxxo.ReceiveMessageResponse;

/**
 *  ChatSkeleton java skeleton for the axisService
 */
public class ChatSkeleton implements ChatSkeletonInterface {
    /**
     * Auto generated method signature
     *
     * @param receiveMessage0
     * @return receiveMessageResponse1
     */
    public naxxo.ReceiveMessageResponse receiveMessage(naxxo.ReceiveMessage receiveMessage0) {
       ReceiveMessageResponse response = new ReceiveMessageResponse();
       response.set_return(Chat.messages.parallelStream().reduce((a, b) -> a + "\n" + b).orElse(""));
       return response;
    }

    /**
     * Auto generated method signature
     *
     * @param sendMessage2
     * @return
     */
    public void sendMessage(naxxo.SendMessage sendMessage2) {
       Chat.messages.add(sendMessage2.getArgs0());
       System.out.println(Chat.messages.parallelStream().reduce((a, b) -> a + "\n" + b).orElse("No messages"));
    }
}
