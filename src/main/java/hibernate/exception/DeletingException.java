package hibernate.exception;

import java.sql.SQLException;

public class DeletingException extends SQLException {
	
	private static final long serialVersionUID = 4400675575277258731L;

	public DeletingException() {
		super();
	}

	public DeletingException(String reason, String SQLState) {
		super(reason, SQLState);
	}

	public DeletingException(String reason, Throwable cause) {
		super(reason, cause);
	}

	public DeletingException(String reason) {
		super(reason);
	}

	public DeletingException(Throwable cause) {
		super(cause);
	}
	

}
