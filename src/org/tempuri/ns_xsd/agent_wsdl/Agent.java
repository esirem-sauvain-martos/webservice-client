/**
 * Agent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri.ns_xsd.agent_wsdl;

public interface Agent extends javax.xml.rpc.Service {

/**
 * gSOAP 2.8.98 generated service definition
 */
    public java.lang.String getagentAddress();

    public org.tempuri.ns_xsd.agent_wsdl.AgentPortType getagent() throws javax.xml.rpc.ServiceException;

    public org.tempuri.ns_xsd.agent_wsdl.AgentPortType getagent(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
