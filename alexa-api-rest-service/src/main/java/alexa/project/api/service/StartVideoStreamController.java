package alexa.project.api.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.amdocs.ch.api.mobile.CustomerDevice;
import com.amdocs.ch.api.mobile.Id;
import com.amdocs.ch.api.mobile.VideoRecord;
import com.amdocs.ch.api.mobile.VideoSession;

import alexa.project.api.service.delegate.impel.GetAllDevicesDelegate;
import alexa.project.api.service.delegate.impel.PlaySavedVideoDelegate;
import alexa.project.api.service.delegate.impel.StratVideoStreamingDelegate;
import alexa.project.api.service.delegate.interfaces.IGetAllDevicesDelegate;
import alexa.project.api.service.delegate.interfaces.IPlaySavedVideoDelegate;
import alexa.project.api.service.delegate.interfaces.IStartVideoStreamingDelegate;

import java.security.Principal;

@RestController
@RequestMapping("/rest")
public class StartVideoStreamController {


    @GetMapping("/principal")
    public Principal user(Principal principal) {
        return principal;
    }
    
    @GetMapping(value = "/startVideoStream")
    @ResponseBody
    public VideoSession startVideoStream(@RequestParam("id") String id){
		IStartVideoStreamingDelegate delegate = new StratVideoStreamingDelegate();
		return delegate.GetVideoStream(id);
		
    }
        @GetMapping(value = "/playSavedVideo")
        @ResponseBody
    public VideoRecord playSavedVideo(@RequestParam("name") String name) {
       	IPlaySavedVideoDelegate delegate = new PlaySavedVideoDelegate();
		return delegate.GetSavedVideo(name);
		
    }
    @GetMapping("/getAllDevices")
    public CustomerDevice[] GetAllDevices(@RequestParam(value="videoId", defaultValue="1") long name) {
    	IGetAllDevicesDelegate delegate = new GetAllDevicesDelegate();
		return delegate.GetAllDevices();
		
    }

}
