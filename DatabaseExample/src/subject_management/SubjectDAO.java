package subject_management;

import java.sql.Connection;
import java. sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql. SQLException;
import java.util.ArrayList;
import java.util. List;

import static academic_database.DBConnectionUtil .*;

public class SubjectDAO {
    private static final SubjectDAO instance = new SubjectDAO();
    // 싱글톤 패턴
    public static SubjectDAO getInstance() {
        return instance;
    }

    private SubjectDAO() {}

    // 메서드를 하나씩 작성하면 된다.

    private SubjectDTO addSubject(ResultSet rs) throws SQLException {
        SubjectDTO subjectDTO = new SubjectDTO();
        subjectDTO.setNo(rs.getInt("no"));
        subjectDTO.setSubjectNumber(rs.getString("s_num"));
        subjectDTO.setSubjectName(rs.getString("s_name"));
        return subjectDTO;
    }

    public List<SubjectDTO> getAllSubjects() throws SQLException {
        List<SubjectDTO> list = new ArrayList<>();
        String sql = """
                SELECT no, s_num, s_name FROM subject
                ORDER BY no
        """;
        try (
                Connection conn = getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);
                ResultSet rs= pstmt.executeQuery()
        ) {
            while (rs.next()) {
                list.add(addSubject(rs));
            }
        }
        return list;
    }

    public boolean subjectInsert(SubjectDTO subjectDTO) throws SQLException {
        String sql = """
                INSERT INTO subject(s_name)
                VALUES(?)
                """;
        try (
                Connection conn = getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);
        ) {
            pstmt.setString(1, subjectDTO.getSubjectName());

            return pstmt.executeUpdate() == 1;
        }
    }


    public int studentDataCheck(SubjectDTO subjectDTO) throws SQLException {
        String sql = """
                SELECT COUNT (*)
                FROM student
                WHERE s_num = ?
        """;

        try (
                Connection conn = getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql)
        ) {
            pstmt.setString(1, subjectDTO.getSubjectNumber());

            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt(1);
                }
            }
        }
        return 0;
    }

    public boolean subjectDelete(SubjectDTO subjectDTO) throws SQLException {
        String sql = """
                DELETE subject
                WHERE s_num = ?
                """;
        try (
                Connection conn = getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);
        ) {
            pstmt.setString(1, subjectDTO.getSubjectNumber());

            return pstmt.executeUpdate() == 1;
        }
    }

    public boolean subjectUpdate(SubjectDTO subjectDTO) throws SQLException {
        String sql = """
                UPDATE subject
                SET s_name = ?
                WHERE s_num = ?
                """;
        try (
                Connection conn = getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);
        ) {
            pstmt.setString(1, subjectDTO.getSubjectName());
            pstmt.setString(2, subjectDTO.getSubjectNumber());

            return pstmt.executeUpdate() == 1;
        }
    }

    public List<SubjectDTO> getSearch(SubjectDTO subjectDTO) throws SQLException {
        List<SubjectDTO> list = new ArrayList<>();
        String sql = """
                SELECT no, s_num, s_name FROM subject
                WHERE s_name = ?
        """;
        try (
                Connection conn = getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);

        ) {
            pstmt.setString(1, subjectDTO.getSubjectName());
            ResultSet rs= pstmt.executeQuery();
            while (rs.next()) {
                list.add(addSubject(rs));
            }
        }
        return list;
    }
}