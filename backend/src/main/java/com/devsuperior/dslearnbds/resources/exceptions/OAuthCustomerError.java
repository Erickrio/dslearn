package com.devsuperior.dslearnbds.resources.exceptions;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/*
 @ Erro que gero
 */
public class OAuthCustomerError implements Serializable {

    private static final long serialVersionUID = 1L;

    private String error;

    @JsonProperty("error_description")
    private String errorDescription;

    public OAuthCustomerError(){}

    public OAuthCustomerError(String error, String errorDescription) {
        this.error = error;
        this.errorDescription = errorDescription;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getErrorDescription() {
        return errorDescription;
    }

    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }


}
