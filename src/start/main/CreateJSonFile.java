/**
 * 
 */
package start.main;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 * @description:
 * @author: Admin
 * @time: 6:00:52 PM
 * @date: Mar 12, 2018
 */
public class CreateJSonFile {
	 /**
	 * @description:  
	 * @author: Admin CMC Corporation
	 * @create_date: Mar 13, 2018
	 * @modifier: Admin
	 * @modifined_date: Mar 13, 2018
	 * @exception: 
	 * @param args
	 */
	public static void main(String[] args) {

		JSONObject obj = new JSONObject();
		obj.put("name", "mkyong.com");
		obj.put("age", new Integer(100));

		JSONArray list = new JSONArray();
		list.add("msg 1");
		list.add("msg 2");
		list.add("msg 3");

		obj.put("messages", list);

		try (FileWriter file = new FileWriter("test.json")) {

			file.write(obj.toJSONString());
			file.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.print(obj);

	}
}
