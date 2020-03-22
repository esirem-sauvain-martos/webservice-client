/**
 * AgentPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri.ns_xsd.agent_wsdl;

public interface AgentPortType extends java.rmi.Remote {

    /**
     * Service definition of function ns__get_cpu_info
     */
    public java.lang.String getCpuInfo() throws java.rmi.RemoteException;

    /**
     * Service definition of function ns__get_cpu_usage
     */
    public float getCpuUsage() throws java.rmi.RemoteException;

    /**
     * Service definition of function ns__get_memory_info
     */
    public java.lang.String getMemoryInfo() throws java.rmi.RemoteException;

    /**
     * Service definition of function ns__get_memory_available
     */
    public int getMemoryAvailable() throws java.rmi.RemoteException;

    /**
     * Service definition of function ns__get_memory_free
     */
    public int getMemoryFree() throws java.rmi.RemoteException;

    /**
     * Service definition of function ns__get_drive_number
     */
    public org.apache.axis.types.UnsignedInt getDriveNumber() throws java.rmi.RemoteException;

    /**
     * Service definition of function ns__get_drive_names
     */
    public java.lang.String getDriveNames() throws java.rmi.RemoteException;

    /**
     * Service definition of function ns__get_drive_info
     */
    public java.lang.String getDriveInfo(java.lang.String name) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns__get_drive_total_capacity
     */
    public float getDriveTotalCapacity(java.lang.String name) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns__get_drive_used_capatity
     */
    public float getDriveUsedCapatity(java.lang.String name) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns__get_interface_number
     */
    public org.apache.axis.types.UnsignedInt getInterfaceNumber() throws java.rmi.RemoteException;

    /**
     * Service definition of function ns__get_interface_names
     */
    public java.lang.String getInterfaceNames() throws java.rmi.RemoteException;

    /**
     * Service definition of function ns__get_interface_info
     */
    public java.lang.String getInterfaceInfo(java.lang.String name) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns__get_interface_ip_address
     */
    public java.lang.String getInterfaceIpAddress(java.lang.String name) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns__get_interface_speed
     */
    public int getInterfaceSpeed(java.lang.String name) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns__set_hostname
     */
    public void setHostname(java.lang.String hostname) throws java.rmi.RemoteException;

    /**
     * Service definition of function ns__set_interface_ip_address
     */
    public void setInterfaceIpAddress(java.lang.String name, java.lang.String ipAddress, java.lang.String subnetMask) throws java.rmi.RemoteException;
}
