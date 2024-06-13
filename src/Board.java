import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Board {
//	게시판 서비스 만들기
//	1. 회원가입
//	Author클래스 : id, name, email, password
//	id auto_increment
//	2. 회원 목록 전체 조회
//	id, email조회
//	3. 회원 상세 조회(by id로 조회)
//	id, name, email, password
//	4. 게시글 작성
//	id, title, contents, email(입력받되 Author객체로 집어넣기)
//	5. 게시글 목록조회
//	id, title
//	6. 게시글 상세 조회
//	id, title, contents, 저자(email or name or author_id)
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {

		while (true) {
			System.out.println("서비스 번호를 입력하세요\n 1.회원가입\n 2.회원목록조회\n 3.회원상세조회\n 4.게시글작성\n 5.게시글목록조회\n 6.게시글상세조회\n 0.종료\n");
			int input = Integer.parseInt(br.readLine());

			if (input == 1) {
				Author.register();
			} else if (input == 2) {
				Author.getAuthorLists();
			}else if (input == 3) {
				Author.getAuthor();
			}else if (input == 4) {
				Post.addPost();
			}else if (input == 5) {
				Post.getPostLists();
			} else if (input == 6) {
				Post.getPost();
			} else if (input == 0) {
				break;
			} else {
				System.out.println("다시 입력하세요.");
			}
		}
	}
}

class Author {
	static long static_id = 0;
	static List<Author> authorList = new ArrayList<>();
	private long id;
	private String name;
	private String email;
	private String password;

	Author(String name, String email, String password) {
		static_id++;
		id = static_id;
		this.name = name;
		this.email = email;
		this.password = password;
	}

	Author() {

	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	// 회원가입
	public static void register() throws IOException {
		System.out.print("이름을 입력하세요 :");
		String name = Board.br.readLine();
		System.out.print("이메일을 입력하세요 :");
		String email = Board.br.readLine();
		System.out.print("비밀번호를 입력하세요 :");
		String password = Board.br.readLine();

		boolean exist = false;
		if (!authorList.isEmpty()) {
			for (Author author : authorList) {
				if (author.getName().equals(name)) {
					System.out.println("이미 존재하는 회원 정보입니다.");
					exist = true;
					break;
				}
			}
		}

		if (!exist) {
			authorList.add(new Author(name, email, password));
			System.out.println(name + " 회원가입 성공");
		}
	}

	// 회원 전체 목록 조회
	public static void getAuthorLists(){
		if (authorList.isEmpty()) {
			System.out.println("회원 목록이 없습니다.");
			return;
		}
		for (Author author : authorList) {
			System.out.println(author.getId() + " " + author.getEmail());
		}
	}

	public static void getAuthor() throws IOException {
		System.out.print("아이디를 입력하세요 :");
		long id = Long.parseLong(Board.br.readLine());

		for (Author author : authorList) {
			if (author.getId() == id) {
				author.printAll();
			}
		}
	}

	public void printAll() {
		System.out.println("아이디 : " + id);
		System.out.println("이름 : " + name);
		System.out.println("이메일 : " + email);
		System.out.println("비밀번호 : " + password);
	}
}

class Post {
	static long static_id = 0;
	static List<Post> postList = new ArrayList<>();
	private long id;
	private String title;
	private String contents;
	private Author author;


	Post(String title, String contents, Author author) {
		static_id++;
		id = static_id;
		this.title = title;
		this.contents = contents;
		this.author = author;
	}

	Post() {

	}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getContents() {
		return contents;
	}

	public Author getAuthor() {
		return author;
	}

	public static void addPost() throws IOException {
		System.out.print("제목을 입력하세요 : ");
		String title = Board.br.readLine();
		System.out.print("내용 입력하세요 : ");
		String contents = Board.br.readLine();
		System.out.print("이메일을 입력하세요 : ");
		String email = Board.br.readLine();

		for (Author author : Author.authorList) {
			if (author.getEmail().equals(email)) {
				postList.add(new Post(contents, title, author));
				System.out.println("게시글 작성 완료");
			}
		}
	}

	public static void getPostLists(){
		for (Post post : postList) {
			System.out.println(post.getId() + " " + post.getTitle());
		}
	}

	public static void getPost() throws IOException {
		System.out.print("아이디를 입력하세요 :");
		long id = Long.parseLong(Board.br.readLine());

		for (Post post : postList) {
			if (post.getId() == id) {
				post.printAll();
			}
		}
	}

	public void printAll() {
		System.out.println("아이디 : " + id);
		System.out.println("제목 : " + title);
		System.out.println("내용 : " + contents);
		System.out.println("저자 : " + author.getName());
	}
}
