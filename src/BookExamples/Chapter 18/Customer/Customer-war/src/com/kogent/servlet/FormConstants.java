package com.kogent.servlet;

/**
 * Some constants used in servlets and jsps for Customer application
 */
public class FormConstants {

    // Form Actions
    public static final String ACTION_QUERY_FORM = "queryForm";
    public static final String ACTION_VIEW_FORM = "viewForm";
    public static final String ACTION_QUERY = "query";
    public static final String ACTION_EDIT_FORM = "edit";
    
    // Form Fields
    public static final String FIELD_ACTION = "action";
    public static final String FIELD_COMPANY = "company";
    public static final String FIELD_FNAME = "fname";
    public static final String FIELD_LNAME= "lname";
    public static final String FIELD_CUSTOMER_ID = "customer_id";
    public static final String FIELD_EMAIL = "email";
    public static final String FIELD_PHONE = "phone";
    public static final String FIELD_ADDRESS1 = "address1";
    public static final String FIELD_ADDRESS2 = "address2";
    public static final String FIELD_CITY = "city";
    public static final String FIELD_STATE = "state";
    public static final String FIELD_ZIP = "zip";

    
    // Request attributes
    public static final String ATTRIBUTE_CUSTOMER = "customer";
    public static final String ATTRIBUTE_CUSTOMER_LIST = "customer_list";

    // Controller Servlet
    public static final String CONTROLLER = "CustomerServlet";

}
