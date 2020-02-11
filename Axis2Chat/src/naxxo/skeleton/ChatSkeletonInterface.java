/**
 * ChatSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.4  Built on : Oct 21, 2016 (10:47:34 BST)
 */
package naxxo.skeleton;

/**
 *  ChatSkeletonInterface java skeleton interface for the axisService
 */
public interface ChatSkeletonInterface {
    /**
     * Auto generated method signature
     *
     * @param receiveMessage
     */
    public naxxo.ReceiveMessageResponse receiveMessage(
        naxxo.ReceiveMessage receiveMessage);

    /**
     * Auto generated method signature
     *
     * @param sendMessage
     */
    public void sendMessage(naxxo.SendMessage sendMessage);
}
