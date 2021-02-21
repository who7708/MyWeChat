package com.lqr.wechat.model.exception;

import com.lqr.wechat.R;
import com.lqr.wechat.util.UIUtils;

/**
 * @author Chris
 *  服务器异常
 */
public class ServerException extends Exception {

    public ServerException(int errorCode) {
        this(UIUtils.getString(R.string.error_code) + errorCode);
    }

    public ServerException(String message) {
        super(message);
    }

}
