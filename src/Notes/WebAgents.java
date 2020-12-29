package Notes;

import swim.api.agent.AbstractAgent;

public class WebAgents extends AbstractAgent {
	/*
	General purpose distributed object model called web agents.
	Typical OOPS with addressability, statefulness, consistency, boundedness, composability.
	
	** Declaration
	- Lifecycle callback functions are used by web agents to invoke methods. (They are called during specified stages of a web agents lifetime)
	- Web agents instantiation is not accomplished by invoking a constructor.
	- Instantiations define the behaviour of the web agents.
	
	** Instantiation
	- First half: Agent gets its own identifier. Second half: Swim servers runs Plane for every group of web agents.
	- When nodeUri() is invoked.
	
	** Convineince Methods:
	- getProp(String prop) will return structure.Text if it exist, else absent(). Ex.: getProp("id").
	- 
	
	** Lifecycle Callbacks: Swim runtime schedules and executes callbacks stages of an Agents lifecycle.
	- didStart(): After agent starts.
	- willStop(): Right before agent stops.
	- 
	- 
	 */
	
	//Lifecycle methods
	@Override
	public void didStart() {
	  logMessage("didStart");
	}
	
	//Lifecycle methods
	@Override
	public void willStop() {
	  logMessage("willStop");
	}
	
	// **Addressability: Universal logical address, URI. 
	private void logMessage(Object msg) {
		  System.out.println(nodeUri() + ": " + msg);
		}
	
	
}
