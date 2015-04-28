package hibernate.exception;

import java.sql.SQLException;

public class AddingException extends SQLException {

	private static final long serialVersionUID = 3150041972009839243L;

	public AddingException() {
		super();
	}

	public AddingException(String reason, String SQLState) {
		super(reason, SQLState);
	}

	public AddingException(String reason, Throwable cause) {
		super(reason, cause);
	}

	public AddingException(String reason) {
		super(reason);
	}

	public AddingException(Throwable cause) {
		super(cause);
	}

}
