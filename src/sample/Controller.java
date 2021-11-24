package sample;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
public class Controller {
    @FXML
    public ResourceBundle resources;

    @FXML
    public URL location;

    @FXML
    public Button exitbtn;

    @FXML
    public Button file;

    @FXML
    public Button newbutton;

    @FXML
    public Button openbutton;

    @FXML
    public Label outputt;

    @FXML
    public Button savebtn;

    @FXML
    public AnchorPane scnd;

    @FXML
    void initialize() {
        scnd.setVisible(false);
        newbutton.setOnAction(event -> {
        IDocument doc=new IDocument(1);
        doc.CreateNew();
        long start=System.currentTimeMillis();
        outputt.setText("Создан "+doc.getType());
        });
        openbutton.setOnAction(event -> {
            IDocument doc=new IDocument(1);
            doc.CreateOpen();
            outputt.setText("Открыт "+doc.getType());
        });
        file.setOnAction(event-> {
            if(scnd.isVisible())
                scnd.setVisible(false);else scnd.setVisible(true);
        });
        exitbtn.setOnAction(event->{
            System.exit(0);
        });
        savebtn.setOnAction(event->{
            outputt.setText("Изменения сохранены");System.out.println("Изменения сохранены");
        });
    }
}
