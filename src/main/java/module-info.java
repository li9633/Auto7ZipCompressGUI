// module-info.java
module com.auto7zip { // 与包路径 com.auto7zip 完全一致
    requires javafx.controls;
    requires javafx.fxml;
    requires org.controlsfx.controls;

    opens com.auto7zip.view to javafx.fxml;
    exports com.auto7zip; // 主模块包
    exports com.auto7zip.view to javafx.graphics;
}