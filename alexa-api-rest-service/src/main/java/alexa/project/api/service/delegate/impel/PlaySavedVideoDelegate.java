package alexa.project.api.service.delegate.impel;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import org.apache.axis.client.Stub;
import org.springframework.stereotype.Component;

import com.amdocs.ch.api.mobile.Id;
import com.amdocs.ch.api.mobile.MobileHomeService_PortType;
import com.amdocs.ch.api.mobile.MobileHomeService_ServiceLocator;
import com.amdocs.ch.api.mobile.RecordedVideoRequest;
import com.amdocs.ch.api.mobile.RecordedVideosCamerasNamesResponse;
import com.amdocs.ch.api.mobile.VideoRecord;
import com.amdocs.ch.api.mobile.VideoRecordsRequest;
import com.amdocs.ch.api.mobile.VideoRecordsResponse;
import com.amdocs.ch.api.mobile.VideoSession;
import com.amdocs.ch.publicapi.service.AuthenticationResponse;
import com.amdocs.ch.publicapi.service.AuthenticationServiceProxy;

import alexa.project.api.service.delegate.interfaces.IPlaySavedVideoDelegate;
import alexa.project.api.service.delegate.interfaces.IStartVideoStreamingDelegate;
@Component
public class PlaySavedVideoDelegate implements IPlaySavedVideoDelegate{
	private AuthenticationServiceProxy m_AuthenticationServiceProxy;
	
	private MobileHomeService_ServiceLocator m_MobileHomeService_ServiceLocator;
	
	public PlaySavedVideoDelegate() {
		m_AuthenticationServiceProxy = new AuthenticationServiceProxy();
	}
	
	@SuppressWarnings("null")
	@Override
	public VideoRecord GetSavedVideo(String name)
	{
		VideoRecordsResponse allSavedVideos=null;
		try {
			AuthenticationResponse respones = m_AuthenticationServiceProxy.authenticate("PM360DX1", "Password1");
			m_MobileHomeService_ServiceLocator = new MobileHomeService_ServiceLocator();
			
			MobileHomeService_PortType client = m_MobileHomeService_ServiceLocator.getMobileHomeServicePort();
			((Stub) client)._setProperty(javax.xml.rpc.Call.USERNAME_PROPERTY, "PM360DX1");
			((Stub) client)._setProperty(javax.xml.rpc.Call.PASSWORD_PROPERTY, respones.getAuthenticationDetails().getSecurityToken());
			
			VideoRecordsRequest request = new VideoRecordsRequest();
			request.setGatewayId(166004);
			allSavedVideos = client.getRecordedVideos(request);
			long length = allSavedVideos.getTotalCount();
			for(int i=0;i<length; i++)
			{
				if(allSavedVideos.getRecordedVideos(i).getFileName().contains(name))
					return allSavedVideos.getRecordedVideos(i);
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
}
