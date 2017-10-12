package me.puras.mo.seed.kotlin.controller;

import org.springframework.beans.factory.annotation.Autowired;

import me.puras.common.json.Response;
import me.puras.common.json.ResponseHelper;
import me.puras.common.util.ClientListSlice;
import me.puras.common.util.ListBounds;
import me.puras.common.util.ListSlice;
import me.puras.common.util.Pagination;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

public abstract class BaseController {
    protected boolean pageable;

    @Autowired
    public MessageSource messageSource;

    public static final Locale DEFAULT_LOCALE = Locale.SIMPLIFIED_CHINESE;

    public BaseController() {
        this.pageable = false;
    }


    protected ListBounds getBounds(Pagination pagination) {
        return new ListBounds(pagination.getStartIndex(), pagination.getPageSize());
    }

    protected ClientListSlice<?> getClientListSlice(Pagination pagination, ListSlice<?> slice) {
        if (null == slice) return null;
        pagination.setTotalCount(Long.valueOf(slice.getTotal()));
        return new ClientListSlice(slice, pagination.getCurrentPage(), pagination.getPageSize());
    }

    protected ClientListSlice<?> getClientListSlice(ListSlice<?> slice) {
        if (null == slice) return null;
        return new ClientListSlice(slice, 0L, slice.getTotal());
    }

    protected Response updateResultResponse(Response resp, Pagination pagination, ListSlice slice) {
        if(pagination == null){
            resp.setPayload(getClientListSlice(slice));
        } else {
            resp.setPayload(getClientListSlice(pagination, slice));
        }
        return resp;
    }

    protected Response updateResultResponse(Pagination pagination, ListSlice slice) {
        Response resp = ResponseHelper.createSuccessResponse();
        return updateResultResponse(resp, pagination, slice);
    }

    protected String getMessage(String key) {
        return messageSource.getMessage(key, null, DEFAULT_LOCALE);
    }

    public String getMessage(String key, Object[] objs) {
        return messageSource.getMessage(key, objs, DEFAULT_LOCALE);
    }

}
