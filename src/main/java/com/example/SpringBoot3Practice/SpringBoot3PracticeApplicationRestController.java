package com.example.SpringBoot3Practice;

//import org.springframework.boot.ApplicationArguments;
//import org.springframework.boot.ApplicationRunner;
//import org.springframework.boot.Banner;
//import org.springframework.boot.CommandLineRunner;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.http.MediaType;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

//import javax.swing.*;
//import java.util.Arrays;
//import java.util.Date;

//@SpringBootApplication
//@RestController
public class SpringBoot3PracticeApplicationRestController {
    //public class SpringBoot3PracticeApplication implements CommandLineRunner {
//public class SpringBoot3PracticeApplication implements ApplicationRunner {
//    public static void main(String[] args) {
//        SpringApplication.run(SpringBoot3PracticeApplicationRestController.class, args);
//		System.out.println("Hello, Spring Boot 3!!");
//		SpringApplication springApplication = new SpringApplication(SpringBoot3PracticeApplication.class);
//		springApplication.setBannerMode(Banner.Mode.OFF);
//		springApplication.setHeadless(false);
//		springApplication.run(args);
//    }

//    @RequestMapping("/")
//    public String index(HttpServletRequest request, HttpServletResponse response) {
//        response.setContentType(MediaType.TEXT_HTML_VALUE);
//        return """
//			<html>
//				<head>
//					<title>Sample App</title>
//				</head>
//				<body>
//					<h1>Sample App</h1>
//					<p>This is a sample page!</p>
//				</body>
//			</html>
//			""";
//    }

//	DataObject[] data = new DataObject[]{
//            new DataObject("noname", "no email address", 0),
//            new DataObject("taro", "taro@yamada", 39),
//            new DataObject("hanako", "hanako@flower", 28),
//    };
//
//	@RequestMapping("/{num}")
//	public DataObject index(@PathVariable int num) {
//		int n = num < 0 ? 0 : num >= data.length ? 0 : num;
//		return data[n];
//	}

//	String[][] data = {
//			{"noname", "no email address", "0"},
//			{"taro", "taro@yamada", "39"},
//			{"hanako", "hanako@flower", "28"},
//	};
//	@RequestMapping("/{num}")
//	public String index(@PathVariable int num) {
//		int n = num < 0 ? 0 : num >= data.length ? 0 : num;
//		String[] item = data[n];
//		String msg = "ID=%s. {name: %s, mail: %s, age: %s}";
//		return String.format(msg, num, item[0], item[1], item[2]);
//	}

//	@RequestMapping("/")
//	public String index() {
//		return "Hello, Spring Boot 3!!";
//	}

//	java -jar ./build/libs/SpringBoot3Practice-0.0.1-SNAPSHOT.jar --aaa=123 --zzz=456
//	@Override
//	public void run(ApplicationArguments args) {
//		System.out.println("This is Application Runner program.");
//		System.out.println(args.getOptionNames());
//		System.out.println(args.getNonOptionArgs());
//		System.out.println(Arrays.asList(args.getSourceArgs()));
//
//		JFrame jFrame = new JFrame("Spring Boot Swing App");
//		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		jFrame.setSize(300, 200);
//		jFrame.add(new JLabel("Spring Boot Application."));
//		jFrame.setVisible(true);
//	}

//	java -jar ./build/libs/SpringBoot3Practice-0.0.1-SNAPSHOT.jar --aaa=123 --zzz=456
//	@Override
//	public void run(String... args) {
//		System.out.println("This is CommandLine Runner program.");
//		System.out.println("[" + String.join(",", args) + "]");
//	}
}
