package generic;

//generic이 필요한 이유

import java.util.List;
import java.util.ArrayList;

public class MTest02 {

	public static void main(String[] args) {
		//List list = new ArrayList();					//generic이 없으면 문자열이나 숫자도 캐릭터도 들어갈 수 있다.
		List<String> list = new ArrayList<String>();	//숫자랑 문자형은 에러를 내줌  //원하는 타입만 강제한다.
		list.add("1");				
		list.add("2");
		//list.add(3);
		list.add("4");
		list.add("5");
		//list.add('6');

		for (int i = 0; i < list.size(); i++) {
			System.out.println(((String) list.get(i)).getBytes());		//getBytes로 꺼내자했는데 원하지 않는 동작이 들어가게되어 오류가 남

		}

	}
}
