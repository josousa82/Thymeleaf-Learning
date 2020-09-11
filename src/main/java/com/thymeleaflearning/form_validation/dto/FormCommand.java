package com.thymeleaflearning.form_validation.dto;

import lombok.Data;

/**
 * Created by sousaJ on 10/09/2020
 * in package - com.thymeleaflearning.form_validation.dto
 **/
@Data
public class FormCommand {

    public String textField;

    public String textareaField;

    public String colorField;

    public String datetimeField;

    public boolean singleCheckboxField;

    public String[] multiCheckboxSelectedValues;

    public String radioButtonSelectValue;

    public String dropdownSelectedValue;

}
