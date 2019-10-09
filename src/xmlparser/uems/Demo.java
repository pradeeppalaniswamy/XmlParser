package xmlparser.uems;
import java.io.File;

import javax.xml.bind.*;
public class Demo {
	 public static void main(String[] args) throws Exception {
	        JAXBContext jc = JAXBContext.newInstance(ListWrapper.class);

	        Unmarshaller unmarshaller = jc.createUnmarshaller();
	        File xml = new File("uems.xml");
	        ListWrapper sc = (ListWrapper) unmarshaller.unmarshal(xml);

	        Marshaller marshaller = jc.createMarshaller();
	        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	        marshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, "List_Wrapper.xsd");
	        marshaller.marshal(sc, System.out);
	    }
}
