/**
 * ServUtilsStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.4  Built on : Oct 21, 2016 (10:47:34 BST)
 */
package naxxo.stub;


/*
 *  ServUtilsStub java implementation
 */
public class ServUtilsStub extends org.apache.axis2.client.Stub {
   private static int counter = 0;
   protected org.apache.axis2.description.AxisOperation[] _operations;

   //hashmaps to keep the fault mapping
   private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
   private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
   private java.util.HashMap faultMessageMap = new java.util.HashMap();
   private javax.xml.namespace.QName[] opNameArray = null;

   /**
    *Constructor that takes in a configContext
    */
   public ServUtilsStub(
         org.apache.axis2.context.ConfigurationContext configurationContext,
         java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
      this(configurationContext, targetEndpoint, false);
   }

   /**
    * Constructor that takes in a configContext  and useseperate listner
    */
   public ServUtilsStub(
         org.apache.axis2.context.ConfigurationContext configurationContext,
         java.lang.String targetEndpoint, boolean useSeparateListener)
               throws org.apache.axis2.AxisFault {
      //To populate AxisService
      populateAxisService();
      populateFaults();

      _serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext,
            _service);

      _serviceClient.getOptions()
      .setTo(new org.apache.axis2.addressing.EndpointReference(
            targetEndpoint));
      _serviceClient.getOptions().setUseSeparateListener(useSeparateListener);

