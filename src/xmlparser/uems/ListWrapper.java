package xmlparser.uems;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="List_Wrapper" )//, namespace="")
@XmlAccessorType(XmlAccessType.FIELD)
	public class ListWrapper {
	 @XmlElement(name="_bp")
	private ArrayList < _bp > _bp ;

}
