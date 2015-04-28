package hibernate.application;

import java.sql.SQLException;

import hibernate.dao.ContentTagLinkerDao;
import hibernate.dao.FrontPageDao;
import hibernate.daoImpl.ContentDaoImpl;
import hibernate.daoImpl.ContentTagLinkerDaoImpl;
import hibernate.daoImpl.FrontPageDaoImpl;
import hibernate.daoImpl.UserDaoImpl;
import hibernate.tables.Content;
import hibernate.tables.ContentTagLinker;
import hibernate.tables.FrontPage;
import hibernate.tables.Tag;
import hibernate.tables.User;

public class Project {
	public static void main(String[] args) throws SQLException {
		FrontPageDao fpd = new FrontPageDaoImpl();
		set10FrontPages(fpd);

		ContentTagLinkerDao ctld = new ContentTagLinkerDaoImpl();
		set10Links(ctld);
	}

	private static void set10Links(ContentTagLinkerDao ctld) {
		ContentTagLinker ctl = new ContentTagLinker();
		Content c = new Content();
		User u =new User();
		u.setFirstName("Vasya");
		u.setLastName("Pupkin");
		u.setLogin("vas");
		u.setPassword("vas");
		u.setRole(1);
		c.setAuthor(u);
		c.setText("some text");
		
		Tag t = new Tag();
		t.setName("Tag");
		t.setUrl("http://1/1/1/1.html");
		
		ctl.setContent(c);
	}

	private static void set10FrontPages(FrontPageDao fpd) throws SQLException {
		FrontPage fp = new FrontPage();
		for (int i = 1; i < 11; i++) {
			fp.setAuthor(new UserDaoImpl().getUser(1));
			fp.setContentId(new ContentDaoImpl().getContent(1));
			fp.setOrder(i);
			fpd.addFrontPageContent(fp);
		}
	}

}
