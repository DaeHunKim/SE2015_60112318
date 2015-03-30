
public class HacksaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Professor professor = new Professor("chol");
			Lecture lecture1 = new Lecture("소프트웨어 공학");
			
			ApplicationContext factory = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
			
			Professor Professor = (Professor)factory.getBean("professor");
			Lecture lecture2 = (Lecture)factory.getBean("lecture2");
			
			professor.addLecture(lecture1);
			professor.showLecture();
			
			
	}

}
