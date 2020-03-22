/**
 * AgentLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri.ns_xsd.agent_wsdl;

public class AgentLocator extends org.apache.axis.client.Service implements org.tempuri.ns_xsd.agent_wsdl.Agent {

/**
 * gSOAP 2.8.98 generated service definition
 */

    public AgentLocator() {
    }


    public AgentLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AgentLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for agent
    private java.lang.String agent_address = "http://91.166.177.209:8080";

    public java.lang.String getagentAddress() {
        return agent_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String agentWSDDServiceName = "agent";

    public java.lang.String getagentWSDDServiceName() {
        return agentWSDDServiceName;
    }

    public void setagentWSDDServiceName(java.lang.String name) {
        agentWSDDServiceName = name;
    }

    public org.tempuri.ns_xsd.agent_wsdl.AgentPortType getagent() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(agent_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getagent(endpoint);
    }

    public org.tempuri.ns_xsd.agent_wsdl.AgentPortType getagent(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.tempuri.ns_xsd.agent_wsdl.AgentStub _stub = new org.tempuri.ns_xsd.agent_wsdl.AgentStub(portAddress, this);
            _stub.setPortName(getagentWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setagentEndpointAddress(java.lang.String address) {
        agent_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.tempuri.ns_xsd.agent_wsdl.AgentPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                org.tempuri.ns_xsd.agent_wsdl.AgentStub _stub = new org.tempuri.ns_xsd.agent_wsdl.AgentStub(new java.net.URL(agent_address), this);
                _stub.setPortName(getagentWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("agent".equals(inputPortName)) {
            return getagent();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/ns.xsd/agent.wsdl", "agent");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/ns.xsd/agent.wsdl", "agent"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("agent".equals(portName)) {
            setagentEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
