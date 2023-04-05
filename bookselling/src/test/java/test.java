import com.books.domain.BookInfo;
import com.books.mapper.BookInfoMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;

import java.util.List;
import java.io.IOException;
import java.io.InputStream;

public class test {

    public static void main(String[] args) throws IOException {
        String resource = "Mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(inputStream);
        SqlSession sqlSession = factory.openSession();

        System.out.println("hello");

//        BookInfoMapper mapper = sqlSession.getMapper(BookInfoMapper.class);
//
//        BookInfo test = new BookInfo();
//        List<BookInfo> allBooks = mapper.selectBookInfoList(test);
//        System.out.println("allBooks: " + allBooks);
//        BookInfo sth = mapper.selectBookInfoByBookId(1L);
//        String s = sth.toString();
//        System.out.println("sth: " + s);
    }
}
