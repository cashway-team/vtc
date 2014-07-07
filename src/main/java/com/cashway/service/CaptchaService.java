/*
 * Copyright 2005-2013 shopxx.net. All rights reserved.
 * Support: http://www.shopxx.net
 * License: http://www.shopxx.net/license
 */
package com.cashway.service;

import com.cashway.common.Setting;

import java.awt.image.BufferedImage;

public interface CaptchaService {

	BufferedImage buildImage(String captchaId);

	boolean isValid(Setting.CaptchaType captchaType, String captchaId, String captcha);

}