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
			//1����������������
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			//2��ͨ�������������DOM����������DocumentBuilder����
			DocumentBuilder db = dbf.newDocumentBuilder();
			//3������ָ��xml�ĵ����õ�DOM�ڵ���
			Document doc = db.parse("G:\\WorkSpace\\lanqiaobook2\\src\\com\\ch4\\test4_10_2\\vehicle_info.xml");
			//4����DOM�ڵ������в�������ɶ�XML�ĵ�����ɾ�Ĳ�
			//�õ����ڵ��µ������ӽڵ�
			NodeList vehicles = doc.getChildNodes();
			System.out.println("���⳵ϵͳ���й��У�"+vehicles.getLength()+"�����͵ĳ���");
			//�õ�����<truck>�ڵ��б���Ϣ
			NodeList truckList = doc.getElementsByTagName("truck");
			System.out.println("���⳵ϵͳ���й��У�"+truckList.getLength()+"��������");
			NodeList carList = doc.getElementsByTagName("car");
			System.out.println("���鳵ϵͳ���й��У�"+carList.getLength()+"���γ�!");
			//�������нγ�
			for (int i = 0; i < carList.getLength(); i++) {
				Node truck = carList.item(i);
				Element element = (Element) truck;
				String idValue = element.getAttribute("id");
				System.out.println("idΪ"+idValue+"�Ŀ�����ϢΪ��");
				for (Node node = truck.getFirstChild(); node!=null; node = node.getNextSibling()) {
					if(node.getNodeType()==Node.ELEMENT_NODE){
						String name = node.getNodeName();
						String value = node.getFirstChild().getNodeValue();
						System.out.println(" "+name+":"+value+";");
					}
				}
			}
			//�������п���
			for (int i = 0; i < truckList.getLength(); i++) {
				//��ȡ����Ϊi�Ŀ���
				Node truck = truckList.item(i);
				//��ȡ��������ֵ����ʾ
				Element element = (Element) truck;
				String idValue = element.getAttribute("id");
				//����ͨ������ֵ������Խڵ㣬��ͨ�����Խڵ�getNodeValue()�������ֵ
				//Node attr = element.getAttributeNode("id");
				//String idValue2 = attr.getNodeName();
				System.out.println("idΪ"+idValue+"�Ŀ�����ϢΪ��");
				//��ȡ����Ϊi�Ŀ�����ϸ��Ϣ�����
				for (Node node = truck.getFirstChild();node!=null;node=node.getNextSibling()) {
					//���ݽڵ����ͽ����жϣ���ʾԪ�ؽڵ���Ϣ������<oil>20</oil>
					if (node.getNodeType() == Node.ELEMENT_NODE) {
						String name = node.getNodeName();
						//Ԫ�ؽڵ�<oil>20<oil>�µ�һ���ӽڵ�Ϊ�ı��ڵ�20���õ��ڵ�ֵ20
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
