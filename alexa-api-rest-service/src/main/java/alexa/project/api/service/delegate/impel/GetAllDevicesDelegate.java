package alexa.project.api.service.delegate.impel;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import org.apache.axis.client.Stub;

import com.amdocs.ch.api.mobile.CustomerDevice;
import com.amdocs.ch.api.mobile.MobileHomeService_PortType;
import com.amdocs.ch.api.mobile.MobileHomeService_ServiceLocator;
import com.amdocs.ch.api.mobile.ProductType;
import com.amdocs.ch.api.mobile.VideoRecordsRequest;
import com.amdocs.ch.api.mobile.VideoRecordsResponse;
import com.amdocs.ch.publicapi.service.AuthenticationResponse;
import com.amdocs.ch.publicapi.service.AuthenticationServiceProxy;

import alexa.project.api.service.delegate.interfaces.IGetAllDevicesDelegate;

public class GetAllDevicesDelegate implements IGetAllDevicesDelegate{
	
	private AuthenticationServiceProxy m_AuthenticationServiceProxy;
	
	private MobileHomeService_ServiceLocator m_MobileHomeService_ServiceLocator;
	
	public GetAllDevicesDelegate()
	{
		m_AuthenticationServiceProxy = new AuthenticationServiceProxy();
	}
	
	public CustomerDevice[] GetAllDevices()
	{
		 CustomerDevice[] devices=null;
		 ProductType[] types=new ProductType[5];
		 types[0]=ProductType.fromString("camera_sercomm_rc8110");
		 types[1]=ProductType.fromString("camera_sercomm_rc8111");
		 types[2]=ProductType.fromString("camera_sercomm_oc810");
		 types[3]=ProductType.fromString("camera_sercomm_oc821");
		 types[4]=ProductType.fromString("camera_sercomm_oc830");

		 try {
			AuthenticationResponse respones = m_AuthenticationServiceProxy.authenticate("PM360DX1", "Password1");
			m_MobileHomeService_ServiceLocator = new MobileHomeService_ServiceLocator();
			
			MobileHomeService_PortType client = m_MobileHomeService_ServiceLocator.getMobileHomeServicePort();
			((Stub) client)._setProperty(javax.xml.rpc.Call.USERNAME_PROPERTY, "PM360DX1");
			((Stub) client)._setProperty(javax.xml.rpc.Call.PASSWORD_PROPERTY, respones.getAuthenticationDetails().getSecurityToken());
			
			devices=client.getDevicesByType(166004,types);
			
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		return devices;
	}
}
