package com.kogent.servlet;

import static com.kogent.servlet.FormConstants.*;

/**
 * Utility class to generate URLs for Customer application
 */
public class UrlUtils {

    private static String makeActionUrl(String action) {
        return CONTROLLER + "?" + FIELD_ACTION + "=" + action;
    }

    public static String makeCustomerViewUrl(String customerId) {
        return makeActionUrl(ACTION_VIEW_FORM) + "&" + FIELD_CUSTOMER_ID
                + "=" + customerId;
    }
}
