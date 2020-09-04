package client;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

//Это заглушка, не успел сделать д.з. Начал разбираться с кодом, думаю что
// нужно изменить метод регистрации: убрать список List<UserData> users, добавить метод записи в базу
// добавить метод чтения из базы.
// или все это реализовать в одном методе registration..

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/sample.fxml"));
        primaryStage.setTitle("Chat july 2020");
        primaryStage.setScene(new Scene(root, 450, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
