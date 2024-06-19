package C07ExceptionParsing.AuthorException;

import java.util.Optional;

public class AuthorService{
	AuthorRepository authorRepository;

	public AuthorService() {
		this.authorRepository = new AuthorRepository();
	}

	public void register(String name, String email, String password) throws IllegalArgumentException{
		if (password.length() <= 5) {
			throw new IllegalArgumentException("비밀번호를 길게 입력하도록");
		}
		if (!authorRepository.authorList.isEmpty()) {
			Optional<Author> tmp = authorRepository.authorList.stream()
				.filter(a -> a.getEmail().equals(email))
				.findFirst();
			if(tmp.isPresent()) {
				throw new IllegalArgumentException("동일한 이메일 이미 존재");
			}

		}
		Author author = new Author(name, email, password);
		authorRepository.register(author);
		System.out.println("회원가입 성공");
	}

	public void login(String email, String password) throws IllegalArgumentException {
		Optional<Author> tmp = authorRepository.authorList.stream()
			.filter(a -> a.getEmail().equals(email))
			.findAny();
		if (tmp.isPresent()) {
			if(tmp.get().getPassword().contains(password)){
				throw new IllegalArgumentException("비민번호가 틀립니다");
			}
		}else{
			throw new IllegalArgumentException("회원정보가 없습니다");
		}

		System.out.println("로그인 성공");
	}
}
