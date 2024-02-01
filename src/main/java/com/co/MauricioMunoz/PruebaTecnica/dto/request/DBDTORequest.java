package com.co.MauricioMunoz.PruebaTecnica.dto.request;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBDTORequest {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            // Establecer la conexión con la base de datos
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nombre_base_de_datos", "usuario", "contraseña");

            // Consulta SQL para recuperar las reservas pagadas y abonadas
            String sql = "SELECT * FROM reservas WHERE estado IN ('pagada', 'abonada')";
            stmt = conn.prepareStatement(sql);

            // Ejecutar la consulta
            rs = stmt.executeQuery();

            // Recorrer los resultados
            while (rs.next()) {
                int idReserva = rs.getInt("id_reserva");
                String nombreCliente = rs.getString("nombre_cliente");
                // Obtener más columnas según sea necesario

                // Imprimir información de la reserva
                System.out.println("Reserva - ID: " + idReserva + ", Cliente: " + nombreCliente);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar ResultSet, PreparedStatement y Connection
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

}
