package Com.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import Com.Entity.College;
import Com.Entity.Student;

@Configuration
public class AppConfig {

	@Bean(name = "co")
	public College getCollege() {
		College c = new College();
		c.setSid(101);
		c.setCname("PCCOE");
		
		return c;
	}
	
	
	@Bean(name = "stu")
	@Scope(value = "prototype")
	public Student createBeanForStudent() {
		Student st = new Student();
		st.setSid(200);
		st.setSname("ram");
//		st.setCollege(getCollege());//manual injection

		return st;
	}
	
}
