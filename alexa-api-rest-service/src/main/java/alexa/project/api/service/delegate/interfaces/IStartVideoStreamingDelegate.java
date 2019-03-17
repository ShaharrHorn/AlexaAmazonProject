package alexa.project.api.service.delegate.interfaces;

import com.amdocs.ch.api.mobile.VideoSession;

public interface IStartVideoStreamingDelegate {
	public VideoSession GetVideoStream(String id);
}
