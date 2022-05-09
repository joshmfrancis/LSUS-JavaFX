// Name: Joshua Francis
// Course: CSC 135
// Project: LAB3_Extra_Francis_Joshua
// File Name: House.java

// This program uses JavaFX to draw a house with a door, doorknob, windows, 
// chimney, smoke from that chimney, and some clouds in the sky.
// imports that I use in this program

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.*;
import javafx.stage.Stage;

public class House extends Application {

    // Objects on the Stage
    public void start(Stage primaryStage) {

        // The objects made in the program are 
        // in the order that they appear on the stage
        
        // Rectangles follow the parameters of: 
        // Creates new rectangle with the points (x, y, width, height)
        // Stroke Color Set
        // Stroke Width Set
        // Fill Color Set
        
        // The elipses and circles are pretty easy to follow.
        // They follow somewhat of the same conventions as listed above.
        
        // Draws the grass
        Rectangle rect1 = new Rectangle(0, 500, 1500, 250);
        rect1.setStroke(Color.BLACK);
        rect1.setStrokeWidth(1);
        rect1.setFill(Color.GREEN);

        // Draws the main base of the house
        Rectangle rect2 = new Rectangle(375, 300, 750, 250);
        rect2.setStroke(Color.BLACK);
        rect2.setStrokeWidth(1);
        rect2.setFill(Color.YELLOW);

        // Draws the door
        Rectangle rect3 = new Rectangle(710, 430, 80, 120);
        rect3.setStroke(Color.BLACK);
        rect3.setStrokeWidth(1);
        rect3.setFill(Color.ORANGE);

        // Draws the doorknob
        Circle circ1 = new Circle(775, 500, 5);
        circ1.setStroke(Color.BLACK);
        circ1.setStrokeWidth(1);
        circ1.setFill(Color.BLACK);

        // Draws the left window
        Rectangle rect4 = new Rectangle(502.5, 430, 100, 50);
        rect4.setStroke(Color.BLACK);
        rect4.setStrokeWidth(1);
        rect4.setFill(Color.WHITE);

        // Draws the right window
        Rectangle rect5 = new Rectangle(907.5, 430, 100, 50);
        rect5.setStroke(Color.BLACK);
        rect5.setStrokeWidth(1);
        rect5.setFill(Color.WHITE);

        // Draws the roof 
        Rectangle rect6 = new Rectangle(350, 250, 800, 120);
        rect6.setStroke(Color.BLACK);
        rect6.setStrokeWidth(1);
        rect6.setFill(Color.PURPLE);

        // Draws the chimney
        Rectangle rect7 = new Rectangle(450, 200, 50, 100);
        rect7.setStroke(Color.BLACK);
        rect7.setStrokeWidth(1);
        rect7.setFill(Color.ORANGE);

        // Draws the first smoke coming from the chimney
        Circle circ2 = new Circle(485, 170, 15);
        circ2.setFill(Color.GREY);

        // Draws the second smoke coming from the chimney
        Circle circ3 = new Circle(495, 155, 15);
        circ3.setFill(Color.GREY);

        // Draws the first cloud in the sky
        Ellipse elip1 = new Ellipse(1125, 150, 100, 70);
        elip1.setFill(Color.WHITE);

        // Draws the second cloud in the sky
        Ellipse elip2 = new Ellipse(1200, 110, 105, 65);
        elip2.setFill(Color.WHITE);

        // Draws the LSUS sign on the roof
        Text text1 = new Text(650, 330, "LSUS");
        text1.setFont(Font.font("Comic Sans MS", 75));
        text1.setFill(Color.YELLOW);

        // Group root to hold all of the objects that I created 
        // (Based on order of showing)
        Group root = new Group(rect1, rect2, rect3, circ1, rect4, rect5,
                rect6, rect7, circ2, circ3, elip1, elip2, text1);

        // Creating Scene and Instructions for the Stage and Scene:
        // group root, size, color, name, and showing
        Scene scene = new Scene(root, 1500, 750, Color.LIGHTBLUE);
        primaryStage.setTitle("LSUS");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    // Launches the JavaFX application.
    public static void main(String[] args) {
        launch(args);
    }

}
