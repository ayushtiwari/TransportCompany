package com.ayushtiwari.EmployeeUI;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ReceiveTruckTableController {

    @FXML
    private TableView<ReceiveTruckTableItem> tableView;

    @FXML
    private TableColumn<ReceiveTruckTableItem, String> truckID;

    @FXML
    private TableColumn<ReceiveTruckTableItem, String> departingBranch;

    @FXML
    private TableColumn<ReceiveTruckTableItem, String> expectedArrivalDate;

    @FXML
    private TableColumn<ReceiveTruckTableItem, String> occupancy;

    @FXML
    private TableColumn<ReceiveTruckTableItem, String> driverId;

    public void initialize() {
        truckID.setCellValueFactory(new PropertyValueFactory<>("truckId"));
        departingBranch.setCellValueFactory(new PropertyValueFactory<>("sendingBranch"));
        occupancy.setCellValueFactory(new PropertyValueFactory<>("volumeFilled"));

        tableView.setItems(populate());

        tableView.setRowFactory(tv -> {
            TableRow<ReceiveTruckTableItem> row = new TableRow<>();

            row.setOnMouseClicked(event -> {
                if (event.getClickCount() == 2 && (!row.isEmpty())) {
                    ReceiveTruckTableItem tableItem = row.getItem();
                    try {


                        FXMLLoader loader = new FXMLLoader();
                        loader.setLocation(getClass().getResource("individualReceiveTruck.fxml"));
                        Parent individualScene = loader.load();

                        Scene individual = new Scene(individualScene);

                        IndividualTruckReceiveController controller = loader.getController();

                        controller.initData(tableItem.getTruckId());

                        Stage stage = new Stage();
                        stage.initModality(Modality.WINDOW_MODAL);
                        stage.setScene(individual);
                        stage.show();

                    } catch (Exception e) {
                        System.out.println("Error");
                    }
                }

            });
            return row;
        });

    }

    private ObservableList<ReceiveTruckTableItem> populate() {

        ObservableList<ReceiveTruckTableItem> observableList = FXCollections.observableArrayList();

        //Query Database and return ObservableList

        return observableList;

    }

}