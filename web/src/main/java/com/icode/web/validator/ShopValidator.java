package com.icode.web.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * Created with IntelliJ IDEA.
 * User: ZhongGang
 * Date: 13-6-18
 * Time: 上午12:40
 */
public class ShopValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        throw new UnsupportedOperationException("Not yet implemented!");
    }

    @Override
    public void validate(Object target, Errors errors) {
        throw new UnsupportedOperationException("Not yet implemented!");
    }
}
