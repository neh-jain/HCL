package org.alvas.spring_xml.objectref_injextion;

public class Laptop {
	Usb usb;
	public void setUsb(Usb usb)
	{
		this.usb = usb;
	}
	public void getLaptop()
	{
		System.out.println("In my laptop");
		usb.getUsb();
	}

}
