import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.KeyCode;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.io.File;

public class Main extends Application {
    ImageView[] image = new ImageView[10];
    Boolean[] placer = new Boolean[9];
    ImageView[] mélange = new ImageView[9];
    Image[] trueImage = new Image[9];
    public static void main(String[] args) {launch(args);}
    public void start(Stage stage1){
        stage1.setTitle("Puzzle");
        stage1.setHeight(640);
        stage1.setWidth(640);
        stage1.setResizable(false);
        try{
            trueImage[0] = new Image(new File("mario0.jpg").toURI().toURL().toExternalForm());
            trueImage[1] = new Image(new File("mario1.jpg").toURI().toURL().toExternalForm());
            trueImage[2] = new Image(new File("mario2.jpg").toURI().toURL().toExternalForm());
            trueImage[3] = new Image(new File("mario3.jpg").toURI().toURL().toExternalForm());
            trueImage[4] = new Image(new File("mario4.jpg").toURI().toURL().toExternalForm());
            trueImage[5] = new Image(new File("mario5.jpg").toURI().toURL().toExternalForm());
            trueImage[6] = new Image(new File("mario6.jpg").toURI().toURL().toExternalForm());
            trueImage[7] = new Image(new File("mario7.jpg").toURI().toURL().toExternalForm());
            trueImage[8] = new Image(new File("mario8.jpg").toURI().toURL().toExternalForm());
        }catch(Exception exception1){}
            image[0] = new ImageView(trueImage[0]);
            image[1] = new ImageView(trueImage[1]);
            image[2] = new ImageView(trueImage[2]);
            image[3] = new ImageView(trueImage[3]);
            image[4] = new ImageView(trueImage[4]);
            image[5] = new ImageView(trueImage[5]);
            image[6] = new ImageView(trueImage[6]);
            image[7] = new ImageView(trueImage[7]);
            image[8] = new ImageView(trueImage[8]);
            image[9] = new ImageView(trueImage[8]);
        FlowPane[] root = new FlowPane[1];
        root[0] = new FlowPane(image[0],image[1],image[2],image[3],image[4],image[5],image[6],image[7],image[8]);
        BorderPane root2 = new BorderPane();
        root2.setCenter(root[0]);
        ColorAdjust imageColors = new ColorAdjust();
        ColorAdjust imageColors2 = new ColorAdjust();
        imageColors.setBrightness(0.5);
        imageColors2.setBrightness(0);

        image[0].setOnDragDetected(event -> {
            image[0].setEffect(imageColors);
            Dragboard dragboard = image[0].startDragAndDrop(TransferMode.MOVE);
            ClipboardContent contenu = new ClipboardContent();
            contenu.putString("0");
            dragboard.setContent(contenu);
        });
        image[1].setOnDragDetected(event -> {
            image[1].setEffect(imageColors);
            Dragboard dragboard = image[1].startDragAndDrop(TransferMode.MOVE);
            ClipboardContent contenu = new ClipboardContent();
            contenu.putString("1");
            dragboard.setContent(contenu);
        });
        image[2].setOnDragDetected(event -> {
            image[2].setEffect(imageColors);
            Dragboard dragboard = image[2].startDragAndDrop(TransferMode.MOVE);
            ClipboardContent contenu = new ClipboardContent();
            contenu.putString("2");
            dragboard.setContent(contenu);
        });
        image[3].setOnDragDetected(event -> {
            image[3].setEffect(imageColors);
            Dragboard dragboard = image[3].startDragAndDrop(TransferMode.MOVE);
            ClipboardContent contenu = new ClipboardContent();
            contenu.putString("3");
            dragboard.setContent(contenu);
        });
        image[4].setOnDragDetected(event -> {
            image[4].setEffect(imageColors);
            Dragboard dragboard = image[4].startDragAndDrop(TransferMode.MOVE);
            ClipboardContent contenu = new ClipboardContent();
            contenu.putString("4");
            dragboard.setContent(contenu);
        });
        image[5].setOnDragDetected(event -> {
            image[5].setEffect(imageColors);
            Dragboard dragboard = image[5].startDragAndDrop(TransferMode.MOVE);
            ClipboardContent contenu = new ClipboardContent();
            contenu.putString("5");
            dragboard.setContent(contenu);
        });
        image[6].setOnDragDetected(event -> {
            image[6].setEffect(imageColors);
            Dragboard dragboard = image[6].startDragAndDrop(TransferMode.MOVE);
            ClipboardContent contenu = new ClipboardContent();
            contenu.putString("6");
            dragboard.setContent(contenu);
        });
        image[7].setOnDragDetected(event -> {
            image[7].setEffect(imageColors);
            Dragboard dragboard = image[7].startDragAndDrop(TransferMode.MOVE);
            ClipboardContent contenu = new ClipboardContent();
            contenu.putString("7");
            dragboard.setContent(contenu);
        });
        image[8].setOnDragDetected(event -> {
            image[8].setEffect(imageColors);
            Dragboard dragboard = image[8].startDragAndDrop(TransferMode.MOVE);
            ClipboardContent contenu = new ClipboardContent();
            contenu.putString("8");
            dragboard.setContent(contenu);
        });
        image[0].setOnDragDone(event -> {
            image[0].setEffect(imageColors2);
            if(Vérifier()){
                root[0] = Mélanger();
                root2.setCenter(root[0]);
            }
        });
        image[1].setOnDragDone(event -> {
            image[1].setEffect(imageColors2);
            if(Vérifier()){
                root[0] = Mélanger();
                root2.setCenter(root[0]);
            }
        });
        image[2].setOnDragDone(event -> {
            image[2].setEffect(imageColors2);
            if(Vérifier()){
                root[0] = Mélanger();
                root2.setCenter(root[0]);
            }
        });
        image[3].setOnDragDone(event -> {
            image[3].setEffect(imageColors2);
            if(Vérifier()){
                root[0] = Mélanger();
                root2.setCenter(root[0]);
            }
        });
        image[4].setOnDragDone(event -> {
            image[4].setEffect(imageColors2);
            if(Vérifier()){
                root[0] = Mélanger();
                root2.setCenter(root[0]);
            }
        });
        image[5].setOnDragDone(event -> {
            image[5].setEffect(imageColors2);
            if(Vérifier()){
                root[0] = Mélanger();
                root2.setCenter(root[0]);
            }
        });
        image[6].setOnDragDone(event -> {
            image[6].setEffect(imageColors2);
            if(Vérifier()){
                root[0] = Mélanger();
                root2.setCenter(root[0]);
            }
        });
        image[7].setOnDragDone(event -> {
            image[7].setEffect(imageColors2);
            if(Vérifier()){
                root[0] = Mélanger();
                root2.setCenter(root[0]);
            }
        });
        image[8].setOnDragDone(event -> {
            image[8].setEffect(imageColors2);
            if(Vérifier()){
                root[0] = Mélanger();
                root2.setCenter(root[0]);
            }
        });
        image[0].setOnDragDropped(event -> {
            image[9].setImage(image[0].getImage());
            image[0].setImage(image[Integer.parseInt(event.getDragboard().getString())].getImage());
            image[Integer.parseInt(event.getDragboard().getString())].setImage(image[9].getImage());
        });
        image[1].setOnDragDropped(event -> {
            image[9].setImage(image[1].getImage());
            image[1].setImage(image[Integer.parseInt(event.getDragboard().getString())].getImage());
            image[Integer.parseInt(event.getDragboard().getString())].setImage(image[9].getImage());
        });
        image[2].setOnDragDropped(event -> {
            image[9].setImage(image[2].getImage());
            image[2].setImage(image[Integer.parseInt(event.getDragboard().getString())].getImage());
            image[Integer.parseInt(event.getDragboard().getString())].setImage(image[9].getImage());
        });
        image[3].setOnDragDropped(event -> {
            image[9].setImage(image[3].getImage());
            image[3].setImage(image[Integer.parseInt(event.getDragboard().getString())].getImage());
            image[Integer.parseInt(event.getDragboard().getString())].setImage(image[9].getImage());
        });
        image[4].setOnDragDropped(event -> {
            image[9].setImage(image[4].getImage());
            image[4].setImage(image[Integer.parseInt(event.getDragboard().getString())].getImage());
            image[Integer.parseInt(event.getDragboard().getString())].setImage(image[9].getImage());
        });
        image[5].setOnDragDropped(event -> {
            image[9].setImage(image[5].getImage());
            image[5].setImage(image[Integer.parseInt(event.getDragboard().getString())].getImage());
            image[Integer.parseInt(event.getDragboard().getString())].setImage(image[9].getImage());
        });
        image[6].setOnDragDropped(event -> {
            image[9].setImage(image[6].getImage());
            image[6].setImage(image[Integer.parseInt(event.getDragboard().getString())].getImage());
            image[Integer.parseInt(event.getDragboard().getString())].setImage(image[9].getImage());
        });
        image[7].setOnDragDropped(event -> {
            image[9].setImage(image[7].getImage());
            image[7].setImage(image[Integer.parseInt(event.getDragboard().getString())].getImage());
            image[Integer.parseInt(event.getDragboard().getString())].setImage(image[9].getImage());
        });
        image[8].setOnDragDropped(event -> {
            image[9].setImage(image[8].getImage());
            image[8].setImage(image[Integer.parseInt(event.getDragboard().getString())].getImage());
            image[Integer.parseInt(event.getDragboard().getString())].setImage(image[9].getImage());
        });
        image[0].setOnDragOver(event -> {
            event.acceptTransferModes(TransferMode.MOVE);
        });
        image[1].setOnDragOver(event -> {
            event.acceptTransferModes(TransferMode.MOVE);
        });
        image[2].setOnDragOver(event -> {
            event.acceptTransferModes(TransferMode.MOVE);
        });
        image[3].setOnDragOver(event -> {
            event.acceptTransferModes(TransferMode.MOVE);
        });
        image[4].setOnDragOver(event -> {
            event.acceptTransferModes(TransferMode.MOVE);
        });
        image[5].setOnDragOver(event -> {
            event.acceptTransferModes(TransferMode.MOVE);
        });
        image[6].setOnDragOver(event -> {
            event.acceptTransferModes(TransferMode.MOVE);
        });
        image[7].setOnDragOver(event -> {
            event.acceptTransferModes(TransferMode.MOVE);
        });
        image[8].setOnDragOver(event -> {
            event.acceptTransferModes(TransferMode.MOVE);
        });
        Timeline win = new Timeline();
        Scene scene1 = new Scene(root2);
        stage1.setScene(scene1);
        stage1.show();
        scene1.setOnKeyPressed(event->{
            if(event.getCode() == KeyCode.M) {
                if(event.isControlDown()){
                    root[0] = Mélanger();
                    root2.setCenter(root[0]);
                }

            }
        });

    }
    public boolean Vérifier(){
        try {
            System.out.println("essaie1");
            System.out.println("essaie2");
            if(image[0].getImage()==trueImage[0]){
                System.out.println("done ima 1");
                if(image[1].getImage().equals(trueImage[1])){
                    System.out.println("done ima 2");
                    if(image[2].getImage().equals(trueImage[2])){
                        System.out.println("done ima 3");
                        if(image[3].getImage().equals(trueImage[3])){
                            System.out.println("done ima 4");
                            if(image[4].getImage().equals(trueImage[4])){
                                System.out.println("done ima 5");
                                if(image[5].getImage().equals(trueImage[5])){
                                    System.out.println("done ima 6");
                                    if(image[6].getImage().equals(trueImage[6])){
                                        System.out.println("done ima 7");
                                        if(image[7].getImage().equals(trueImage[7])){
                                            System.out.println("done ima 8");
                                            if(image[8].getImage().equals(trueImage[8])){
                                                System.out.println("done ima 9");
                                                Alert alerte = new Alert(Alert.AlertType.CONFIRMATION);
                                                alerte.setTitle("Félicitation");
                                                alerte.setHeaderText("Vous avez terminé le casse tête!");
                                                alerte.setContentText(
                                                        "Clic sur ok pour jouer à nouveau ou sur annuler pour ne rien faire");
                                                ButtonType resultat = alerte.showAndWait().get();
                                                if(resultat == ButtonType.OK){
                                                    return true;
                                                }else{
                                                    return false;
                                                }
                                            }else{
                                                return false;
                                            }
                                        }else{
                                            return false;
                                        }
                                    }else{
                                        return false;
                                    }
                                }else{
                                    return false;
                                }
                            }else{
                                return false;
                            }
                        }else{
                            return false;
                        }
                    }else{
                        return false;
                    }
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }catch(Exception exception1){
            return false;
        }
        }
        public FlowPane Mélanger(){
            for(int i=0;i<9;i++){
                placer[i] = false;
                try{
                    mélange[i] = new ImageView(new Image(new File("mario0.jpg").toURI().toURL().toExternalForm()));
                }catch(Exception test){
                }
            }
            for(int i=0;i<9;i++){
                boolean cherche = true;
                while(cherche){
                    int random = (int) (Math.random()*9);
                    if(!placer[random]){
                        mélange[i].setImage(image[random].getImage());
                        placer[random] = true;
                        cherche = false;
                    }
                }
            }
            for(int i=0;i<9;i++){
                image[i].setImage(mélange[i].getImage());
            }
        return new FlowPane(image[0],image[1],image[2],image[3],image[4],image[5],image[6],image[7],image[8]);
        }
}

