package com.example.yukyuchung_comp228lab4;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;

public class HelloController {

    @FXML
    private TextField nameField;

    @FXML
    private TextField addressField;

    @FXML
    private TextField provinceField;

    @FXML
    private TextField cityField;

    @FXML
    private TextField postalCodeField;

    @FXML
    private TextField phoneNumberField;

    @FXML
    private TextField emailField;

    @FXML
    private CheckBox studentCouncilCheckBox;

    @FXML
    private CheckBox volunteerWorkCheckBox;

    @FXML
    private RadioButton computerScienceRadio;

    @FXML
    private RadioButton businessRadio;

    @FXML
    private ComboBox<String> coursesComboBox;

    @FXML
    private ListView<String> selectedCoursesListView;

    @FXML
    private TextArea resultTextArea;

    @FXML
    private Label messageLabel;

    private ObservableList<String> selectedCourses = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        // Set up listeners for the radio buttons to change course options
        computerScienceRadio.setOnAction(event -> {
            if (computerScienceRadio.isSelected()) {
                coursesComboBox.setItems(FXCollections.observableArrayList("Python", "C#", "Java"));
            }
        });

        businessRadio.setOnAction(event -> {
            if (businessRadio.isSelected()) {
                coursesComboBox.setItems(FXCollections.observableArrayList("Accounting", "Finance", "Economics"));
            }
        });

        // Add selected course to the ListView, avoiding duplicates
        coursesComboBox.setOnAction(event -> {
            String selectedCourse = coursesComboBox.getValue();
            if (selectedCourse != null && !selectedCourses.contains(selectedCourse)) {
                selectedCourses.add(selectedCourse);
                selectedCoursesListView.setItems(selectedCourses);
            }
        });
    }

    @FXML
    protected void onDisplayButtonClick() {
        if (areFieldsValid()) {
            StringBuilder result = new StringBuilder();

            result.append(nameField.getText()).append(", ")
                    .append(addressField.getText()).append(", ")
                    .append(cityField.getText()).append(", ")
                    .append(provinceField.getText()).append(", ")
                    .append(postalCodeField.getText()).append(", ")
                    .append(phoneNumberField.getText()).append(", ")
                    .append(emailField.getText()).append("\n");

            if (studentCouncilCheckBox.isSelected()) {
                result.append("Student Council\n");
            }

            if (volunteerWorkCheckBox.isSelected()) {
                result.append("Volunteer Work\n");
            }

            if (computerScienceRadio.isSelected()) {
                result.append("Programme: Computer Science\n");
            } else if (businessRadio.isSelected()) {
                result.append("Programme: Business\n");
            }

            result.append("Selected Courses: ");
            for (String course : selectedCourses) {
                result.append(course).append(", ");
            }
            // Remove comma and space
            if (!selectedCourses.isEmpty()) {
                result.setLength(result.length() - 2);
            }

            result.append("\n");

            resultTextArea.setText(result.toString());
            messageLabel.setText("Information displayed successfully.");


        }
    }

    private boolean areFieldsValid() {
        if (nameField.getText().isEmpty() ||
                addressField.getText().isEmpty() ||
                cityField.getText().isEmpty() ||
                provinceField.getText().isEmpty() ||
                postalCodeField.getText().isEmpty() ||
                phoneNumberField.getText().isEmpty() ||
                emailField.getText().isEmpty() ||
                (!computerScienceRadio.isSelected() && !businessRadio.isSelected())) {

            showAlert("Validation Error", "Please fill in all fields and select a programme.");
            return false;
        }
        return true;
    }

    // Method to show alert dialog
    private void showAlert(String title, String message) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle(title);
        alert.setContentText(message);
        alert.showAndWait();
    }


}
