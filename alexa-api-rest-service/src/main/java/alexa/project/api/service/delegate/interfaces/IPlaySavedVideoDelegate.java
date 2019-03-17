package alexa.project.api.service.delegate.interfaces;

import com.amdocs.ch.api.mobile.Id;
import com.amdocs.ch.api.mobile.VideoRecord;
import com.amdocs.ch.api.mobile.VideoSession;

public interface IPlaySavedVideoDelegate {
	public VideoRecord GetSavedVideo(String name);

}
