/**
 * Created by Uos on 2017-03-17.
 **/
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.applet.Applet;

public class JAXPTest extends Applet {

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        //***XML문서를 Document라는 객체로 인식.***
        //1.문서를 읽기위한 공장을 만들어야 한다.

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        //2.빌더를 생성

        DocumentBuilder builder = factory.newDocumentBuilder();
        //3.생성된 빌더를 통해서 xml문서를 Document객체로 파싱해서 가져온다.
        //Document org에서 가져온다!!!
        //url Open API 실시간 파싱
        Document doc = builder.parse("http://openAPI.seoul.go.kr:8088/5961664a496a617939307762674e6a/xml/ListAirQualityByDistrictService/1/5/");
        Element root = doc.getDocumentElement();
        System.out.println("ROOT: " + root.getNodeName());
        //루트의 자식노드수 구하기.
        NodeList all = root.getChildNodes();
        System.out.println("루트의 지식노드수 :" + all.getLength());

        for (int i = 0; i < all.getLength(); i++) {
            Node node = all.item(i);
            System.out.println("자식노드 : " + node.getNodeName());
        }
        //personal 이라는 이름을 가진 요소들을 모두 가려내는 작업.
        NodeList n_list = root.getElementsByTagName("row");
        System.out.println("n_list: " + n_list.getLength());
        /** start **/


        for (int i = 0; i < n_list.getLength(); i++) {

            System.out.println("\ni: " + i + "\n");
            Element p = (Element) n_list.item(i);
//            Node s_node = n_list.item(0);

            NodeList names = p.getElementsByTagName("MSRSTENAME");



            Element el_name = (Element) names.item(i);
            //MSRSTENAME의 값을 구한다.
            if(i == 0){
                p = (Element) n_list.item(i) ;
                names = p.getElementsByTagName("MSRDATE");
                el_name = (Element) names.item(0);
                Node txt = el_name.getFirstChild();
                System.out.println("갱신 주기는 1시간 단위입니다.");
                System.out.println("\n====================\n" + "MSRDATE: " + txt.getNodeValue() + "\n====================\n");
            }
            p = (Element) n_list.item(i);
            names = p.getElementsByTagName("MSRSTENAME");
            el_name = (Element) names.item(0);
            Node txt = el_name.getFirstChild();
            System.out.println("MSRSTENAME: " + txt.getNodeValue());

            names = p.getElementsByTagName("MSRADMCODE");
            el_name = (Element) names.item(0);
            txt = el_name.getFirstChild();
            System.out.println("MSRADMCODE: " + txt.getNodeValue());

            names = p.getElementsByTagName("MAXINDEX");
            el_name = (Element) names.item(0);
            txt = el_name.getFirstChild();

            System.out.println("MAXINDEX: " + txt.getNodeValue());

            p = (Element) n_list.item(i);
            names = p.getElementsByTagName("GRADE");
            el_name = (Element) names.item(0);
            txt = el_name.getFirstChild();

            System.out.println("GRADE: " + txt.getNodeValue());

            p = (Element) n_list.item(i);
            names = p.getElementsByTagName("POLLUTANT");
            el_name = (Element) names.item(0);
            txt = el_name.getFirstChild();

            System.out.println("POLLUTANT: " + txt.getNodeValue());

            p = (Element) n_list.item(i);
            names = p.getElementsByTagName("NITROGEN");
            el_name = (Element) names.item(0);
            txt = el_name.getFirstChild();

            System.out.println("NITROGEN: " + txt.getNodeValue());

            p = (Element) n_list.item(i);
            names = p.getElementsByTagName("OZONE");
            el_name = (Element) names.item(0);
            txt = el_name.getFirstChild();

            System.out.println("OZONE: " + txt.getNodeValue());

            p = (Element) n_list.item(i);
            names = p.getElementsByTagName("CARBON");
            el_name = (Element) names.item(0);
            txt = el_name.getFirstChild();

            System.out.println("CARBON: " + txt.getNodeValue());

            p = (Element) n_list.item(i);
            names = p.getElementsByTagName("SULFUROUS");
            el_name = (Element) names.item(0);
            txt = el_name.getFirstChild();

            System.out.println("SULFUROUS: " + txt.getNodeValue());

            p = (Element) n_list.item(i);
            names = p.getElementsByTagName("PM25");
            el_name = (Element) names.item(0);
            txt = el_name.getFirstChild();

            System.out.println("PM25: " + txt.getNodeValue());
        }

    }




}