      //Set the soap version
      _serviceClient.getOptions()
      .setSoapVersionURI(org.apache.axiom.soap.SOAP12Constants.SOAP_ENVELOPE_NAMESPACE_URI);
   }

   /**
    * Default Constructor
    */
   public ServUtilsStub(
         org.apache.axis2.context.ConfigurationContext configurationContext)
               throws org.apache.axis2.AxisFault {
      this(configurationContext,
            "http://localhost:8080/axis2/services/ServUtils");
   }

   /**
    * Default Constructor
    */
   public ServUtilsStub() throws org.apache.axis2.AxisFault {
      this("http://localhost:8080/axis2/services/ServUtils");
   }

   /**
    * Constructor taking the target endpoint
    */
   public ServUtilsStub(java.lang.String targetEndpoint)
         throws org.apache.axis2.AxisFault {
      this(null, targetEndpoint);
   }

   private static synchronized java.lang.String getUniqueSuffix() {
      // reset the counter if it is greater than 99999
      if (counter > 99999) {
         counter = 0;
      }

      counter = counter + 1;

      return java.lang.Long.toString(java.lang.System.currentTimeMillis()) +
            "_" + counter;
   }

   private void populateAxisService() throws org.apache.axis2.AxisFault {
      //creating the Service with a unique name
      _service = new org.apache.axis2.description.AxisService("ServUtils" +
            getUniqueSuffix());
      addAnonymousOperations();

      //creating the operations
      org.apache.axis2.description.AxisOperation __operation;

      _operations = new org.apache.axis2.description.AxisOperation[4];

      __operation = new org.apache.axis2.description.OutInAxisOperation();

      __operation.setName(new javax.xml.namespace.QName("http://naxxo",
            "averageOfThree"));
      _service.addOperation(__operation);

      _operations[0] = __operation;

      __operation = new org.apache.axis2.description.OutInAxisOperation();

      __operation.setName(new javax.xml.namespace.QName("http://naxxo",
            "reverse"));
      _service.addOperation(__operation);

      _operations[1] = __operation;

      __operation = new org.apache.axis2.description.OutInAxisOperation();

      __operation.setName(new javax.xml.namespace.QName("http://naxxo",
            "averageOfTwo"));
      _service.addOperation(__operation);

      _operations[2] = __operation;

      __operation = new org.apache.axis2.description.OutInAxisOperation();

      __operation.setName(new javax.xml.namespace.QName("http://naxxo",
            "isLeapYear"));
      _service.addOperation(__operation);

      _operations[3] = __operation;
   }

   //populates the faults
   private void populateFaults() {
   }

   /**
    * Auto generated method signature
    *
    * @see naxxo.stub.ServUtils#averageOfThree
    * @param averageOfThree
    */
   public naxxo.stub.ServUtilsStub.AverageOfThreeResponse averageOfThree(
         naxxo.stub.ServUtilsStub.AverageOfThree averageOfThree)
               throws java.rmi.RemoteException {
      org.apache.axis2.context.MessageContext _messageContext = null;

      try {
         org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
         _operationClient.getOptions().setAction("urn:averageOfThree");
         _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

         addPropertyToOperationClient(_operationClient,
               org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
               "&");

         // create a message context
         _messageContext = new org.apache.axis2.context.MessageContext();

         // create SOAP envelope with that payload
         org.apache.axiom.soap.SOAPEnvelope env = null;

         env = toEnvelope(getFactory(_operationClient.getOptions()
               .getSoapVersionURI()),
               averageOfThree,
               optimizeContent(
                     new javax.xml.namespace.QName("http://naxxo",
                           "averageOfThree")),
                           new javax.xml.namespace.QName("http://naxxo",
                                 "averageOfThree"));

         //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
         // set the message context with that soap envelope
         _messageContext.setEnvelope(env);

         // add the message contxt to the operation client
         _operationClient.addMessageContext(_messageContext);

         //execute the operation client
         _operationClient.execute(true);

         org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
         org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

         java.lang.Object object = fromOM(_returnEnv.getBody()
               .getFirstElement(),
               naxxo.stub.ServUtilsStub.AverageOfThreeResponse.class);

         return (naxxo.stub.ServUtilsStub.AverageOfThreeResponse) object;
      } catch (org.apache.axis2.AxisFault f) {
         org.apache.axiom.om.OMElement faultElt = f.getDetail();

         if (faultElt != null) {
            if (faultExceptionNameMap.containsKey(
                  new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "averageOfThree"))) {
               //make the fault by reflection
               try {
                  java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "averageOfThree"));
                  java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                  java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                  java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                  //message class
                  java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "averageOfThree"));
                  java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                  java.lang.Object messageObject = fromOM(faultElt,
                        messageClass);
                  java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                        new java.lang.Class[] { messageClass });
                  m.invoke(ex, new java.lang.Object[] { messageObject });

                  throw new java.rmi.RemoteException(ex.getMessage(), ex);
               } catch (java.lang.ClassCastException e) {
                  // we cannot intantiate the class - throw the original Axis fault
                  throw f;
               } catch (java.lang.ClassNotFoundException e) {
                  // we cannot intantiate the class - throw the original Axis fault
                  throw f;
               } catch (java.lang.NoSuchMethodException e) {
                  // we cannot intantiate the class - throw the original Axis fault
                  throw f;
               } catch (java.lang.reflect.InvocationTargetException e) {
                  // we cannot intantiate the class - throw the original Axis fault
                  throw f;
               } catch (java.lang.IllegalAccessException e) {
                  // we cannot intantiate the class - throw the original Axis fault
                  throw f;
               } catch (java.lang.InstantiationException e) {
                  // we cannot intantiate the class - throw the original Axis fault
                  throw f;
               }
            } else {
               throw f;
            }
         } else {
            throw f;
         }
      } finally {
         if (_messageContext.getTransportOut() != null) {
            _messageContext.getTransportOut().getSender()
            .cleanup(_messageContext);
         }
      }
   }

   /**
    * Auto generated method signature
    *
    * @see naxxo.stub.ServUtils#reverse
    * @param reverse
    */
   public naxxo.stub.ServUtilsStub.ReverseResponse reverse(
         naxxo.stub.ServUtilsStub.Reverse reverse)
               throws java.rmi.RemoteException {
      org.apache.axis2.context.MessageContext _messageContext = null;

      try {
         org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
         _operationClient.getOptions().setAction("urn:reverse");
         _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

         addPropertyToOperationClient(_operationClient,
               org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
               "&");

         // create a message context
         _messageContext = new org.apache.axis2.context.MessageContext();

         // create SOAP envelope with that payload
         org.apache.axiom.soap.SOAPEnvelope env = null;

         env = toEnvelope(getFactory(_operationClient.getOptions()
               .getSoapVersionURI()),
               reverse,
               optimizeContent(
                     new javax.xml.namespace.QName("http://naxxo", "reverse")),
                     new javax.xml.namespace.QName("http://naxxo", "reverse"));

         //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
         // set the message context with that soap envelope
         _messageContext.setEnvelope(env);

         // add the message contxt to the operation client
         _operationClient.addMessageContext(_messageContext);

         //execute the operation client
         _operationClient.execute(true);

         org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
         org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

         java.lang.Object object = fromOM(_returnEnv.getBody()
               .getFirstElement(),
               naxxo.stub.ServUtilsStub.ReverseResponse.class);

         return (naxxo.stub.ServUtilsStub.ReverseResponse) object;
      } catch (org.apache.axis2.AxisFault f) {
         org.apache.axiom.om.OMElement faultElt = f.getDetail();

         if (faultElt != null) {
            if (faultExceptionNameMap.containsKey(
                  new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "reverse"))) {
               //make the fault by reflection
               try {
                  java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "reverse"));
                  java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                  java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                  java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                  //message class
                  java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "reverse"));
                  java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                  java.lang.Object messageObject = fromOM(faultElt,
                        messageClass);
                  java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                        new java.lang.Class[] { messageClass });
                  m.invoke(ex, new java.lang.Object[] { messageObject });

                  throw new java.rmi.RemoteException(ex.getMessage(), ex);
               } catch (java.lang.ClassCastException e) {
                  // we cannot intantiate the class - throw the original Axis fault
                  throw f;
               } catch (java.lang.ClassNotFoundException e) {
                  // we cannot intantiate the class - throw the original Axis fault
                  throw f;
               } catch (java.lang.NoSuchMethodException e) {
                  // we cannot intantiate the class - throw the original Axis fault
                  throw f;
               } catch (java.lang.reflect.InvocationTargetException e) {
                  // we cannot intantiate the class - throw the original Axis fault
                  throw f;
               } catch (java.lang.IllegalAccessException e) {
                  // we cannot intantiate the class - throw the original Axis fault
                  throw f;
               } catch (java.lang.InstantiationException e) {
                  // we cannot intantiate the class - throw the original Axis fault
                  throw f;
               }
            } else {
               throw f;
            }
         } else {
            throw f;
         }
      } finally {
         if (_messageContext.getTransportOut() != null) {
            _messageContext.getTransportOut().getSender()
            .cleanup(_messageContext);
         }
      }
   }

   /**
    * Auto generated method signature
    *
    * @see naxxo.stub.ServUtils#averageOfTwo
    * @param averageOfTwo
    */
   public naxxo.stub.ServUtilsStub.AverageOfTwoResponse averageOfTwo(
         naxxo.stub.ServUtilsStub.AverageOfTwo averageOfTwo)
               throws java.rmi.RemoteException {
      org.apache.axis2.context.MessageContext _messageContext = null;

      try {
         org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
         _operationClient.getOptions().setAction("urn:averageOfTwo");
         _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

         addPropertyToOperationClient(_operationClient,
               org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
               "&");

         // create a message context
         _messageContext = new org.apache.axis2.context.MessageContext();

         // create SOAP envelope with that payload
         org.apache.axiom.soap.SOAPEnvelope env = null;

         env = toEnvelope(getFactory(_operationClient.getOptions()
               .getSoapVersionURI()),
               averageOfTwo,
               optimizeContent(
                     new javax.xml.namespace.QName("http://naxxo",
                           "averageOfTwo")),
                           new javax.xml.namespace.QName("http://naxxo", "averageOfTwo"));

         //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
         // set the message context with that soap envelope
         _messageContext.setEnvelope(env);

         // add the message contxt to the operation client
         _operationClient.addMessageContext(_messageContext);

         //execute the operation client
         _operationClient.execute(true);

         org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
         org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

         java.lang.Object object = fromOM(_returnEnv.getBody()
               .getFirstElement(),
               naxxo.stub.ServUtilsStub.AverageOfTwoResponse.class);

         return (naxxo.stub.ServUtilsStub.AverageOfTwoResponse) object;
      } catch (org.apache.axis2.AxisFault f) {
         org.apache.axiom.om.OMElement faultElt = f.getDetail();

         if (faultElt != null) {
            if (faultExceptionNameMap.containsKey(
                  new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "averageOfTwo"))) {
               //make the fault by reflection
               try {
                  java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "averageOfTwo"));
                  java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                  java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                  java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                  //message class
                  java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "averageOfTwo"));
                  java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                  java.lang.Object messageObject = fromOM(faultElt,
                        messageClass);
                  java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                        new java.lang.Class[] { messageClass });
                  m.invoke(ex, new java.lang.Object[] { messageObject });

                  throw new java.rmi.RemoteException(ex.getMessage(), ex);
               } catch (java.lang.ClassCastException e) {
                  // we cannot intantiate the class - throw the original Axis fault
                  throw f;
               } catch (java.lang.ClassNotFoundException e) {
                  // we cannot intantiate the class - throw the original Axis fault
                  throw f;
               } catch (java.lang.NoSuchMethodException e) {
                  // we cannot intantiate the class - throw the original Axis fault
                  throw f;
               } catch (java.lang.reflect.InvocationTargetException e) {
                  // we cannot intantiate the class - throw the original Axis fault
                  throw f;
               } catch (java.lang.IllegalAccessException e) {
                  // we cannot intantiate the class - throw the original Axis fault
                  throw f;
               } catch (java.lang.InstantiationException e) {
                  // we cannot intantiate the class - throw the original Axis fault
                  throw f;
               }
            } else {
               throw f;
            }
         } else {
            throw f;
         }
      } finally {
         if (_messageContext.getTransportOut() != null) {
            _messageContext.getTransportOut().getSender()
            .cleanup(_messageContext);
         }
      }
   }

   /**
    * Auto generated method signature
    *
    * @see naxxo.stub.ServUtils#isLeapYear
    * @param isLeapYear
    */
   public naxxo.stub.ServUtilsStub.IsLeapYearResponse isLeapYear(
         naxxo.stub.ServUtilsStub.IsLeapYear isLeapYear)
               throws java.rmi.RemoteException {
      org.apache.axis2.context.MessageContext _messageContext = null;

      try {
         org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
         _operationClient.getOptions().setAction("urn:isLeapYear");
         _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

         addPropertyToOperationClient(_operationClient,
               org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
               "&");

         // create a message context
         _messageContext = new org.apache.axis2.context.MessageContext();

         // create SOAP envelope with that payload
         org.apache.axiom.soap.SOAPEnvelope env = null;

         env = toEnvelope(getFactory(_operationClient.getOptions()
               .getSoapVersionURI()),
               isLeapYear,
               optimizeContent(
                     new javax.xml.namespace.QName("http://naxxo",
                           "isLeapYear")),
                           new javax.xml.namespace.QName("http://naxxo", "isLeapYear"));

         //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
         // set the message context with that soap envelope
         _messageContext.setEnvelope(env);

         // add the message contxt to the operation client
         _operationClient.addMessageContext(_messageContext);

         //execute the operation client
         _operationClient.execute(true);

         org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
         org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

         java.lang.Object object = fromOM(_returnEnv.getBody()
               .getFirstElement(),
               naxxo.stub.ServUtilsStub.IsLeapYearResponse.class);

         return (naxxo.stub.ServUtilsStub.IsLeapYearResponse) object;
      } catch (org.apache.axis2.AxisFault f) {
         org.apache.axiom.om.OMElement faultElt = f.getDetail();

         if (faultElt != null) {
            if (faultExceptionNameMap.containsKey(
                  new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "isLeapYear"))) {
               //make the fault by reflection
               try {
                  java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "isLeapYear"));
                  java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                  java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                  java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                  //message class
                  java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "isLeapYear"));
                  java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                  java.lang.Object messageObject = fromOM(faultElt,
                        messageClass);
                  java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                        new java.lang.Class[] { messageClass });
                  m.invoke(ex, new java.lang.Object[] { messageObject });

                  throw new java.rmi.RemoteException(ex.getMessage(), ex);
               } catch (java.lang.ClassCastException e) {
                  // we cannot intantiate the class - throw the original Axis fault
                  throw f;
               } catch (java.lang.ClassNotFoundException e) {
                  // we cannot intantiate the class - throw the original Axis fault
                  throw f;
               } catch (java.lang.NoSuchMethodException e) {
                  // we cannot intantiate the class - throw the original Axis fault
                  throw f;
               } catch (java.lang.reflect.InvocationTargetException e) {
                  // we cannot intantiate the class - throw the original Axis fault
                  throw f;
               } catch (java.lang.IllegalAccessException e) {
                  // we cannot intantiate the class - throw the original Axis fault
                  throw f;
               } catch (java.lang.InstantiationException e) {
                  // we cannot intantiate the class - throw the original Axis fault
                  throw f;
               }
            } else {
               throw f;
            }
         } else {
            throw f;
         }
      } finally {
         if (_messageContext.getTransportOut() != null) {
            _messageContext.getTransportOut().getSender()
            .cleanup(_messageContext);
         }
      }
   }

   private boolean optimizeContent(javax.xml.namespace.QName opName) {
      if (opNameArray == null) {
         return false;
      }

      for (int i = 0; i < opNameArray.length; i++) {
         if (opName.equals(opNameArray[i])) {
            return true;
         }
      }

      return false;
   }

   private org.apache.axiom.om.OMElement toOM(
         naxxo.stub.ServUtilsStub.AverageOfThree param, boolean optimizeContent)
               throws org.apache.axis2.AxisFault {
      try {
         return param.getOMElement(naxxo.stub.ServUtilsStub.AverageOfThree.MY_QNAME,
               org.apache.axiom.om.OMAbstractFactory.getOMFactory());
      } catch (org.apache.axis2.databinding.ADBException e) {
         throw org.apache.axis2.AxisFault.makeFault(e);
      }
   }

   private org.apache.axiom.om.OMElement toOM(
         naxxo.stub.ServUtilsStub.AverageOfThreeResponse param,
         boolean optimizeContent) throws org.apache.axis2.AxisFault {
      try {
         return param.getOMElement(naxxo.stub.ServUtilsStub.AverageOfThreeResponse.MY_QNAME,
               org.apache.axiom.om.OMAbstractFactory.getOMFactory());
      } catch (org.apache.axis2.databinding.ADBException e) {
         throw org.apache.axis2.AxisFault.makeFault(e);
      }
   }

   private org.apache.axiom.om.OMElement toOM(
         naxxo.stub.ServUtilsStub.Reverse param, boolean optimizeContent)
               throws org.apache.axis2.AxisFault {
      try {
         return param.getOMElement(naxxo.stub.ServUtilsStub.Reverse.MY_QNAME,
               org.apache.axiom.om.OMAbstractFactory.getOMFactory());
      } catch (org.apache.axis2.databinding.ADBException e) {
         throw org.apache.axis2.AxisFault.makeFault(e);
      }
   }

   private org.apache.axiom.om.OMElement toOM(
         naxxo.stub.ServUtilsStub.ReverseResponse param, boolean optimizeContent)
               throws org.apache.axis2.AxisFault {
      try {
         return param.getOMElement(naxxo.stub.ServUtilsStub.ReverseResponse.MY_QNAME,
               org.apache.axiom.om.OMAbstractFactory.getOMFactory());
      } catch (org.apache.axis2.databinding.ADBException e) {
         throw org.apache.axis2.AxisFault.makeFault(e);
      }
   }

   private org.apache.axiom.om.OMElement toOM(
         naxxo.stub.ServUtilsStub.AverageOfTwo param, boolean optimizeContent)
               throws org.apache.axis2.AxisFault {
      try {
         return param.getOMElement(naxxo.stub.ServUtilsStub.AverageOfTwo.MY_QNAME,
               org.apache.axiom.om.OMAbstractFactory.getOMFactory());
      } catch (org.apache.axis2.databinding.ADBException e) {
         throw org.apache.axis2.AxisFault.makeFault(e);
      }
   }

   private org.apache.axiom.om.OMElement toOM(
         naxxo.stub.ServUtilsStub.AverageOfTwoResponse param,
         boolean optimizeContent) throws org.apache.axis2.AxisFault {
      try {
         return param.getOMElement(naxxo.stub.ServUtilsStub.AverageOfTwoResponse.MY_QNAME,
               org.apache.axiom.om.OMAbstractFactory.getOMFactory());
      } catch (org.apache.axis2.databinding.ADBException e) {
         throw org.apache.axis2.AxisFault.makeFault(e);
      }
   }

   private org.apache.axiom.om.OMElement toOM(
         naxxo.stub.ServUtilsStub.IsLeapYear param, boolean optimizeContent)
               throws org.apache.axis2.AxisFault {
      try {
         return param.getOMElement(naxxo.stub.ServUtilsStub.IsLeapYear.MY_QNAME,
               org.apache.axiom.om.OMAbstractFactory.getOMFactory());
      } catch (org.apache.axis2.databinding.ADBException e) {
         throw org.apache.axis2.AxisFault.makeFault(e);
      }
   }

   private org.apache.axiom.om.OMElement toOM(
         naxxo.stub.ServUtilsStub.IsLeapYearResponse param,
         boolean optimizeContent) throws org.apache.axis2.AxisFault {
      try {
         return param.getOMElement(naxxo.stub.ServUtilsStub.IsLeapYearResponse.MY_QNAME,
               org.apache.axiom.om.OMAbstractFactory.getOMFactory());
      } catch (org.apache.axis2.databinding.ADBException e) {
         throw org.apache.axis2.AxisFault.makeFault(e);
      }
   }

   private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
         org.apache.axiom.soap.SOAPFactory factory,
         naxxo.stub.ServUtilsStub.AverageOfThree param, boolean optimizeContent,
         javax.xml.namespace.QName elementQName)
               throws org.apache.axis2.AxisFault {
      try {
         org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
         emptyEnvelope.getBody()
         .addChild(param.getOMElement(
               naxxo.stub.ServUtilsStub.AverageOfThree.MY_QNAME, factory));

         return emptyEnvelope;
      } catch (org.apache.axis2.databinding.ADBException e) {
         throw org.apache.axis2.AxisFault.makeFault(e);
      }
   }

   /* methods to provide back word compatibility */
   private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
         org.apache.axiom.soap.SOAPFactory factory,
         naxxo.stub.ServUtilsStub.Reverse param, boolean optimizeContent,
         javax.xml.namespace.QName elementQName)
               throws org.apache.axis2.AxisFault {
      try {
         org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
         emptyEnvelope.getBody()
         .addChild(param.getOMElement(
               naxxo.stub.ServUtilsStub.Reverse.MY_QNAME, factory));

         return emptyEnvelope;
      } catch (org.apache.axis2.databinding.ADBException e) {
         throw org.apache.axis2.AxisFault.makeFault(e);
      }
   }

   /* methods to provide back word compatibility */
   private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
         org.apache.axiom.soap.SOAPFactory factory,
         naxxo.stub.ServUtilsStub.AverageOfTwo param, boolean optimizeContent,
         javax.xml.namespace.QName elementQName)
               throws org.apache.axis2.AxisFault {
      try {
         org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
         emptyEnvelope.getBody()
         .addChild(param.getOMElement(
               naxxo.stub.ServUtilsStub.AverageOfTwo.MY_QNAME, factory));

         return emptyEnvelope;
      } catch (org.apache.axis2.databinding.ADBException e) {
         throw org.apache.axis2.AxisFault.makeFault(e);
      }
   }

   /* methods to provide back word compatibility */
   private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
         org.apache.axiom.soap.SOAPFactory factory,
         naxxo.stub.ServUtilsStub.IsLeapYear param, boolean optimizeContent,
         javax.xml.namespace.QName elementQName)
               throws org.apache.axis2.AxisFault {
      try {
         org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
         emptyEnvelope.getBody()
         .addChild(param.getOMElement(
               naxxo.stub.ServUtilsStub.IsLeapYear.MY_QNAME, factory));

         return emptyEnvelope;
      } catch (org.apache.axis2.databinding.ADBException e) {
         throw org.apache.axis2.AxisFault.makeFault(e);
      }
   }

   /* methods to provide back word compatibility */

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
         if (naxxo.stub.ServUtilsStub.AverageOfThree.class.equals(type)) {
            return naxxo.stub.ServUtilsStub.AverageOfThree.Factory.parse(param.getXMLStreamReaderWithoutCaching());
         }

         if (naxxo.stub.ServUtilsStub.AverageOfThreeResponse.class.equals(
               type)) {
            return naxxo.stub.ServUtilsStub.AverageOfThreeResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
         }

         if (naxxo.stub.ServUtilsStub.AverageOfTwo.class.equals(type)) {
            return naxxo.stub.ServUtilsStub.AverageOfTwo.Factory.parse(param.getXMLStreamReaderWithoutCaching());
         }

         if (naxxo.stub.ServUtilsStub.AverageOfTwoResponse.class.equals(type)) {
            return naxxo.stub.ServUtilsStub.AverageOfTwoResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
         }

         if (naxxo.stub.ServUtilsStub.IsLeapYear.class.equals(type)) {
            return naxxo.stub.ServUtilsStub.IsLeapYear.Factory.parse(param.getXMLStreamReaderWithoutCaching());
         }

         if (naxxo.stub.ServUtilsStub.IsLeapYearResponse.class.equals(type)) {
            return naxxo.stub.ServUtilsStub.IsLeapYearResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
         }

         if (naxxo.stub.ServUtilsStub.Reverse.class.equals(type)) {
            return naxxo.stub.ServUtilsStub.Reverse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
         }

         if (naxxo.stub.ServUtilsStub.ReverseResponse.class.equals(type)) {
            return naxxo.stub.ServUtilsStub.ReverseResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
         }
      } catch (java.lang.Exception e) {
         throw org.apache.axis2.AxisFault.makeFault(e);
      }

      return null;
   }

   //http://localhost:8080/axis2/services/ServUtils
   public static class AverageOfTwo implements org.apache.axis2.databinding.ADBBean {
      public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://naxxo",
            "averageOfTwo", "ns1");

      /**
       * field for Args0
       */
      protected double localArgs0;

      /**
       * field for Args1
       */
      protected double localArgs1;

      /**
       * Auto generated getter method
       * @return double
       */
      public double getArgs0() {
         return localArgs0;
      }

      /**
       * Auto generated setter method
       * @param param Args0
       */
      public void setArgs0(double param) {
         this.localArgs0 = param;
      }

      /**
       * Auto generated getter method
       * @return double
       */
      public double getArgs1() {
         return localArgs1;
      }

      /**
       * Auto generated setter method
       * @param param Args1
       */
      public void setArgs1(double param) {
         this.localArgs1 = param;
      }

      /**
       *
       * @param parentQName
       * @param factory
       * @return org.apache.axiom.om.OMElement
       */
      public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory)
                  throws org.apache.axis2.databinding.ADBException {
         return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
               this, MY_QNAME));
      }

      public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter)
                  throws javax.xml.stream.XMLStreamException,
                  org.apache.axis2.databinding.ADBException {
         serialize(parentQName, xmlWriter, false);
      }

      public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
                  throws javax.xml.stream.XMLStreamException,
                  org.apache.axis2.databinding.ADBException {
         java.lang.String prefix = null;
         java.lang.String namespace = null;

         prefix = parentQName.getPrefix();
         namespace = parentQName.getNamespaceURI();
         writeStartElement(prefix, namespace, parentQName.getLocalPart(),
               xmlWriter);

         if (serializeType) {
            java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                  "http://naxxo");

            if ((namespacePrefix != null) &&
                  (namespacePrefix.trim().length() > 0)) {
               writeAttribute("xsi",
                     "http://www.w3.org/2001/XMLSchema-instance", "type",
                     namespacePrefix + ":averageOfTwo", xmlWriter);
            } else {
               writeAttribute("xsi",
                     "http://www.w3.org/2001/XMLSchema-instance", "type",
                     "averageOfTwo", xmlWriter);
            }
         }

         namespace = "http://naxxo";
         writeStartElement(null, namespace, "args0", xmlWriter);

         if (java.lang.Double.isNaN(localArgs0)) {
            throw new org.apache.axis2.databinding.ADBException(
                  "args0 cannot be null!!");
         } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                  localArgs0));
         }

         xmlWriter.writeEndElement();

         namespace = "http://naxxo";
         writeStartElement(null, namespace, "args1", xmlWriter);

         if (java.lang.Double.isNaN(localArgs1)) {
            throw new org.apache.axis2.databinding.ADBException(
                  "args1 cannot be null!!");
         } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                  localArgs1));
         }

         xmlWriter.writeEndElement();

         xmlWriter.writeEndElement();
      }

      private static java.lang.String generatePrefix(
            java.lang.String namespace) {
         if (namespace.equals("http://naxxo")) {
            return "ns1";
         }

         return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
      }

      /**
       * Utility method to write an element start tag.
       */
      private void writeStartElement(java.lang.String prefix,
            java.lang.String namespace, java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
                  throws javax.xml.stream.XMLStreamException {
         java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

         if (writerPrefix != null) {
            xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
         } else {
            if (namespace.length() == 0) {
               prefix = "";
            } else if (prefix == null) {
               prefix = generatePrefix(namespace);
            }

            xmlWriter.writeStartElement(prefix, localPart, namespace);
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
         }
      }

      /**
       * Util method to write an attribute with the ns prefix
       */
      private void writeAttribute(java.lang.String prefix,
            java.lang.String namespace, java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
                  throws javax.xml.stream.XMLStreamException {
         java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

         if (writerPrefix != null) {
            xmlWriter.writeAttribute(writerPrefix, namespace, attName,
                  attValue);
         } else {
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
            xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
         }
      }

      /**
       * Util method to write an attribute without the ns prefix
       */
      private void writeAttribute(java.lang.String namespace,
            java.lang.String attName, java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
                  throws javax.xml.stream.XMLStreamException {
         if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attValue);
         } else {
            xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace),
                  namespace, attName, attValue);
         }
      }

      /**
       * Util method to write an attribute without the ns prefix
       */
      private void writeQNameAttribute(java.lang.String namespace,
            java.lang.String attName, javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
                  throws javax.xml.stream.XMLStreamException {
         java.lang.String attributeNamespace = qname.getNamespaceURI();
         java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

         if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
         }

         java.lang.String attributeValue;

         if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
         } else {
            attributeValue = qname.getLocalPart();
         }

         if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
         } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(attributePrefix, namespace, attName,
                  attributeValue);
         }
      }

      /**
       *  method to handle Qnames
       */
      private void writeQName(javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
                  throws javax.xml.stream.XMLStreamException {
         java.lang.String namespaceURI = qname.getNamespaceURI();

         if (namespaceURI != null) {
            java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

            if (prefix == null) {
               prefix = generatePrefix(namespaceURI);
               xmlWriter.writeNamespace(prefix, namespaceURI);
               xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
               xmlWriter.writeCharacters(prefix + ":" +
                     org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                           qname));
            } else {
               // i.e this is the default namespace
               xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                     qname));
            }
         } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                  qname));
         }
      }

      private void writeQNames(javax.xml.namespace.QName[] qnames,
            javax.xml.stream.XMLStreamWriter xmlWriter)
                  throws javax.xml.stream.XMLStreamException {
         if (qnames != null) {
            // we have to store this data until last moment since it is not possible to write any
            // namespace data after writing the charactor data
            java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
            java.lang.String namespaceURI = null;
            java.lang.String prefix = null;

            for (int i = 0; i < qnames.length; i++) {
               if (i > 0) {
                  stringToWrite.append(" ");
               }

               namespaceURI = qnames[i].getNamespaceURI();

               if (namespaceURI != null) {
                  prefix = xmlWriter.getPrefix(namespaceURI);

                  if ((prefix == null) || (prefix.length() == 0)) {
                     prefix = generatePrefix(namespaceURI);
                     xmlWriter.writeNamespace(prefix, namespaceURI);
                     xmlWriter.setPrefix(prefix, namespaceURI);
                  }

                  if (prefix.trim().length() > 0) {
                     stringToWrite.append(prefix).append(":")
                     .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                           qnames[i]));
                  } else {
                     stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                           qnames[i]));
                  }
               } else {
                  stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qnames[i]));
               }
            }

            xmlWriter.writeCharacters(stringToWrite.toString());
         }
      }

      /**
       * Register a namespace prefix
       */
      private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter,
            java.lang.String namespace)
                  throws javax.xml.stream.XMLStreamException {
         java.lang.String prefix = xmlWriter.getPrefix(namespace);

         if (prefix == null) {
            prefix = generatePrefix(namespace);

            javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

            while (true) {
               java.lang.String uri = nsContext.getNamespaceURI(prefix);

               if ((uri == null) || (uri.length() == 0)) {
                  break;
               }

               prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
            }

            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
         }

         return prefix;
      }

      /**
       *  Factory class that keeps the parse method
       */
      public static class Factory {
         private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

         /**
          * static method to create the object
          * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
          *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
          * Postcondition: If this object is an element, the reader is positioned at its end element
          *                If this object is a complex type, the reader is positioned at the end element of its outer element
          */
         public static AverageOfTwo parse(
               javax.xml.stream.XMLStreamReader reader)
                     throws java.lang.Exception {
            AverageOfTwo object = new AverageOfTwo();

            int event;
            javax.xml.namespace.QName currentQName = null;
            java.lang.String nillableValue = null;
            java.lang.String prefix = "";
            java.lang.String namespaceuri = "";

            try {
               while (!reader.isStartElement() && !reader.isEndElement())
                  reader.next();

               currentQName = reader.getName();

               if (reader.getAttributeValue(
                     "http://www.w3.org/2001/XMLSchema-instance",
                     "type") != null) {
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");

                  if (fullTypeName != null) {
                     java.lang.String nsPrefix = null;

                     if (fullTypeName.indexOf(":") > -1) {
                        nsPrefix = fullTypeName.substring(0,
                              fullTypeName.indexOf(":"));
                     }

                     nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                     java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                           ":") + 1);

                     if (!"averageOfTwo".equals(type)) {
                        //find namespace for the prefix
                        java.lang.String nsUri = reader.getNamespaceContext()
                              .getNamespaceURI(nsPrefix);

                        return (AverageOfTwo) ExtensionMapper.getTypeObject(nsUri,
                              type, reader);
                     }
                  }
               }

               // Note all attributes that were handled. Used to differ normal attributes
               // from anyAttributes.
               java.util.Vector handledAttributes = new java.util.Vector();

               reader.next();

               while (!reader.isStartElement() && !reader.isEndElement())
                  reader.next();

               if ((reader.isStartElement() &&
                     new javax.xml.namespace.QName("http://naxxo",
                           "args0").equals(reader.getName())) ||
                           new javax.xml.namespace.QName("", "args0").equals(
                                 reader.getName())) {
                  nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "nil");

                  if ("true".equals(nillableValue) ||
                        "1".equals(nillableValue)) {
                     throw new org.apache.axis2.databinding.ADBException(
                           "The element: " + "args0" + "  cannot be null");
                  }

                  java.lang.String content = reader.getElementText();

                  object.setArgs0(org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(
                        content));

                  reader.next();
               } // End of if for expected property start element

               else {
                  // 1 - A start element we are not expecting indicates an invalid parameter was passed
                  throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
               }

               while (!reader.isStartElement() && !reader.isEndElement())
                  reader.next();

               if ((reader.isStartElement() &&
                     new javax.xml.namespace.QName("http://naxxo",
                           "args1").equals(reader.getName())) ||
                           new javax.xml.namespace.QName("", "args1").equals(
                                 reader.getName())) {
                  nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "nil");

                  if ("true".equals(nillableValue) ||
                        "1".equals(nillableValue)) {
                     throw new org.apache.axis2.databinding.ADBException(
                           "The element: " + "args1" + "  cannot be null");
                  }

                  java.lang.String content = reader.getElementText();

                  object.setArgs1(org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(
                        content));

                  reader.next();
               } // End of if for expected property start element

               else {
                  // 1 - A start element we are not expecting indicates an invalid parameter was passed
                  throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
               }

               while (!reader.isStartElement() && !reader.isEndElement())
                  reader.next();

               if (reader.isStartElement()) {
                  // 2 - A start element we are not expecting indicates a trailing invalid property
                  throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
               }
            } catch (javax.xml.stream.XMLStreamException e) {
               throw new java.lang.Exception(e);
            }

            return object;
         }
      } //end of factory class
   }

   public static class IsLeapYear implements org.apache.axis2.databinding.ADBBean {
      public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://naxxo",
            "isLeapYear", "ns1");

      /**
       * field for Args0
       */
      protected int localArgs0;

      /**
       * Auto generated getter method
       * @return int
       */
      public int getArgs0() {
         return localArgs0;
      }

      /**
       * Auto generated setter method
       * @param param Args0
       */
      public void setArgs0(int param) {
         this.localArgs0 = param;
      }

      /**
       *
       * @param parentQName
       * @param factory
       * @return org.apache.axiom.om.OMElement
       */
      public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory)
                  throws org.apache.axis2.databinding.ADBException {
         return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
               this, MY_QNAME));
      }

      public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter)
                  throws javax.xml.stream.XMLStreamException,
                  org.apache.axis2.databinding.ADBException {
         serialize(parentQName, xmlWriter, false);
      }

      public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
                  throws javax.xml.stream.XMLStreamException,
                  org.apache.axis2.databinding.ADBException {
         java.lang.String prefix = null;
         java.lang.String namespace = null;

         prefix = parentQName.getPrefix();
         namespace = parentQName.getNamespaceURI();
         writeStartElement(prefix, namespace, parentQName.getLocalPart(),
               xmlWriter);

         if (serializeType) {
            java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                  "http://naxxo");

            if ((namespacePrefix != null) &&
                  (namespacePrefix.trim().length() > 0)) {
               writeAttribute("xsi",
                     "http://www.w3.org/2001/XMLSchema-instance", "type",
                     namespacePrefix + ":isLeapYear", xmlWriter);
            } else {
               writeAttribute("xsi",
                     "http://www.w3.org/2001/XMLSchema-instance", "type",
                     "isLeapYear", xmlWriter);
            }
         }

         namespace = "http://naxxo";
         writeStartElement(null, namespace, "args0", xmlWriter);

         if (localArgs0 == java.lang.Integer.MIN_VALUE) {
            throw new org.apache.axis2.databinding.ADBException(
                  "args0 cannot be null!!");
         } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                  localArgs0));
         }

         xmlWriter.writeEndElement();

         xmlWriter.writeEndElement();
      }

      private static java.lang.String generatePrefix(
            java.lang.String namespace) {
         if (namespace.equals("http://naxxo")) {
            return "ns1";
         }

         return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
      }

      /**
       * Utility method to write an element start tag.
       */
      private void writeStartElement(java.lang.String prefix,
            java.lang.String namespace, java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
                  throws javax.xml.stream.XMLStreamException {
         java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

         if (writerPrefix != null) {
            xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
         } else {
            if (namespace.length() == 0) {
               prefix = "";
            } else if (prefix == null) {
               prefix = generatePrefix(namespace);
            }

            xmlWriter.writeStartElement(prefix, localPart, namespace);
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
         }
      }

      /**
       * Util method to write an attribute with the ns prefix
       */
      private void writeAttribute(java.lang.String prefix,
            java.lang.String namespace, java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
                  throws javax.xml.stream.XMLStreamException {
         java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

         if (writerPrefix != null) {
            xmlWriter.writeAttribute(writerPrefix, namespace, attName,
                  attValue);
         } else {
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
            xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
         }
      }

      /**
       * Util method to write an attribute without the ns prefix
       */
      private void writeAttribute(java.lang.String namespace,
            java.lang.String attName, java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
                  throws javax.xml.stream.XMLStreamException {
         if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attValue);
         } else {
            xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace),
                  namespace, attName, attValue);
         }
      }

      /**
       * Util method to write an attribute without the ns prefix
       */
      private void writeQNameAttribute(java.lang.String namespace,
            java.lang.String attName, javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
                  throws javax.xml.stream.XMLStreamException {
         java.lang.String attributeNamespace = qname.getNamespaceURI();
         java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

         if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
         }

         java.lang.String attributeValue;

         if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
         } else {
            attributeValue = qname.getLocalPart();
         }

         if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
         } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(attributePrefix, namespace, attName,
                  attributeValue);
         }
      }

      /**
       *  method to handle Qnames
       */
      private void writeQName(javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
                  throws javax.xml.stream.XMLStreamException {
         java.lang.String namespaceURI = qname.getNamespaceURI();

         if (namespaceURI != null) {
            java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

            if (prefix == null) {
               prefix = generatePrefix(namespaceURI);
               xmlWriter.writeNamespace(prefix, namespaceURI);
               xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
               xmlWriter.writeCharacters(prefix + ":" +
                     org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                           qname));
            } else {
               // i.e this is the default namespace
               xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                     qname));
            }
         } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                  qname));
         }
      }

      private void writeQNames(javax.xml.namespace.QName[] qnames,
            javax.xml.stream.XMLStreamWriter xmlWriter)
                  throws javax.xml.stream.XMLStreamException {
         if (qnames != null) {
            // we have to store this data until last moment since it is not possible to write any
            // namespace data after writing the charactor data
            java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
            java.lang.String namespaceURI = null;
            java.lang.String prefix = null;

            for (int i = 0; i < qnames.length; i++) {
               if (i > 0) {
                  stringToWrite.append(" ");
               }

               namespaceURI = qnames[i].getNamespaceURI();

               if (namespaceURI != null) {
                  prefix = xmlWriter.getPrefix(namespaceURI);

                  if ((prefix == null) || (prefix.length() == 0)) {
                     prefix = generatePrefix(namespaceURI);
                     xmlWriter.writeNamespace(prefix, namespaceURI);
                     xmlWriter.setPrefix(prefix, namespaceURI);
                  }

                  if (prefix.trim().length() > 0) {
                     stringToWrite.append(prefix).append(":")
                     .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                           qnames[i]));
                  } else {
                     stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                           qnames[i]));
                  }
               } else {
                  stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qnames[i]));
               }
            }

            xmlWriter.writeCharacters(stringToWrite.toString());
         }
      }

      /**
       * Register a namespace prefix
       */
      private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter,
            java.lang.String namespace)
                  throws javax.xml.stream.XMLStreamException {
         java.lang.String prefix = xmlWriter.getPrefix(namespace);

         if (prefix == null) {
            prefix = generatePrefix(namespace);

            javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

            while (true) {
               java.lang.String uri = nsContext.getNamespaceURI(prefix);

               if ((uri == null) || (uri.length() == 0)) {
                  break;
               }

               prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
            }

            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
         }

         return prefix;
      }

      /**
       *  Factory class that keeps the parse method
       */
      public static class Factory {
         private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

         /**
          * static method to create the object
          * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
          *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
          * Postcondition: If this object is an element, the reader is positioned at its end element
          *                If this object is a complex type, the reader is positioned at the end element of its outer element
          */
         public static IsLeapYear parse(
               javax.xml.stream.XMLStreamReader reader)
                     throws java.lang.Exception {
            IsLeapYear object = new IsLeapYear();

            int event;
            javax.xml.namespace.QName currentQName = null;
            java.lang.String nillableValue = null;
            java.lang.String prefix = "";
            java.lang.String namespaceuri = "";

            try {
               while (!reader.isStartElement() && !reader.isEndElement())
                  reader.next();

               currentQName = reader.getName();

               if (reader.getAttributeValue(
                     "http://www.w3.org/2001/XMLSchema-instance",
                     "type") != null) {
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");

                  if (fullTypeName != null) {
                     java.lang.String nsPrefix = null;

                     if (fullTypeName.indexOf(":") > -1) {
                        nsPrefix = fullTypeName.substring(0,
                              fullTypeName.indexOf(":"));
                     }

                     nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                     java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                           ":") + 1);

                     if (!"isLeapYear".equals(type)) {
                        //find namespace for the prefix
                        java.lang.String nsUri = reader.getNamespaceContext()
                              .getNamespaceURI(nsPrefix);

                        return (IsLeapYear) ExtensionMapper.getTypeObject(nsUri,
                              type, reader);
                     }
                  }
               }

               // Note all attributes that were handled. Used to differ normal attributes
               // from anyAttributes.
               java.util.Vector handledAttributes = new java.util.Vector();

               reader.next();

               while (!reader.isStartElement() && !reader.isEndElement())
                  reader.next();

               if ((reader.isStartElement() &&
                     new javax.xml.namespace.QName("http://naxxo",
                           "args0").equals(reader.getName())) ||
                           new javax.xml.namespace.QName("", "args0").equals(
                                 reader.getName())) {
                  nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "nil");

                  if ("true".equals(nillableValue) ||
                        "1".equals(nillableValue)) {
                     throw new org.apache.axis2.databinding.ADBException(
                           "The element: " + "args0" + "  cannot be null");
                  }

                  java.lang.String content = reader.getElementText();

                  object.setArgs0(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                        content));

                  reader.next();
               } // End of if for expected property start element

               else {
                  // 1 - A start element we are not expecting indicates an invalid parameter was passed
                  throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
               }

               while (!reader.isStartElement() && !reader.isEndElement())
                  reader.next();

               if (reader.isStartElement()) {
                  // 2 - A start element we are not expecting indicates a trailing invalid property
                  throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
               }
            } catch (javax.xml.stream.XMLStreamException e) {
               throw new java.lang.Exception(e);
            }

            return object;
         }
      } //end of factory class
   }

   public static class Reverse implements org.apache.axis2.databinding.ADBBean {
      public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://naxxo",
            "reverse", "ns1");

      /**
       * field for Args0
       */
      protected java.lang.String localArgs0;

      /*  This tracker boolean wil be used to detect whether the user called the set method
       *   for this attribute. It will be used to determine whether to include this field
       *   in the serialized XML
       */
      protected boolean localArgs0Tracker = false;

      public boolean isArgs0Specified() {
         return localArgs0Tracker;
      }

      /**
       * Auto generated getter method
       * @return java.lang.String
       */
      public java.lang.String getArgs0() {
         return localArgs0;
      }

      /**
       * Auto generated setter method
       * @param param Args0
       */
      public void setArgs0(java.lang.String param) {
         localArgs0Tracker = true;

         this.localArgs0 = param;
      }

      /**
       *
       * @param parentQName
       * @param factory
       * @return org.apache.axiom.om.OMElement
       */
      public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory)
                  throws org.apache.axis2.databinding.ADBException {
         return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
               this, MY_QNAME));
      }

      public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter)
                  throws javax.xml.stream.XMLStreamException,
                  org.apache.axis2.databinding.ADBException {
         serialize(parentQName, xmlWriter, false);
      }

      public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
                  throws javax.xml.stream.XMLStreamException,
                  org.apache.axis2.databinding.ADBException {
         java.lang.String prefix = null;
         java.lang.String namespace = null;

         prefix = parentQName.getPrefix();
         namespace = parentQName.getNamespaceURI();
         writeStartElement(prefix, namespace, parentQName.getLocalPart(),
               xmlWriter);

         if (serializeType) {
            java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                  "http://naxxo");

            if ((namespacePrefix != null) &&
                  (namespacePrefix.trim().length() > 0)) {
               writeAttribute("xsi",
                     "http://www.w3.org/2001/XMLSchema-instance", "type",
                     namespacePrefix + ":reverse", xmlWriter);
            } else {
               writeAttribute("xsi",
                     "http://www.w3.org/2001/XMLSchema-instance", "type",
                     "reverse", xmlWriter);
            }
         }

         if (localArgs0Tracker) {
            namespace = "http://naxxo";
            writeStartElement(null, namespace, "args0", xmlWriter);

            if (localArgs0 == null) {
               // write the nil attribute
               writeAttribute("xsi",
                     "http://www.w3.org/2001/XMLSchema-instance", "nil",
                     "1", xmlWriter);
            } else {
               xmlWriter.writeCharacters(localArgs0);
            }

            xmlWriter.writeEndElement();
         }

         xmlWriter.writeEndElement();
      }

      private static java.lang.String generatePrefix(
            java.lang.String namespace) {
         if (namespace.equals("http://naxxo")) {
            return "ns1";
         }

         return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
      }

      /**
       * Utility method to write an element start tag.
       */
      private void writeStartElement(java.lang.String prefix,
            java.lang.String namespace, java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
                  throws javax.xml.stream.XMLStreamException {
         java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

         if (writerPrefix != null) {
            xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
         } else {
            if (namespace.length() == 0) {
               prefix = "";
            } else if (prefix == null) {
               prefix = generatePrefix(namespace);
            }

            xmlWriter.writeStartElement(prefix, localPart, namespace);
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
         }
      }

      /**
       * Util method to write an attribute with the ns prefix
       */
      private void writeAttribute(java.lang.String prefix,
            java.lang.String namespace, java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
                  throws javax.xml.stream.XMLStreamException {
         java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

         if (writerPrefix != null) {
            xmlWriter.writeAttribute(writerPrefix, namespace, attName,
                  attValue);
         } else {
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
            xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
         }
      }

      /**
       * Util method to write an attribute without the ns prefix
       */
      private void writeAttribute(java.lang.String namespace,
            java.lang.String attName, java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
                  throws javax.xml.stream.XMLStreamException {
         if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attValue);
         } else {
            xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace),
                  namespace, attName, attValue);
         }
      }

      /**
       * Util method to write an attribute without the ns prefix
       */
      private void writeQNameAttribute(java.lang.String namespace,
            java.lang.String attName, javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
                  throws javax.xml.stream.XMLStreamException {
         java.lang.String attributeNamespace = qname.getNamespaceURI();
         java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

         if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
         }

         java.lang.String attributeValue;

         if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
         } else {
            attributeValue = qname.getLocalPart();
         }

         if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
         } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(attributePrefix, namespace, attName,
                  attributeValue);
         }
      }

      /**
       *  method to handle Qnames
       */
      private void writeQName(javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
                  throws javax.xml.stream.XMLStreamException {
         java.lang.String namespaceURI = qname.getNamespaceURI();

         if (namespaceURI != null) {
            java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

            if (prefix == null) {
               prefix = generatePrefix(namespaceURI);
               xmlWriter.writeNamespace(prefix, namespaceURI);
               xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
               xmlWriter.writeCharacters(prefix + ":" +
                     org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                           qname));
            } else {
               // i.e this is the default namespace
               xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                     qname));
            }
         } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                  qname));
         }
      }

      private void writeQNames(javax.xml.namespace.QName[] qnames,
            javax.xml.stream.XMLStreamWriter xmlWriter)
                  throws javax.xml.stream.XMLStreamException {
         if (qnames != null) {
            // we have to store this data until last moment since it is not possible to write any
            // namespace data after writing the charactor data
            java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
            java.lang.String namespaceURI = null;
            java.lang.String prefix = null;

            for (int i = 0; i < qnames.length; i++) {
               if (i > 0) {
                  stringToWrite.append(" ");
               }

               namespaceURI = qnames[i].getNamespaceURI();

               if (namespaceURI != null) {
                  prefix = xmlWriter.getPrefix(namespaceURI);

                  if ((prefix == null) || (prefix.length() == 0)) {
                     prefix = generatePrefix(namespaceURI);
                     xmlWriter.writeNamespace(prefix, namespaceURI);
                     xmlWriter.setPrefix(prefix, namespaceURI);
                  }

                  if (prefix.trim().length() > 0) {
                     stringToWrite.append(prefix).append(":")
                     .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                           qnames[i]));
                  } else {
                     stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                           qnames[i]));
                  }
               } else {
                  stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qnames[i]));
               }
            }

            xmlWriter.writeCharacters(stringToWrite.toString());
         }
      }

      /**
       * Register a namespace prefix
       */
      private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter,
            java.lang.String namespace)
                  throws javax.xml.stream.XMLStreamException {
         java.lang.String prefix = xmlWriter.getPrefix(namespace);

         if (prefix == null) {
            prefix = generatePrefix(namespace);

            javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

            while (true) {
               java.lang.String uri = nsContext.getNamespaceURI(prefix);

               if ((uri == null) || (uri.length() == 0)) {
                  break;
               }

               prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
            }

            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
         }

         return prefix;
      }

      /**
       *  Factory class that keeps the parse method
       */
      public static class Factory {
         private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

         /**
          * static method to create the object
          * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
          *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
          * Postcondition: If this object is an element, the reader is positioned at its end element
          *                If this object is a complex type, the reader is positioned at the end element of its outer element
          */
         public static Reverse parse(javax.xml.stream.XMLStreamReader reader)
               throws java.lang.Exception {
            Reverse object = new Reverse();

            int event;
            javax.xml.namespace.QName currentQName = null;
            java.lang.String nillableValue = null;
            java.lang.String prefix = "";
            java.lang.String namespaceuri = "";

            try {
               while (!reader.isStartElement() && !reader.isEndElement())
                  reader.next();

               currentQName = reader.getName();

               if (reader.getAttributeValue(
                     "http://www.w3.org/2001/XMLSchema-instance",
                     "type") != null) {
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");

                  if (fullTypeName != null) {
                     java.lang.String nsPrefix = null;

                     if (fullTypeName.indexOf(":") > -1) {
                        nsPrefix = fullTypeName.substring(0,
                              fullTypeName.indexOf(":"));
                     }

                     nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                     java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                           ":") + 1);

                     if (!"reverse".equals(type)) {
                        //find namespace for the prefix
                        java.lang.String nsUri = reader.getNamespaceContext()
                              .getNamespaceURI(nsPrefix);

                        return (Reverse) ExtensionMapper.getTypeObject(nsUri,
                              type, reader);
                     }
                  }
               }

               // Note all attributes that were handled. Used to differ normal attributes
               // from anyAttributes.
               java.util.Vector handledAttributes = new java.util.Vector();

               reader.next();

               while (!reader.isStartElement() && !reader.isEndElement())
                  reader.next();

               if ((reader.isStartElement() &&
                     new javax.xml.namespace.QName("http://naxxo",
                           "args0").equals(reader.getName())) ||
                           new javax.xml.namespace.QName("", "args0").equals(
                                 reader.getName())) {
                  nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "nil");

                  if (!"true".equals(nillableValue) &&
                        !"1".equals(nillableValue)) {
                     java.lang.String content = reader.getElementText();

                     object.setArgs0(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                           content));
                  } else {
                     reader.getElementText(); // throw away text nodes if any.
                  }

                  reader.next();
               } // End of if for expected property start element

               else {
               }

               while (!reader.isStartElement() && !reader.isEndElement())
                  reader.next();

               if (reader.isStartElement()) {
                  // 2 - A start element we are not expecting indicates a trailing invalid property
                  throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
               }
            } catch (javax.xml.stream.XMLStreamException e) {
               throw new java.lang.Exception(e);
            }

            return object;
         }
      } //end of factory class
   }

   public static class ExtensionMapper {
      public static java.lang.Object getTypeObject(
            java.lang.String namespaceURI, java.lang.String typeName,
            javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
         throw new org.apache.axis2.databinding.ADBException(
               "Unsupported type " + namespaceURI + " " + typeName);
      }
   }

   public static class AverageOfThreeResponse implements org.apache.axis2.databinding.ADBBean {
      public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://naxxo",
            "averageOfThreeResponse", "ns1");

      /**
       * field for _return
       */
      protected double local_return;

      /**
       * Auto generated getter method
       * @return double
       */
      public double get_return() {
         return local_return;
      }

      /**
       * Auto generated setter method
       * @param param _return
       */
      public void set_return(double param) {
         this.local_return = param;
      }

      /**
       *
       * @param parentQName
       * @param factory
       * @return org.apache.axiom.om.OMElement
       */
      public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory)
                  throws org.apache.axis2.databinding.ADBException {
         return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
               this, MY_QNAME));
      }

      public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter)
                  throws javax.xml.stream.XMLStreamException,
                  org.apache.axis2.databinding.ADBException {
         serialize(parentQName, xmlWriter, false);
      }

      public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
                  throws javax.xml.stream.XMLStreamException,
                  org.apache.axis2.databinding.ADBException {
         java.lang.String prefix = null;
         java.lang.String namespace = null;

         prefix = parentQName.getPrefix();
         namespace = parentQName.getNamespaceURI();
         writeStartElement(prefix, namespace, parentQName.getLocalPart(),
               xmlWriter);

         if (serializeType) {
            java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                  "http://naxxo");

            if ((namespacePrefix != null) &&
                  (namespacePrefix.trim().length() > 0)) {
               writeAttribute("xsi",
                     "http://www.w3.org/2001/XMLSchema-instance", "type",
                     namespacePrefix + ":averageOfThreeResponse", xmlWriter);
            } else {
               writeAttribute("xsi",
                     "http://www.w3.org/2001/XMLSchema-instance", "type",
                     "averageOfThreeResponse", xmlWriter);
            }
         }

         namespace = "http://naxxo";
         writeStartElement(null, namespace, "return", xmlWriter);

         if (java.lang.Double.isNaN(local_return)) {
            throw new org.apache.axis2.databinding.ADBException(
                  "return cannot be null!!");
         } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                  local_return));
         }

         xmlWriter.writeEndElement();

         xmlWriter.writeEndElement();
      }

      private static java.lang.String generatePrefix(
            java.lang.String namespace) {
         if (namespace.equals("http://naxxo")) {
            return "ns1";
         }

         return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
      }

      /**
       * Utility method to write an element start tag.
       */
      private void writeStartElement(java.lang.String prefix,
            java.lang.String namespace, java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
                  throws javax.xml.stream.XMLStreamException {
         java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

         if (writerPrefix != null) {
            xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
         } else {
            if (namespace.length() == 0) {
               prefix = "";
            } else if (prefix == null) {
               prefix = generatePrefix(namespace);
            }

            xmlWriter.writeStartElement(prefix, localPart, namespace);
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
         }
      }

      /**
       * Util method to write an attribute with the ns prefix
       */
      private void writeAttribute(java.lang.String prefix,
            java.lang.String namespace, java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
                  throws javax.xml.stream.XMLStreamException {
         java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

         if (writerPrefix != null) {
            xmlWriter.writeAttribute(writerPrefix, namespace, attName,
                  attValue);
         } else {
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
            xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
         }
      }

      /**
       * Util method to write an attribute without the ns prefix
       */
      private void writeAttribute(java.lang.String namespace,
            java.lang.String attName, java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
                  throws javax.xml.stream.XMLStreamException {
         if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attValue);
         } else {
            xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace),
                  namespace, attName, attValue);
         }
      }

      /**
       * Util method to write an attribute without the ns prefix
       */
      private void writeQNameAttribute(java.lang.String namespace,
            java.lang.String attName, javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
                  throws javax.xml.stream.XMLStreamException {
         java.lang.String attributeNamespace = qname.getNamespaceURI();
         java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

         if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
         }

         java.lang.String attributeValue;

         if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
         } else {
            attributeValue = qname.getLocalPart();
         }

         if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
         } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(attributePrefix, namespace, attName,
                  attributeValue);
         }
      }

      /**
       *  method to handle Qnames
       */
      private void writeQName(javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
                  throws javax.xml.stream.XMLStreamException {
         java.lang.String namespaceURI = qname.getNamespaceURI();

         if (namespaceURI != null) {
            java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

            if (prefix == null) {
               prefix = generatePrefix(namespaceURI);
               xmlWriter.writeNamespace(prefix, namespaceURI);
               xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
               xmlWriter.writeCharacters(prefix + ":" +
                     org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                           qname));
            } else {
               // i.e this is the default namespace
               xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                     qname));
            }
         } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                  qname));
         }
      }

      private void writeQNames(javax.xml.namespace.QName[] qnames,
            javax.xml.stream.XMLStreamWriter xmlWriter)
                  throws javax.xml.stream.XMLStreamException {
         if (qnames != null) {
            // we have to store this data until last moment since it is not possible to write any
            // namespace data after writing the charactor data
            java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
            java.lang.String namespaceURI = null;
            java.lang.String prefix = null;

            for (int i = 0; i < qnames.length; i++) {
               if (i > 0) {
                  stringToWrite.append(" ");
               }

               namespaceURI = qnames[i].getNamespaceURI();

               if (namespaceURI != null) {
                  prefix = xmlWriter.getPrefix(namespaceURI);

                  if ((prefix == null) || (prefix.length() == 0)) {
                     prefix = generatePrefix(namespaceURI);
                     xmlWriter.writeNamespace(prefix, namespaceURI);
                     xmlWriter.setPrefix(prefix, namespaceURI);
                  }

                  if (prefix.trim().length() > 0) {
                     stringToWrite.append(prefix).append(":")
                     .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                           qnames[i]));
                  } else {
                     stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                           qnames[i]));
                  }
               } else {
                  stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qnames[i]));
               }
            }

            xmlWriter.writeCharacters(stringToWrite.toString());
         }
      }

      /**
       * Register a namespace prefix
       */
      private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter,
            java.lang.String namespace)
                  throws javax.xml.stream.XMLStreamException {
         java.lang.String prefix = xmlWriter.getPrefix(namespace);

         if (prefix == null) {
            prefix = generatePrefix(namespace);

            javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

            while (true) {
               java.lang.String uri = nsContext.getNamespaceURI(prefix);

               if ((uri == null) || (uri.length() == 0)) {
                  break;
               }

               prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
            }

            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
         }

         return prefix;
      }

      /**
       *  Factory class that keeps the parse method
       */
      public static class Factory {
         private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

         /**
          * static method to create the object
          * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
          *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
          * Postcondition: If this object is an element, the reader is positioned at its end element
          *                If this object is a complex type, the reader is positioned at the end element of its outer element
          */
         public static AverageOfThreeResponse parse(
               javax.xml.stream.XMLStreamReader reader)
                     throws java.lang.Exception {
            AverageOfThreeResponse object = new AverageOfThreeResponse();

            int event;
            javax.xml.namespace.QName currentQName = null;
            java.lang.String nillableValue = null;
            java.lang.String prefix = "";
            java.lang.String namespaceuri = "";

            try {
               while (!reader.isStartElement() && !reader.isEndElement())
                  reader.next();

               currentQName = reader.getName();

               if (reader.getAttributeValue(
                     "http://www.w3.org/2001/XMLSchema-instance",
                     "type") != null) {
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");

                  if (fullTypeName != null) {
                     java.lang.String nsPrefix = null;

                     if (fullTypeName.indexOf(":") > -1) {
                        nsPrefix = fullTypeName.substring(0,
                              fullTypeName.indexOf(":"));
                     }

                     nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                     java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                           ":") + 1);

                     if (!"averageOfThreeResponse".equals(type)) {
                        //find namespace for the prefix
                        java.lang.String nsUri = reader.getNamespaceContext()
                              .getNamespaceURI(nsPrefix);

                        return (AverageOfThreeResponse) ExtensionMapper.getTypeObject(nsUri,
                              type, reader);
                     }
                  }
               }

               // Note all attributes that were handled. Used to differ normal attributes
               // from anyAttributes.
               java.util.Vector handledAttributes = new java.util.Vector();

               reader.next();

               while (!reader.isStartElement() && !reader.isEndElement())
                  reader.next();

               if ((reader.isStartElement() &&
                     new javax.xml.namespace.QName("http://naxxo",
                           "return").equals(reader.getName())) ||
                           new javax.xml.namespace.QName("", "return").equals(
                                 reader.getName())) {
                  nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "nil");

                  if ("true".equals(nillableValue) ||
                        "1".equals(nillableValue)) {
                     throw new org.apache.axis2.databinding.ADBException(
                           "The element: " + "return" +
                           "  cannot be null");
                  }

                  java.lang.String content = reader.getElementText();

                  object.set_return(org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(
                        content));

                  reader.next();
               } // End of if for expected property start element

               else {
                  // 1 - A start element we are not expecting indicates an invalid parameter was passed
                  throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
               }

               while (!reader.isStartElement() && !reader.isEndElement())
                  reader.next();

               if (reader.isStartElement()) {
                  // 2 - A start element we are not expecting indicates a trailing invalid property
                  throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
               }
            } catch (javax.xml.stream.XMLStreamException e) {
               throw new java.lang.Exception(e);
            }

            return object;
         }
      } //end of factory class
   }

   public static class IsLeapYearResponse implements org.apache.axis2.databinding.ADBBean {
      public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://naxxo",
            "isLeapYearResponse", "ns1");

      /**
       * field for _return
       */
      protected boolean local_return;

      /**
       * Auto generated getter method
       * @return boolean
       */
      public boolean get_return() {
         return local_return;
      }

      /**
       * Auto generated setter method
       * @param param _return
       */
      public void set_return(boolean param) {
         this.local_return = param;
      }

      /**
       *
       * @param parentQName
       * @param factory
       * @return org.apache.axiom.om.OMElement
       */
      public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory)
                  throws org.apache.axis2.databinding.ADBException {
         return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
               this, MY_QNAME));
      }

      public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter)
                  throws javax.xml.stream.XMLStreamException,
                  org.apache.axis2.databinding.ADBException {
         serialize(parentQName, xmlWriter, false);
      }

      public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
                  throws javax.xml.stream.XMLStreamException,
                  org.apache.axis2.databinding.ADBException {
         java.lang.String prefix = null;
         java.lang.String namespace = null;

         prefix = parentQName.getPrefix();
         namespace = parentQName.getNamespaceURI();
         writeStartElement(prefix, namespace, parentQName.getLocalPart(),
               xmlWriter);

         if (serializeType) {
            java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                  "http://naxxo");

            if ((namespacePrefix != null) &&
                  (namespacePrefix.trim().length() > 0)) {
               writeAttribute("xsi",
                     "http://www.w3.org/2001/XMLSchema-instance", "type",
                     namespacePrefix + ":isLeapYearResponse", xmlWriter);
            } else {
               writeAttribute("xsi",
                     "http://www.w3.org/2001/XMLSchema-instance", "type",
                     "isLeapYearResponse", xmlWriter);
            }
         }

         namespace = "http://naxxo";
         writeStartElement(null, namespace, "return", xmlWriter);

         if (false) {
            throw new org.apache.axis2.databinding.ADBException(
                  "return cannot be null!!");
         } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                  local_return));
         }

         xmlWriter.writeEndElement();

         xmlWriter.writeEndElement();
      }

      private static java.lang.String generatePrefix(
            java.lang.String namespace) {
         if (namespace.equals("http://naxxo")) {
            return "ns1";
         }

         return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
      }

      /**
       * Utility method to write an element start tag.
       */
      private void writeStartElement(java.lang.String prefix,
            java.lang.String namespace, java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
                  throws javax.xml.stream.XMLStreamException {
         java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

         if (writerPrefix != null) {
            xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
         } else {
            if (namespace.length() == 0) {
               prefix = "";
            } else if (prefix == null) {
               prefix = generatePrefix(namespace);
            }

            xmlWriter.writeStartElement(prefix, localPart, namespace);
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
         }
      }

      /**
       * Util method to write an attribute with the ns prefix
       */
      private void writeAttribute(java.lang.String prefix,
            java.lang.String namespace, java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
                  throws javax.xml.stream.XMLStreamException {
         java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

         if (writerPrefix != null) {
            xmlWriter.writeAttribute(writerPrefix, namespace, attName,
                  attValue);
         } else {
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
            xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
         }
      }

      /**
       * Util method to write an attribute without the ns prefix
       */
      private void writeAttribute(java.lang.String namespace,
            java.lang.String attName, java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
                  throws javax.xml.stream.XMLStreamException {
         if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attValue);
         } else {
            xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace),
                  namespace, attName, attValue);
         }
      }

      /**
       * Util method to write an attribute without the ns prefix
       */
      private void writeQNameAttribute(java.lang.String namespace,
            java.lang.String attName, javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
                  throws javax.xml.stream.XMLStreamException {
         java.lang.String attributeNamespace = qname.getNamespaceURI();
         java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

         if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
         }

         java.lang.String attributeValue;

         if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
         } else {
            attributeValue = qname.getLocalPart();
         }

         if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
         } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(attributePrefix, namespace, attName,
                  attributeValue);
         }
      }

      /**
       *  method to handle Qnames
       */
      private void writeQName(javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
                  throws javax.xml.stream.XMLStreamException {
         java.lang.String namespaceURI = qname.getNamespaceURI();

         if (namespaceURI != null) {
            java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

            if (prefix == null) {
               prefix = generatePrefix(namespaceURI);
               xmlWriter.writeNamespace(prefix, namespaceURI);
               xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
               xmlWriter.writeCharacters(prefix + ":" +
                     org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                           qname));
            } else {
               // i.e this is the default namespace
               xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                     qname));
            }
         } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                  qname));
         }
      }

      private void writeQNames(javax.xml.namespace.QName[] qnames,
            javax.xml.stream.XMLStreamWriter xmlWriter)
                  throws javax.xml.stream.XMLStreamException {
         if (qnames != null) {
            // we have to store this data until last moment since it is not possible to write any
            // namespace data after writing the charactor data
            java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
            java.lang.String namespaceURI = null;
            java.lang.String prefix = null;

            for (int i = 0; i < qnames.length; i++) {
               if (i > 0) {
                  stringToWrite.append(" ");
               }

               namespaceURI = qnames[i].getNamespaceURI();

               if (namespaceURI != null) {
                  prefix = xmlWriter.getPrefix(namespaceURI);

                  if ((prefix == null) || (prefix.length() == 0)) {
                     prefix = generatePrefix(namespaceURI);
                     xmlWriter.writeNamespace(prefix, namespaceURI);
                     xmlWriter.setPrefix(prefix, namespaceURI);
                  }

                  if (prefix.trim().length() > 0) {
                     stringToWrite.append(prefix).append(":")
                     .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                           qnames[i]));
                  } else {
                     stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                           qnames[i]));
                  }
               } else {
                  stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qnames[i]));
               }
            }

            xmlWriter.writeCharacters(stringToWrite.toString());
         }
      }

      /**
       * Register a namespace prefix
       */
      private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter,
            java.lang.String namespace)
                  throws javax.xml.stream.XMLStreamException {
         java.lang.String prefix = xmlWriter.getPrefix(namespace);

         if (prefix == null) {
            prefix = generatePrefix(namespace);

            javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

            while (true) {
               java.lang.String uri = nsContext.getNamespaceURI(prefix);

               if ((uri == null) || (uri.length() == 0)) {
                  break;
               }

               prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
            }

            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
         }

         return prefix;
      }

      /**
       *  Factory class that keeps the parse method
       */
      public static class Factory {
         private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

         /**
          * static method to create the object
          * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
          *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
          * Postcondition: If this object is an element, the reader is positioned at its end element
          *                If this object is a complex type, the reader is positioned at the end element of its outer element
          */
         public static IsLeapYearResponse parse(
               javax.xml.stream.XMLStreamReader reader)
                     throws java.lang.Exception {
            IsLeapYearResponse object = new IsLeapYearResponse();

            int event;
            javax.xml.namespace.QName currentQName = null;
            java.lang.String nillableValue = null;
            java.lang.String prefix = "";
            java.lang.String namespaceuri = "";

            try {
               while (!reader.isStartElement() && !reader.isEndElement())
                  reader.next();

               currentQName = reader.getName();

               if (reader.getAttributeValue(
                     "http://www.w3.org/2001/XMLSchema-instance",
                     "type") != null) {
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");

                  if (fullTypeName != null) {
                     java.lang.String nsPrefix = null;

                     if (fullTypeName.indexOf(":") > -1) {
                        nsPrefix = fullTypeName.substring(0,
                              fullTypeName.indexOf(":"));
                     }

                     nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                     java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                           ":") + 1);

                     if (!"isLeapYearResponse".equals(type)) {
                        //find namespace for the prefix
                        java.lang.String nsUri = reader.getNamespaceContext()
                              .getNamespaceURI(nsPrefix);

                        return (IsLeapYearResponse) ExtensionMapper.getTypeObject(nsUri,
                              type, reader);
                     }
                  }
               }

               // Note all attributes that were handled. Used to differ normal attributes
               // from anyAttributes.
               java.util.Vector handledAttributes = new java.util.Vector();

               reader.next();

               while (!reader.isStartElement() && !reader.isEndElement())
                  reader.next();

               if ((reader.isStartElement() &&
                     new javax.xml.namespace.QName("http://naxxo",
                           "return").equals(reader.getName())) ||
                           new javax.xml.namespace.QName("", "return").equals(
                                 reader.getName())) {
                  nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "nil");

                  if ("true".equals(nillableValue) ||
                        "1".equals(nillableValue)) {
                     throw new org.apache.axis2.databinding.ADBException(
                           "The element: " + "return" +
                           "  cannot be null");
                  }

                  java.lang.String content = reader.getElementText();

                  object.set_return(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                        content));

                  reader.next();
               } // End of if for expected property start element

               else {
                  // 1 - A start element we are not expecting indicates an invalid parameter was passed
                  throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
               }

               while (!reader.isStartElement() && !reader.isEndElement())
                  reader.next();

               if (reader.isStartElement()) {
                  // 2 - A start element we are not expecting indicates a trailing invalid property
                  throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
               }
            } catch (javax.xml.stream.XMLStreamException e) {
               throw new java.lang.Exception(e);
            }

            return object;
         }
      } //end of factory class
   }

   public static class AverageOfTwoResponse implements org.apache.axis2.databinding.ADBBean {
      public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://naxxo",
            "averageOfTwoResponse", "ns1");

      /**
       * field for _return
       */
      protected double local_return;

      /**
       * Auto generated getter method
       * @return double
       */
      public double get_return() {
         return local_return;
      }

      /**
       * Auto generated setter method
       * @param param _return
       */
      public void set_return(double param) {
         this.local_return = param;
      }

      /**
       *
       * @param parentQName
       * @param factory
       * @return org.apache.axiom.om.OMElement
       */
      public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory)
                  throws org.apache.axis2.databinding.ADBException {
         return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
               this, MY_QNAME));
      }

      public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter)
                  throws javax.xml.stream.XMLStreamException,
                  org.apache.axis2.databinding.ADBException {
         serialize(parentQName, xmlWriter, false);
      }

      public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
                  throws javax.xml.stream.XMLStreamException,
                  org.apache.axis2.databinding.ADBException {
         java.lang.String prefix = null;
         java.lang.String namespace = null;

         prefix = parentQName.getPrefix();
         namespace = parentQName.getNamespaceURI();
         writeStartElement(prefix, namespace, parentQName.getLocalPart(),
               xmlWriter);

         if (serializeType) {
            java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                  "http://naxxo");

            if ((namespacePrefix != null) &&
                  (namespacePrefix.trim().length() > 0)) {
               writeAttribute("xsi",
                     "http://www.w3.org/2001/XMLSchema-instance", "type",
                     namespacePrefix + ":averageOfTwoResponse", xmlWriter);
            } else {
               writeAttribute("xsi",
                     "http://www.w3.org/2001/XMLSchema-instance", "type",
                     "averageOfTwoResponse", xmlWriter);
            }
         }

         namespace = "http://naxxo";
         writeStartElement(null, namespace, "return", xmlWriter);

         if (java.lang.Double.isNaN(local_return)) {
            throw new org.apache.axis2.databinding.ADBException(
                  "return cannot be null!!");
         } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                  local_return));
         }

         xmlWriter.writeEndElement();

         xmlWriter.writeEndElement();
      }

      private static java.lang.String generatePrefix(
            java.lang.String namespace) {
         if (namespace.equals("http://naxxo")) {
            return "ns1";
         }

         return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
      }

      /**
       * Utility method to write an element start tag.
       */
      private void writeStartElement(java.lang.String prefix,
            java.lang.String namespace, java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
                  throws javax.xml.stream.XMLStreamException {
         java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

         if (writerPrefix != null) {
            xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
         } else {
            if (namespace.length() == 0) {
               prefix = "";
            } else if (prefix == null) {
               prefix = generatePrefix(namespace);
            }

            xmlWriter.writeStartElement(prefix, localPart, namespace);
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
         }
      }

      /**
       * Util method to write an attribute with the ns prefix
       */
      private void writeAttribute(java.lang.String prefix,
            java.lang.String namespace, java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
                  throws javax.xml.stream.XMLStreamException {
         java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

         if (writerPrefix != null) {
            xmlWriter.writeAttribute(writerPrefix, namespace, attName,
                  attValue);
         } else {
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
            xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
         }
      }

      /**
       * Util method to write an attribute without the ns prefix
       */
      private void writeAttribute(java.lang.String namespace,
            java.lang.String attName, java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
                  throws javax.xml.stream.XMLStreamException {
         if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attValue);
         } else {
            xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace),
                  namespace, attName, attValue);
         }
      }

      /**
       * Util method to write an attribute without the ns prefix
       */
      private void writeQNameAttribute(java.lang.String namespace,
            java.lang.String attName, javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
                  throws javax.xml.stream.XMLStreamException {
         java.lang.String attributeNamespace = qname.getNamespaceURI();
         java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

         if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
         }

         java.lang.String attributeValue;

         if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
         } else {
            attributeValue = qname.getLocalPart();
         }

         if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
         } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(attributePrefix, namespace, attName,
                  attributeValue);
         }
      }

      /**
       *  method to handle Qnames
       */
      private void writeQName(javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
                  throws javax.xml.stream.XMLStreamException {
         java.lang.String namespaceURI = qname.getNamespaceURI();

         if (namespaceURI != null) {
            java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

            if (prefix == null) {
               prefix = generatePrefix(namespaceURI);
               xmlWriter.writeNamespace(prefix, namespaceURI);
               xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
               xmlWriter.writeCharacters(prefix + ":" +
                     org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                           qname));
            } else {
               // i.e this is the default namespace
               xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                     qname));
            }
         } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                  qname));
         }
      }

      private void writeQNames(javax.xml.namespace.QName[] qnames,
            javax.xml.stream.XMLStreamWriter xmlWriter)
                  throws javax.xml.stream.XMLStreamException {
         if (qnames != null) {
            // we have to store this data until last moment since it is not possible to write any
            // namespace data after writing the charactor data
            java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
            java.lang.String namespaceURI = null;
            java.lang.String prefix = null;

            for (int i = 0; i < qnames.length; i++) {
               if (i > 0) {
                  stringToWrite.append(" ");
               }

               namespaceURI = qnames[i].getNamespaceURI();

               if (namespaceURI != null) {
                  prefix = xmlWriter.getPrefix(namespaceURI);

                  if ((prefix == null) || (prefix.length() == 0)) {
                     prefix = generatePrefix(namespaceURI);
                     xmlWriter.writeNamespace(prefix, namespaceURI);
                     xmlWriter.setPrefix(prefix, namespaceURI);
                  }

                  if (prefix.trim().length() > 0) {
                     stringToWrite.append(prefix).append(":")
                     .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                           qnames[i]));
                  } else {
                     stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                           qnames[i]));
                  }
               } else {
                  stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qnames[i]));
               }
            }

            xmlWriter.writeCharacters(stringToWrite.toString());
         }
      }

      /**
       * Register a namespace prefix
       */
      private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter,
            java.lang.String namespace)
                  throws javax.xml.stream.XMLStreamException {
         java.lang.String prefix = xmlWriter.getPrefix(namespace);

         if (prefix == null) {
            prefix = generatePrefix(namespace);

            javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

            while (true) {
               java.lang.String uri = nsContext.getNamespaceURI(prefix);

               if ((uri == null) || (uri.length() == 0)) {
                  break;
               }

               prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
            }

            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
         }

         return prefix;
      }

      /**
       *  Factory class that keeps the parse method
       */
      public static class Factory {
         private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

         /**
          * static method to create the object
          * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
          *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
          * Postcondition: If this object is an element, the reader is positioned at its end element
          *                If this object is a complex type, the reader is positioned at the end element of its outer element
          */
         public static AverageOfTwoResponse parse(
               javax.xml.stream.XMLStreamReader reader)
                     throws java.lang.Exception {
            AverageOfTwoResponse object = new AverageOfTwoResponse();

            int event;
            javax.xml.namespace.QName currentQName = null;
            java.lang.String nillableValue = null;
            java.lang.String prefix = "";
            java.lang.String namespaceuri = "";

            try {
               while (!reader.isStartElement() && !reader.isEndElement())
                  reader.next();

               currentQName = reader.getName();

               if (reader.getAttributeValue(
                     "http://www.w3.org/2001/XMLSchema-instance",
                     "type") != null) {
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");

                  if (fullTypeName != null) {
                     java.lang.String nsPrefix = null;

                     if (fullTypeName.indexOf(":") > -1) {
                        nsPrefix = fullTypeName.substring(0,
                              fullTypeName.indexOf(":"));
                     }

                     nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                     java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                           ":") + 1);

                     if (!"averageOfTwoResponse".equals(type)) {
                        //find namespace for the prefix
                        java.lang.String nsUri = reader.getNamespaceContext()
                              .getNamespaceURI(nsPrefix);

                        return (AverageOfTwoResponse) ExtensionMapper.getTypeObject(nsUri,
                              type, reader);
                     }
                  }
               }

               // Note all attributes that were handled. Used to differ normal attributes
               // from anyAttributes.
               java.util.Vector handledAttributes = new java.util.Vector();

               reader.next();

               while (!reader.isStartElement() && !reader.isEndElement())
                  reader.next();

               if ((reader.isStartElement() &&
                     new javax.xml.namespace.QName("http://naxxo",
                           "return").equals(reader.getName())) ||
                           new javax.xml.namespace.QName("", "return").equals(
                                 reader.getName())) {
                  nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "nil");

                  if ("true".equals(nillableValue) ||
                        "1".equals(nillableValue)) {
                     throw new org.apache.axis2.databinding.ADBException(
                           "The element: " + "return" +
                           "  cannot be null");
                  }

                  java.lang.String content = reader.getElementText();

                  object.set_return(org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(
                        content));

                  reader.next();
               } // End of if for expected property start element

               else {
                  // 1 - A start element we are not expecting indicates an invalid parameter was passed
                  throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
               }

               while (!reader.isStartElement() && !reader.isEndElement())
                  reader.next();

               if (reader.isStartElement()) {
                  // 2 - A start element we are not expecting indicates a trailing invalid property
                  throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
               }
            } catch (javax.xml.stream.XMLStreamException e) {
               throw new java.lang.Exception(e);
            }

            return object;
         }
      } //end of factory class
   }

   public static class AverageOfThree implements org.apache.axis2.databinding.ADBBean {
      public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://naxxo",
            "averageOfThree", "ns1");

      /**
       * field for Args0
       */
      protected double localArgs0;

      /**
       * field for Args1
       */
      protected double localArgs1;

      /**
       * field for Args2
       */
      protected double localArgs2;

      /**
       * Auto generated getter method
       * @return double
       */
      public double getArgs0() {
         return localArgs0;
      }

      /**
       * Auto generated setter method
       * @param param Args0
       */
      public void setArgs0(double param) {
         this.localArgs0 = param;
      }

      /**
       * Auto generated getter method
       * @return double
       */
      public double getArgs1() {
         return localArgs1;
      }

      /**
       * Auto generated setter method
       * @param param Args1
       */
      public void setArgs1(double param) {
         this.localArgs1 = param;
      }

      /**
       * Auto generated getter method
       * @return double
       */
      public double getArgs2() {
         return localArgs2;
      }

      /**
       * Auto generated setter method
       * @param param Args2
       */
      public void setArgs2(double param) {
         this.localArgs2 = param;
      }

      /**
       *
       * @param parentQName
       * @param factory
       * @return org.apache.axiom.om.OMElement
       */
      public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory)
                  throws org.apache.axis2.databinding.ADBException {
         return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
               this, MY_QNAME));
      }

      public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter)
                  throws javax.xml.stream.XMLStreamException,
                  org.apache.axis2.databinding.ADBException {
         serialize(parentQName, xmlWriter, false);
      }

      public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
                  throws javax.xml.stream.XMLStreamException,
                  org.apache.axis2.databinding.ADBException {
         java.lang.String prefix = null;
         java.lang.String namespace = null;

         prefix = parentQName.getPrefix();
         namespace = parentQName.getNamespaceURI();
         writeStartElement(prefix, namespace, parentQName.getLocalPart(),
               xmlWriter);

         if (serializeType) {
            java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                  "http://naxxo");

            if ((namespacePrefix != null) &&
                  (namespacePrefix.trim().length() > 0)) {
               writeAttribute("xsi",
                     "http://www.w3.org/2001/XMLSchema-instance", "type",
                     namespacePrefix + ":averageOfThree", xmlWriter);
            } else {
               writeAttribute("xsi",
                     "http://www.w3.org/2001/XMLSchema-instance", "type",
                     "averageOfThree", xmlWriter);
            }
         }

         namespace = "http://naxxo";
         writeStartElement(null, namespace, "args0", xmlWriter);

         if (java.lang.Double.isNaN(localArgs0)) {
            throw new org.apache.axis2.databinding.ADBException(
                  "args0 cannot be null!!");
         } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                  localArgs0));
         }

         xmlWriter.writeEndElement();

         namespace = "http://naxxo";
         writeStartElement(null, namespace, "args1", xmlWriter);

         if (java.lang.Double.isNaN(localArgs1)) {
            throw new org.apache.axis2.databinding.ADBException(
                  "args1 cannot be null!!");
         } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                  localArgs1));
         }

         xmlWriter.writeEndElement();

         namespace = "http://naxxo";
         writeStartElement(null, namespace, "args2", xmlWriter);

         if (java.lang.Double.isNaN(localArgs2)) {
            throw new org.apache.axis2.databinding.ADBException(
                  "args2 cannot be null!!");
         } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                  localArgs2));
         }

         xmlWriter.writeEndElement();

         xmlWriter.writeEndElement();
      }

      private static java.lang.String generatePrefix(
            java.lang.String namespace) {
         if (namespace.equals("http://naxxo")) {
            return "ns1";
         }

         return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
      }

      /**
       * Utility method to write an element start tag.
       */
      private void writeStartElement(java.lang.String prefix,
            java.lang.String namespace, java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
                  throws javax.xml.stream.XMLStreamException {
         java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

         if (writerPrefix != null) {
            xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
         } else {
            if (namespace.length() == 0) {
               prefix = "";
            } else if (prefix == null) {
               prefix = generatePrefix(namespace);
            }

            xmlWriter.writeStartElement(prefix, localPart, namespace);
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
         }
      }

      /**
       * Util method to write an attribute with the ns prefix
       */
      private void writeAttribute(java.lang.String prefix,
            java.lang.String namespace, java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
                  throws javax.xml.stream.XMLStreamException {
         java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

         if (writerPrefix != null) {
            xmlWriter.writeAttribute(writerPrefix, namespace, attName,
                  attValue);
         } else {
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
            xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
         }
      }

      /**
       * Util method to write an attribute without the ns prefix
       */
      private void writeAttribute(java.lang.String namespace,
            java.lang.String attName, java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
                  throws javax.xml.stream.XMLStreamException {
         if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attValue);
         } else {
            xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace),
                  namespace, attName, attValue);
         }
      }

      /**
       * Util method to write an attribute without the ns prefix
       */
      private void writeQNameAttribute(java.lang.String namespace,
            java.lang.String attName, javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
                  throws javax.xml.stream.XMLStreamException {
         java.lang.String attributeNamespace = qname.getNamespaceURI();
         java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

         if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
         }

         java.lang.String attributeValue;

         if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
         } else {
            attributeValue = qname.getLocalPart();
         }

         if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
         } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(attributePrefix, namespace, attName,
                  attributeValue);
         }
      }

      /**
       *  method to handle Qnames
       */
      private void writeQName(javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
                  throws javax.xml.stream.XMLStreamException {
         java.lang.String namespaceURI = qname.getNamespaceURI();

         if (namespaceURI != null) {
            java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

            if (prefix == null) {
               prefix = generatePrefix(namespaceURI);
               xmlWriter.writeNamespace(prefix, namespaceURI);
               xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
               xmlWriter.writeCharacters(prefix + ":" +
                     org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                           qname));
            } else {
               // i.e this is the default namespace
               xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                     qname));
            }
         } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                  qname));
         }
      }

      private void writeQNames(javax.xml.namespace.QName[] qnames,
            javax.xml.stream.XMLStreamWriter xmlWriter)
                  throws javax.xml.stream.XMLStreamException {
         if (qnames != null) {
            // we have to store this data until last moment since it is not possible to write any
            // namespace data after writing the charactor data
            java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
            java.lang.String namespaceURI = null;
            java.lang.String prefix = null;

            for (int i = 0; i < qnames.length; i++) {
               if (i > 0) {
                  stringToWrite.append(" ");
               }

               namespaceURI = qnames[i].getNamespaceURI();

               if (namespaceURI != null) {
                  prefix = xmlWriter.getPrefix(namespaceURI);

                  if ((prefix == null) || (prefix.length() == 0)) {
                     prefix = generatePrefix(namespaceURI);
                     xmlWriter.writeNamespace(prefix, namespaceURI);
                     xmlWriter.setPrefix(prefix, namespaceURI);
                  }

                  if (prefix.trim().length() > 0) {
                     stringToWrite.append(prefix).append(":")
                     .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                           qnames[i]));
                  } else {
                     stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                           qnames[i]));
                  }
               } else {
                  stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qnames[i]));
               }
            }

            xmlWriter.writeCharacters(stringToWrite.toString());
         }
      }

      /**
       * Register a namespace prefix
       */
      private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter,
            java.lang.String namespace)
                  throws javax.xml.stream.XMLStreamException {
         java.lang.String prefix = xmlWriter.getPrefix(namespace);

         if (prefix == null) {
            prefix = generatePrefix(namespace);

            javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

            while (true) {
               java.lang.String uri = nsContext.getNamespaceURI(prefix);

               if ((uri == null) || (uri.length() == 0)) {
                  break;
               }

               prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
            }

            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
         }

         return prefix;
      }

      /**
       *  Factory class that keeps the parse method
       */
      public static class Factory {
         private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

         /**
          * static method to create the object
          * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
          *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
          * Postcondition: If this object is an element, the reader is positioned at its end element
          *                If this object is a complex type, the reader is positioned at the end element of its outer element
          */
         public static AverageOfThree parse(
               javax.xml.stream.XMLStreamReader reader)
                     throws java.lang.Exception {
            AverageOfThree object = new AverageOfThree();

            int event;
            javax.xml.namespace.QName currentQName = null;
            java.lang.String nillableValue = null;
            java.lang.String prefix = "";
            java.lang.String namespaceuri = "";

            try {
               while (!reader.isStartElement() && !reader.isEndElement())
                  reader.next();

               currentQName = reader.getName();

               if (reader.getAttributeValue(
                     "http://www.w3.org/2001/XMLSchema-instance",
                     "type") != null) {
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");

                  if (fullTypeName != null) {
                     java.lang.String nsPrefix = null;

                     if (fullTypeName.indexOf(":") > -1) {
                        nsPrefix = fullTypeName.substring(0,
                              fullTypeName.indexOf(":"));
                     }

                     nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                     java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                           ":") + 1);

                     if (!"averageOfThree".equals(type)) {
                        //find namespace for the prefix
                        java.lang.String nsUri = reader.getNamespaceContext()
                              .getNamespaceURI(nsPrefix);

                        return (AverageOfThree) ExtensionMapper.getTypeObject(nsUri,
                              type, reader);
                     }
                  }
               }

               // Note all attributes that were handled. Used to differ normal attributes
               // from anyAttributes.
               java.util.Vector handledAttributes = new java.util.Vector();

               reader.next();

               while (!reader.isStartElement() && !reader.isEndElement())
                  reader.next();

               if ((reader.isStartElement() &&
                     new javax.xml.namespace.QName("http://naxxo",
                           "args0").equals(reader.getName())) ||
                           new javax.xml.namespace.QName("", "args0").equals(
                                 reader.getName())) {
                  nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "nil");

                  if ("true".equals(nillableValue) ||
                        "1".equals(nillableValue)) {
                     throw new org.apache.axis2.databinding.ADBException(
                           "The element: " + "args0" + "  cannot be null");
                  }

                  java.lang.String content = reader.getElementText();

                  object.setArgs0(org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(
                        content));

                  reader.next();
               } // End of if for expected property start element

               else {
                  // 1 - A start element we are not expecting indicates an invalid parameter was passed
                  throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
               }

               while (!reader.isStartElement() && !reader.isEndElement())
                  reader.next();

               if ((reader.isStartElement() &&
                     new javax.xml.namespace.QName("http://naxxo",
                           "args1").equals(reader.getName())) ||
                           new javax.xml.namespace.QName("", "args1").equals(
                                 reader.getName())) {
                  nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "nil");

                  if ("true".equals(nillableValue) ||
                        "1".equals(nillableValue)) {
                     throw new org.apache.axis2.databinding.ADBException(
                           "The element: " + "args1" + "  cannot be null");
                  }

                  java.lang.String content = reader.getElementText();

                  object.setArgs1(org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(
                        content));

                  reader.next();
               } // End of if for expected property start element

               else {
                  // 1 - A start element we are not expecting indicates an invalid parameter was passed
                  throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
               }

               while (!reader.isStartElement() && !reader.isEndElement())
                  reader.next();

               if ((reader.isStartElement() &&
                     new javax.xml.namespace.QName("http://naxxo",
                           "args2").equals(reader.getName())) ||
                           new javax.xml.namespace.QName("", "args2").equals(
                                 reader.getName())) {
                  nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "nil");

                  if ("true".equals(nillableValue) ||
                        "1".equals(nillableValue)) {
                     throw new org.apache.axis2.databinding.ADBException(
                           "The element: " + "args2" + "  cannot be null");
                  }

                  java.lang.String content = reader.getElementText();

                  object.setArgs2(org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(
                        content));

                  reader.next();
               } // End of if for expected property start element

               else {
                  // 1 - A start element we are not expecting indicates an invalid parameter was passed
                  throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
               }

               while (!reader.isStartElement() && !reader.isEndElement())
                  reader.next();

               if (reader.isStartElement()) {
                  // 2 - A start element we are not expecting indicates a trailing invalid property
                  throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
               }
            } catch (javax.xml.stream.XMLStreamException e) {
               throw new java.lang.Exception(e);
            }

            return object;
         }
      } //end of factory class
   }

   public static class ReverseResponse implements org.apache.axis2.databinding.ADBBean {
      public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://naxxo",
            "reverseResponse", "ns1");

      /**
       * field for _return
       */
      protected java.lang.String local_return;

      /*  This tracker boolean wil be used to detect whether the user called the set method
       *   for this attribute. It will be used to determine whether to include this field
       *   in the serialized XML
       */
      protected boolean local_returnTracker = false;

      public boolean is_returnSpecified() {
         return local_returnTracker;
      }

      /**
       * Auto generated getter method
       * @return java.lang.String
       */
      public java.lang.String get_return() {
         return local_return;
      }

      /**
       * Auto generated setter method
       * @param param _return
       */
      public void set_return(java.lang.String param) {
         local_returnTracker = true;

         this.local_return = param;
      }

      /**
       *
       * @param parentQName
       * @param factory
       * @return org.apache.axiom.om.OMElement
       */
      public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory)
                  throws org.apache.axis2.databinding.ADBException {
         return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
               this, MY_QNAME));
      }

      public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter)
                  throws javax.xml.stream.XMLStreamException,
                  org.apache.axis2.databinding.ADBException {
         serialize(parentQName, xmlWriter, false);
      }

      public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
                  throws javax.xml.stream.XMLStreamException,
                  org.apache.axis2.databinding.ADBException {
         java.lang.String prefix = null;
         java.lang.String namespace = null;

         prefix = parentQName.getPrefix();
         namespace = parentQName.getNamespaceURI();
         writeStartElement(prefix, namespace, parentQName.getLocalPart(),
               xmlWriter);

         if (serializeType) {
            java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                  "http://naxxo");

            if ((namespacePrefix != null) &&
                  (namespacePrefix.trim().length() > 0)) {
               writeAttribute("xsi",
                     "http://www.w3.org/2001/XMLSchema-instance", "type",
                     namespacePrefix + ":reverseResponse", xmlWriter);
            } else {
               writeAttribute("xsi",
                     "http://www.w3.org/2001/XMLSchema-instance", "type",
                     "reverseResponse", xmlWriter);
            }
         }

         if (local_returnTracker) {
            namespace = "http://naxxo";
            writeStartElement(null, namespace, "return", xmlWriter);

            if (local_return == null) {
               // write the nil attribute
               writeAttribute("xsi",
                     "http://www.w3.org/2001/XMLSchema-instance", "nil",
                     "1", xmlWriter);
            } else {
               xmlWriter.writeCharacters(local_return);
            }

            xmlWriter.writeEndElement();
         }

         xmlWriter.writeEndElement();
      }

      private static java.lang.String generatePrefix(
            java.lang.String namespace) {
         if (namespace.equals("http://naxxo")) {
            return "ns1";
         }

         return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
      }

      /**
       * Utility method to write an element start tag.
       */
      private void writeStartElement(java.lang.String prefix,
            java.lang.String namespace, java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
                  throws javax.xml.stream.XMLStreamException {
         java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

         if (writerPrefix != null) {
            xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
         } else {
            if (namespace.length() == 0) {
               prefix = "";
            } else if (prefix == null) {
               prefix = generatePrefix(namespace);
            }

            xmlWriter.writeStartElement(prefix, localPart, namespace);
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
         }
      }

      /**
       * Util method to write an attribute with the ns prefix
       */
      private void writeAttribute(java.lang.String prefix,
            java.lang.String namespace, java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
                  throws javax.xml.stream.XMLStreamException {
         java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

         if (writerPrefix != null) {
            xmlWriter.writeAttribute(writerPrefix, namespace, attName,
                  attValue);
         } else {
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
            xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
         }
      }

      /**
       * Util method to write an attribute without the ns prefix
       */
      private void writeAttribute(java.lang.String namespace,
            java.lang.String attName, java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
                  throws javax.xml.stream.XMLStreamException {
         if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attValue);
         } else {
            xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace),
                  namespace, attName, attValue);
         }
      }

      /**
       * Util method to write an attribute without the ns prefix
       */
      private void writeQNameAttribute(java.lang.String namespace,
            java.lang.String attName, javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
                  throws javax.xml.stream.XMLStreamException {
         java.lang.String attributeNamespace = qname.getNamespaceURI();
         java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

         if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
         }

         java.lang.String attributeValue;

         if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
         } else {
            attributeValue = qname.getLocalPart();
         }

         if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
         } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(attributePrefix, namespace, attName,
                  attributeValue);
         }
      }

      /**
       *  method to handle Qnames
       */
      private void writeQName(javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
                  throws javax.xml.stream.XMLStreamException {
         java.lang.String namespaceURI = qname.getNamespaceURI();

         if (namespaceURI != null) {
            java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

            if (prefix == null) {
               prefix = generatePrefix(namespaceURI);
               xmlWriter.writeNamespace(prefix, namespaceURI);
               xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
               xmlWriter.writeCharacters(prefix + ":" +
                     org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                           qname));
            } else {
               // i.e this is the default namespace
               xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                     qname));
            }
         } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                  qname));
         }
      }

      private void writeQNames(javax.xml.namespace.QName[] qnames,
            javax.xml.stream.XMLStreamWriter xmlWriter)
                  throws javax.xml.stream.XMLStreamException {
         if (qnames != null) {
            // we have to store this data until last moment since it is not possible to write any
            // namespace data after writing the charactor data
            java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
            java.lang.String namespaceURI = null;
            java.lang.String prefix = null;

            for (int i = 0; i < qnames.length; i++) {
               if (i > 0) {
                  stringToWrite.append(" ");
               }

               namespaceURI = qnames[i].getNamespaceURI();

               if (namespaceURI != null) {
                  prefix = xmlWriter.getPrefix(namespaceURI);

                  if ((prefix == null) || (prefix.length() == 0)) {
                     prefix = generatePrefix(namespaceURI);
                     xmlWriter.writeNamespace(prefix, namespaceURI);
                     xmlWriter.setPrefix(prefix, namespaceURI);
                  }

                  if (prefix.trim().length() > 0) {
                     stringToWrite.append(prefix).append(":")
                     .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                           qnames[i]));
                  } else {
                     stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                           qnames[i]));
                  }
               } else {
                  stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qnames[i]));
               }
            }

            xmlWriter.writeCharacters(stringToWrite.toString());
         }
      }

      /**
       * Register a namespace prefix
       */
      private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter,
            java.lang.String namespace)
                  throws javax.xml.stream.XMLStreamException {
         java.lang.String prefix = xmlWriter.getPrefix(namespace);

         if (prefix == null) {
            prefix = generatePrefix(namespace);

            javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

            while (true) {
               java.lang.String uri = nsContext.getNamespaceURI(prefix);

               if ((uri == null) || (uri.length() == 0)) {
                  break;
               }

               prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
            }

            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
         }

         return prefix;
      }

      /**
       *  Factory class that keeps the parse method
       */
      public static class Factory {
         private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

         /**
          * static method to create the object
          * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
          *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
          * Postcondition: If this object is an element, the reader is positioned at its end element
          *                If this object is a complex type, the reader is positioned at the end element of its outer element
          */
         public static ReverseResponse parse(
               javax.xml.stream.XMLStreamReader reader)
                     throws java.lang.Exception {
            ReverseResponse object = new ReverseResponse();

            int event;
            javax.xml.namespace.QName currentQName = null;
            java.lang.String nillableValue = null;
            java.lang.String prefix = "";
            java.lang.String namespaceuri = "";

            try {
               while (!reader.isStartElement() && !reader.isEndElement())
                  reader.next();

               currentQName = reader.getName();

               if (reader.getAttributeValue(
                     "http://www.w3.org/2001/XMLSchema-instance",
                     "type") != null) {
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");

                  if (fullTypeName != null) {
                     java.lang.String nsPrefix = null;

                     if (fullTypeName.indexOf(":") > -1) {
                        nsPrefix = fullTypeName.substring(0,
                              fullTypeName.indexOf(":"));
                     }

                     nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                     java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                           ":") + 1);

                     if (!"reverseResponse".equals(type)) {
                        //find namespace for the prefix
                        java.lang.String nsUri = reader.getNamespaceContext()
                              .getNamespaceURI(nsPrefix);

                        return (ReverseResponse) ExtensionMapper.getTypeObject(nsUri,
                              type, reader);
                     }
                  }
               }

               // Note all attributes that were handled. Used to differ normal attributes
               // from anyAttributes.
               java.util.Vector handledAttributes = new java.util.Vector();

               reader.next();

               while (!reader.isStartElement() && !reader.isEndElement())
                  reader.next();

               if ((reader.isStartElement() &&
                     new javax.xml.namespace.QName("http://naxxo",
                           "return").equals(reader.getName())) ||
                           new javax.xml.namespace.QName("", "return").equals(
                                 reader.getName())) {
                  nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "nil");

                  if (!"true".equals(nillableValue) &&
                        !"1".equals(nillableValue)) {
                     java.lang.String content = reader.getElementText();

                     object.set_return(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                           content));
                  } else {
                     reader.getElementText(); // throw away text nodes if any.
                  }

                  reader.next();
               } // End of if for expected property start element

               else {
               }

               while (!reader.isStartElement() && !reader.isEndElement())
                  reader.next();

               if (reader.isStartElement()) {
                  // 2 - A start element we are not expecting indicates a trailing invalid property
                  throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
               }
            } catch (javax.xml.stream.XMLStreamException e) {
               throw new java.lang.Exception(e);
            }

            return object;
         }
      } //end of factory class
   }
}
