package com.example.yukyuchung_comp228lab5;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


import java.sql.*;

public class HelloController {
    private static final String URL = "jdbc:oracle:thin:@//199.212.26.208:1521/SQLD";
    private static final String USER = "COMP228_F24_soh_7";
    private static final String PASSWORD = "91231079";

    @FXML
    private TextField txtPlayerID, txtFirstName, txtLastName, txtAddress, txtPostalCode, txtProvince, txtPhoneNumber;
    @FXML
    private TextField txtGameID, txtGameTitle;
    @FXML
    private TextField txtPlayerGameID, txtPlayerIDRel, txtGameIDRel, txtPlayingDate, txtScoreRel;
    @FXML
    private TextArea txtReportArea;

    public void insertPlayer() {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String query = "INSERT INTO YukYu_Chung_player (player_id, first_name, last_name, address, postal_code, province, phone_number) VALUES (?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement pstmt = conn.prepareStatement(query)) {
                pstmt.setInt(1, Integer.parseInt(txtPlayerID.getText()));
                pstmt.setString(2, txtFirstName.getText());
                pstmt.setString(3, txtLastName.getText());
                pstmt.setString(4, txtAddress.getText());
                pstmt.setString(5, txtPostalCode.getText());
                pstmt.setString(6, txtProvince.getText());
                pstmt.setString(7, txtPhoneNumber.getText());
                pstmt.executeUpdate();
                txtReportArea.setText("Player inserted successfully!");
            }
        } catch (SQLException e) {
            txtReportArea.setText("Error: " + e.getMessage());
        }
    }

    public void updatePlayer() {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String query = "UPDATE YukYu_Chung_player SET first_name = ?, last_name = ?, address = ?, postal_code = ?, province = ?, phone_number = ? WHERE player_id = ?";
            try (PreparedStatement pstmt = conn.prepareStatement(query)) {
                pstmt.setString(1, txtFirstName.getText());
                pstmt.setString(2, txtLastName.getText());
                pstmt.setString(3, txtAddress.getText());
                pstmt.setString(4, txtPostalCode.getText());
                pstmt.setString(5, txtProvince.getText());
                pstmt.setString(6, txtPhoneNumber.getText());
                pstmt.setInt(7, Integer.parseInt(txtPlayerID.getText()));
                pstmt.executeUpdate();
                txtReportArea.setText("Player updated successfully!");
            }
        } catch (SQLException e) {
            txtReportArea.setText("Error: " + e.getMessage());
        }
    }

    public void insertGame() {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String query = "INSERT INTO YukYu_Chung_game (game_id, game_title) VALUES (?, ?)";
            try (PreparedStatement pstmt = conn.prepareStatement(query)) {
                pstmt.setInt(1, Integer.parseInt(txtGameID.getText()));
                pstmt.setString(2, txtGameTitle.getText());
                pstmt.executeUpdate();
                txtReportArea.setText("Game inserted successfully!");
            }
        } catch (SQLException e) {
            txtReportArea.setText("Error: " + e.getMessage());
        }
    }
    public void insertPlayerAndGame() {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String query = "INSERT INTO YukYu_Chung_player_and_game (player_game_id, player_id, game_id, playing_date, score) VALUES (?, ?, ?, TO_DATE(?, 'YYYY-MM-DD'), ?)";
            try (PreparedStatement pstmt = conn.prepareStatement(query)) {
                pstmt.setInt(1, Integer.parseInt(txtPlayerGameID.getText()));  // player_game_id
                pstmt.setInt(2, Integer.parseInt(txtPlayerIDRel.getText()));   // player_id
                pstmt.setInt(3, Integer.parseInt(txtGameIDRel.getText()));     // game_id
                pstmt.setString(4, txtPlayingDate.getText());                  // playing_date (format YYYY-MM-DD)
                pstmt.setInt(5, Integer.parseInt(txtScoreRel.getText()));      // score

                pstmt.executeUpdate();
                txtReportArea.setText("Relationship inserted successfully!");
            }
        } catch (SQLException e) {
            txtReportArea.setText("Error inserting relationship: " + e.getMessage());
            e.printStackTrace();
        } catch (NumberFormatException e) {
            txtReportArea.setText("Invalid input: Please ensure all fields are filled correctly.");
        }
    }
    public void displayReport() {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String query = """
            SELECT p.player_id, p.first_name, p.last_name, g.game_title, pg.playing_date, pg.score
            FROM YukYu_Chung_player p
            JOIN YukYu_Chung_player_and_game pg ON p.player_id = pg.player_id
            JOIN YukYu_Chung_game g ON pg.game_id = g.game_id
            WHERE p.player_id = ?
        """;

            try (PreparedStatement pstmt = conn.prepareStatement(query)) {
                pstmt.setInt(1, Integer.parseInt(txtPlayerID.getText())); // Get player_id from input field
                ResultSet rs = pstmt.executeQuery();

                txtReportArea.clear();
                boolean hasResults = false;

                while (rs.next()) {
                    hasResults = true;
                    txtReportArea.appendText(
                            "Player ID: " + rs.getInt("player_id") +
                                    ", Name: " + rs.getString("first_name") + " " + rs.getString("last_name") +
                                    ", Game: " + rs.getString("game_title") +
                                    ", Score: " + rs.getInt("score") +
                                    ", Date: " + rs.getDate("playing_date") + "\n"
                    );
                }

                if (!hasResults) {
                    txtReportArea.setText("No results found for Player ID: " + txtPlayerID.getText());
                }
            }
        } catch (SQLException e) {
            txtReportArea.setText("Error: " + e.getMessage());
            e.printStackTrace();
        } catch (NumberFormatException e) {
            txtReportArea.setText("Invalid Player ID. Please enter a numeric value.");
        }
    }


}
