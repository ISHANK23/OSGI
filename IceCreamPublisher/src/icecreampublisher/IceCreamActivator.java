package icecreampublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class IceCreamActivator implements BundleActivator {

	ServiceRegistration serviceReg;

	public void start(BundleContext bundleContext) throws Exception {

		IceCreamPublisher pService = new IceCreamPublisherImpl();
		serviceReg = bundleContext.registerService(IceCreamPublisher.class.getName(), pService, null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		

		serviceReg.unregister();
		
		
	}

}
