//можно  автокликер сделать
//SHIFT +F6 изменение названий в районе видимости

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.sql.*;

public class login extends Application {


    @Override
    public void start(Stage primaryStage)throws  SQLException,ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sqlfx?useSSL=false&serverTimezone=UTC", "root", "lol20000317F");
            Statement stat = con.createStatement();{
//                    stat.executeUpdate("insert  into students (`name`,`Date Birthday`) values ('Alexey','1999.07.12')");
//                stat.executeUpdate("");
                Image image =new Image("https://www.jpc.de/assets.php?type=spotlight&hnum=7737427"); ImageView imageView =new ImageView(image); imageView.setFitHeight(300);imageView.setFitWidth(500);

                Label AppName = new Label("PRIVATE CHAT"); AppName.setTranslateX(50); AppName.setFont(new Font("Times New Roman", 40)); AppName.setTextFill(Color.DARKBLUE);
                Label labelLogin =new Label("Login"); labelLogin.setTranslateX(158); labelLogin.setFont(new Font("Mistral", 18));labelLogin.setTextFill(Color.ROYALBLUE);labelLogin.setStyle("-fx-background-color: #ff00bc ");
                Label labelPassword =new Label("Password");labelPassword.setTranslateX(150);labelPassword.setFont(new Font("Mistral", 18));labelPassword.setTextFill(Color.ROYALBLUE);labelPassword.setStyle("-fx-background-color: #b2d2ff ");
                TextField textLogin = new TextField();textLogin.setStyle("-fx-background-color: #ffd9bd ");
                PasswordField textPassword = new PasswordField();textPassword.setStyle("-fx-background-color: #ffd9bd ");
                Button buttonLogin =new Button("Login");buttonLogin.setPrefWidth(52);buttonLogin.setStyle("-fx-background-color: #b2d2ff ");buttonLogin.setTextFill(Color.HOTPINK);buttonLogin.setFont(new Font ("Arial Black", 10));
                Button buttonReg =new Button("Registration");buttonReg.setPrefWidth(68);buttonReg.setStyle("-fx-background-color: #b2d2ff ");buttonReg.setTextFill(Color.HOTPINK); buttonReg.setFont(new Font ("Arial Black", 10));buttonReg.setMinWidth(85);

                FlowPane flowPane =new FlowPane(); flowPane.setPrefWidth(50);
                FlowPane flowButtons =new FlowPane(Orientation.HORIZONTAL,buttonLogin,buttonReg);flowButtons.setTranslateX(120);
                FlowPane flowLogin = new FlowPane(Orientation.VERTICAL,AppName,labelLogin,textLogin,labelPassword,textPassword,flowButtons);
                BorderPane borderPane = new BorderPane();borderPane.setLeft(flowPane);borderPane.setCenter(flowLogin);
                primaryStage.setScene(new Scene(new Group(imageView,borderPane), 500, 300)); primaryStage.setResizable(true); primaryStage.setTitle("Login Taylor Swift");primaryStage.show();

                buttonReg.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        Label AppNameInReg = new Label("PRIVATE CHAT"); AppNameInReg.setTranslateX(50); AppNameInReg.setFont(new Font("Times New Roman", 40)); AppNameInReg.setTextFill(Color.DARKBLUE);
                        Image imageInReg =new Image("https://ds04.infourok.ru/uploads/ex/0ce1/00060050-9e64f17d/1/img1.jpg");ImageView imageViewInReg =new ImageView(imageInReg);imageViewInReg.setFitWidth(480);imageViewInReg.setFitHeight(320);
                        Label labelNameInReg =new Label("*Name"); labelNameInReg.setTranslateX(158); labelNameInReg.setFont(new Font("Mistral", 18));labelNameInReg.setTextFill(Color.ROYALBLUE);labelNameInReg.setStyle("-fx-background-color: #ff00bc ");
                        TextField textNameInReg = new TextField("Enter your NickName");textNameInReg.setStyle("-fx-background-color: #ffd9bd "); textNameInReg.setOnMouseClicked(new EventHandler<MouseEvent>() {@Override public void handle(MouseEvent event) {if((textNameInReg.getText()).equals("Enter your NickName")) textNameInReg.setText(""); }});
                        Label labelDateInReg =new Label("Date"); labelDateInReg.setTranslateX(158); labelDateInReg.setFont(new Font("Mistral", 18));labelDateInReg.setTextFill(Color.ROYALBLUE);labelDateInReg.setStyle("-fx-background-color: #ff00bc ");
                        TextField textDateInReg = new TextField("year:mm:dd");textDateInReg.setStyle("-fx-background-color: #ffd9bd ");textDateInReg.setOnMouseClicked(new EventHandler<MouseEvent>() {@Override public void handle(MouseEvent event) {if((textDateInReg.getText()).equals("year:mm:dd")) textDateInReg.setText(""); }});
                        Label labelLoginInReg =new Label("*Login"); labelLoginInReg.setTranslateX(158); labelLoginInReg.setFont(new Font("Mistral", 18));labelLoginInReg.setTextFill(Color.ROYALBLUE);labelLoginInReg.setStyle("-fx-background-color: #ff00bc ");
                        Label labelPasswordInReg =new Label("*Password");labelPasswordInReg.setTranslateX(150);labelPasswordInReg.setFont(new Font("Mistral", 18));labelPasswordInReg.setTextFill(Color.ROYALBLUE);labelPasswordInReg.setStyle("-fx-background-color: #b2d2ff ");
                        TextField textLoginInReg = new TextField("Enter your Login");textLoginInReg.setStyle("-fx-background-color: #ffd9bd ");textLoginInReg.setOnMouseClicked(new EventHandler<MouseEvent>() {@Override public void handle(MouseEvent event) {if((textLoginInReg.getText()).equals("Enter your Login")) textLoginInReg.setText(""); }});
                        PasswordField passwordFieldInReg = new PasswordField();passwordFieldInReg.setStyle("-fx-background-color: #ffd9bd ");
                        Label labelCheckInReg =new Label("*Check Password");labelCheckInReg.setTranslateX(150);labelCheckInReg.setFont(new Font("Mistral", 18));labelCheckInReg.setTextFill(Color.ROYALBLUE);labelCheckInReg.setStyle("-fx-background-color: #b2d2ff ");
                        PasswordField passwordCheckInReg = new PasswordField();passwordCheckInReg.setStyle("-fx-background-color: #ffd9bd ");
                        CheckBox checkBoxInReg =new CheckBox("*I agree with Rules "); checkBoxInReg.setTextFill(Color.LIGHTSKYBLUE);
                        Hyperlink hyperlinkInReg =new Hyperlink("http://google.com"); hyperlinkInReg.setText("DON`T PRESS");
                        Button buttonRegInReg =new Button("Register");buttonRegInReg.setPrefWidth(68);buttonRegInReg.setStyle("-fx-background-color: #b2d2ff ");buttonRegInReg.setTextFill(Color.HOTPINK); buttonRegInReg.setFont(new Font ("Arial Black", 10));
                        Button buttonShowRegInReg =new Button("Show last register person");buttonShowRegInReg.setStyle("-fx-background-color: #b2d2ff ");buttonShowRegInReg.setTextFill(Color.HOTPINK); buttonShowRegInReg.setFont(new Font("Arial Black", 10));buttonShowRegInReg.setTranslateX(42);

                        Label labelShowInReg =new Label();
                        FlowPane flowShowReg = new FlowPane(Orientation.HORIZONTAL,labelShowInReg);
                        buttonShowRegInReg.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                try { ResultSet resultSet1=stat.executeQuery("select *from login");
                                    while (resultSet1.next()) {
                                        labelShowInReg.setText ("Name="+resultSet1.getString(4) + "\tBirthday="+resultSet1.getString(5)+ "\tNick Name="+resultSet1.getString(2));
                                    } } catch (SQLException e) { e.printStackTrace(); } }});

                        FlowPane flowRazdelInReg =new FlowPane(); flowRazdelInReg.setPrefWidth(50);
                        FlowPane flowRulesInReg =new FlowPane(Orientation.HORIZONTAL,checkBoxInReg, hyperlinkInReg, buttonShowRegInReg, flowShowReg);
                        FlowPane flowRegInReg = new FlowPane(Orientation.VERTICAL,AppNameInReg,labelNameInReg, textNameInReg, labelDateInReg,textDateInReg,labelLoginInReg,textLoginInReg,labelPasswordInReg,passwordFieldInReg, flowRulesInReg,buttonRegInReg);
                        BorderPane borderPaneInReg = new BorderPane();borderPaneInReg.setLeft(flowRazdelInReg);borderPaneInReg.setCenter(flowRegInReg);
                        Group groupReg =new Group(imageViewInReg,borderPaneInReg);
                        Stage stageReg =new Stage(); stageReg.setScene(new Scene (groupReg, 480,320));stageReg.setResizable(true); stageReg.setTitle("Register Taylor Swift");stageReg.show();
                        //if(passwordFieldInReg.getText()!=passwordCheckInReg)
                        buttonRegInReg.setOnAction(new EventHandler<ActionEvent>() {@Override public void handle(ActionEvent event) { try {
                            if(passwordFieldInReg.getText().length()>8){if (checkBoxInReg.isSelected()){
                                stat.executeUpdate("insert  into login (`Name`,`Birthday`,`Nick Name`,`Password`) values ('"+textNameInReg.getText()+"','"+textDateInReg.getText()+"','"+textLoginInReg.getText()+"','"+passwordFieldInReg.getText()+"')");}else {checkBoxInReg.setText("Don`t accept rules");}}else {labelPasswordInReg.setText("Passord : min 8 elements size");}
                            } catch (SQLException e) {e.printStackTrace();} }});

                    }
                });

                buttonLogin.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        try {
                            ResultSet resultLogin = stat.executeQuery("select *  FROM `login`");
                            while(resultLogin.next()){
                                if (resultLogin.getString(2).equals(textLogin.getText())){
                                    while(resultLogin.next()) {
                                        if (resultLogin.getString(3).equals(textPassword)) {
                                            //Stage stage=new Stage(); stage.setScene(new Scene(new Group(new Label("Sucesfull Login")),Color.SIENNA));stage.setTitle("Your are Login"); stage.show();
                                            System.out.println("hui");
                                        }
                                    }
                                }
                            }
                        } catch (SQLException e) {e.printStackTrace();};
                    }
                });

            } } catch(SQLException ex){ System.out.println("Ошибка подключения"); ex.printStackTrace(); }
    }
    public static void main(String[] args) {launch(args);}
}


