package billpublisher;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;



public class BillActivator implements BundleActivator {

	ServiceRegistration servicReg;

	public void start(BundleContext context) throws Exception {
		BillServicePublisher billPublish = new BillServicePublisherImpl();
		servicReg = context.registerService(BillServicePublisher.class.getName(), billPublish, null);
	}

	public void stop(BundleContext context) throws Exception {
		servicReg.unregister();
	}

}
