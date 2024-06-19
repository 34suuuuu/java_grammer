package C07ExceptionParsing;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class C0703JsonParsing1 {
	public static void main(String[] args) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		Path filePath = Paths.get("src/C07ExceptionParsing/test_data1.json");
		String jsonString = Files.readString(filePath);

	//	readTree : 트리구조의 JsonNode로 변환
	//	트리구조의 장점은 유연함
	// 	JsonNode data1 = objectMapper.readTree(jsonString);
	// 	Map<String, String> studentMap = new HashMap<>();
	// 	studentMap.put("id", data1.get("id").asText());
	// 	studentMap.put("name", data1.get("name").asText());
	// 	studentMap.put("classNumber", data1.get("classNumber").asText());
	// 	studentMap.put("city", data1.get("city").asText());
	// 	System.out.println(studentMap);

	//	readValue : 바로 객체로 변환
	// 	Map<String, String> studentMap2 = objectMapper.readValue(jsonString, Map.class);

	//	Student객체 생성 및 toString() 오버라이딩
		Student student3 = objectMapper.readValue(jsonString, Student.class);
		System.out.println(student3);
	}
}

class Student{
	private String id;
	private String name;
	private String classNumber;
	private String city;

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getClassNumber() {
		return classNumber;
	}

	public String getCity() {
		return city;
	}

	@Override
	public String toString(){
		return "이름은 " + this.name + "\nclassNumber는 " + this.classNumber + "\n출신 도시는 " + this.city+"\n";
	}
}
