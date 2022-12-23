package com.example.mini_project_dictonary;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.io.IOException;

public class Dictionary extends Application {
    Dictionary_using_HM load = new Dictionary_using_HM();
    Label heading;
    BackgroundFill background;
    TextField wordTextField;
    Button search_button;
    Label ip_label;
    Label meaning_label;
    Label suggestion;
    ListView<String> suggestionList;
    String word;
    public void showResult(String word){
        if(word.isBlank() || word.isEmpty()){
            meaning_label.setText("Please enter a word !");
            meaning_label.setTextFill(Color.RED);
        }
        else{
            String meaning = Dictionary_using_HM.getMeaning(word);
            meaning_label.setText(meaning);
            meaning_label.setWrapText(true);
            meaning_label.setMaxWidth(200);
            meaning_label.setTextFill(Color.BLACK);
        }
    }
    Pane createContent(){
        // create window and set background and its size
        Pane root = new Pane();
        root.setPrefSize(400,450);
        background = new BackgroundFill(Color.LIGHTCYAN, new CornerRadii(1), new Insets(0.0,4.0,0.0,0.0));
        root.setBackground(new Background(background));

        // Declare and update CSS of labels and fields

        heading = new Label("Welcome to my dictionary here you can find meaning of words which you are looking for!!");
        heading.setTranslateX(10);
        heading.setTranslateY(12);
        heading.setWrapText(true);
        heading.setMaxWidth(350);
        heading.setStyle("-fx-font-weight: Italic");
        heading.setStyle("-fx-font-weight: Bold");

        ip_label = new Label("Enter your word");
        ip_label.setTranslateX(65);
        ip_label.setTranslateY(65);

        wordTextField = new TextField();
        wordTextField.setTranslateX(68);
        wordTextField.setTranslateY(85);
        wordTextField.setMaxSize(200.0,20.0);
        // show result when Enter pressed in Search Field
        wordTextField.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                if (keyEvent.getCode().equals(KeyCode.ENTER)){
                    word = wordTextField.getText().toLowerCase();
                    showResult(word);
                }
            }
        });

        search_button = new Button("Search");
        search_button.setTranslateX(220);
        search_button.setTranslateY(85);
        // Get Result by clicking on Search Button
        search_button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                word = wordTextField.getText().toLowerCase();
                showResult(word);
            }
        });

        meaning_label = new Label();
        meaning_label.setTranslateX(70);
        meaning_label.setTranslateY(120);

        // Show suggestion list to user to get direct access of words in dictionary
        suggestion = new Label("select word from suggestion list");
        suggestion.setTranslateX(20);
        suggestion.setTranslateY(290);

        String [] words = {"Absence","Approval","Answer","Attention","Amount","Borrow","Baffle","Ban","Banish","Banter","Characteristic","Cars","Care","Chip","Cease","Dialogue","Decisive","Delusion","Deplete","Derogatory","Edible","Effervescent","Eloquent","Elusive","Embody"};

        suggestionList = new ListView<>();
        suggestionList.getItems().addAll(words);
        suggestionList.setPrefSize(350.0,50.0);
        suggestionList.setTranslateX(20);
        suggestionList.setTranslateY(310);
        suggestionList.setOrientation(Orientation.HORIZONTAL);
        suggestionList.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                String selected  = suggestionList.getSelectionModel().getSelectedItem();
                showResult(selected);
            }
        });

        root.getChildren().addAll(wordTextField,search_button,meaning_label, ip_label,suggestion,heading,suggestionList);
        return root;
    }
    @Override
    public void start(Stage stage) throws IOException {
        Scene scene = new Scene(createContent());
        stage.setTitle("Dictionary");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}