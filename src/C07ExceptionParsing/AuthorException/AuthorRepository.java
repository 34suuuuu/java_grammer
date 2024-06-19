package C07ExceptionParsing.AuthorException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AuthorRepository {
	private List<Author> authorList;

	AuthorRepository() {
		authorList = new ArrayList<>();
	}

	void register(Author author) {
		this.authorList.add(author);
	}

	public List<Author> getAuthorList() {
		return authorList;
	}

	// Optional 객체로 리턴하는게 Spring에서 가장 일반적인 방법
	// public Optional<Author> findByEmail(String email) {
	// 	Author author1 = null;
	// 	for (Author author : authorList) {
	// 		if (author.getEmail().equals(email)) {
	// 			author1 = author;
	// 		}
	// 	}
	// 	return Optional.ofNullable(author1);
	// }

	// Stream을 이용한 코드
	public Optional<Author> findByEmail(String email) {
		return authorList.stream()
			.filter(a -> a.getEmail().equals(email))
			.findFirst();
	}

}

