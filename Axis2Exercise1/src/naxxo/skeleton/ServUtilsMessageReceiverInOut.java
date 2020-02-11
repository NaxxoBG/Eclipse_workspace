/**
 * ServUtilsMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.4  Built on : Oct 21, 2016 (10:47:34 BST)
 */
package naxxo.skeleton;


/**
 *  ServUtilsMessageReceiverInOut message receiver
 */
public class ServUtilsMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver {
    public void invokeBusinessLogic(
        org.apache.axis2.context.MessageContext msgContext,
        org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault {
        try {
            // get the implementation class for the Web Service
            Object obj = getTheImplementationObject(msgContext);

            ServUtilsSkeletonInterface skel = (ServUtilsSkeletonInterface) obj;

            //Out Envelop
            org.apache.axiom.soap.SOAPEnvelope envelope = null;

            //Find the axisOperation that has been set by the Dispatch phase.
            org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext()
                                                                      .getAxisOperation();

            if (op == null) {
                throw new org.apache.axis2.AxisFault(
                    "Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
            }

            java.lang.String methodName;

            if ((op.getName() != null) &&
                    ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(
                            op.getName().getLocalPart())) != null)) {
                if ("averageOfThree".equals(methodName)) {
                    naxxo.AverageOfThreeResponse averageOfThreeResponse25 = null;
                    naxxo.AverageOfThree wrappedParam = (naxxo.AverageOfThree) fromOM(msgContext.getEnvelope()
                                                                                                .getBody()
                                                                                                .getFirstElement(),
                            naxxo.AverageOfThree.class);

                    averageOfThreeResponse25 = skel.averageOfThree(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            averageOfThreeResponse25, false,
                            new javax.xml.namespace.QName("http://naxxo",
                                "averageOfThreeResponse"));
                } else
                 if ("reverse".equals(methodName)) {
                    naxxo.ReverseResponse reverseResponse27 = null;
                    naxxo.Reverse wrappedParam = (naxxo.Reverse) fromOM(msgContext.getEnvelope()
                                                                                  .getBody()
                                                                                  .getFirstElement(),
                            naxxo.Reverse.class);

                    reverseResponse27 = skel.reverse(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            reverseResponse27, false,
                            new javax.xml.namespace.QName("http://naxxo",
                                "reverseResponse"));
                } else
                 if ("averageOfTwo".equals(methodName)) {
                    naxxo.AverageOfTwoResponse averageOfTwoResponse29 = null;
                    naxxo.AverageOfTwo wrappedParam = (naxxo.AverageOfTwo) fromOM(msgContext.getEnvelope()
                                                                                            .getBody()
                                                                                            .getFirstElement(),
                            naxxo.AverageOfTwo.class);

                    averageOfTwoResponse29 = skel.averageOfTwo(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            averageOfTwoResponse29, false,
                            new javax.xml.namespace.QName("http://naxxo",
                                "averageOfTwoResponse"));
                } else
                 if ("isLeapYear".equals(methodName)) {
                    naxxo.IsLeapYearResponse isLeapYearResponse31 = null;
                    naxxo.IsLeapYear wrappedParam = (naxxo.IsLeapYear) fromOM(msgContext.getEnvelope()
                                                                                        .getBody()
                                                                                        .getFirstElement(),
                            naxxo.IsLeapYear.class);

                    isLeapYearResponse31 = skel.isLeapYear(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            isLeapYearResponse31, false,
                            new javax.xml.namespace.QName("http://naxxo",
                                "isLeapYearResponse"));
                } else {
                    throw new java.lang.RuntimeException("method not found");
                }

                newMsgContext.setEnvelope(envelope);
            }
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    //
    private org.apache.axiom.om.OMElement toOM(naxxo.AverageOfThree param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(naxxo.AverageOfThree.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        naxxo.AverageOfThreeResponse param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(naxxo.AverageOfThreeResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(naxxo.Reverse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(naxxo.Reverse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(naxxo.ReverseResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(naxxo.ReverseResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(naxxo.AverageOfTwo param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(naxxo.AverageOfTwo.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        naxxo.AverageOfTwoResponse param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(naxxo.AverageOfTwoResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(naxxo.IsLeapYear param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(naxxo.IsLeapYear.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(naxxo.IsLeapYearResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(naxxo.IsLeapYearResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        naxxo.AverageOfThreeResponse param, boolean optimizeContent,
        javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    naxxo.AverageOfThreeResponse.MY_QNAME, factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private naxxo.AverageOfThreeResponse wrapaverageOfThree() {
        naxxo.AverageOfThreeResponse wrappedElement = new naxxo.AverageOfThreeResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory, naxxo.ReverseResponse param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    naxxo.ReverseResponse.MY_QNAME, factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private naxxo.ReverseResponse wrapreverse() {
        naxxo.ReverseResponse wrappedElement = new naxxo.ReverseResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        naxxo.AverageOfTwoResponse param, boolean optimizeContent,
        javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    naxxo.AverageOfTwoResponse.MY_QNAME, factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private naxxo.AverageOfTwoResponse wrapaverageOfTwo() {
        naxxo.AverageOfTwoResponse wrappedElement = new naxxo.AverageOfTwoResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        naxxo.IsLeapYearResponse param, boolean optimizeContent,
        javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    naxxo.IsLeapYearResponse.MY_QNAME, factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private naxxo.IsLeapYearResponse wrapisLeapYear() {
        naxxo.IsLeapYearResponse wrappedElement = new naxxo.IsLeapYearResponse();

        return wrappedElement;
    }

    /**
     *  get the default envelope
     */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory) {
        return factory.getDefaultEnvelope();
    }

    private java.lang.Object fromOM(org.apache.axiom.om.OMElement param,
        java.lang.Class type) throws org.apache.axis2.AxisFault {
        try {
            if (naxxo.AverageOfThree.class.equals(type)) {
                return naxxo.AverageOfThree.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (naxxo.AverageOfThreeResponse.class.equals(type)) {
                return naxxo.AverageOfThreeResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (naxxo.AverageOfTwo.class.equals(type)) {
                return naxxo.AverageOfTwo.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (naxxo.AverageOfTwoResponse.class.equals(type)) {
                return naxxo.AverageOfTwoResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (naxxo.IsLeapYear.class.equals(type)) {
                return naxxo.IsLeapYear.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (naxxo.IsLeapYearResponse.class.equals(type)) {
                return naxxo.IsLeapYearResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (naxxo.Reverse.class.equals(type)) {
                return naxxo.Reverse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (naxxo.ReverseResponse.class.equals(type)) {
                return naxxo.ReverseResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

        return null;
    }

    private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();

        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }
} //end of class
