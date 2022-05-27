package com.liferay.sample.portlet;

import com.liferay.sample.constants.SamplePortletKeys;
import com.liferay.sample.service.FooLocalService;

import java.io.IOException;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.UserLocalService;
import com.liferay.portal.kernel.util.ParamUtil;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author greeng
 */
@Component(
    immediate = true,
    property = {
        "com.liferay.portlet.display-category=category.sample",
        "com.liferay.portlet.header-portlet-css=/css/main.css",
        "com.liferay.portlet.instanceable=true",
        "javax.portlet.display-name=Sample",
        "javax.portlet.init-param.template-path=/",
        "javax.portlet.init-param.view-template=/view.jsp",
        "javax.portlet.name=" + SamplePortletKeys.SAMPLE,
        "javax.portlet.resource-bundle=content.Language",
        "javax.portlet.security-role-ref=power-user,user"
    },
    service = Portlet.class
)
public class SamplePortlet extends MVCPortlet {
	
	public void testMethod(ActionRequest request, ActionResponse response) throws IOException, PortletException {
        String first = ParamUtil.getString(request, "first");
        
        String identifyer = _userLocalService.getOSGiServiceIdentifier();
        System.out.println("identifier" + identifyer);
        System.out.print("db count <" + _fooLocalService.getUserCount() + ">");

    }
    

	@Reference
	protected void setUserLocalService(
			UserLocalService userLocalService) {

		_userLocalService = userLocalService;
	}
	
	@Reference
	protected void setFooLocalService(
		FooLocalService fooLocalService) {
		_fooLocalService = fooLocalService;
	}
	
    private FooLocalService _fooLocalService;
    private UserLocalService _userLocalService;

	
}