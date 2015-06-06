/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.bootsfaces.component.validators;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author ysantana
 */
@FacesValidator(RequiredInputTextValidator.VALIDATOR)
public class RequiredInputTextValidator implements Validator {
    public final static String VALUE_REQUIRED_MSG = "InputText value required";
    public final static String VALIDATOR = "net.bootsfaces.validators.requiredInputTextValidator";

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        if (value == null || value.equals("")) {
            throw new ValidatorException(
                new FacesMessage(FacesMessage.SEVERITY_ERROR, component.getClientId(), VALUE_REQUIRED_MSG));
        }
    }
}
