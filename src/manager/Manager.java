package manager;

import org.tempuri.ns_xsd.agent_wsdl.AgentLocator;
import org.tempuri.ns_xsd.agent_wsdl.AgentStub;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

public class Manager {
    public static void main(String[] args) throws RemoteException, MalformedURLException {
        AgentLocator agent = new AgentLocator();
        AgentStub stub = new AgentStub(new URL("http://91.166.177.209:8080"), agent);

        System.out.println(stub.getInterfaceNames());
    }
}
