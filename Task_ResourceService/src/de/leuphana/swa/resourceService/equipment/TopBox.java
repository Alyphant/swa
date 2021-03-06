package de.leuphana.swa.resourceService.equipment;

import de.leuphana.swa.resourceService.resource.Resource;

public class TopBox extends Equipment {

	
	
	public TopBox(Resource resource) {
		super(resource);
	}

	public double getPrice() {
		return resource.getPrice() + 120.0;
	}

	@Override
	public void getSelectedResource() {
		resource.getSelectedResource();

		System.out.println(" additional TopBox is ordered !");
		
	}
	
}
