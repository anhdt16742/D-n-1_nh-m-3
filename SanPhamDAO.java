
package DAO;

import Models.DBconect;
import Models.SanPham;
import com.sun.java.swing.plaf.windows.WindowsBorders;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.naming.spi.DirStateFactory;

public class SanPhamDAO {
ResultSet rs;
     public boolean insertSP(SanPham sp) throws Exception {
        String sql = "INSERT INTO [dbo].[SANPHAM]\n"
                + "           ([MASP]\n"
                + "           ,[LOAISP]\n"
                + "           ,[CHATLIEU]\n"
                + "           ,[MAUSAC]\n"
                + "           ,[TENSANPHAM]\n"
                + "           ,[SOLUONG])\n"
                + "           ,[GIABAN])\n"
                + "           ,[TRONGLUONG])\n"
                + "           ,[SIZE])\n"
                + "     VALUES (?,?,?,?,?,?,?)";
        try (
                Connection con = DBconect.openConnection();
                java.sql.PreparedStatement pstm = con.prepareStatement(sql);) {
            pstm.setString(1, sp.getMaSP());
            pstm.setString(2, sp.getMaLoai());
            pstm.setString(3, sp.getMaChatlieu());
            pstm.setString(4, sp.getMaMauSac());
            pstm.setString(5, sp.getTenSP());
            pstm.setInt(6, sp.getSoLuong());
             pstm.setFloat(7, sp.getGiaban());
            pstm.setFloat(8, sp.getTrongLuong());
            pstm.setString(9, sp.getSize());
            return pstm.executeUpdate() > 0;
        }
    }
 public boolean updateSP(SanPham sp) throws Exception {
        String sql = "INSERT INTO [dbo].[SANPHAM]\n"
                + "    SET       ([MASP]\n"
                + "           ,[LOAISP]\n"
                + "           ,[CHATLIEU]\n"
                + "           ,[MAUSAC]\n"
                + "           ,[TENSANPHAM]\n"
                + "           ,[SOLUONG])\n"
                + "           ,[GIABAN])\n"
                + "           ,[TRONGLUONG])\n"
                + "           ,[SIZE])\n"
                + "     WHERE [MASP]";
        try (
                Connection con = DBconect.openConnection();
                java.sql.PreparedStatement pstm = con.prepareStatement(sql);) {
            pstm.setString(1, sp.getMaSP());
            pstm.setString(2, sp.getMaLoai());
            pstm.setString(3, sp.getMaChatlieu());
            pstm.setString(4, sp.getMaMauSac());
            pstm.setString(5, sp.getTenSP());
            pstm.setInt(6, sp.getSoLuong());
             pstm.setFloat(7, sp.getGiaban());
            pstm.setFloat(8, sp.getTrongLuong());
            pstm.setString(9, sp.getSize());
            return pstm.executeUpdate() > 0;
        }
    }
  public boolean deteleSP(SanPham sp) throws Exception {
        String sql = "DELETE FROM [dbo].[SANPHAM]\n"
                + "      WHERE [MASP] = ?";
        try (
                Connection con = DBconect.openConnection();
                java.sql.PreparedStatement pstm = con.prepareStatement(sql);) {
            pstm.setString(1, sp.getMaSP());
            return pstm.executeUpdate() > 0;
        }
    }
  
    public SanPham searchSP(String maSP)
            throws Exception {
        String sql = "Select * from SANPHAM Where MaSP = ?";
        try (
                Connection con = DBconect.openConnection();
                java.sql.PreparedStatement pstm = con.prepareStatement(sql);) {
            pstm.setString(1, maSP);
            try (ResultSet rs = pstm.executeQuery()) {
                if (rs.next()) {
                    SanPham sp = new SanPham();  
                    sp.setMaSP(rs.getString("MASP"));
                    sp.setMaLoai(rs.getString("MALOAI"));
                    sp.setMaChatlieu(rs.getString("MACHATLIEU"));
                    sp.setMaMauSac(rs.getString("MAMAUSAC"));
                    sp.setTenSP(rs.getString("TENSP"));
                    sp.setSoLuong(rs.getInt("SOLUONG"));
                    sp.setGiaban(rs.getInt("GIABAN"));
                     sp.setTrongLuong(rs.getFloat("TRONGLUONG"));
                     sp.setSize(rs.getString("SIZE"));
            

                    return sp;
                }
            }
            return null;
        }

    }
  }

    


   
    

