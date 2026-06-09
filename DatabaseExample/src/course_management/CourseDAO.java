package course_management;

import java.sql.Connection;
import java. sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql. SQLException;
import java.util.ArrayList;
import java.util. List;

import static academic_database.DBConnectionUtil.getConnection;

public class CourseDAO {
    private static final CourseDAO instance = new CourseDAO();
    // 싱글톤 패턴
    public static CourseDAO getInstance() {
        return instance;
    }

    private CourseDAO() {}

    // 메서드를 하나씩 작성하면 된다.

    private courseDTO addCourse(ResultSet rs) throws SQLException {
        courseDTO courseDTO = new courseDTO();
        courseDTO.setNo(rs.getInt("no"));
        courseDTO.setCourseNumber(rs.getString("c_num"));
        courseDTO.setCourseName(rs.getString("c_name"));
        courseDTO.setCredit(rs.getInt("c_credit"));
        courseDTO.setCourseSection(rs.getString("c_section"));
        return courseDTO;
    }

    public List<courseDTO> getAllSubjects() throws SQLException {
        List<courseDTO> list = new ArrayList<>();
        String sql = """
                SELECT no, c_num, c_name, c_credit, c_section
                FROM course
                ORDER BY no
        """;
        try (
                Connection conn = getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);
                ResultSet rs= pstmt.executeQuery()
        ) {
            while (rs.next()) {
                list.add(addCourse(rs));
            }
        }
        return list;
    }

    public boolean courseInsert(courseDTO courseDTO) throws SQLException {
        String sql = """
                INSERT INTO course(no, c_num, c_name, c_credit, c_section)
                VALUES(course_seq.NEXTVAL, ?, ?, ?, ?)
                """;
        try (
                Connection conn = getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);
        ) {
            pstmt.setString(1, courseDTO.getCourseNumber());
            pstmt.setString(2, courseDTO.getCourseName());
            pstmt.setInt(3, courseDTO.getCredit());
            pstmt.setString(4, courseDTO.getCourseSection());

            return pstmt.executeUpdate() == 1;
        }
    }


    public boolean courseDelete(courseDTO courseDTO) throws SQLException {
        String sql = """
                DELETE course
                WHERE c_num = ?
                """;
        try (
                Connection conn = getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);
        ) {
            pstmt.setString(1, courseDTO.getCourseNumber());

            return pstmt.executeUpdate() == 1;
        }
    }

    public boolean courseUpdate(courseDTO courseDTO) throws SQLException {
        String sql = """
                UPDATE course
                SET c_name = ?, c_credit = ?, c_section = ?
                WHERE c_num = ?
                """;
        try (
                Connection conn = getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);
        ) {
            pstmt.setString(1, courseDTO.getCourseName());
            pstmt.setInt(2, courseDTO.getCredit());
            pstmt.setString(3, courseDTO.getCourseSection());
            pstmt.setString(4, courseDTO.getCourseNumber());

            return pstmt.executeUpdate() == 1;
        }
    }

    public List<courseDTO> getSearch(courseDTO courseDTO) throws SQLException {
        List<courseDTO> list = new ArrayList<>();
        String sql = """
                SELECT no, c_num, c_name, c_credit, c_section
                FROM course
                WHERE c_name = ?
        """;
        try (
                Connection conn = getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);

        ) {
            pstmt.setString(1, courseDTO.getCourseName());
            ResultSet rs= pstmt.executeQuery();
            while (rs.next()) {
                list.add(addCourse(rs));
            }
        }
        return list;
    }
}