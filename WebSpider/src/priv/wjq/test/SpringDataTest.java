package priv.wjq.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import priv.wjq.sss.model.Blog;
import priv.wjq.sss.repsotory.BlogRepsotory;

public class SpringDataTest {

	private ApplicationContext ctx = null;
	private BlogRepsotory blogRepsotory = null;
	
	
	
	
	{
		
		
		ctx = new ClassPathXmlApplicationContext("applicationContext-tx-Test.xml");
		blogRepsotory = ctx.getBean(BlogRepsotory.class);
	}
	
	
	
	@Test
	public void testHelloWorldSpringData() throws FileNotFoundException, IOException, InstantiationException, IllegalAccessException{
		System.out.println(blogRepsotory.getClass().getName());
		
		Blog blog = blogRepsotory.getByBId(1);
		System.out.println(blog.getbContent());
	}
	
	
	@Test
	public void testJpa(){
		
	}
	
	@Test
	public void testDataSource() throws SQLException {
		DataSource dataSource = ctx.getBean(DataSource.class);
		System.out.println(dataSource.getConnection());
	}
	
	
	
	@Test
	public void testFirstSelect(){
		Blog b = new Blog();
		b.setbId(3);
		b.setbCommentnum(43243);
		blogRepsotory.save(b);
	}
	
	
	
	
	
	
	
}
