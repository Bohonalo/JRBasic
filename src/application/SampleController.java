package application;

import javafx.fxml.FXML;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Ellipse;

public class SampleController {
	
	@FXML
	private Ellipse ellipse;
	
	@FXML
    private ImageView imageView;   
	
	
	@FXML
	private void handleClose() {
	        System.exit(0);
	}
	
	@FXML
    public void setclip() {           
        ellipse = new Ellipse();
        ellipse.centerXProperty().setValue(95);
        ellipse.centerYProperty().setValue(70);
        ellipse.radiusXProperty().setValue(70);
        ellipse.radiusYProperty().setValue(70);
        imageView.setClip(ellipse);
    }

	@FXML
    public void setblur() {           
             imageView.setEffect(new GaussianBlur(10));
    }
	
}
