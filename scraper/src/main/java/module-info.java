module com.example.scraper {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.scraper to javafx.fxml;
    exports com.example.scraper;
}