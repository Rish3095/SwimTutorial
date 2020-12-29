package Notes;

import swim.api.plane.AbstractPlane;
import swim.api.agent.AgentRoute;

public class Plane extends AbstractPlane{
	/*
	 Swim server runs a plane that manages the runtime of a group of web agents & provides shared context for a group of web agents.
	 - Resolves Agent URIs for requests.
	 - So we are annotating a field to each Agent with a corresponding URI pattern.
	 
	 
	 */
	
	// Make sure the URI patterns don't clash within the same plane.
	@SwimRoute("/unit/:id")
	AgentRoute<WebAgents> unitAgentType;
}


























/*
 - Colons indicate dynamic components
 */