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
        SqlSessionFactory Factory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = Factory.openSession();
        BookInfoMapper books = sqlSession.getMapper(BookInfoMapper.class);
//        List<BookInfo> allbooks = books.selectAll();
//        System.out.println("allbooks: " + allbooks);
//        BookInfo sth = books.selectBookInfoByBookId(1L);
//        String s = sth.toString();
//        System.out.println("sth: " + s);
    }
}
