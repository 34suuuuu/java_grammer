package C07ExceptionParsing;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class C0704JsonParsing2 {
	public static void main(String[] args) throws IOException {

	//	test_data2의 데이터를 student형태로 출력
		ObjectMapper objectMapper = new ObjectMapper();
		Path filePath = Paths.get("src/C07ExceptionParsing/test_data2.json");
		String jsonString = Files.readString(filePath);

		List<Student> studentList = new ArrayList<>();
		JsonNode data = objectMapper.readTree(jsonString);
		for (JsonNode j : data) {
			studentList.add(objectMapper.readValue(j.toString(), Student.class));
		}
		System.out.println(studentList);
	}
}
