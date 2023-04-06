package exam03.config_JDBC;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class AppCtx {
    @Bean
    public DataSource dataSource(){
        // 오라클 연결
        String url = "jdbc:oracle:thin:@localhost:1521:orcl"; //오라클데이터베이스 현재 호스트의주소

        DataSource ds = new DataSource();
        ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        ds.setUrl(url);

        //계정설정
        ds.setUsername("scott");
        ds.setPassword("tiger");

        ds.setInitialSize(2); // 커넥션풀 만들어놓기 2개 만듬
        ds.setMaxActive(10); // 커넥션풀 최대값
        ds.setTestWhileIdle(true); // 유휴상태일때 연결상태 체크할것인지 여부
        ds.setTimeBetweenEvictionRunsMillis(3000); // 밀리초 마다 유휴 객체 연결체크
        ds.setMinEvictableIdleTimeMillis(60000); // 60초 이후 연결객체 다시생성

        return ds;
    }



    @Bean // 쿼리객체
    public JdbcTemplate jdbcTemplate(){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource());

        return jdbcTemplate;
    }


    @Bean
    public TestDao testDao(){

        return new TestDao();
    }



}
