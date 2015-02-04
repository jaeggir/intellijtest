package ch.rogerjaeggi.intellijtest.web;

import org.springframework.web.filter.HiddenHttpMethodFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

public class WebServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    private static final String SERVLET_NAME = "test";

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] {
                ApplicationConfiguration.class
        };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] {
                MvcConfiguration.class
        };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/api/*" };
    }

    @Override
    protected String getServletName() {
        return SERVLET_NAME;
    }

    @Override
    protected Filter[] getServletFilters() {
        return new Filter[] {
                new HiddenHttpMethodFilter()
        };
    }

}