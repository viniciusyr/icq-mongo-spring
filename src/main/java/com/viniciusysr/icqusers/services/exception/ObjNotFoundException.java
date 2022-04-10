package com.viniciusysr.icqusers.services.exception;

import java.io.Serial;

public class ObjNotFoundException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;

    public ObjNotFoundException(String msg) {
        super(msg);
    }
}
