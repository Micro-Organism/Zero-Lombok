package com.zero.lombok.common.model;

import lombok.SneakyThrows;

import java.io.UnsupportedEncodingException;

public class Demo6 {

	@SneakyThrows(UnsupportedEncodingException.class)
	public String utf8ToString(byte[] bytes) {
		return new String(bytes, "UTF8");
	}

}
