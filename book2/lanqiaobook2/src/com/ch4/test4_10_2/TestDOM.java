package com.ch4.test4_10_2;

import java.io.IOException;

import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

public class TestDOM {
	public static void main(String[] args) {
		try {
			//1、创建解析器工厂
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			//2、通过解析工厂获得DOM解析器，即DocumentBuilder对象
			DocumentBuilder db = dbf.newDocumentBuilder();
			//3、解析指定xml文档，得到DOM节点树
			Document doc = db.parse("G:\\WorkSpace\\lanqiaobook2\\src\\com\\ch4\\test4_10_2\\vehicle_info.xml");
			//4、对DOM节点树进行操作，完成对XML文档的增删改查
			//得到根节点下的所有子节点
			NodeList vehicles = doc.getChildNodes();
			System.out.println("《租车系统》中共有："+vehicles.getLength()+"种类型的车！");
			//得到所有<truck>节点列表信息
			NodeList truckList = doc.getElementsByTagName("truck");
			System.out.println("《租车系统》中共有："+truckList.getLength()+"辆卡车！");
			NodeList carList = doc.getElementsByTagName("car");
			System.out.println("《组车系统》中共有："+carList.getLength()+"辆轿车!");
			//遍历所有轿车
			for (int i = 0; i < carList.getLength(); i++) {
				Node truck = carList.item(i);
				Element element = (Element) truck;
				String idValue = element.getAttribute("id");
				System.out.println("id为"+idValue+"的卡车信息为：");
				for (Node node = truck.getFirstChild(); node!=null; node = node.getNextSibling()) {
					if(node.getNodeType()==Node.ELEMENT_NODE){
						String name = node.getNodeName();
						String value = node.getFirstChild().getNodeValue();
						System.out.println(" "+name+":"+value+";");
					}
				}
			}
			//遍历所有卡车
			for (int i = 0; i < truckList.getLength(); i++) {
				//获取索引为i的卡车
				Node truck = truckList.item(i);
				//获取卡车属性值并显示
				Element element = (Element) truck;
				String idValue = element.getAttribute("id");
				//以下通过属性值获得属性节点，再通过属性节点getNodeValue()获得属性值
				//Node attr = element.getAttributeNode("id");
				//String idValue2 = attr.getNodeName();
				System.out.println("id为"+idValue+"的卡车信息为：");
				//获取索引为i的卡车详细信息并输出
				for (Node node = truck.getFirstChild();node!=null;node=node.getNextSibling()) {
					//根据节点类型进行判断，显示元素节点信息，例如<oil>20</oil>
					if (node.getNodeType() == Node.ELEMENT_NODE) {
						String name = node.getNodeName();
						//元素节点<oil>20<oil>下第一个子节点为文本节点20，得到节点值20
						String value = node.getFirstChild().getNodeValue();
						System.out.println(" "+name+":"+value+";");
					}
				}
			}
		} catch (ParserConfigurationException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
