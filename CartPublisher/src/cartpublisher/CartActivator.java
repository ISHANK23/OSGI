package cartpublisher;



import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import com.res2.Strings;

import cartpublisher.CartServicePublisher;
import cartpublisher.CartServicePublisherImpl;

public class CartActivator implements BundleActivator {

	ServiceRegistration serviceReg;

	public void start(BundleContext context) throws Exception {
		CartServicePublisher billPublish = new CartServicePublisherImpl();
		serviceReg = context.registerService(CartServicePublisher.class.getName(), billPublish, null);
	}

	public void stop(BundleContext context) throws Exception {
		serviceReg.unregister();
	}

}
