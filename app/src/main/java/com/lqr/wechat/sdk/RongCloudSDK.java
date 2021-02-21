package com.lqr.wechat.sdk;

/**
 * @author Chris
 *  RongIMClient提供的SDK
 */

public class RongCloudSDK {

    private static RongCloudSDK mInstance;

    private RongCloudSDK() {
    }

    public static RongCloudSDK getInstance() {
        if (mInstance == null) {
            synchronized (RongCloudSDK.class) {
                if (mInstance == null) {
                    mInstance = new RongCloudSDK();
                }
            }
        }
        return mInstance;
    }
}
