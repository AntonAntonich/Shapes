package by.anton.shapes.creator;

import by.anton.shapes.entity.CustomRectangle;
import by.anton.shapes.entity.CustomRectangleParameter;
import by.anton.shapes.exception.CustomReaderException;
import by.anton.shapes.exception.CustomRectangleException;
import by.anton.shapes.exception.EmptyStringException;
import by.anton.shapes.observer.CustomRectangleObserver;
import by.anton.shapes.observer.impl.CustomRectangleObserverImpl;
import by.anton.shapes.parser.DataRectangleParser;
import by.anton.shapes.reader.DataRectangleReader;

import java.util.ArrayList;
import java.util.List;

import static by.anton.shapes.creator.FillRectangleParameter.fillRectangleParameter;
import static by.anton.shapes.creator.PutterRectangleParamInContainer.putRectangleParameterInContainer;
import static by.anton.shapes.factory.CustomRectangleFactory.createCustomRectangle;
import static by.anton.shapes.validator.ContainsNullValidator.isContainNull;

public class CustomRectangleCreator {
    private static final String ADDRESS = "resources/data/shape_data.txt";
    private List<String> strings;
    private List<Double[]> data;
    private List<CustomRectangle> customRectangleList = new ArrayList<>();
    private List<CustomRectangleParameter> customRectangleParameterList = new ArrayList<>();

    public void createRectangle() {
        readData();
        transformDataIntoDoubleArrays();
        fillRectangleList();
        attachingObserver();
        fillParameters();
        fillWareHouse();

        System.out.println(customRectangleList);
    }

    private void attachingObserver() {
        try {
            CustomRectangleObserver customRectangleObserver = new CustomRectangleObserverImpl();
            for (CustomRectangle customRectangle : customRectangleList) {
                customRectangle.attach(customRectangleObserver);
            }
        } catch (CustomRectangleException c) {
            //log
        }
    }

    private void fillWareHouse() {
        try {
            for (CustomRectangleParameter parameter : customRectangleParameterList) {
                putRectangleParameterInContainer(parameter);
            }
        } catch (CustomRectangleException c) {
            //log
        }
    }

    private void fillParameters() {
        try {
            for (CustomRectangle customRectangle : customRectangleList) {
                CustomRectangleParameter parameter = fillRectangleParameter(customRectangle);
                customRectangleParameterList.add(parameter);
            }
        } catch (CustomRectangleException e) {
            //log
        }
    }

    private void fillRectangleList() {
        try {
            for (Double[] points : data) {
                if (!isContainNull(points)) {
                    customRectangleList.add(createCustomRectangle(points));
                }
            }
        } catch (CustomRectangleException e) {
            //log
        }
    }

    private void readData() {
        DataRectangleReader reader = new DataRectangleReader();
        try {
            strings = reader.readDataFromFile(ADDRESS);
        } catch (CustomReaderException e) {
            //log
        }
    }

    private void transformDataIntoDoubleArrays() {
        try{
            data = DataRectangleParser.parsStringToDoubleArrays(strings);
        } catch (EmptyStringException | CustomRectangleException e) {
            //log
        }
    }
}
