package com.github.plushaze.traynotification;

import com.github.plushaze.traynotification.animations.Animations;
import com.github.plushaze.traynotification.notification.TrayNotification;
import javafx.application.Platform;
import javafx.scene.image.Image;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;
import javafx.util.Duration;

import static javafx.application.Application.launch;

public class CreateNot extends javafx.application.Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Platform.runLater(() -> {
            System.out.println("Hello, world!");
            showNotification("¡Próximamente!", "¡Esta función estará disponible en la próxima actualización, así que atento para descargarla!");
        });
    }

    public static void showNotification(String title, String message) {
        Image logo = new Image("/images/notice.png");

        TrayNotification tray = new TrayNotification();
        tray.setTitle(title);
        tray.setMessage(message);
        tray.setRectangleFill(Paint.valueOf("#000000"));
        tray.setAnimation(Animations.POPUP);
        tray.setImage(logo);
        tray.showAndWait();
        //tray.showAndDismiss(Duration.seconds(4));
    }
}
