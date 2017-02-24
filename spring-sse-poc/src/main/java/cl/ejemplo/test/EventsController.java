package cl.ejemplo.test;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

/*
 * http://javaandspring.blogspot.cl/2015/11/server-sent-events-in-spring-42.html
 */
@Controller
public class EventsController {

	private static Map<Long, SseEmitter> sseemiters = new Hashtable<Long, SseEmitter>(1);
	
	@RequestMapping(value ="/events/publish", method=RequestMethod.GET)
	public String showEventPublishingPage(Model model) {
		model.addAttribute("eventMsg", "");
		model.addAttribute("successMsg", "");
		
		return "publishEvent";
	}
	
	@RequestMapping(value ="/events/subscribe", method=RequestMethod.GET)
	public String showEventSubscriptionPage(Model model) {
		return "subscribeEvent";
	}
	
	@RequestMapping(value ="/events/connect", method=RequestMethod.GET)
	public SseEmitter openConnection() {
		if(sseemiters.isEmpty()) {
			sseemiters.put(1L, new SseEmitter()); // TODO: 30000L ???
		}
		
		return sseemiters.get(1L);
	}
	
	
	@RequestMapping(value ="/events/broadcast", method=RequestMethod.POST)
	public String broadcastMessage(Model model, @RequestParam("eventMsg") String msg) throws IOException  {
		System.out.println("sseemiters=" + sseemiters);
		System.out.println("sseemiters.get(1L)=" + sseemiters.get(1L));

		sseemiters.get(1L).send(msg, MediaType.TEXT_PLAIN);
		model.addAttribute("successMsg", "Message broadcasted.");
		
		// Notice the commented call to complete; this signifies that server has closed the connection to that client. This results in browser frenzied attempts to reconnect.
		// sseemiters.get(1L).complete();
		
		return "publishEvent";
	}

}

