package com.imooc.security.core.validate.code;

import java.awt.image.BufferedImage;
import java.time.LocalDateTime;

/**
 * 验证码
 * ClassName: ImageCode 
 * @Description: 验证码
 * @author lihaoyang
 * @date 2018年3月1日
 */
public class ImageCode {

	private BufferedImage image;
	
	private String code;
	
	private LocalDateTime expireTime;//过期时间点
	

	/**
	 * 
	 * <p>Description: </p>
	 * @param image
	 * @param code
	 * @param expireTn 多少秒过期
	 */
	public ImageCode(BufferedImage image, String code, int expireTn) {
		super();
		this.image = image;
		this.code = code;
		//过期时间=当前时间+过期秒数 
		this.expireTime = LocalDateTime.now().plusSeconds(expireTn);
	}

	public BufferedImage getImage() {
		return image;
	}

	public void setImage(BufferedImage image) {
		this.image = image;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public LocalDateTime getExpireTime() {
		return expireTime;
	}

	public void setExpireTime(LocalDateTime expireTime) {
		this.expireTime = expireTime;
	}
	
	
}