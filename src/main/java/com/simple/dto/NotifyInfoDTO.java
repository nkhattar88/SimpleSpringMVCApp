package com.simple.dto;

import java.util.Arrays;

public class NotifyInfoDTO {

	private String[] to;
	private String msg;
	private int deliverymode;

	public String[] getTo() {
		return to;
	}

	public void setTo(String[] to) {
		this.to = to;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getDeliverymode() {
		return deliverymode;
	}

	public void setDeliverymode(int deliverymode) {
		this.deliverymode = deliverymode;
	}

	@Override
	public String toString() {
		return "NotifyInfoDTO [to=" + Arrays.toString(to) + ", msg=" + msg
				+ ", deliverymode=" + deliverymode + "]";
	}

}
