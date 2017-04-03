/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawing.demo.section.pkg3;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

/**
 *
 * @author kmhasan
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Canvas drawingCanvas;
    
    private void drawGrid() {
        double width = drawingCanvas.getWidth();
        double height =drawingCanvas.getHeight();
        double dx = 20;
        double dy = 20;
        System.out.println(width);
        System.out.println(height);
        
        GraphicsContext gc = drawingCanvas.getGraphicsContext2D();
        gc.setStroke(Color.LIGHTGRAY);
        
        // write two for loops to draw the horizontal and vertical lines
        // vertical lines
        for (double x = 0; x <= width; x = x + dx)
            gc.strokeLine(x, 0, x, height);
        
        // horizontal lines
        for (double y = 0; y <= height; y = y + dy)
            gc.strokeLine(0, y, width, y);
        
        // Hometask:
        // 1. draw major gridlines every 100 pixels apart
        // 2. brush up on your trigonometry and polar coordinate knowledge
        
    }
    
    private void draw_gridlines()
    {
        double height=drawingCanvas.getHeight();
        double width=drawingCanvas.getWidth();
        double dx=5;
        double dy=5;
        GraphicsContext gc = drawingCanvas.getGraphicsContext2D();
        gc.setStroke(Color.LIGHTGRAY);
                // vertical lines
        for (double x = 0; x <= width; x = x + dx)
            gc.strokeLine(x, 0, x, height);
        
        // horizontal lines
        for (double y = 0; y <= height; y = y + dy)
            gc.strokeLine(0, y, width, y);
        
        
    }
    private void draw_angle()
    {
        GraphicsContext gc = drawingCanvas.getGraphicsContext2D();
        gc.setStroke(Color.RED);
        gc.strokeLine(40, 10, 40, 150); // line segment A
        gc.strokeLine(40, 10, 150, 10); // line segment B
        gc.strokeLine(150, 10, 150, 150); // line segment C
        gc.strokeLine(40, 150,150, 150);
        
        gc.strokeLine(38, 10, 38, 150); // line segment A
        gc.strokeLine(38, 8, 150, 8); // line segment B
        gc.strokeLine(152, 8, 152, 150); // line segment C
        gc.strokeLine(40, 152,150, 152);
    }
    
  private void drawTriangle() {
        GraphicsContext gc = drawingCanvas.getGraphicsContext2D();
        gc.setStroke(Color.BLUE);
        gc.strokeLine(200, 0, 200, 150); // line segment C
        gc.strokeLine(200, 150, 400, 150); // line segment A
        gc.strokeLine(400, 150, 200, 0); // line segment B
        gc.strokeLine(0, 0, 0, 0);
 }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        drawGrid();
        drawTriangle();
        draw_gridlines();
        draw_angle();
    }    
    
}
