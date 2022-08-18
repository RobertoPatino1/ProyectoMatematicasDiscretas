module com.mycompany.proyectomd {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.proyectomd to javafx.fxml;
    exports com.mycompany.proyectomd;
}
