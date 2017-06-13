package com.ch9.test9_11;

/**
 * 假设一个邮件，不仅需要符合EmailInterface接口对电子邮件规范的要求，
 * 而且需要符合对发送端和接受端口号规范的要求，
 * 才允许成为一个合格的电子邮件
 * @author gg
 *
 */
public interface PortInterface {
	//设置发送端端口号
	public void setSendPort(int port);
	//设置接受端端口号
	public void setReceivePort(int port);
}
