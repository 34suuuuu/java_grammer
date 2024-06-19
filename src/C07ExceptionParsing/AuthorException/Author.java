package C07ExceptionParsing.AuthorException;

public class Author {
	static int staticId = 0;
	private int id;
	private String name;
	private String email;
	private String password;

	public Author(String name, String email, String password) {
		this.staticId++;
		this.id = staticId;
		this.name = name;
		this.email = email;
		this.password = password;
	}

	public int getId() {
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
}
