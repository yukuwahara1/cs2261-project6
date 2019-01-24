//============================================================================
//Name        : Battleship.java
//Course      : CS 2261: Objected-Oriented Programming
//Date        : 12/5/2018
//Author      : Yu Kuwahara
//============================================================================

// Create a GUI for a battleship game

// imported whatever needed every time I got a warning
import javafx.application.Application;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

import javafx.geometry.Pos;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Battleship extends Application 
{
	
	public static void main(String[] args) throws Exception
	{ 
		launch(args);
	}
	
    public void start(Stage primaryStage) throws Exception 
    {
    	// title of the project
        primaryStage.setTitle("SuperSimpleBattleship!");
        
        // remove max or min button from the window
        primaryStage.initStyle(StageStyle.UTILITY);
        
        // I picked border pane for scene because you can only have one root pane
        BorderPane rootNode = new BorderPane();
        rootNode.setPrefSize(300, 300);
        
        // label for the battleship
        Text topText = new Text("Try to sink my battleship!");
        
        // place a text on top 
        rootNode.setTop(topText);
        
        // center align the top text
        rootNode.setAlignment(topText, Pos.CENTER);
        
        // create a vertical label
        // unfortunately it does not move along the buttons
        Text leftText = new Text("\nH\n\n" + "0\n\n\n" + "Misses\n\n\n\n" + "0\n\n\n" + "Sunk\n\n\n" + "0\n\n");
        
        // place a text on left
        rootNode.setLeft(leftText);
        
        // center align the left text
        rootNode.setAlignment(leftText, Pos.CENTER);
        
        // create an instance of grid pane
        GridPane gridPane = new GridPane();
        
        // make the background color pink 
        gridPane.setStyle("-fx-background-color: PINK;");
        rootNode.setCenter(gridPane);
        
        // keep the grids in center
        gridPane.setAlignment(Pos.CENTER);
        
        // each of the buttons needs to nearly touch each other
        gridPane.setHgap(0.5);
        gridPane.setVgap(0.5);
        
        double minButtonSize = 5;
        double numColumn = 10;
        double numRow = 10;
        
        // nested loop to create a 10x10 grid
        for(int i = 0; i < numColumn; i++)
        {
        	for(int j = 0; j < numRow; j++)
        	{
        		Button button = new Button("0");
        		
        		
        		button.setMinSize(minButtonSize, minButtonSize);
        		
        		// max size of button depends on how big the window is 
        		button.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        		
        		gridPane.add(button, i, j, 1, 1);
        		
        		 // make it able to resize the height of each buttons
        		 rootNode.heightProperty().addListener(new ChangeListener()
         		{

 					@Override
 					public void changed(ObservableValue arg0, Object arg1, Object arg2) {
 						double height = (double)arg2;
 						button.setPrefHeight(height/2);
 						
 					}
      
         		});
        		 
        		 // make it able to resize the width of each buttons
        		 rootNode.widthProperty().addListener(new ChangeListener()
         		{

 					@Override
 					public void changed(ObservableValue arg0, Object arg1, Object arg2) {
 						double width = (double)arg2;
 						button.setPrefWidth(width/2);
 						
 					}
      
         		});
        	}
        	
        } // the end of nested loop
     
        // set the scene
        // "rootNode" takes care of both grid pane and border pane
        Scene scene = new Scene(rootNode);
        
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    
}
    
   
