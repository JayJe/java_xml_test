/**
 * Created by Uos on 2017-03-17.
 */
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
        Document doc = builder.parse("src/test_air.xml");
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
        //얻어낸 row의 갯수만큼 for문을 돌려줌
        
        for (int i = 0; i < n_list.getLength(); i++) {

            System.out.println("i: " + i);
            Element p = (Element) n_list.item(i);
//            Node s_node = n_list.item(0);

            //얻어낸 row의 자식들 중에 MSRSTENAME을 구하고 싶을 경우(서울시 어느구)
            //names란 배열 생성, 객채선택 안해주면 NULLPOINTER 에러남
            NodeList names = p.getElementsByTagName("MSRSTENAME");

            Element el_name = (Element) names.item(i);
            //MSRSTENAME의 값을 구한다.
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
//
//            if(i == 0){
//
//                Element el_name = (Element) names.item(i);
//                //MSRSTENAME의 값을 구한다.
//                Node txt = el_name.getFirstChild();
//                System.out.println("MSRSTENAME: " + txt.getNodeValue());
//
//                names = p.getElementsByTagName("MSRADMCODE");
//                el_name = (Element) names.item(0);
//                txt = el_name.getFirstChild();
//                System.out.println("MSRADMCODE: " +txt.getNodeValue());
//
//                names = p.getElementsByTagName("MAXINDEX");
//                el_name = (Element) names.item(0);
//                txt = el_name.getFirstChild();
//
//                System.out.println("MAXINDEX: " +txt.getNodeValue());
//
//                p = (Element) n_list.item(i);
//                names = p.getElementsByTagName("GRADE");
//                el_name = (Element) names.item(0);
//                txt = el_name.getFirstChild();
//
//                System.out.println("GRADE: " +txt.getNodeValue());
//
//                p = (Element) n_list.item(i);
//                names = p.getElementsByTagName("POLLUTANT");
//                el_name = (Element) names.item(0);
//                txt = el_name.getFirstChild();
//
//                System.out.println("POLLUTANT: " +txt.getNodeValue());
//
//                p = (Element) n_list.item(i);
//                names = p.getElementsByTagName("NITROGEN");
//                el_name = (Element) names.item(0);
//                txt = el_name.getFirstChild();
//
//                System.out.println("NITROGEN: " +txt.getNodeValue());
//
//                p = (Element) n_list.item(i);
//                names = p.getElementsByTagName("OZONE");
//                el_name = (Element) names.item(0);
//                txt = el_name.getFirstChild();
//
//                System.out.println("OZONE: " +txt.getNodeValue());
//
//                p = (Element) n_list.item(i);
//                names = p.getElementsByTagName("CARBON");
//                el_name = (Element) names.item(0);
//                txt = el_name.getFirstChild();
//
//                System.out.println("CARBON: " +txt.getNodeValue());
//
//                p = (Element) n_list.item(i);
//                names = p.getElementsByTagName("SULFUROUS");
//                el_name = (Element) names.item(0);
//                txt = el_name.getFirstChild();
//
//                System.out.println("SULFUROUS: " +txt.getNodeValue());
//
//                p = (Element) n_list.item(i);
//                names = p.getElementsByTagName("PM25");
//                el_name = (Element) names.item(0);
//                txt = el_name.getFirstChild();
//
//                System.out.println("PM25: " +txt.getNodeValue());
//
//          }
//            else if(i ==1){
//
//                Element el_name = (Element) names.item(i);
//                p = (Element) n_list.item(i);
//                names = p.getElementsByTagName("MSRSTENAME");
//                el_name = (Element) names.i  tem(0);
//                Node txt = el_name.getFirstChild();
//                txt = el_name.getFirstChild();
//
//                System.out.println("MSRSTENAME: " +txt.getNodeValue());
//
//
//                p = (Element) n_list.item(i);
//                names = p.getElementsByTagName("MSRADMCODE");
//                el_name = (Element) names.item(0);
//                txt = el_name.getFirstChild();
//
//                System.out.println("MSRADMCODE: " +txt.getNodeValue());
//
//                p = (Element) n_list.item(i);
//                names = p.getElementsByTagName("MAXINDEX");
//                el_name = (Element) names.item(0);
//                txt = el_name.getFirstChild();
//
//                System.out.println("MAXINDEX: " +txt.getNodeValue());
//
//                p = (Element) n_list.item(i);
//                names = p.getElementsByTagName("GRADE");
//                el_name = (Element) names.item(0);
//                txt = el_name.getFirstChild();
//
//                System.out.println("GRADE: " +txt.getNodeValue());
//
//                p = (Element) n_list.item(i);
//                names = p.getElementsByTagName("POLLUTANT");
//                el_name = (Element) names.item(0);
//                txt = el_name.getFirstChild();
//
//                System.out.println("POLLUTANT: " +txt.getNodeValue());
//
//                p = (Element) n_list.item(i);
//                names = p.getElementsByTagName("NITROGEN");
//                el_name = (Element) names.item(0);
//                txt = el_name.getFirstChild();
//
//                System.out.println("NITROGEN: " +txt.getNodeValue());
//
//                p = (Element) n_list.item(i);
//                names = p.getElementsByTagName("OZONE");
//                el_name = (Element) names.item(0);
//                txt = el_name.getFirstChild();
//
//                System.out.println("OZONE: " +txt.getNodeValue());
//
//                p = (Element) n_list.item(i);
//                names = p.getElementsByTagName("CARBON");
//                el_name = (Element) names.item(0);
//                txt = el_name.getFirstChild();
//
//                System.out.println("CARBON: " +txt.getNodeValue());
//
//                p = (Element) n_list.item(i);
//                names = p.getElementsByTagName("SULFUROUS");
//                el_name = (Element) names.item(0);
//                txt = el_name.getFirstChild();
//
//                System.out.println("SULFUROUS: " +txt.getNodeValue());
//
//
//                p = (Element) n_list.item(i);
//                names = p.getElementsByTagName("PM10");
//                el_name = (Element) names.item(0);
//                txt = el_name.getFirstChild();
//
//                System.out.println("PM10: " +txt.getNodeValue());
//
//                p = (Element) n_list.item(i);
//                names = p.getElementsByTagName("PM25");
//                el_name = (Element) names.item(0);
//                txt = el_name.getFirstChild();
//
//                System.out.println("PM25: " +txt.getNodeValue());
//            }else if(i == 2){
//
//                Element el_name = (Element) names.item(i);
//                p = (Element) n_list.item(i);
//                names = p.getElementsByTagName("MSRSTENAME");
//                el_name = (Element) names.item(0);
//                Node txt = el_name.getFirstChild();
//                txt = el_name.getFirstChild();
//
//                System.out.println("MSRSTENAME: " +txt.getNodeValue());
//
//                p = (Element) n_list.item(i);
//                names = p.getElementsByTagName("MSRADMCODE");
//                el_name = (Element) names.item(0);
//                txt = el_name.getFirstChild();
//
//                System.out.println("MSRADMCODE: " +txt.getNodeValue());
//
//                p = (Element) n_list.item(i);
//                names = p.getElementsByTagName("MAXINDEX");
//                el_name = (Element) names.item(0);
//                txt = el_name.getFirstChild();
//
//                System.out.println("MAXINDEX: " +txt.getNodeValue());
//
//                p = (Element) n_list.item(i);
//                names = p.getElementsByTagName("GRADE");
//                el_name = (Element) names.item(0);
//                txt = el_name.getFirstChild();
//
//                System.out.println("GRADE: " +txt.getNodeValue());
//
//                p = (Element) n_list.item(i);
//                names = p.getElementsByTagName("POLLUTANT");
//                el_name = (Element) names.item(0);
//                txt = el_name.getFirstChild();
//
//                System.out.println("POLLUTANT: " +txt.getNodeValue());
//
//                p = (Element) n_list.item(i);
//                names = p.getElementsByTagName("NITROGEN");
//                el_name = (Element) names.item(0);
//                txt = el_name.getFirstChild();
//
//                System.out.println("NITROGEN: " +txt.getNodeValue());
//
//                p = (Element) n_list.item(i);
//                names = p.getElementsByTagName("OZONE");
//                el_name = (Element) names.item(0);
//                txt = el_name.getFirstChild();
//
//                System.out.println("OZONE: " +txt.getNodeValue());
//
//                p = (Element) n_list.item(i);
//                names = p.getElementsByTagName("CARBON");
//                el_name = (Element) names.item(0);
//                txt = el_name.getFirstChild();
//
//                System.out.println("CARBON: " +txt.getNodeValue());
//
//                p = (Element) n_list.item(i);
//                names = p.getElementsByTagName("SULFUROUS");
//                el_name = (Element) names.item(0);
//                txt = el_name.getFirstChild();
//
//                System.out.println("SULFUROUS: " +txt.getNodeValue());
//
//
//                p = (Element) n_list.item(i);
//                names = p.getElementsByTagName("PM10");
//                el_name = (Element) names.item(0);
//                txt = el_name.getFirstChild();
//
//                System.out.println("PM10: " +txt.getNodeValue());
//
//                p = (Element) n_list.item(i);
//                names = p.getElementsByTagName("PM25");
//                el_name = (Element) names.item(0);
//                txt = el_name.getFirstChild();
//
//                System.out.println("PM25: " +txt.getNodeValue());
//
//            }else if(i == 3){
//
//                Element el_name = (Element) names.item(i);
//                p = (Element) n_list.item(i);
//                names = p.getElementsByTagName("MSRSTENAME");
//                el_name = (Element) names.item(0);
//                Node txt = el_name.getFirstChild();
//                txt = el_name.getFirstChild();
//
//                System.out.println("MSRSTENAME: " +txt.getNodeValue());
//
//                p = (Element) n_list.item(i);
//                names = p.getElementsByTagName("MSRADMCODE");
//                el_name = (Element) names.item(0);
//                txt = el_name.getFirstChild();
//
//                System.out.println("MSRADMCODE: " +txt.getNodeValue());
//
//                p = (Element) n_list.item(i);
//                names = p.getElementsByTagName("MAXINDEX");
//                el_name = (Element) names.item(0);
//                txt = el_name.getFirstChild();
//
//                System.out.println("MAXINDEX: " +txt.getNodeValue());
//
//                p = (Element) n_list.item(i);
//                names = p.getElementsByTagName("GRADE");
//                el_name = (Element) names.item(0);
//                txt = el_name.getFirstChild();
//
//                System.out.println("GRADE: " +txt.getNodeValue());
//
//                p = (Element) n_list.item(i);
//                names = p.getElementsByTagName("POLLUTANT");
//                el_name = (Element) names.item(0);
//                txt = el_name.getFirstChild();
//
//                System.out.println("POLLUTANT: " +txt.getNodeValue());
//
//                p = (Element) n_list.item(i);
//                names = p.getElementsByTagName("NITROGEN");
//                el_name = (Element) names.item(0);
//                txt = el_name.getFirstChild();
//
//                System.out.println("NITROGEN: " +txt.getNodeValue());
//
//                p = (Element) n_list.item(i);
//                names = p.getElementsByTagName("OZONE");
//                el_name = (Element) names.item(0);
//                txt = el_name.getFirstChild();
//
//                System.out.println("OZONE: " +txt.getNodeValue());
//
//                p = (Element) n_list.item(i);
//                names = p.getElementsByTagName("CARBON");
//                el_name = (Element) names.item(0);
//                txt = el_name.getFirstChild();
//
//                System.out.println("CARBON: " +txt.getNodeValue());
//
//                p = (Element) n_list.item(i);
//                names = p.getElementsByTagName("SULFUROUS");
//                el_name = (Element) names.item(0);
//                txt = el_name.getFirstChild();
//
//                System.out.println("SULFUROUS: " +txt.getNodeValue());
//
//
//                p = (Element) n_list.item(i);
//                names = p.getElementsByTagName("PM10");
//                el_name = (Element) names.item(0);
//                txt = el_name.getFirstChild();
//
//                System.out.println("PM10: " +txt.getNodeValue());
//
//                p = (Element) n_list.item(i);
//                names = p.getElementsByTagName("PM25");
//                el_name = (Element) names.item(0);
//                txt = el_name.getFirstChild();
//
//                System.out.println("PM25: " +txt.getNodeValue());
//            }else if(i == 4){
//
//                Element el_name = (Element) names.item(i);
//                p = (Element) n_list.item(i);
//                names = p.getElementsByTagName("MSRSTENAME");
//                el_name = (Element) names.item(0);
//                Node txt = el_name.getFirstChild();
//                txt = el_name.getFirstChild();
//
//                System.out.println("MSRSTENAME: " +txt.getNodeValue());
//                p = (Element) n_list.item(i);
//                names = p.getElementsByTagName("MSRADMCODE");
//                el_name = (Element) names.item(0);
//                txt = el_name.getFirstChild();
//
//                System.out.println("MSRADMCODE: " +txt.getNodeValue());
//
//                p = (Element) n_list.item(i);
//                names = p.getElementsByTagName("MAXINDEX");
//                el_name = (Element) names.item(0);
//                txt = el_name.getFirstChild();
//
//                System.out.println("MAXINDEX: " +txt.getNodeValue());
//
//                p = (Element) n_list.item(i);
//                names = p.getElementsByTagName("GRADE");
//                el_name = (Element) names.item(0);
//                txt = el_name.getFirstChild();
//
//                System.out.println("GRADE: " +txt.getNodeValue());
//
//                p = (Element) n_list.item(i);
//                names = p.getElementsByTagName("POLLUTANT");
//                el_name = (Element) names.item(0);
//                txt = el_name.getFirstChild();
//
//                System.out.println("POLLUTANT: " +txt.getNodeValue());
//
//                p = (Element) n_list.item(i);
//                names = p.getElementsByTagName("NITROGEN");
//                el_name = (Element) names.item(0);
//                txt = el_name.getFirstChild();
//
//                System.out.println("NITROGEN: " +txt.getNodeValue());
//
//                p = (Element) n_list.item(i);
//                names = p.getElementsByTagName("OZONE");
//                el_name = (Element) names.item(0);
//                txt = el_name.getFirstChild();
//
//                System.out.println("OZONE: " +txt.getNodeValue());
//
//                p = (Element) n_list.item(i);
//                names = p.getElementsByTagName("CARBON");
//                el_name = (Element) names.item(0);
//                txt = el_name.getFirstChild();
//
//                System.out.println("CARBON: " +txt.getNodeValue());
//
//                p = (Element) n_list.item(i);
//                names = p.getElementsByTagName("SULFUROUS");
//                el_name = (Element) names.item(0);
//                txt = el_name.getFirstChild();
//
//                System.out.println("SULFUROUS: " +txt.getNodeValue());
//
//
//                p = (Element) n_list.item(i);
//                names = p.getElementsByTagName("PM10");
//                el_name = (Element) names.item(0);
//                txt = el_name.getFirstChild();
//
//                System.out.println("PM10: " +txt.getNodeValue());
//
//                p = (Element) n_list.item(i);
//                names = p.getElementsByTagName("PM25");
//                el_name = (Element) names.item(0);
//                txt = el_name.getFirstChild();
//
//                System.out.println("PM25: " +txt.getNodeValue());
//
//            }else if(i == 5){
//
//                Element el_name = (Element) names.item(i);
//                p = (Element) n_list.item(i);
//                names = p.getElementsByTagName("MSRSTENAME");
//                el_name = (Element) names.item(0);
//                Node txt = el_name.getFirstChild();
//                txt = el_name.getFirstChild();
//
//                System.out.println("MSRSTENAME: " +txt.getNodeValue());
//
//                p = (Element) n_list.item(i);
//                names = p.getElementsByTagName("MSRADMCODE");
//                el_name = (Element) names.item(0);
//                txt = el_name.getFirstChild();
//
//                System.out.println("MSRADMCODE: " +txt.getNodeValue());
//
//                p = (Element) n_list.item(i);
//                names = p.getElementsByTagName("MAXINDEX");
//                el_name = (Element) names.item(0);
//                txt = el_name.getFirstChild();
//
//                System.out.println("MAXINDEX: " +txt.getNodeValue());
//
//                p = (Element) n_list.item(i);
//                names = p.getElementsByTagName("GRADE");
//                el_name = (Element) names.item(0);
//                txt = el_name.getFirstChild();
//
//                System.out.println("GRADE: " +txt.getNodeValue());
//
//                p = (Element) n_list.item(i);
//                names = p.getElementsByTagName("POLLUTANT");
//                el_name = (Element) names.item(0);
//                txt = el_name.getFirstChild();
//
//                System.out.println("POLLUTANT: " +txt.getNodeValue());
//
//                p = (Element) n_list.item(i);
//                names = p.getElementsByTagName("NITROGEN");
//                el_name = (Element) names.item(0);
//                txt = el_name.getFirstChild();
//
//                System.out.println("NITROGEN: " +txt.getNodeValue());
//
//                p = (Element) n_list.item(i);
//                names = p.getElementsByTagName("OZONE");
//                el_name = (Element) names.item(0);
//                txt = el_name.getFirstChild();
//
//                System.out.println("OZONE: " +txt.getNodeValue());
//
//                p = (Element) n_list.item(i);
//                names = p.getElementsByTagName("CARBON");
//                el_name = (Element) names.item(0);
//                txt = el_name.getFirstChild();
//
//                System.out.println("CARBON: " +txt.getNodeValue());
//
//                p = (Element) n_list.item(i);
//                names = p.getElementsByTagName("SULFUROUS");
//                el_name = (Element) names.item(0);
//                txt = el_name.getFirstChild();
//
//                System.out.println("SULFUROUS: " +txt.getNodeValue());
//
//
//                p = (Element) n_list.item(i);
//                names = p.getElementsByTagName("PM10");
//                el_name = (Element) names.item(0);
//                txt = el_name.getFirstChild();
//
//                System.out.println("PM10: " +txt.getNodeValue());
//
//                p = (Element) n_list.item(i);
//                names = p.getElementsByTagName("PM25");
//                el_name = (Element) names.item(0);
//                txt = el_name.getFirstChild();
//
//                System.out.println("PM25: " +txt.getNodeValue());
//            }else if(i ==6){
//
//                Element el_name = (Element) names.item(i);
//                p = (Element) n_list.item(i);
//                names = p.getElementsByTagName("OZONE");
//                el_name = (Element) names.item(0);
//                Node txt = el_name.getFirstChild();
//                txt = el_name.getFirstChild();
//
//                System.out.println("OZONE: " +txt.getNodeValue());
//
//                p = (Element) n_list.item(i);
//                names = p.getElementsByTagName("PM25");
//                el_name = (Element) names.item(0);
//                txt = el_name.getFirstChild();
//
//                System.out.println("PM25: " +txt.getNodeValue());
//            }
//
//        }
            /** end **/

//        //첫번째 요소 personal이라는 요소
//        Element p = (Element) n_list.item(0);
//        Node s_node = n_list.item(0);
//        NodeList s_list = s_node.getChildNodes();
//        for(int i=0; i<s_list.getLength(); i++){
//            if(!s_node.getNodeName().equals("#text")){
//                Node no = s_node.getFirstChild();
//                System.out.println(no.getNodeName());
//            }
//        }
//        //얻어낸 row의 자식요소들 중에서 MSRSTENAME을 구하고 싶을때
//        //(서울시 어느구)
//        NodeList names = p.getElementsByTagName("MSRSTENAME");
//        Element el_name = (Element) names.item(0);
//        //MSRSTENAME의 값을 구한다.
//        Node txt = el_name.getFirstChild();
//        System.out.println("MSRSTENAME: " + txt.getNodeValue());
//
//        //row의 두번째 요소중 MSRADMCODE을 구하자!
//        //지역구 코드
//
//        p = (Element) n_list.item(1);
//        names = p.getElementsByTagName("MSRADMCODE");
//        el_name = (Element) names.item(0);
//        txt = el_name.getFirstChild();
//
//        System.out.println("MSRADMCODE: " +txt.getNodeValue());
//
//        //통합대기환경지수
//        p = (Element) n_list.item(2);
//        names = p.getElementsByTagName("MAXINDEX");
//        el_name = (Element) names.item(0);
//        txt = el_name.getFirstChild();
//
//        System.out.println("MAXINDEX: " +txt.getNodeValue());
//
//        //평균
//        p = (Element) n_list.item(3);
//        names = p.getElementsByTagName("GRADE");
//        el_name = (Element) names.item(0);
//        txt = el_name.getFirstChild();
//
//        System.out.println("GRADE: " +txt.getNodeValue());
//
//        //지수결정물질
//        p = (Element) n_list.item(4);
//        names = p.getElementsByTagName("POLLUTANT");
//        el_name = (Element) names.item(0);
//        txt = el_name.getFirstChild();
//
//        System.out.println("POLLUTANT: " +txt.getNodeValue());
//
//        //이산화질소 농도(단위 : ppm)
//        p = (Element) n_list.item(5);
//        names = p.getElementsByTagName("NITROGEN");
//        el_name = (Element) names.item(0);
//        txt = el_name.getFirstChild();
//
//        System.out.println("NITROGEN: " +txt.getNodeValue());
//
//        //오존 농도(단위 : ppm)
//        p = (Element) n_list.item(6);
//        names = p.getElementsByTagName("OZONE");
//        el_name = (Element) names.item(0);
//        txt = el_name.getFirstChild();
//
//        System.out.println("OZONE: " +txt.getNodeValue());
//
//        //일산화탄소 농도(단위 : ppm)
//        p = (Element) n_list.item(7);
//        names = p.getElementsByTagName("CARBON");
//        el_name = (Element) names.item(0);
//        txt = el_name.getFirstChild();
//
//        System.out.println("CARBON: " +txt.getNodeValue());
//
//      //아황산가스 농도 농도(단위 : ppm)
//        p = (Element) n_list.item(8);
//        names = p.getElementsByTagName("SULFUROUS");
//        el_name = (Element) names.item(0);
//        txt = el_name.getFirstChild();
//
//        System.out.println("SULFUROUS: " +txt.getNodeValue());
//
//      //미세먼지 농도 농도(단위 : ㎍/㎥)
//        p = (Element) n_list.item(9);
//        names = p.getElementsByTagName("PM10");
//        el_name = (Element) names.item(0);
//        txt = el_name.getFirstChild();
//
//        System.out.println("PM10: " +txt.getNodeValue());
//
//      //초미세먼지 농도 농도(단위 : ㎍/㎥)
//        p = (Element) n_list.item(10);
//        names = p.getElementsByTagName("PM25");
//        el_name = (Element) names.item(0);
//        txt = el_name.getFirstChild();
//
//        System.out.println("PM25: " +txt.getNodeValue());
        }
    }




}
